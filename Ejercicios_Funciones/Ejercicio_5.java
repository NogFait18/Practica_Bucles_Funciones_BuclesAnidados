package Ejercicios_Funciones;

public class Ejercicio_5 {
    public static void main(String[]args){
        double[]calificacion={2.6,4.2,1,3,5,3.4};
        calcularPromedioSatisfaccion(calificacion);
    }
    public static void calcularPromedioSatisfaccion(double[] calificacion){
        for (int i=0;i < calificacion.length;i++){
            if (calificacion[i] >= 5){
                System.out.println(calificacion[i]+" Usted esta muy feliz");
            }
            if (calificacion[i]>4 && calificacion[i] < 5){
                System.out.println(calificacion[i]+" Usted esta feliz");
            }
            if (calificacion[i]>3 && calificacion[i] < 4){
                System.out.println(calificacion[i]+" Usted esta neutro ");
            }
            if (calificacion[i]>2 && calificacion[i] < 3){
                System.out.println(calificacion[i]+" Usted esta triste");
            }
            if (calificacion[i] < 2){
                System.out.println(calificacion[i]+" Usted esta muy triste");
            }
        }
    }
}
