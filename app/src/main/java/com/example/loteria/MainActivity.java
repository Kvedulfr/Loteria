package com.example.loteria;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    static Registros r;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);


        Bundle recibido=getIntent().getExtras();
        try{

            r = (Registros) recibido.getSerializable("usuario");

        }catch(NullPointerException npe){

        }

    }


    //Funcionalidad de los botones
    public void abrirRegistro(View view){
        //Recibimos el Objeto

        Bundle recibido=getIntent().getExtras();
        try{
            r = (Registros) recibido.getSerializable("usuario");

        }catch(NullPointerException npe){

        }
        Intent i =new Intent(this,Registro.class);

        //Enviamos  el objetos
        Bundle bundle=new Bundle();
        bundle.putSerializable("usuario",r);
        i.putExtras(bundle);

        startActivity(i);

    }

    public void abrirAjustes(View view) {
        Bundle recibido=getIntent().getExtras();
        try{
            r = (Registros) recibido.getSerializable("usuario");

        }catch(NullPointerException npe){

        }
        Intent i =new Intent(this,Ajustes.class);

        //Enviamos  el objetos
        Bundle bundle=new Bundle();
        bundle.putSerializable("usuario",r);
        i.putExtras(bundle);

        startActivity(i);
    }

    public void abrirLoterias(View view){
        Bundle recibido=getIntent().getExtras();
        try{
            r = (Registros) recibido.getSerializable("usuario");

        }catch(NullPointerException npe){

        }
        Intent i =new Intent(this,Loterias.class);

        //Enviamos  el objetos
        Bundle bundle=new Bundle();
        bundle.putSerializable("usuario",r);
        i.putExtras(bundle);

        startActivity(i);
    }

    public void abrirSorteo(View view){


        Bundle recibido=getIntent().getExtras();
        if(recibido!=null) {
            r = (Registros) recibido.getSerializable("usuario");
           // Toast.makeText(this, r.getNombre(), Toast.LENGTH_LONG).show();
        }

        Intent i =new Intent(this,Sorteo.class);

        //Enviamos  el objetos
        Bundle bundle=new Bundle();
        bundle.putSerializable("usuario",r);
        i.putExtras(bundle);

        startActivity(i);
    }

    public void abrirAcercaDe(View view){
        Intent i =new Intent(this,AcercaDe.class);
        startActivity(i);
    }

    public void abrirAyuda(View view){
        Intent i =new Intent(this,Ayuda.class);
        startActivity(i);
    }
    //MENU
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent i;
        switch (item.getItemId()){
            case R.id.item1:
                 i =new Intent(this,AcercaDe.class);
                startActivity(i);
                return true;
            case R.id.item2:
                 i =new Intent(this,Ayuda.class);
                startActivity(i);
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }

    }
}
