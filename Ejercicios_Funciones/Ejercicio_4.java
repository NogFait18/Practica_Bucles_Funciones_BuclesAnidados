package Ejercicios_Funciones;

public class Ejercicio_4 {
    public static void main(String[]args){
        String[] clientes={"Laura","Martin","Rosario","Leandro"};
        int[] compras={4,15,10,12};
        calcularDescuentos(clientes,compras);
    }
    public static void calcularDescuentos(String[] clientes,int[]compras){
        for (int i=1;i < clientes.length;i++){
            if(compras[i]>10){
                System.out.println(clientes[i]+":"+" Cantidad de compras: "+compras[i]+" Obtiene descuento de: 10%");
            }
        }
    }
}
