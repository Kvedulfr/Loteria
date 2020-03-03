package com.example.loteria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Registro extends AppCompatActivity {
    private EditText nombre;
    private EditText pass;
    private EditText email;
    private EditText edad;

    static Registros r = new Registros();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        nombre = (EditText) findViewById(R.id.editText);
        pass = (EditText) findViewById(R.id.editText2);
        email = (EditText) findViewById(R.id.editText3);
        edad = (EditText) findViewById(R.id.editText4);

        Bundle recibido = getIntent().getExtras();

        if (recibido != null) {
            try {
                r = (Registros) recibido.getSerializable("usuario");

                if (r.getNombre() == null || r.getNombre().trim().equals("")) {

                } else {
                    nombre.setText(r.getNombre());
                    pass.setText(r.getPass());
                    email.setText(r.getEmails());
                    edad.setText(r.getEdad() + "");

                }
            }catch(NullPointerException npe){
                   r=new Registros();
                }
            }
        }

        public void abrirPanelPrincipal (View view){
       /* Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
        Toast.makeText(this.getApplicationContext(), "Registro Cancelado", Toast.LENGTH_LONG).show();
    */
            onBackPressed();
        }


        public void registrar (View view){

            String n = nombre.getText().toString();
            String p = pass.getText().toString();
            String e = email.getText().toString();

            if (edad.getText().toString().trim().equals("")) {
                Toast.makeText(this.getApplicationContext(), "Falta la edad", Toast.LENGTH_LONG).show();
            } else {
                int ed=0;
                try{
                     ed = Integer.parseInt(edad.getText().toString());
                }catch(NumberFormatException nfe){

                }

                String ed1 = edad.getText().toString();

                if (n.isEmpty() || p.isEmpty() || e.isEmpty() || ed1.isEmpty()) {

                    Toast.makeText(this.getApplicationContext(), "No has insertado todos los datos", Toast.LENGTH_LONG).show();


                } else {
                    if (ed > 17) {
                        r.setNombre(n);
                        r.setPass(p);
                        r.setEdad(ed);
                        r.setEmails(e);
                        Toast.makeText(this.getApplicationContext(), "Usuario:" + r.getNombre() + " \n Registrado", Toast.LENGTH_LONG).show();
                        Intent i = new Intent(this, MainActivity.class);
                        //Enviar el objetos
                        Bundle bundle = new Bundle();
                        bundle.putSerializable("usuario", r);
                        i.putExtras(bundle);

                        startActivity(i);
                    } else
                        Toast.makeText(this.getApplicationContext(), "Edad invalida", Toast.LENGTH_LONG).show();

                }
            }

        }


    }
