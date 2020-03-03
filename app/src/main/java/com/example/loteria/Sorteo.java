package com.example.loteria;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Sorteo extends AppCompatActivity {

    TextView nombre;
    TextView sorteo;
    TextView cantidad;
    TextView combinacion;
    static Boolean comprobacion;
    static Registros r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sorteo);
        comprobacion = true;

        Bundle recibido = getIntent().getExtras();

        if (recibido != null) {
            nombre = (TextView) findViewById(R.id.textView11);
            cantidad = (TextView) findViewById(R.id.textView12);
            sorteo = (TextView) findViewById(R.id.textView13);
            combinacion = (TextView) findViewById(R.id.textView14);

            r = (Registros) recibido.getSerializable("usuario");
            //Nombre
            try {
                if (r.getNombre().trim().equals("")) {
                    nombre.setText("CAMPO NO AGREGADO");
                    comprobacion = false;
                } else {
                    nombre.setText(r.getNombre());

                }

            } catch (NullPointerException npe) {
                nombre.setText("CAMPO NO AGREGADO");
                comprobacion = false;
            }
            //Sorteo
            try {
                if (r.getSorteo().trim().equals("")) {
                    sorteo.setText("CAMPO NO AGREGADO");
                    comprobacion = false;
                }
                else {

                    sorteo.setText(r.getSorteo());
                }
            } catch (NullPointerException npe) {
                sorteo.setText("CAMPO NO AGREGADO");
                comprobacion = false;
            }
            //Cantidad
            try {
                if(r.getDinero()==0){
                    cantidad.setText("CAMPO NO AGREGADO");
                    comprobacion = false;
                }else
                cantidad.setText(r.getDinero() + " €");


            } catch (NullPointerException npe) {
                cantidad.setText("CAMPO NO AGREGADO");
                comprobacion = false;
            }
            //Combinación
            try {
                if(r.getComb1()==0){
                    combinacion.setText("CAMPO NO AGREGADO");
                    comprobacion = false;

                }else {
                    combinacion.setText(r.getComb1() + "-" + r.getComb2() + "-" + r.getComb3());
                }
            } catch (NullPointerException npe) {
                combinacion.setText("CAMPO NO AGREGADO");
                comprobacion = false;

            }
        } else {
            Toast.makeText(this, "nulo", Toast.LENGTH_LONG).show();
        }
    }

    public void abrirPanelPrincipal(View view) {
       /* Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
        Toast.makeText(this.getApplicationContext(), "Registro Cancelado", Toast.LENGTH_LONG).show();
    */
        onBackPressed();
    }

    public void RealizarSorteo(View view) {

        int numer1 = (int) (Math.random() * 10 + 1);
        int numer2 = (int) (Math.random() * 10 + 1);
        int numer3 = (int) (Math.random() * 10 + 1);

        int pago = r.getDinero();
        int num = r.getComb1();
        int num2 = r.getComb2();
        int num3 = r.getComb3();

        if (!comprobacion) {
            Toast.makeText(this, "No has rellanado todos los campos", Toast.LENGTH_LONG).show();
        } else {

            int premiosCount = 0;
            if (num == numer1 || num == numer2 || num == numer3) {
                premiosCount++;
            }

            if (num2 == numer1 || num2 == numer2 || num2 == numer3) {
                premiosCount++;
            }

            if (num3 == numer1 || num3 == numer2 || num3 == numer3) {
                premiosCount++;
            }

            String premio;
            switch (premiosCount) {
                case 1:
                    premio = "Has ganado " + pago + "€";
                    break;
                case 2:
                    premio = "¡Has ganado " + (pago * 2) + "€!";
                    break;
                case 3:
                    premio = "¡Has conseguido el coche!";
                    break;
                default:
                    premio = "No esta premiado";
            }


            //Dialogo de alerta
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Sorteo");
            builder.setMessage("Numeros Premiados: " + numer1 + "-" + numer2 + "-" + numer3 +
                    "\nNumeros Elegidos:" + num + "-" + num2 + "-" + num3 +
                    "\n" + premio);
            builder.setPositiveButton("Cobrar Premio", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(Sorteo.this, "Premio Recaudado", Toast.LENGTH_LONG).show();

                }
            });

            builder.setNegativeButton(android.R.string.cancel, null);
            Dialog dialog = builder.create();
            dialog.show();
        }


    }

}
