package com.example.itmaster.sql_calculadora.listeners;

import android.content.Intent;
import android.view.View;

import com.example.itmaster.sql_calculadora.interfaz.ListActivity;
import com.example.itmaster.sql_calculadora.interfaz.MainActivity;

public class ListenerHistorial implements View.OnClickListener
{
    private MainActivity contextHistorial;

    public ListenerHistorial(MainActivity contextHistorial)
    {
        this.contextHistorial = contextHistorial;
    }

    @Override
    public void onClick(View view)
    {
        Intent historial = new Intent(contextHistorial, ListActivity.class);

    }
}
