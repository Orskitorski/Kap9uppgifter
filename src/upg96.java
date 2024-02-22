import java.util.Scanner;

public class upg96 {
    public static void main(String[] args) {
        Scanner tgb = new Scanner(System.in);
        String input = tgb.next();
        rot(input);
    }

    public static void rot(String input) {
        int wordCount = 1;
        int rowCount = 1;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                wordCount++;
            }
            if (input.charAt(i) == '\n') {
                rowCount++;
            }
        }
        System.out.println(rowCount + " " + wordCount + " " + input.length());
    }
}
