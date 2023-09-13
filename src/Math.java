import java.util.Scanner;

public class Math {
    static char mathOper;
    static double result;

    public static void math() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        result = scanner.nextDouble();

        boolean run = true;

        while (run) {
            System.out.println("Enter Math.operator");
            mathOper = scanner.next().charAt(0);

            if (mathOper == '+') {
                System.out.println("Enter your number");
                result += scanner.nextDouble();
                System.out.println("Result: " + result);

            } else if (mathOper == '-') {
                System.out.println("Enter your number");
                result -= scanner.nextDouble();
                System.out.println("Result: " + result);

            } else if (mathOper == '/') {
                System.out.println("Enter your number");
                result /= scanner.nextDouble();
                System.out.println("Result: " + result);

            } else if (mathOper == '*') {
                System.out.println("Enter your number");
                result *= scanner.nextDouble();
                System.out.println("Result: " + result);

            } else if (mathOper == 'c') {
                System.out.println("New Start");
                result = scanner.nextDouble();

            } else if (mathOper == 's') {
                run = false;
                result = 0;
                System.out.println("The program is over");

            } else {
                System.out.println("Ты ввёл неподдерживаемую операцию");
            }
        }
    }
}
