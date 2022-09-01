package com.example.calc_pekus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    EditText txtValor1, txtValor2;
    RadioButton optSoma, optSubtrai, optMultiplica, optDivide;
    Button cmdCalcular, cmdLimpar;
    ImageButton cmdLista;
    TextView lblResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Objects.requireNonNull(getSupportActionBar()).hide();

        txtValor1 = (EditText) findViewById(R.id.txtValor1);
        txtValor2 = (EditText) findViewById(R.id.txtValor2);
        optSoma = (RadioButton) findViewById(R.id.optSoma);
        optSubtrai = (RadioButton) findViewById(R.id.optSubtrai);
        optMultiplica = (RadioButton) findViewById(R.id.optMultiplica);
        optDivide = (RadioButton) findViewById(R.id.optDivide);
        cmdCalcular = (Button) findViewById(R.id.cmdCalcular);
        cmdLimpar = (Button) findViewById(R.id.cmdLimpar);
        cmdLista = (ImageButton) findViewById(R.id.cmdLista);
        lblResultado = (TextView) findViewById(R.id.lblResultado);

        cmdCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                dados dados = new dados(optSoma.getText().toString(), optSubtrai.getText().toString(),optMultiplica.getText().toString(),optDivide.getText().toString(), Double.parseDouble(txtValor1.getText().toString()), Double.parseDouble(txtValor2.getText().toString()));
                BancoController bdControl = new BancoController(this);
                long Dados = bdControl.inserir(dados);

                double n1 = Double.parseDouble(txtValor1.getText().toString());
                double n2 = Double.parseDouble(txtValor2.getText().toString());
                double dResultado;

                if (optSoma.isChecked()) {
                    dResultado = n1 + n2;
                    lblResultado.setText("" + dResultado);
                }
                if (optSubtrai.isChecked()) {
                    dResultado = n1 - n2;
                    lblResultado.setText("" + dResultado);
                }
                if (optMultiplica.isChecked()) {
                    dResultado = n1 * n2;
                    lblResultado.setText("" + dResultado);
                }
                if (optDivide.isChecked()) {
                    dResultado = n1 / n2;
                    lblResultado.setText("" + dResultado);
                }
            }
        });

        cmdLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lblResultado.setText("");
                txtValor1.setText("");
                txtValor2.setText("");
            }
        });

        cmdLista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Recent.class);
                startActivity(intent);
            }
        });

    }
}