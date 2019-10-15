package ifpr.br.hackler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
    }
    public void irConquistas (View view){
        Intent conquestIntent = new Intent(SettingsActivity.this, Conquistas.class);
        startActivity(conquestIntent);
        finish();
    }
    public void voltarConfig (View view){
        Intent voltarIntent = new Intent(SettingsActivity.this, MainActivity.class);
        startActivity(voltarIntent);
        finish();
    }

}
