package Ejercicios_Funciones;

public class Ejercicio_7 {
    public static void main(String[]args){
        double[]compras={500,321,670,538,896};
        aplicarDescuento(compras);
    }

    public static void aplicarDescuento(double[]compras){
        for (int i=0;i < compras.length;i++){
            if (compras[i]>500){
                double descuento,com;
                com=compras[i];
                System.out.println(com +" Se le aplicara un 15% de descuento: "+(descuento=compras[i]*=0.15)+"$"+ " su compra quedaria en: "+(com-descuento)+"$");
            }
            else {
                System.out.println(compras[i]+" No se le aplicara ningun descuento");
            }
        }
    }
}
