import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String[] mas = a.split(" ");
        double valOne;
        double valTwo;

        try {

            valOne = Double.parseDouble(mas[0]);
            valTwo = Double.parseDouble(mas[2]);

            System.out.println(calc(valOne, valTwo, mas[1]));

        } catch (NumberFormatException nfe) {
            System.out.println("Error! Not number");
        } catch (ArithmeticException arEx) {
            System.out.println("Error! Division by zero");
        } catch (Exception mathEr) {
            System.out.println(mathEr.getMessage());
        }
    }

    public static double calc(double valOne, double valTwo, String sign) throws Exception {

        switch (sign) {

            case "+":
                return valOne + valTwo;
            case "-":
                return valOne - valTwo;
            case "*":
                return valOne * valTwo;
            case "/":
                if (valTwo == 0) {
                    throw new ArithmeticException();
                }
                return valOne / valTwo;

            default:
                throw new Exception("Operation Error!");

        }


    }
}
