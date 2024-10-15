package Ejercicios_Bucles;

import javax.swing.*;

public class Ejercicio_3 {
    public static void main(String[]args){
        int unid_productos,cantidad_producto;
        cantidad_producto=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el cantidad de productos"));
        for (int i=1;i <=cantidad_producto;i++){
            unid_productos=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la candidad de unidades que posee el producto nro: "+i));
            if (unid_productos<5){
                System.out.println("Es necesario realizar un pedido del producto nro: "+i);
            }
        }

    }
}
