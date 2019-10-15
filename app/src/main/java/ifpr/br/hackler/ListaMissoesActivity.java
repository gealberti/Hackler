package ifpr.br.hackler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ListaMissoesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_missoes);
    }
    public void irMissao (View view){
        Intent missaoIntent = new Intent(ListaMissoesActivity.this, Missao1.class);
        startActivity(missaoIntent);
        finish();
    }
    public void voltarHome (View view){
        Intent voltarIntent = new Intent(ListaMissoesActivity.this, MainActivity.class);
        startActivity(voltarIntent);
        finish();
    }
}
