import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = new String[5];
        char[] firstLetters = new char[5];

        System.out.println("Введіть 5 слів:");
        for (int i = 0; i < 5; i++) {
            words[i] = scanner.nextLine();
        }

        for (int i = 0; i < 5; i++) {
            firstLetters[i] = words[i].substring(0, 1).charAt(0);
        }

        System.out.print("Перші літери слів: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(firstLetters[i] + " ");
        }
    }
}
