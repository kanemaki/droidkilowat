package br.eti.kanemaki.droidkilowatt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

public class Main2Activity extends AppCompatActivity {
    private  EditText watts;
    private  TextView result;
    private float quantidade ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        watts = (EditText)findViewById(R.id.k1);
        result = (TextView)findViewById(R.id.k2);

    }

    public void Proximo(View view){
        Intent Main3Activity = new Intent(this, Main3Activity.class);
        startActivity(Main3Activity);
    }

    public void Calcular1(View view){

        if(watts.getText().toString().isEmpty()){

            Toast.makeText(Main2Activity.this, "Preenchimento obrigatório.", Toast.LENGTH_SHORT).show();

        }else{

            quantidade = Float.parseFloat(watts.getText().toString());
            quantidade = quantidade / 1000;
            result.setText(Float.toString(quantidade));

        }
    }
}
