package ifpr.br.hackler;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import ifpr.br.hackler.db.DBHelper;

public class LojaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loja);
        enabledFullScreenMode();
    }

    public void voltarHome (View view){
        Intent voltarIntent = new Intent(LojaActivity.this, MainActivity.class);
        startActivity(voltarIntent);
        finish();
    }

    public void adquirirItem (View view){
        Toast.makeText(getApplicationContext() , "Você adquiriu um item!", Toast.LENGTH_SHORT).show();
    }

    public void descricaoCapuccino (View view) throws IOException, JSONException {
        JSONArray todasDescricoes = DBHelper.readDescricaoLoja();
        int ID = 0;
        JSONObject descricao = todasDescricoes.getJSONObject(ID);
        String novadescricao = descricao.toString();
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Capuccino!");
        builder.setMessage(novadescricao);
        builder.setPositiveButton("Ok", null);
        builder.create().show();
    }
    public void descricaoCafe (View view) throws IOException, JSONException {
        JSONArray todasDescricoes = DBHelper.readDescricaoLoja();
        int ID = 1;
        JSONObject descricao = todasDescricoes.getJSONObject(ID);
        String novadescricao = descricao.toString();
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Café!");
        builder.setMessage(novadescricao);
        builder.setPositiveButton("Ok", null);
        builder.create().show();
    }
    public void descricaoEnergetico (View view) throws IOException, JSONException {
        JSONArray todasDescricoes = DBHelper.readDescricaoLoja();
        int ID = 2;
        JSONObject descricao = todasDescricoes.getJSONObject(ID);
        String novadescricao = descricao.toString();
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Energético!");
        builder.setMessage(novadescricao);
        builder.setPositiveButton("Ok", null);
        builder.create().show();
    }
    public void descricaoAntivirus (View view) throws IOException, JSONException {
        JSONArray todasDescricoes = DBHelper.readDescricaoLoja();
        int ID = 3;
        JSONObject descricao = todasDescricoes.getJSONObject(ID);
        String novadescricao = descricao.toString();
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Antivírus!");
        builder.setMessage(novadescricao);
        builder.setPositiveButton("Ok", null);
        builder.create().show();
    }
    public void descricaoBloqueador (View view) throws IOException, JSONException {
        JSONArray todasDescricoes = DBHelper.readDescricaoLoja();
        int ID = 4;
        JSONObject descricao = todasDescricoes.getJSONObject(ID);
        String novadescricao = descricao.toString();
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Bloqueador de Firewaal!");
        builder.setMessage(novadescricao);
        builder.setPositiveButton("Ok", null);
        builder.create().show();
    }
    public void descricaoLupa (View view) throws IOException, JSONException {
        JSONArray todasDescricoes = DBHelper.readDescricaoLoja();
        int ID = 5;
        JSONObject descricao = todasDescricoes.getJSONObject(ID);
        String novadescricao = descricao.toString();
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Lupa!");
        builder.setMessage(novadescricao);
        builder.setPositiveButton("Ok", null);
        builder.create().show();
    }
    public void descricaoOculos (View view) throws IOException, JSONException {
        JSONArray todasDescricoes = DBHelper.readDescricaoLoja();
        int ID = 6;
        JSONObject descricao = todasDescricoes.getJSONObject(ID);
        String novadescricao = descricao.toString();
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Óculos!");
        builder.setMessage(novadescricao);
        builder.setPositiveButton("Ok", null);
        builder.create().show();
    }
    public void descricaoXP (View view) throws IOException, JSONException {
        JSONArray todasDescricoes = DBHelper.readDescricaoLoja();
        int ID = 7;
        JSONObject descricao = todasDescricoes.getJSONObject(ID);
        String novadescricao = descricao.toString();
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("+XP!");
        builder.setMessage(novadescricao);
        builder.setPositiveButton("Ok", null);
        builder.create().show();
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
