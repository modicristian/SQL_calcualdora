package com.example.itmaster.sql_calculadora.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.itmaster.sql_calculadora.R;
import com.example.itmaster.sql_calculadora.models.Operacion;

import java.util.ArrayList;

public class AdapterListOperaciones extends BaseAdapter
{
    private ArrayList<Operacion> operacionArrayList;
    private Context context;

    public AdapterListOperaciones(ArrayList<Operacion> operacionArrayList, Context context)
    {
        this.operacionArrayList = operacionArrayList;
        this.context = context;
    }

    @Override
    public int getCount()
    {
        return operacionArrayList.size();
    }

    @Override
    public Object getItem(int i)
    {
        return operacionArrayList.get(i);
    }

    @Override
    public long getItemId(int i)
    {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup)
    {
        LayoutInflater miInfladorDeLayouts;

        miInfladorDeLayouts = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        view = miInfladorDeLayouts.inflate(R.layout.operaciones,viewGroup,false);

        TextView operacion;

        operacion = view.findViewById(R.id.txtoperacion);

        operacion.setText(operacionArrayList.get(i).getOperacion());

        return view;
    }
}
