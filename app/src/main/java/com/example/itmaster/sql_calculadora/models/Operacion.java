package com.example.itmaster.sql_calculadora.models;

public class Operacion
{
    private Integer id;
    private String operacion;

    public Integer getId() {
        return id;
    }

    public String getOperacion() {
        return operacion;
    }

    public Operacion(Integer id, String operacion)
    {
        this.id = id;
        this.operacion = operacion;
    }
}
