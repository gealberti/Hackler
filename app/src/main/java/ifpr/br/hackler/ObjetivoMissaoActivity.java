package ifpr.br.hackler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

public class ObjetivoMissaoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_objetivo_missao);
        enabledFullScreenMode();
    }

    public void voltarLista (View view){
        Intent voltarIntent = new Intent(ObjetivoMissaoActivity.this, ListaMissoesActivity.class);
        startActivity(voltarIntent);
        finish();
    }

    private void enabledFullScreenMode() {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        View decorView = getWindow().getDecorView();
        // Hide the status bar.
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
    }

    public void irMissão (View view){
        Intent intent = new Intent(ObjetivoMissaoActivity.this, Missao1Activity.class);
        startActivity(intent);
        finish();
    }

}
