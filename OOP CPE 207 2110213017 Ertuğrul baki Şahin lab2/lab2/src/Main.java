import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Builder builder = new Builder("Ali", 150);

        Scanner scanner = new Scanner(System.in);
        builder.PerhourWages = scanner.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        builder.WorkHour = scanner2.nextInt();

        System.out.println(builder);
        System.out.println(builder.calculateSalary());

    }
}

