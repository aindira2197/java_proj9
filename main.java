import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Matn kiriting: ");

        String text = sc.nextLine();

        for (int i = text.length() - 1; i >= 0; i--) {
            System.out.print(text.charAt(i));
        }

    }
}
