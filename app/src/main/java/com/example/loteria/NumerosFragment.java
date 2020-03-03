package com.example.loteria;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;


public class NumerosFragment extends Fragment {
    public EditText e1;
    public EditText e2;
    public EditText e3;
    public Button guardar;
    public View vista;

    public NumerosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        vista = inflater.inflate(R.layout.fragment_numeros, container, false);
        /*
        e1 = (EditText) vista.findViewById(R.id.editText8);
        e2 = (EditText) vista.findViewById(R.id.editText10);
        e3 = (EditText) vista.findViewById(R.id.editText9);
        guardar = (Button) vista.findViewById(R.id.button11);
        guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int num;
                int num2;
                int num3;
                try {
                    num = Integer.parseInt(e1.getText().toString());
                    num2 = Integer.parseInt(e2.getText().toString());
                    num3 = Integer.parseInt(e3.getText().toString());
                    if (num <= 10 && num2 <= 10 && num3 <= 10 && num >= 1 && num2 >= 1 && num3 >= 1) {
                        Toast.makeText(getContext(), "Tu combinacion es :" + num + "/"
                                + num2 + "/" + num3, Toast.LENGTH_LONG).show();

                        Intent intent = new Intent(getActivity(), Ajustes.class);
                        intent.putExtra("Numero1", num );
                        intent.putExtra("Numero2", num2);
                        intent.putExtra("Numero3", num3);

                    } else {
                        Toast.makeText(getContext(), "Los números tienen que estar entre 1-10", Toast.LENGTH_LONG).show();
                    }

                } catch (NumberFormatException n) {

                    Toast.makeText(getContext(), "No has selecionado una combinación", Toast.LENGTH_LONG).show();

                }

            }
        });

*/
        return vista;
    }


}
