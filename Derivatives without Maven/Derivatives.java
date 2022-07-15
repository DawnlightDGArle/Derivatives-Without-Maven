import java.util.Scanner;

class Derivatives {
    public static void main (String [] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Input function:");
            String function = scan.nextLine();
            if (function.contains("x")) {
                int x = function.indexOf('^');
                String pow = function.substring(x + 1);
                long power = Long.parseLong(pow);

                int y = function.indexOf('x');
                String num = function.substring(0, y);
                long base = Long.parseLong(num);

                System.out.println("Power: " + power + "\nBase: " + base);

                long firstDerivative = power * base;

                System.out.println("Output Derivative:");
                System.out.println(firstDerivative + "x^" + (power - 1));

            }

            else {
                System.out.println(function);
            }
        }

    }

}


