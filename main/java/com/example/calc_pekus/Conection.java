package com.example.calc_pekus;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.view.View;

import androidx.annotation.Nullable;

public class Conection extends SQLiteOpenHelper {

    private static final String nome = "Banco.db";
    private static final int versao = 1;

    public Conection(@Nullable View.OnClickListener context) {
        super((Context) context, nome, null, versao);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE recente (id INTENGER PRIMARY KEY AUTOINCREMENT, valorA FLOAT, valorB FLOAT, operacao VARCHAR(2), resultado FLOAT)");
    }
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
    }
}
