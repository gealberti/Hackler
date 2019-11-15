package ifpr.br.hackler;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import ifpr.br.hackler.db.DBHelper;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        enabledFullScreenMode();
    }
    private void enabledFullScreenMode() {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        View decorView = getWindow().getDecorView();
        // Hide the status bar.
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
    }

    public void login (View view) throws JSONException, IOException {


        EditText emailLogin = findViewById(R.id.Email);
        EditText nomeLogin = findViewById(R.id.Nome);

        String emailDigitado = emailLogin.getText().toString();
        String nomeDigitado = nomeLogin.getText().toString();

        JSONArray todosOsUsuarios = DBHelper.selectAllFromUsuarios();
        boolean encontrou = false;
        for (int i = 0; i < todosOsUsuarios.length(); i++) {
            JSONObject usuario = todosOsUsuarios.getJSONObject(i);
            String email = usuario.getString("email");
            String nome = usuario.getString("nome");
            if (email.equals(emailDigitado) && nome.equals(nomeDigitado)) {
                encontrou = true;
                Intent intent = new Intent(this, SettingsActivity.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "Login feito!", Toast.LENGTH_SHORT).show();
            }
        }
        if (encontrou == false) {
            Toast.makeText(getApplicationContext(), "Login deu ruim ;(", Toast.LENGTH_SHORT).show();
        }
    }

        public void voltarConfig(View view){
            Intent voltarIntent = new Intent(Login.this, SettingsActivity.class);
            startActivity(voltarIntent);
            finish();
        }


    }

