package br.eti.kanemaki.droidkilowatt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
    private EditText kwatts;
    private EditText horas;
    private TextView result;
    private float kwh ;
    private int hr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        kwatts = (EditText)findViewById(R.id.k3);
        horas  = (EditText)findViewById(R.id.k4);
        result = (TextView)findViewById(R.id.k5);

    }

    public void Proximo(View view){
        Intent Main4Activity = new Intent(this, Main4Activity.class);
        startActivity(Main4Activity);

    }

    public void Calcular2(View view){


        if(kwatts.getText().toString().isEmpty() || horas.getText().toString().isEmpty() ){

            Toast.makeText(Main3Activity.this, "Preenchimento obrigatório.", Toast.LENGTH_SHORT).show();

        }else{
            kwh = Float.parseFloat(kwatts.getText().toString());
            hr  = Integer.parseInt(horas.getText().toString());

            result.setText(Float.toString((kwh * hr)));

        }
    }
}

