package EX3;

public class FazCalculos1 {
    // Constructors
    public FazCalculos1() {
    }
    // Main Method
    public static void main(String[] args) {
        var Calculator = new Calculadora();
        System.out.println("2.7 + 5.2 = " + Calculator.Sum(2.7, 5.2));
        System.out.println("2.7 - 5.2 = " + Calculator.Subtract(2.7, 5.2));
        System.out.println("2.7 * 5.2 = " + Calculator.Multiply(2.7, 5.2));
        System.out.println("2.7 / 5.2 = " + Calculator.Divide(2.7, 5.2));
    }
}
