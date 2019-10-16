package ifpr.br.hackler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

import java.util.Set;

public class Conquistas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conquistas);
        enabledFullScreenMode();
    }
    public void voltarConfig (View view){
        Intent voltarIntent = new Intent(Conquistas.this, SettingsActivity.class);
        startActivity(voltarIntent);
        finish();
    }
    public void moedasConquista (View view){
        Toast.makeText(getApplicationContext() , "Parabéns! +50sitcoins", Toast.LENGTH_SHORT).show();
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
