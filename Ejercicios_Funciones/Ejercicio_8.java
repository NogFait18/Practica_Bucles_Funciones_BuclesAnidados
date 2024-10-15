package Ejercicios_Funciones;

public class Ejercicio_8 {
    public static void main(String[]args){
        String[] empleados={"Neyen","Morales","Sebastian"};
        int[] horasTrabajadas={10,43,36};
        calcularPagoSemanal(empleados,horasTrabajadas);
    }
    public static void calcularPagoSemanal(String[] empleados,int[]horasTrabajadas){
        for (int i = 0; i < empleados.length; i++) {
            System.out.println(empleados[i]+" Trabajo un total de: "+horasTrabajadas[i]+" horas"+" Su pago semanal sera de: "+(horasTrabajadas[i]*15)+"$");
        }
    }
}
