package com.example.itmaster.sql_calculadora.DAO;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SqliteCalculadora extends SQLiteOpenHelper
{
    private static final String DBNAME = "CALCULADORA";
    private static final Integer DBVERSION = 1;
    private Context context;
    private SQLiteDatabase conexion;

    public SqliteCalculadora(Context context)
    {
        super(context, DBNAME, null, DBVERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        String query = "CREATE TABLE `operacion` ( `id` INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, `operacion` INTEGER NOT NULL )";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1)
    {

    }

    private void conectar (){
        conexion = getWritableDatabase();
    }

    private void desconectar (){
        conexion.close();
    }

    public void guardarOperacion (String operacion)
    {
        this.conectar();

        

        this.desconectar();
    }
}
