import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("ATTENTION: input \"exit\" to stop calculation!");
        while (true) {
            System.out.println("input:");
            String inputString = in.nextLine();
            if (inputString.equals("exit")) break;
            System.out.println("output:");
            try {
                System.out.println(calculator.calc(inputString));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        in.close();

    }

}