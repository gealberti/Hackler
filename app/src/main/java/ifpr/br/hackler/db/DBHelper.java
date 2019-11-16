package ifpr.br.hackler.db;

import android.os.Build;
import android.os.StrictMode;

import org.json.JSONArray;
import org.json.JSONException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class DBHelper {

    private static String WEB_SERVICE_URL = "http://192.168.15.7/web_service/";

    private static void checkThreadPolicy() {
        int SDK_INT = Build.VERSION.SDK_INT;
        if (SDK_INT > 8) {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
        }
    }

    public static boolean insertIntoUsuario(String email, String nome) throws IOException {
        checkThreadPolicy();
        String parametros = "email="+email+"&nome="+nome;
        URL url = new URL(WEB_SERVICE_URL + "ws_insert/ws_insert_usuario.php?" + parametros);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String resposta = bufferedReader.readLine();
        return resposta.equals("true");
    }

    public static boolean deleteUsuario(String email) throws IOException {
        checkThreadPolicy();
        String parametros = "email="+email;
        URL url = new URL(WEB_SERVICE_URL + "ws_delete/ws_delete_usuario.php?" + parametros);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String resposta = bufferedReader.readLine();
        return resposta.equals("true");
    }
    public static JSONArray selectAllFromUsuarios() throws IOException, JSONException {
        checkThreadPolicy();
        URL url = new URL(WEB_SERVICE_URL + "ws_read/ws_read_usuario.php?");
        HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
        BufferedReader br = new BufferedReader(new InputStreamReader(conexao.getInputStream()));
        StringBuilder sb = new StringBuilder();
        String resposta;
        while((resposta = br.readLine())!=null){
            sb.append(resposta);

        }
        JSONArray jsonArray =  new JSONArray(sb.toString().trim());
        return jsonArray;
    }

    public static JSONArray readDescricaoLoja() throws IOException, JSONException {
        checkThreadPolicy();
        URL url = new URL(WEB_SERVICE_URL + "ws_read/ws_read_item.php");
        HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
        BufferedReader br = new BufferedReader(new InputStreamReader(conexao.getInputStream()));
        StringBuilder sb = new StringBuilder();
        String resposta;
        while((resposta = br.readLine())!=null){
            sb.append(resposta);

        }
        JSONArray jsonArray =  new JSONArray(sb.toString().trim());
        return jsonArray;
    }

    public static JSONArray descricaoConquista() throws IOException, JSONException {
        checkThreadPolicy();
        URL url = new URL(WEB_SERVICE_URL + "ws_read/ws_read_conquistas.php");
        HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
        BufferedReader br = new BufferedReader(new InputStreamReader(conexao.getInputStream()));
        StringBuilder sb = new StringBuilder();
        String resposta;
        while((resposta = br.readLine())!=null){
            sb.append(resposta);

        }
        JSONArray jsonArray =  new JSONArray(sb.toString().trim());
        return jsonArray;
    }




}
