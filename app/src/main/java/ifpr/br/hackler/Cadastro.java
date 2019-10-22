package ifpr.br.hackler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.Toast;

import java.io.IOException;

import ifpr.br.hackler.db.DBHelper;

public class Cadastro extends AppCompatActivity {

    EditText editTextNome;
    EditText editTextEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        enabledFullScreenMode();
        editTextNome = findViewById(R.id.Nome);
        editTextEmail = findViewById(R.id.Email);
    }
    public void cadastro (View view) throws IOException {
        String nome = editTextNome.getText().toString();
        String email = editTextEmail.getText().toString();
        DBHelper.insertIntoUsuario(email, nome);
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
