package Ejercicios_Bucles;

import javax.swing.*;

public class Ejercicio_4 {
    public static void main(String[]args){
        int dias=1,ventas,total_ventas=0;
        while (dias < 8){
            ventas=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de ventas en el dia nro: "+dias));
            dias++;
            total_ventas+=ventas;
        }
            System.out.println("El total de ventas en la semana es de: "+total_ventas);
    }
}
