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

public class DeleteActivity extends AppCompatActivity {

    EditText editTextEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete);
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

    public void voltarConfig (View view){
        Intent voltarIntent = new Intent(DeleteActivity.this, SettingsActivity.class);
        startActivity(voltarIntent);
        finish();
    }

    public void deletarConta(View v) throws IOException {
        String email = editTextEmail.getText().toString();
        DBHelper.deleteUsuario(email);
        Intent deleteIntent = new Intent(DeleteActivity.this, SettingsActivity.class);
        startActivity(deleteIntent);
        finish();
        Toast.makeText(getApplicationContext() , "Adeus... :,(", Toast.LENGTH_SHORT).show();
    }
}
