import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("welcome to the calculator\n");
        System.out.println("Enter a command:");
        Calculator calculator = new Calculator();
        int result;
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;
        while(!exit) {
            if (scanner.hasNextLine()) {
                String input = scanner.nextLine();
                String[] parts = input.split(" ");
                String command = parts[0];
                switch (command) {
                    case "add":
                        result = calculator.add(Integer.parseInt(parts[1]), Integer.parseInt(parts[2]));
                        System.out.println(result);
                        break;

                    case "subtract":
                        result = calculator.subtract(Integer.parseInt(parts[1]), Integer.parseInt(parts[2]));
                        System.out.println(result);
                        break;

                    case "multiply":
                        result = calculator.multiply(Integer.parseInt(parts[1]), Integer.parseInt(parts[2]));
                        System.out.println(result);
                        break;

                    case "divide":
                        result = calculator.divide(Integer.parseInt(parts[1]), Integer.parseInt(parts[2]));
                        System.out.println(result);
                        break;

                    case "fibonacci":
                        result = calculator.fibonacciNumberFinder(Integer.parseInt(parts[1]));
                        System.out.println(result);
                        break;

                    case "binary":
                        String binary = calculator.intToBinaryNumber(Integer.parseInt(parts[1]));
                        System.out.println(binary);
                        break;
                    case "exit":
                        exit = true;
                        break;
                }
            }
        }
        scanner.close();
    }
}