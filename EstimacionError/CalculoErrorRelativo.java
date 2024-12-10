package EstimacionError;

public class CalculoErrorRelativo {
    public double calcularErrorRelativo(double valorReal, double valorExperimental) {
        if (valorReal == 0) {
            throw new IllegalArgumentException("El valor real no puede ser 0.");
        }

        // Calcula el error relativo usando la fórmula correcta
        double errorRelativo = (Math.abs(valorReal - valorExperimental) / valorReal)*100;

        // Redondea a la centésima (2 decimales)
        return Math.round(errorRelativo * 100.0) / 100.0;
    }
}
