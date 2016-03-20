package br.eti.kanemaki.droidkilowatt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {
    private EditText kwatts;
    private EditText dias;
    private TextView result;
    private float kwh ;
    private int dia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        kwatts = (EditText)findViewById(R.id.k6);
        dias   = (EditText)findViewById(R.id.k7);
        result = (TextView)findViewById(R.id.k8);
    }

    public void Proximo(View view){
        Intent Main5Activity = new Intent(this, Main5Activity.class);
        startActivity(Main5Activity);

    }

    public void Calcular3(View view){

        if(kwatts.getText().toString().isEmpty() || dias.getText().toString().isEmpty()){
            Toast.makeText(Main4Activity.this, "Preenchimento obrigatório.", Toast.LENGTH_SHORT).show();
        }else{

            kwh = Float.parseFloat(kwatts.getText().toString());
            dia  = Integer.parseInt(dias.getText().toString());

            result.setText(Float.toString((kwh * dia)));
        }

    }
}
