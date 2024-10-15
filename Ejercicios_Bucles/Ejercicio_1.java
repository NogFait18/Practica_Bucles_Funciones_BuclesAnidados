package Ejercicios_Bucles;

import javax.swing.*;

public class Ejercicio_1 {
    public static void main(String[]args){
        int horas ,total_horas = 0;
        JOptionPane.showMessageDialog(null,"Ingrese la cnatidad de horas que dedica a:\nestudiar\nejercicio\nleer\ntiempo libre");
        for (int i = 1;i <= 4;i++){
            horas=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de horas de la: "+ i +" actividad"));
            total_horas+=horas;
        }
            JOptionPane.showMessageDialog(null,"La cantidad de horas total que usted le dedica a sus actividades es de: "+total_horas+" horas totales");
    }
}
