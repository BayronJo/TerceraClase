package com.lugares.bayron.terceraclase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class CheckActivity extends AppCompatActivity {
    private final  String COMIDA1 = "Carne Asada";
    private final  String COMIDA2 = "Tacos";
    private final  String COMIDA3 = "Pupusas";
    private boolean check_Comida1 = false;
    private boolean check_Comida2 = false;
    private boolean check_Comida3 = false;
    private  String Mensaje = "Tu comida Favorita es \n";


    private  CheckBox CheckComida1;
    private  CheckBox CheckComida2;
    private  CheckBox CheckComida3;
    private Button btnProcesar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check);

        CheckComida1 = findViewById(R.id.chkcomida1);
        CheckComida2 = findViewById(R.id.chkcomida2);
        CheckComida3 = findViewById(R.id.chkcomida3);

        CheckComida1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                check_Comida1 = isChecked;
            }
        });

        CheckComida2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                check_Comida2 = isChecked;
            }
        });

        CheckComida3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                check_Comida3 = isChecked;
            }
        });
    }

    public void Presionar(View view){
        //validamos que comidas estan seleccionadas
        if(check_Comida1){
            Mensaje += COMIDA1+"\n";
        }

        if(check_Comida2){
            Mensaje += COMIDA2+"\n";
        }

        if(check_Comida3){
            Mensaje += COMIDA3+"\n";
        }
        Toast.makeText(this,Mensaje,Toast.LENGTH_LONG).show();
        this.CheckComida1.setChecked(false);
        this.CheckComida2.setChecked(false);
        this.CheckComida3.setChecked(false);
    }
}
