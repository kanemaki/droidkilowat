package br.eti.kanemaki.droidkilowatt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Proximo(View view){
        Intent Main1Activity = new Intent(this, Main1Activity.class);
        startActivity(Main1Activity);

    }
}
