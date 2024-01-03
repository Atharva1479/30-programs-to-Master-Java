//13. Convert color Hex code to RGB code

import java.util.Scanner;

public class Thirteen_HexToRGB {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a color Hex code: ");
        String hexCode = scanner.nextLine();

        int r = Integer.parseInt(hexCode.substring(0, 2), 16);
        int g = Integer.parseInt(hexCode.substring(2, 4), 16);
        int b = Integer.parseInt(hexCode.substring(4, 6), 16);

        System.out.println("The RGB code for " + hexCode + " is " + r + ", " + g + ", " + b);
    }
}
