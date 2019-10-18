package ifpr.br.hackler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

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

    public void login (View view){
        Intent loginIntent = new Intent(Login.this, SettingsActivity.class);
        startActivity(loginIntent);
        finish();
        Toast.makeText(getApplicationContext() , "Login feito!", Toast.LENGTH_SHORT).show();
    }

    public void voltarConfig (View view){
        Intent voltarIntent = new Intent(Login.this, SettingsActivity.class);
        startActivity(voltarIntent);
        finish();
    }


}
