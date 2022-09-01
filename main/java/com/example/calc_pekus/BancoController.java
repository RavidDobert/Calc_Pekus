package com.example.calc_pekus;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.view.View;

public class BancoController {

    private Conection con;
    private SQLiteDatabase db;

    public BancoController(View.OnClickListener context){
        con = new Conection(context);
        db = con.getWritableDatabase();
    }

    public long inserir(dados d){
        ContentValues contentValues = new ContentValues();

        contentValues.put("N1", d.getN1());
        contentValues.put("N2", d.getN2());
        contentValues.put("result", d.getdResultado());
        contentValues.put("soma", d.getSoma());
        contentValues.put("Subtrai", d.getSubtrai());
        contentValues.put("multiplica", d.getMultiplica());
        contentValues.put("divide", d.getDivide());

        return db.insert("d", null, contentValues);
    }

}
