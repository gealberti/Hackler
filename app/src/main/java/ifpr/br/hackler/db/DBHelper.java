package ifpr.br.hackler.db;

import android.os.Build;
import android.os.StrictMode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class DBHelper {

    private static String WEB_SERVICE_URL = "http://10.21.60.139/web_service/";

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

}
