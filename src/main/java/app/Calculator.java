package app;

public class Calculator {

    public int calculate(int numA, int numB, String type) {
        int result;
        switch (type) {
            case "+":
                result = numA + numB;
                break;
            case "-":
                result = numA - numB;
                break;
            case "*":
                result = numA * numB;
                break;
            case "/":
                if (numB != 0) {
                    result = numA / numB;
                } else {
                    result = -1;
                    System.out.println("CANNOT DIVIDE BY ZERO !");
                }
                break;
            default:
                result = numA + numB;

        }
        return result;
    }
}
