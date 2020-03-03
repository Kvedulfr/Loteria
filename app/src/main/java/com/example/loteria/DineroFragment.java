package com.example.loteria;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class DineroFragment extends Fragment {
    static Spinner spinner;
    public Button guardar;

    View vista;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        //Esto me hace falta para poder hacer el Listener del boton de otra manera no se podría
        vista=inflater.inflate(R.layout.fragment_apostar,container,false);

        //Para recoger el valor del combobox
        spinner=(Spinner)vista.findViewById(R.id.spinner2);





        //Para crear el evento en un boton
        /*
        guardar= (Button) vista.findViewById(R.id.button12);
        guardar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                int num;
                try {
                    num = Integer.parseInt(spinner.getSelectedItem().toString());
                    Toast.makeText(getContext(), "Has apostado: " + num + " € ", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(getActivity(), Ajustes.class);
                    intent.putExtra("prueba", "prueba");


                }catch(NumberFormatException n){

                    Toast.makeText(getContext(), "No has selecionado una cantidad", Toast.LENGTH_LONG).show();

                }

            }
        }); */
        return vista;


    }

}
