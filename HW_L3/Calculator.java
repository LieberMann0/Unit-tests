import java.util.Scanner;

public class Calculator {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int firstOperand = getOperand();
        int secondOperand = getOperand();
        char operator = getOperator();
        int result = calculation(firstOperand, secondOperand, operator);
        System.out.println("Operation result is: " + result);
        System.out.println(calculatingDiscount(-100, 25));
    }

    public static char getOperator() {
        System.out.println("Enter operation: ");
        char operation = scanner.next().charAt(0);
        return operation;
    }

    public static int getOperand() {
        System.out.println("Enter number: ");
        int operand;
        if (scanner.hasNextInt()) {
            operand = scanner.nextInt();
        }
        else {
            System.out.println("Enter the number correctly");
            if (scanner.hasNext()) {
                scanner.next();
                operand = getOperand();
            }
            else {
                throw new IllegalStateException("Input error");
            }
        }
        return operand;
    }

    public static int calculation(int firstOperand, int secondOperand, char operator) {
        int result;

        switch (operator) {
            case '+':
                result = firstOperand + secondOperand;
                break;
            case '-':
                result = firstOperand - secondOperand;
                break;
            case '*':
                result = firstOperand * secondOperand;
                break;
            case '/':
                if (secondOperand != 0) {
                    result = firstOperand / secondOperand;
                    break;
                }
                else {
                    throw new ArithmeticException("Division by zero is not possible");
                }
            default:
                throw new IllegalStateException("Unexpected value operator: " + operator);
        }
        return result;
    }
    
    public static double squareRootExtraction(double number) {        
        double t;
        double squareRoot = number / 2;
        do {
            t = squareRoot;
            squareRoot = (t + (number / t)) / 2;
        }
        while ((t - squareRoot) != 0);
        return squareRoot;
    }    
    
    public static int pow(int value, int powValue) {
        int result = 1;
        for (int a = 1; a <= powValue; a++) {
            if (a == 0) return 1;
            result = result * value;
        }
        return result;
    }



// Реализовать в калькуляторе с помощью методологии TDD (с описанием шагов)
// функцию расчета длины окружности

    // Начало шагов в CalculatorTest.java

    // 3. Создаем метод в классе Calculator
    public double computeLengthCircle(int radius) {
        return 2 * Math.PI * radius; // Возвращает результат по формуле 2*PI*R

    }
}