package ifpr.br.hackler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class FirewallActivity extends AppCompatActivity {

    protected static int contador = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firewall);
        enabledFullScreenMode();

        final Button destruir = findViewById(R.id.destruir) ;
        destruir.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                contador++;
                if(contador == 10) {
                    Intent intent = new Intent(FirewallActivity.this, Missao1Activity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
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
