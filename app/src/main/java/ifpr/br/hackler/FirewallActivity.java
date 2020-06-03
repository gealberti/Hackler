package ifpr.br.hackler;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirewallActivity extends AppCompatActivity {

    protected static int contador = 0;
    private static int  SPLASH_TIME_OUT = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firewall);
        enabledFullScreenMode();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeIntent = new Intent(FirewallActivity.this, ListaMissoesActivity.class);
                startActivity(homeIntent);
                finish();
            }
        }, SPLASH_TIME_OUT);

        final Button destruir = findViewById(R.id.destruir) ;
        destruir.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                contador++;
                if(contador == 10) {
                    Intent intent = new Intent(FirewallActivity.this, Missao1Activity.class);
                    contador=0;
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
