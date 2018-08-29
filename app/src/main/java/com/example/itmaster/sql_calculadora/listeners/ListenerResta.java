package com.example.itmaster.sql_calculadora.listeners;

import android.view.View;

import com.example.itmaster.sql_calculadora.DAO.SqliteCalculadora;
import com.example.itmaster.sql_calculadora.interfaz.MainActivity;
import com.example.itmaster.sql_calculadora.models.Operacion;

public class ListenerResta implements View.OnClickListener
{

    private MainActivity contextResta;
    private SqliteCalculadora sqliteCalculadora;

    public ListenerResta(MainActivity contextResta) {
        this.contextResta = contextResta;
    }

    @Override
    public void onClick(View view)
    {
        Integer resta = Integer.valueOf(contextResta.getTxtNumeroUno().getText().toString()) - Integer.valueOf(contextResta.getTxtNumeroDos().getText().toString());

        contextResta.getTxtResultado().setText(resta.toString());

        sqliteCalculadora = new SqliteCalculadora(contextResta);

        Operacion operacion = new Operacion(null, String.valueOf(contextResta.getTxtNumeroUno().getText())+ " - " +String.valueOf(contextResta.getTxtNumeroDos().getText())+ " = "+String.valueOf(contextResta.getTxtResultado().getText()));

        sqliteCalculadora.guardarOperacion(operacion);

    }


}
