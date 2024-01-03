//21. Include a library in your cide and use its functions

import java.util.Base64;

public class TwentyOne_UsingLibrary {
    public static void main(String[] args) {
        
        String originalText = "Hello, World!";
        
        // Encode the original text using Base64
        String encodedText = Base64.getEncoder().encodeToString(originalText.getBytes());
        System.out.println("Encoded text: " + encodedText);

        // Decode the encoded text using Base64
        byte[] decodedBytes = Base64.getDecoder().decode(encodedText);
        String decodedText = new String(decodedBytes);
        System.out.println("Decoded text: " + decodedText);
    }
}
