package com.example.itmaster.sql_calculadora.listeners;

import android.view.View;

import com.example.itmaster.sql_calculadora.interfaz.MainActivity;

public class ListenerSuma implements View.OnClickListener{

    private MainActivity contextSuma;

    public ListenerSuma(MainActivity contextSuma) {
        this.contextSuma = contextSuma;
    }

    @Override
    public void onClick(View view)
    {
        Integer suma = Integer.valueOf(contextSuma.getTxtNumeroUno().getText().toString())+Integer.valueOf(contextSuma.getTxtNumeroDos().getText().toString());
        contextSuma.getTxtResultado().setText(suma.toString());
    }
}
