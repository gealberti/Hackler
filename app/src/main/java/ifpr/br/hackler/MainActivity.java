package ifpr.br.hackler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        enabledFullScreenMode();

    }
    public void irConfig (View view){
        Intent configIntent = new Intent(MainActivity.this, SettingsActivity.class);
        startActivity(configIntent);
    }
    public void irMissoes (View view){
        Intent missoesIntent = new Intent(MainActivity.this, ListaMissoesActivity.class);
        startActivity(missoesIntent);
    }
    public void irLoja (View view){
        Intent lojaIntent = new Intent(MainActivity.this, LojaActivity.class);
        startActivity(lojaIntent);
    }
    public void irCursos (View view){
        Intent cursosIntent = new Intent(MainActivity.this, ListaCursosActivity.class);
        startActivity(cursosIntent);
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
