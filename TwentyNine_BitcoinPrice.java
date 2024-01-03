//29. Get the current Bitcoin price

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class TwentyNine_BitcoinPrice {
    public static void main(String[] args) {
        try {
            // Create URL object for the CoinGecko API
            URL url = new URL("https://api.coingecko.com/api/v3/simple/price?ids=bitcoin&vs_currencies=usd");

            // Create HttpURLConnection
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            // Read the response
            Scanner scanner = new Scanner(conn.getInputStream());
            StringBuilder response = new StringBuilder();
            while (scanner.hasNextLine()) {
                response.append(scanner.nextLine());
            }
            scanner.close();

            // Parse the JSON response to get the Bitcoin price
            String json = response.toString();
            double bitcoinPrice = parseBitcoinPrice(json);

            System.out.println("Current Bitcoin price: $" + bitcoinPrice);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static double parseBitcoinPrice(String json) {
        // Extract the Bitcoin price from the JSON response
        // Assumes the JSON response has the format: {"bitcoin":{"usd":<price>}}
        int start = json.indexOf(":") + 1;
        int end = json.indexOf("}");

        String priceString = json.substring(start, end);
        return Double.parseDouble(priceString);
    }
}

/*import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class TwentyNine_BitcoinPrice {
    public static void main(String[] args) {
        try {
            // Create URL object for the CoinGecko API
            URL url = new URL("https://api.coingecko.com/api/v3/simple/price?ids=bitcoin&vs_currencies=usd");

            // Read the response and extract the Bitcoin price
            Scanner scanner = new Scanner(url.openStream());
            String response = scanner.useDelimiter("\\A").next();
            scanner.close();

            double bitcoinPrice = Double.parseDouble(response.substring(response.indexOf(":") + 1, response.indexOf("}")));

            System.out.println("Current Bitcoin price: $" + bitcoinPrice);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
 */
