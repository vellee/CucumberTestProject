package app;

public class Calculator {

//    public int addTwoNum(int num1, int num2) {
//        return num1 + num2;
//    }

//    public int subtractTwoNum(int num1, int num2) {
//        return num1 - num2;
//    }
//
//    public int multiplyTwoNum(int num1, int num2) {
//        return num1 * num2;
//    }


    public int calculate(int numA, int numB, String type) {
        int result = switch (type) {
            case "+" -> numA + numB;
            case "-" -> numA - numB;
            case "*" -> numA * numB;
            case "/" -> numA / numB;
            default -> numA + numB;
        };
        return result;
    }
}
