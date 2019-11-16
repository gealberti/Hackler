package ifpr.br.hackler;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.Set;

import ifpr.br.hackler.db.DBHelper;

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

    public void descricaoConquistas(View v) throws IOException, JSONException {
        JSONArray todasDescricoes = DBHelper.descricaoConquista();
        int ID = 0;
        JSONObject descricao = todasDescricoes.getJSONObject(ID);
        String novadescricao = descricao.toString();
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Conquista");
        builder.setMessage(novadescricao);
        builder.setPositiveButton("Ok", null);
        builder.create().show();
    }



}
