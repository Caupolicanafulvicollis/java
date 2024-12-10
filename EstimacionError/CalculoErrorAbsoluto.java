package EstimacionError;

public class CalculoErrorAbsoluto {
    public double calcularErrorAbsoluto(double valorReal, double valorExperimental) {
        double errorAbsoluto = Math.abs(valorReal - valorExperimental); // Calcula el error absoluto
        return Math.round(errorAbsoluto * 1000.0) / 1000.0; // Redondea a 3 decimales
    }
}
