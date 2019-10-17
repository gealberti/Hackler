package ifpr.br.hackler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

public class ListaMissoesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_missoes);
        enabledFullScreenMode();
    }
    public void voltarHome (View view){
        Intent voltarIntent = new Intent(ListaMissoesActivity.this, MainActivity.class);
        startActivity(voltarIntent);
        finish();
    }
    public void toastMissao (View view){
        Toast.makeText(getApplicationContext() , "Essa missão ainda não está disponível!", Toast.LENGTH_SHORT).show();
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
