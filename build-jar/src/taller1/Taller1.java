package taller1;

import java.net.URL;
import java.net.URLConnection;

public class Taller1 {
    private static final String dni = "44550153";
    private static final String urlName = "http://212.128.140.128/iot/tiempoActivo.php?set=1&dni=";

    public static void main(String[] args) {
        Taller1 taller1 = new Taller1();
    }

    public Taller1() {
        while (true) // calls the url every 30 secs
        {
            callUrl();
            try {
                Thread.sleep(30000);
            } catch (InterruptedException ex) {
            }
        }
    }

    private void callUrl() {
        URL miUrl;
        try {
            String finalUrl = urlName + "" + dni;
            System.out.println("Calling URL: " + finalUrl);
            miUrl = new URL(finalUrl);
            URLConnection miUrlCon = miUrl.openConnection();
            miUrlCon.getInputStream();
        } catch (Exception e) {
            System.err.println("URL not found");
        }
    }
}