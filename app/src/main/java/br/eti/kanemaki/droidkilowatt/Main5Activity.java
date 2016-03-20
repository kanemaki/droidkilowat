package br.eti.kanemaki.droidkilowatt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

public class Main5Activity extends AppCompatActivity {
    private EditText kwatts;
    private EditText reais;
    private TextView result;
    private float kwh ;
    private float real;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        kwatts  = (EditText)findViewById(R.id.k9);
        reais   = (EditText)findViewById(R.id.k10);
        result  = (TextView)findViewById(R.id.k11);
    }

    public void Calcular4(View view){

        if(kwatts.getText().toString().isEmpty() || reais.getText().toString().isEmpty()){
            Toast.makeText(Main5Activity.this, "Preenchimento obrigatório.", Toast.LENGTH_SHORT).show();
        }else{

            kwh = Float.parseFloat(kwatts.getText().toString());
            real  = Float.parseFloat(reais.getText().toString());

            real = kwh * real;

            result.setText(NumberFormat.getCurrencyInstance().format(real));
        }



    }
}
