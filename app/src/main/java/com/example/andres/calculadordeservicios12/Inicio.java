package com.example.andres.calculadordeservicios12;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class Inicio extends AppCompatActivity implements View.OnClickListener {

    private Button Agua,Luz,Gas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        Button Agua=(Button)findViewById(R.id.ButtonAgua);
        Button Luz=(Button)findViewById(R.id.ButtonLuz);
        Button Gas=(Button)findViewById(R.id.ButtonGas);

        Agua.setOnClickListener(this);
        Luz.setOnClickListener(this);
        Gas.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.ButtonAgua:
                Intent EnvioActvityAgua;
                EnvioActvityAgua =new Intent(Inicio.this,Agua.class);
                startActivity(EnvioActvityAgua);
                break;
            case R.id.ButtonLuz:
                Intent EnvioActvityLuz;
                EnvioActvityLuz =new Intent(Inicio.this,Luz.class);
                startActivity(EnvioActvityLuz);
                break;
            case R.id.ButtonGas:
                Intent EnvioActvityGas;
                EnvioActvityGas =new Intent(Inicio.this,Gas.class);
                startActivity(EnvioActvityGas);
                break;
        }
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_inicio, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
