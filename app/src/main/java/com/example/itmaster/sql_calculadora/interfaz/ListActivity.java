package com.example.itmaster.sql_calculadora.interfaz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.itmaster.sql_calculadora.DAO.SqliteCalculadora;
import com.example.itmaster.sql_calculadora.R;
import com.example.itmaster.sql_calculadora.adapter.AdapterListOperaciones;
import com.example.itmaster.sql_calculadora.models.Operacion;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity
{

    private SqliteCalculadora sqliteCalculadora;
    private AdapterListOperaciones listOperaciones;
    private ListView listView;
    private Operacion Op;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        

    }
}
