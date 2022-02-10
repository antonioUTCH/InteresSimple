package com.example.interessimple;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcularInteres(View v)
    {
        EditText sCapital = (EditText)findViewById(R.id.txtCapital);
        EditText sTasa = (EditText)findViewById(R.id.txtTasa);
        EditText sPeriodo = (EditText)findViewById(R.id.txtPeriodos);

        TextView sInteres = (TextView) findViewById(R.id.lblResultado);

        double capital = Double.parseDouble(sCapital.getText().toString());
        double tasa = Double.parseDouble(sTasa.getText().toString());
        double periodo = Double.parseDouble(sPeriodo.getText().toString());

        double monto = capital * (tasa/100) * periodo;
        double interes = monto + capital;

        sInteres.setText("Total a pagar: " + String.valueOf(interes));


    }
}