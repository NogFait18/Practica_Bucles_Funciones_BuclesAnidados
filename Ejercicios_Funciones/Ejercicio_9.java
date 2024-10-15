package Ejercicios_Funciones;

public class Ejercicio_9 {
    public static void main(String[]args){
        int[] preciosOriginales={22,40,69,150,356};
        calcularPrecioFinal(preciosOriginales);
    }
    public static void calcularPrecioFinal(int[]preciosOriginales){
        for (int i = 0; i < preciosOriginales.length; i++) {
        System.out.println("Al precio numero: "+(i+1)+" "+preciosOriginales[i]+" Se le da un descuento del 10%, por ende el precio final del producto con descuento es de: "+(preciosOriginales[i]*0.10));
        }
    }
}
