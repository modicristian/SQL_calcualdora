package com.example.itmaster.sql_calculadora.listeners;

import android.view.View;

import com.example.itmaster.sql_calculadora.DAO.SqliteCalculadora;
import com.example.itmaster.sql_calculadora.interfaz.MainActivity;
import com.example.itmaster.sql_calculadora.models.Operacion;

public class ListenerSuma implements View.OnClickListener{

    private MainActivity contextSuma;
    private SqliteCalculadora sqliteCalculadora;
    private Operacion operacion;

    public ListenerSuma(MainActivity contextSuma)
    {
        this.contextSuma = contextSuma;
    }

    @Override
    public void onClick(View view)
    {
        Integer suma = Integer.valueOf(contextSuma.getTxtNumeroUno().getText().toString())+Integer.valueOf(contextSuma.getTxtNumeroDos().getText().toString());

        contextSuma.getTxtResultado().setText(suma.toString());

        sqliteCalculadora = new SqliteCalculadora(contextSuma);

        operacion = new Operacion(null,String.valueOf(contextSuma.getTxtResultado()));

        sqliteCalculadora.guardarOperacion(operacion);

    }



}
