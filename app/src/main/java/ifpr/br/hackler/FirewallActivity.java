package ifpr.br.hackler;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FirewallActivity extends AppCompatActivity {

    protected static int contador = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firewall);
        enabledFullScreenMode();

        final TextView tempo = (TextView) findViewById(R.id.tempo);
        final CountDownTimer Timer = new CountDownTimer(10000, 1000) {
            @RequiresApi(api = Build.VERSION_CODES.N)
            public void onTick(long millisUntilFinished) {
                long minutes = (millisUntilFinished / 1000)  / 60;
                int seconds = (int)((millisUntilFinished / 1000) % 60);

                tempo.setText(seconds + "s");
            }

            public void onFinish() {
                Intent Intent = new Intent(FirewallActivity.this, ListaMissoesActivity.class);
                contador=0;
                startActivity(Intent);
                finish();
            }
        }.start();

        final Button destruir = findViewById(R.id.destruir) ;
        destruir.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                contador++;
                if(contador == 10) {
                    Timer.cancel();
                    contador=0;
                    finish();}
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
    /**/