package Ejercicios_Bucles;

import javax.swing.*;

public class Ejercicio_2 {
    public static void main(String[]args){
        int cant_empleados,horas,tarifa=15;
        cant_empleados=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de empleados que trabajan en la empresa"));
        for (int i=1;i <= cant_empleados;i++){
            horas=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de horas que trabajo el empleado nro: "+i));
            tarifa *=horas;
            System.out.println("El empleado nro: "+i+" hizo un total de: "+horas+" horas"+" entonces su salario semanal será de: "+tarifa+"$");
        }
    }
}
