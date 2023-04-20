
import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть перше ім'я:");
        String name1 = scanner.nextLine().toLowerCase();

        System.out.println("Введіть друге ім'я:");
        String name2 = scanner.nextLine().toLowerCase();

        if (name1.equals(name2)) {
            System.out.println("Ці імена ідентичні");
        } else {
            System.out.println("Ці імена не ідентичні");
        }
    }
}
