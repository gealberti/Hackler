package ifpr.br.hackler;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.concurrent.TimeUnit;
public class Missao1Activity extends AppCompatActivity {
    protected static int pistas = 0;
    protected static int contadorLocal = 0;
    protected static int contadorSenha = 0;
    protected static int contadorArquivos = 0;
    protected static int contadorAdmnistrador = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_missao1);
        enabledFullScreenMode();
        final TextView tempo = (TextView) findViewById(R.id.tempo);
        new CountDownTimer(300000, 1000) {
            @RequiresApi(api = Build.VERSION_CODES.N)
            public void onTick(long millisUntilFinished) {
                long minutes = (millisUntilFinished / 1000)  / 60;
                int seconds = (int)((millisUntilFinished / 1000) % 60);

                tempo.setText("" + minutes + ":" + seconds);
            }

            public void onFinish() {
                Intent Intent = new Intent(Missao1Activity.this, MissaoFalhou.class);
                startActivity(Intent);
                zera();
                finish();
            }
        }.start();
    }

    public void onLocal (View view){
        contadorLocal++;
        if(contadorLocal == 15) {
            ImageView pista1= (ImageView) findViewById(R.id.pistaVazia2);
            pista1.setImageResource(R.drawable.pistaencontrada);
            Toast.makeText(getApplicationContext(), "Você achou a terceira pasta!", Toast.LENGTH_SHORT).show();
            pistas++;
            if(pistas == 3){
                Intent ganhou = new Intent(Missao1Activity.this, MissaoConcluida.class);
                startActivity(ganhou);
                zera();
                finish();
            }
        }
    }
    public void onAdministrador (View view){
        contadorAdmnistrador++;
        if(contadorAdmnistrador == 10){
            irFirewall();
        }
    }
    public void onSenha (View view){
        contadorSenha++;
        if(contadorSenha == 15) {
            ImageView pista1= (ImageView) findViewById(R.id.pistaVazia1);
            pista1.setImageResource(R.drawable.pistaencontrada);
            Toast.makeText(getApplicationContext(), "Você achou a segunda pasta!", Toast.LENGTH_SHORT).show();
            pistas++;
            if(pistas == 3){
                Intent ganhou = new Intent(Missao1Activity.this, MissaoConcluida.class);
                startActivity(ganhou);
                zera();
                finish();
            }
        }
    }
    public void onArquivos(View v) {
        contadorArquivos++;
        if(contadorArquivos == 15) {
            ImageView pista1= (ImageView) findViewById(R.id.pistaVazia);
            pista1.setImageResource(R.drawable.pistaencontrada);
            Toast.makeText(getApplicationContext(), "Você achou a primeira pasta!", Toast.LENGTH_SHORT).show();
            pistas++;
            if(pistas == 3){
                Intent ganhou = new Intent(Missao1Activity.this, MissaoConcluida.class);
                startActivity(ganhou);
                zera();
                finish();
            }
        }
    }
    public void irFirewall(){
        Intent intent = new Intent(Missao1Activity.this, FirewallActivity.class);
        startActivity(intent);
    }
    private void zera(){
        pistas = 0;
        contadorLocal = 0;
        contadorSenha = 0;
        contadorArquivos = 0;
        contadorAdmnistrador = 0;
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

