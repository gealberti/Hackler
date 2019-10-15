package ifpr.br.hackler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void irConfig (View view){
        Intent configIntent = new Intent(MainActivity.this, SettingsActivity.class);
        startActivity(configIntent);
        finish();
    }
    public void irMissoes (View view){
        Intent missoesIntent = new Intent(MainActivity.this, ListaMissoesActivity.class);
        startActivity(missoesIntent);
        finish();
    }
    public void irLoja (View view){
        Intent lojaIntent = new Intent(MainActivity.this, LojaActivity.class);
        startActivity(lojaIntent);
        finish();
    }
    public void irCursos (View view){
        Intent cursosIntent = new Intent(MainActivity.this, ListaCursosActivity.class);
        startActivity(cursosIntent);
        finish();
    }



}
