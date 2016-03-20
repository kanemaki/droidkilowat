package br.eti.kanemaki.droidkilowatt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
    }

    public void Proximo(View view){
        Intent Main2Activity = new Intent(this, Main2Activity.class);
        startActivity(Main2Activity);

    }
}
