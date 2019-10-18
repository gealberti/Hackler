package ifpr.br.hackler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

public class Cadastro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        enabledFullScreenMode();
    }
    public void cadastro (View view){
        Intent cadastroIntent = new Intent(Cadastro.this, SettingsActivity.class);
        startActivity(cadastroIntent);
        finish();
        Toast.makeText(getApplicationContext() , "Cadastro realizado com sucesso!", Toast.LENGTH_SHORT).show();
    }

    private void enabledFullScreenMode() {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        View decorView = getWindow().getDecorView();
        // Hide the status bar.
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
    }

    public void voltarConfig (View view){
        Intent voltarIntent = new Intent(Cadastro.this, SettingsActivity.class);
        startActivity(voltarIntent);
        finish();
    }
}
