package Ejercicios_Funciones;

public class Ejercicio_6 {
    public static void main(String[]args){
        double[]facturas={400,1280,304,258};
        calcularImpuesto(facturas);
    }
    public static void calcularImpuesto(double[]facturas){
        for (int i=0;i < facturas.length;i++){
            double factura;
            factura=facturas[i];
            System.out.println(factura);
            double impuestos = facturas[i] *= 0.21;
            System.out.println("El 21% de la factura es de: "+facturas[i]+" El total de la factura con el impuesto aplicado es de: "+(factura+impuestos));
        }
    }
}
