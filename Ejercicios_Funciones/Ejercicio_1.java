package Ejercicios_Funciones;

public class Ejercicio_1 {
    public static double calcularIngresosMensuales(double[] ventas) {
        double total = 0;

        for (int i = 0; i < ventas.length; i++) {
            total += ventas[i];
        }

        return total;
    }

    public static void main(String[] args) {

        double[] ventas = {
                100.50, 200.75, 150.30, 300.25, 400.00, 350.20, 220.80, 180.90, 175.50, 210.00,
                190.00, 220.00, 300.00, 330.50, 295.00, 260.30, 400.75, 500.00, 150.75, 180.60,
                230.00, 240.90, 120.50, 330.00, 370.30, 310.25, 290.40, 430.20, 490.75, 410.30
        };


        double ingresosTotales = calcularIngresosMensuales(ventas);


        System.out.println("El total de ingresos mensuales es: $" + ingresosTotales);
    }
}
