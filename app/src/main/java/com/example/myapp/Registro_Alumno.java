package com.example.myapp;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.design.widget.TextInputEditText;
import android.widget.Button;

public class Registro_Alumno  extends AppCompatActivity{

    TextInputEditText IETnombres, IETapellidos,IETcurso,IETdocumento,IETfecha_nac,IETrh,IETcondicion_esp,
            IETmateria_ag,IETmateria_desag,IETdireccion,IETotra_persona,IETcolegio,IETfoto;
    Button btnRegistrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registralumno);

    }

}
