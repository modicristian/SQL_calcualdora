package com.example.itmaster.sql_calculadora.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.itmaster.sql_calculadora.models.Operacion;

import java.util.ArrayList;

public class SqliteCalculadora extends SQLiteOpenHelper
{
    private static final String DBNAME = "CALCULADORA";
    private static final Integer DBVERSION = 9;
    private Context context;
    private SQLiteDatabase conexion;

    public SqliteCalculadora(Context context)
    {
        super(context, DBNAME, null, DBVERSION);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        String query = "CREATE TABLE `historial` ( `id` INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, `operacion` INTEGER NOT NULL )";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1)
    {
        String query = "CREATE TABLE `historial` ( `id` INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, `operacion` INTEGER NOT NULL )";
        db.execSQL(query);
    }

    private void conectar ()
    {
        conexion = getWritableDatabase();
    }

    private void desconectar ()
    {
        conexion.close();
    }

    public void guardarOperacion (Operacion operacion)
    {
        this.conectar();

        ContentValues fila = new ContentValues();

        fila.put("operacion", operacion.getOperacion());

        conexion.insert("historial",null, fila);

        this.desconectar();
    }

    public ArrayList<Operacion> getOperaciones()
    {
        ArrayList<Operacion> operacionArrayList = new ArrayList<Operacion>();
        this.conectar();

        String query = "";
        query = "select id, operacion from historial";

        Cursor cursor = conexion.rawQuery(query,null);

        while (cursor.moveToNext()){

            Operacion unaOperacion = new Operacion(cursor.getInt(cursor.getColumnIndex("id")),
                                                   cursor.getString(cursor.getColumnIndex("operacion")));

            operacionArrayList.add(unaOperacion);
        }

        this.desconectar();

        return operacionArrayList;
    }
}
