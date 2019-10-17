package ifpr.br.hackler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

public class LojaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loja);
        enabledFullScreenMode();
    }

    public void voltarHome (View view){
        Intent voltarIntent = new Intent(LojaActivity.this, MainActivity.class);
        startActivity(voltarIntent);
        finish();
    }

    public void adquirirItem (View view){
        Toast.makeText(getApplicationContext() , "Você adquiriu um item!", Toast.LENGTH_SHORT).show();
    }

    public void descricaoCapuccino (View view){
        Toast.makeText(getApplicationContext() , "Descrição webservice", Toast.LENGTH_SHORT).show();
    }
    public void descricaoCafe (View view){
        Toast.makeText(getApplicationContext() , "Descrição webservice", Toast.LENGTH_SHORT).show();
    }
    public void descricaoEnergetico (View view){
        Toast.makeText(getApplicationContext() , "Descrição webservice", Toast.LENGTH_SHORT).show();
    }
    public void descricaoAntivirus (View view){
        Toast.makeText(getApplicationContext() , "Descrição webservice", Toast.LENGTH_SHORT).show();
    }
    public void descricaoBloqueador (View view){
        Toast.makeText(getApplicationContext() , "Descrição webservice", Toast.LENGTH_SHORT).show();
    }
    public void descricaoLupa (View view){
        Toast.makeText(getApplicationContext() , "Descrição webservice", Toast.LENGTH_SHORT).show();
    }
    public void descricaoOculos (View view){
        Toast.makeText(getApplicationContext() , "Descrição webservice", Toast.LENGTH_SHORT).show();
    }
    public void descricaoXP (View view){
        Toast.makeText(getApplicationContext() , "Descrição webservice", Toast.LENGTH_SHORT).show();
    }


    private void enabledFullScreenMode() {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        View decorView = getWindow().getDecorView();
        // Hide the status bar.
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
    }

}
