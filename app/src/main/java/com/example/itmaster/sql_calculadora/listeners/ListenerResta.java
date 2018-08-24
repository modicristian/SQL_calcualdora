package com.example.itmaster.sql_calculadora.listeners;

import android.view.View;

import com.example.itmaster.sql_calculadora.interfaz.MainActivity;

public class ListenerResta implements View.OnClickListener
{

    private MainActivity contextResta;

    public ListenerResta(MainActivity contextResta) {
        this.contextResta = contextResta;
    }

    @Override
    public void onClick(View view)
    {
        Integer resta = Integer.valueOf(contextResta.getTxtNumeroUno().getText().toString()) - Integer.valueOf(contextResta.getTxtNumeroDos().getText().toString());

        contextResta.getTxtResultado().setText(resta.toString());
    }


}
