package Ejercicios_Funciones;

public class Ejercicio_2 {
    public static void main(String[]args){
    String[] productos={"Fideos","Arroz","Tomate","Lechuga","hamburguesas"};
    int[] stock = {3,10,2,6,4};
    generarReporteBajoStock(productos,stock);
    }
    public static void generarReporteBajoStock(String[] productos,int[] stock){
        System.out.println("Productos con bajo stock");
        for (int i=0;i<productos.length;i++){
            if (stock[i] < 5){
                System.out.println(productos[i]+ "-Unidades: "+stock[i]);
            }
        }

    }
}
