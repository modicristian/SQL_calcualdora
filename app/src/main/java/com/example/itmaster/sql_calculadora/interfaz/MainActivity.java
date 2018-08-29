package com.example.itmaster.sql_calculadora.interfaz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.crashlytics.android.Crashlytics;
import com.example.itmaster.sql_calculadora.R;
import com.example.itmaster.sql_calculadora.listeners.ListenerHistorial;
import com.example.itmaster.sql_calculadora.listeners.ListenerResta;
import com.example.itmaster.sql_calculadora.listeners.ListenerSuma;

import io.fabric.sdk.android.Fabric;

public class MainActivity extends AppCompatActivity
{
    private EditText txtNumeroUno,txtNumeroDos;
    private TextView txtResultado;
    private Button txtSuma, txtResta, txtHistorial;
    private ListenerSuma listenerSuma;
    private ListenerResta listenerResta;
    private ListenerHistorial listenerHistorial;

    public EditText getTxtNumeroUno() {
        return txtNumeroUno;
    }


    public EditText getTxtNumeroDos() {
        return txtNumeroDos;
    }


    public TextView getTxtResultado() {
        return txtResultado;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        Fabric.with(this, new Crashlytics());
        setContentView(R.layout.activity_main);

        txtNumeroUno = findViewById(R.id.txtNumeroUno);
        txtNumeroDos = findViewById(R.id.txtNumeroDos);
        txtResultado = findViewById(R.id.txtResultado);
        txtSuma = findViewById(R.id.txtSuma);
        txtResta = findViewById(R.id.txtResta);
        txtHistorial = findViewById(R.id.txtHistorial);

        listenerSuma = new ListenerSuma(this);
        listenerResta = new ListenerResta(this);
        listenerHistorial = new ListenerHistorial(this);

        txtSuma.setOnClickListener(listenerSuma);
        txtResta.setOnClickListener(listenerResta);
        txtHistorial.setOnClickListener(listenerHistorial);

    }
}
