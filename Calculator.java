import java.util.Scanner;

class Calculator {

    public static int calculate(int a, int b, char op) {
        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': 
                if (b == 0) {
                    System.out.println("Error: Division by zero!");
                    return a; 
                }
                return a / b;
            case '%':
                if (b == 0) {
                    System.out.println("Error: Modulo by zero!");
                    return a;
                }
                return a % b;
            default:
                System.out.println("Invalid operator!");
                return a;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        boolean firstInput = true;

        System.out.println("🧮 Intelligent Calculator");
        System.out.println("You can use operators: +, -, *, /, %");
        System.out.println("Type 'q' anytime to quit.");

        while (true) {
            try {
                int num;
                if (firstInput) {
                    System.out.print("Enter first number: ");
                    num = sc.nextInt();
                    result = num;
                    firstInput = false;
                }

                System.out.print("Enter operator (+ - * / %), or 'q' to quit: ");
                String opInput = sc.next();
                if (opInput.equalsIgnoreCase("q")) break;

                char op = opInput.charAt(0);

                System.out.print("Enter next number: ");
                int nextNum = sc.nextInt();

                int oldResult = result;
                result = calculate(result, nextNum, op);

                System.out.println(oldResult + " " + op + " " + nextNum + " = " + result);
            } 
            catch (Exception e) {
                System.out.println("Invalid input! Please try again.");
                sc.nextLine(); 
            }
        }

        System.out.println("Calculator exited. Final result = " + result);
        sc.close();
    }
}
