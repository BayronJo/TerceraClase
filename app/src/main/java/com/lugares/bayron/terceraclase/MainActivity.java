package com.lugares.bayron.terceraclase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Declaracion de Variables
    private RadioButton rdbtnSistemas;
    private RadioButton rdbtnElectrica;
    private RadioButton rdbtnIndustrial;
    private  int opcSeleccionada =0;
    private  String Mensaje = "Carrera Seleccionada : \n";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rdbtnElectrica = findViewById(R.id.rdbtnElectrica);
        rdbtnSistemas = findViewById(R.id.rdbtnSistemas);
        rdbtnIndustrial = findViewById(R.id.rdbtnIndustrial);

        rdbtnIndustrial.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    opcSeleccionada=1;
                }
            }
        });

        rdbtnSistemas.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    opcSeleccionada=2;
                }
            }
        });

        rdbtnElectrica.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    opcSeleccionada=3;
                }
            }
        });
    }

    public void OnclickButton(View v){

        switch (opcSeleccionada){
            case 1:
                Mensaje += "Ing. Industrial ";
                break;
            case 2:
                Mensaje += "Ing. En Sistemas";
                break;
            case 3:
                this.opcSeleccionada =0;
                Mensaje += "Ing. Electrica";
                break;
                default:
                    this.opcSeleccionada =0;
                    Mensaje +="Elija una Opcion";
                    break;
        }
        Toast.makeText(this, Mensaje,Toast.LENGTH_LONG).show();
        Mensaje ="Carrera Seleccionada \n";
    }
}
