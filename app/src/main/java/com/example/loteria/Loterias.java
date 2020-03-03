package com.example.loteria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class Loterias extends AppCompatActivity {

    private CheckBox bono;
    private CheckBox primi;
    private CheckBox quini;
    private CheckBox euro;
    static boolean primeraVez=true;

    static Registros r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loterias);

        bono = (CheckBox) findViewById(R.id.checkBox);
        euro = (CheckBox) findViewById(R.id.checkBox2);
        primi = (CheckBox) findViewById(R.id.checkBox3);
        quini = (CheckBox) findViewById(R.id.checkBox4);
         r=new Registros();
        Bundle recibido = getIntent().getExtras();
        if (recibido != null) {

            r = (Registros) recibido.getSerializable("usuario");

        }


    }

    public void actionButton(View view) {

        String sorteo="";
        int cont = 0;

        if (bono.isChecked()) {
            sorteo="BONOLOTO";
            cont++;
        }
        if (primi.isChecked()) {
            sorteo="PRIMITIVA";
            cont++;
        }
        if (quini.isChecked()) {
            sorteo="QUINIELA";
            cont++;
        }
        if (euro.isChecked()) {
            sorteo="EUROMILLÓN";
            cont++;
        }
        Toast.makeText(this, ""+cont, Toast.LENGTH_LONG).show();
        if (cont == 0) {
            if (primeraVez) {
                Toast.makeText(this, "No has seleccionado ningún sorteo", Toast.LENGTH_LONG).show();
                primeraVez = false;
            } else {

                Toast.makeText(this, "Sigues sin seleccionar nada. Vale ya", Toast.LENGTH_LONG).show();
            }
        }

            if (cont == 1) {
                try {
                    r.setSorteo(sorteo);
                }catch (NullPointerException npe){
                    r=new Registros();
                    r.setSorteo(sorteo);
                }
                Toast.makeText(this, "Sorteo Guardado", Toast.LENGTH_LONG).show();
                Intent i = new Intent(this, MainActivity.class);
                //Enviar el objetos
                Bundle bundle = new Bundle();
                bundle.putSerializable("usuario", r);
                i.putExtras(bundle);

                startActivity(i);

            }

            if (cont > 1) {
                Toast.makeText(this, "La versión Lite solo admite un tipo de Sorteo.\n" +
                        "Compra nuestra versión de Pago", Toast.LENGTH_LONG).show();
            }


    }
}
