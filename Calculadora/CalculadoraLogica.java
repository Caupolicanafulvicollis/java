package Calculadora;

public class CalculadoraLogica {
    public int realizarOperacion(int num1, int num2, String operacion) {
        switch (operacion) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "x":
                return num1 * num2;
            case "÷":
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    throw new ArithmeticException("División por cero");
                }
            default:
                return num2; // Si no hay operación previa, devolver el segundo número
        }
    }
}
