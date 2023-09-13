import java.util.Scanner;

public class Math {
    static char mathOper;
    static double sum;

    public static void math() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        sum = scanner.nextDouble();

        boolean run = true;

        while (run) {
            System.out.println("Enter Math.operator");
            mathOper = scanner.next().charAt(0);

            if (mathOper == '+') {
                System.out.println("Enter your number");
                sum += scanner.nextDouble();
                System.out.println("Result: " + sum);

            } else if (mathOper == '-') {
                System.out.println("Enter your number");
                sum -= scanner.nextDouble();
                System.out.println("Result: " + sum);

            } else if (mathOper == '/') {
                System.out.println("Enter your number");
                sum /= scanner.nextDouble();
                System.out.println("Result: " + sum);

            } else if (mathOper == '*') {
                System.out.println("Enter your number");
                sum *= scanner.nextDouble();
                System.out.println("Result: " + sum);

            } else if (mathOper == 'c') {
                System.out.println("New Start");
                sum = scanner.nextDouble();

            } else if (mathOper == 's') {
                run = false;
                sum = 0;
                System.out.println("The program is over");

            } else {
                System.out.println("Ты ввёл неподдерживаемую операцию");
            }
        }
    }
}
