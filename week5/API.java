package week5;

import java.util.Scanner;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.*;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONString;
import org.json.simple.perser.JSONParser;


public class API {
    public static void main(String[] args, Object https) throws Exception {
        try{
            //pubic API:
            //

            URL url;
            URL url1 = new URL("https://docs.oracle.com/javase/6/docs/api/");

            HttpURLConnection conn = (HttpURLConnection) url1.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();

            //check if connect is made 
            int responseCode = conn.getResponseCode();

            //200 ok
            if (responseCode != 200){
            throw RuntimeException("HttpResponseCode: ");
            }else{
                StringBuilder informationString = new StringBuilder(null);
                Scanner scanner = new Scanner(url.openStream());

                while (scanner.hasNext()){
                informationString.append(scanner.nextLine());
                }

            //Close the scanner
            scanner.close();

            System.out.println(informationString);

            //JSON simple Library setup with maven is used to covert string to JSON
            JSONParser parse = new JSONParser();
            JSONArray dataObejct = (JSONArray) perse.perse(String.valueof(informationString));

            //Get the first JSON object in teh JSON array
            System.ot.println(dataObejct.get(0));

            JSONObject countryData = (JSONObject) dataObject.get(0);

            System.out.println(countryData.get("Location_type"));
            }
        }   catch(Exception e){
            e.printStackTrace();
            }
        // Menghitung jumlah constructor yang dimiliki oleh class String
        int constructorCount = String.class.getConstructors().length;
        System.out.println("Jumlah constructor pada class String: " + constructorCount);
    
        // Menghitung jumlah method yang dimiliki oleh class String
        int methodCount = String.class.getMethods().length;
        System.out.println("Jumlah method pada class String: " + methodCount);
    
        // Menampilkan 3 method beserta kegunaannya (selain yang sudah disebutkan pada slide)
        System.out.println("Tiga method beserta kegunaannya:");
        System.out.println("1. indexOf(int ch): Mencari indeks pertama dari karakter yang sesuai dengan nilai ch dalam string.");
        System.out.println("2. substring(int beginIndex, int endIndex): Mengembalikan subtring dari string asli yang dimulai dari beginIndex hingga endIndex - 1.");
        System.out.println("3. replace(CharSequence target, CharSequence replacement): Mengganti semua kemunculan target dalam string dengan replacement.");
    }

    private static Exception RuntimeException(String string) {
        return null;
    }
}

