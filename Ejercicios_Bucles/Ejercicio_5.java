package Ejercicios_Bucles;

import javax.swing.*;

public class Ejercicio_5 {
    public static  void main(String[]args){
        int num_empleados,horas;
        num_empleados=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de empleados"));
        for (int i =1;i<=num_empleados;i++){
            horas=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de horas del empleado nro: "+i));
            if (horas>40){
                System.out.println("El empleado nro: "+i+" hizo mas de 40 horas a la semana haciendo un total de: "+(horas-40)+" horas adicionales");
            }
            else {
                System.out.println("El empleado nro: "+i+" hizo un total de: "+horas);
            }
        }
    }
}
