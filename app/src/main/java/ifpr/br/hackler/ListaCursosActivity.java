package ifpr.br.hackler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ListaCursosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_cursos);
    }

    public void voltarConfig (View view){
        Intent voltarIntent = new Intent(ListaCursosActivity.this, MainActivity.class);
        startActivity(voltarIntent);
        finish();
    }
}

