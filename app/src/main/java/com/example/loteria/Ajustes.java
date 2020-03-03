package com.example.loteria;

import android.content.Intent;
import android.os.Bundle;


import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;


import android.view.View;

import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.loteria.ui.main.SectionsPagerAdapter;

public class Ajustes extends AppCompatActivity {
    private Spinner spinner;
    static Registros r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajustes);
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);

        r=new Registros();
        Bundle recibido = getIntent().getExtras();
        if (recibido != null) {

            r = (Registros) recibido.getSerializable("usuario");
        }










        /*
        //Rellenar Spinner
        String[] opciones={"1","2","5","10"};
        ArrayAdapter<String>adapter= new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, opciones);
        spinner.setAdapter(adapter);
        */
        /* FloatingActionButton fab = findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/


    }

    public void registrar(View view) {
        //String nombree = getIntent().getStringExtra("prueba");
        //Recogemos nuestros datos
        Spinner spinner = (Spinner) findViewById(R.id.spinner2);
        EditText e1 = (EditText) findViewById(R.id.editText8);
        EditText e2 = (EditText) findViewById(R.id.editText10);
        EditText e3 = (EditText) findViewById(R.id.editText9);


        String nombre = spinner.getSelectedItem().toString();
        int pago;
        int num;
        int num2;
        int num3;


        try {
            pago = Integer.parseInt(nombre);
            try {
                num = Integer.parseInt(e1.getText().toString());
                num2 = Integer.parseInt(e2.getText().toString());
                num3 = Integer.parseInt(e3.getText().toString());
                //Resultado correcto
                if (num <= 10 && num2 <= 10 && num3 <= 10 && num >= 1 && num2 >= 1 && num3 >= 1) {
                    try {
                        r.setDinero(pago);
                        r.setComb1(num);
                        r.setComb2(num2);
                        r.setComb3(num3);
                    }catch(NullPointerException nfe){
                        r=new Registros();
                        r.setDinero(pago);
                        r.setComb1(num);
                        r.setComb2(num2);
                        r.setComb3(num3);
                        }
                    Intent i = new Intent(this, MainActivity.class);
                    //Enviar el objetos
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("usuario", r);
                    i.putExtras(bundle);
                    startActivity(i);


                    Toast.makeText(this, "Tu combinacion es :" + num + "/"
                            + num2 + "/" + num3 + " \n con una apuesta de: " + pago + "€ ", Toast.LENGTH_LONG).show();

                    //No has insertado valores entre 1-10
                } else {
                    Toast.makeText(this, "Los números tienen que estar entre 1-10", Toast.LENGTH_LONG).show();
                }
                //No has selecionado una cantidad
            } catch (NumberFormatException n1) {
                Toast.makeText(this, "¡Elige tu combinacion ganadora!", Toast.LENGTH_LONG).show();
            }
        } catch (NumberFormatException n) {
            Toast.makeText(this, "¡Elige tu apuesta!", Toast.LENGTH_LONG).show();
        }


    }
}