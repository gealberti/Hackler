package ifpr.br.hackler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Switch;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        enabledFullScreenMode();
    }
    public void irConquistas (View view){
        Intent conquestIntent = new Intent(SettingsActivity.this, Conquistas.class);
        startActivity(conquestIntent);

    }
    public void voltarConfig (View view){
        Intent voltarIntent = new Intent(SettingsActivity.this, MainActivity.class);
        startActivity(voltarIntent);
    }
    private void enabledFullScreenMode() {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        View decorView = getWindow().getDecorView();
        // Hide the status bar.
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
    }
    public void cadastrar (View view){
        Intent cadastroIntent = new Intent(SettingsActivity.this, Cadastro.class);
        startActivity(cadastroIntent);

    }

    public void irLogin (View view){
        Intent logIntent = new Intent(SettingsActivity.this, Login.class);
        startActivity(logIntent);

    }

    public void irDelete (View view){
        Intent delIntent = new Intent(SettingsActivity.this, DeleteActivity.class);
        startActivity(delIntent);
        finish();
    }

    MediaPlayer mp;

    public void tocarMusica(View view){
        Switch musicaswitch = (Switch) view;
        boolean isOn = musicaswitch.isChecked();
        if(isOn){
            mp = MediaPlayer.create(SettingsActivity.this, R.raw.megadrive);
            mp.start();
        }else{mp.stop();}
    }
}
