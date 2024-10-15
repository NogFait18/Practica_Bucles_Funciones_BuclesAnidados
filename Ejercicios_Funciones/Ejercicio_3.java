package Ejercicios_Funciones;

public class Ejercicio_3 {
    public static void main(String[]args){
        String[] clientes={"Lautaro","Ana","gabriela","Nahuel"};
        int[] facturasPendientes={198,499,578,700};
        enviarFacturas(clientes,facturasPendientes);
    }
    public static void enviarFacturas(String[] clientes,int[]facturasPendientes){
        for (int i=0;i<clientes.length;i++){
            if(facturasPendientes[i] > 500){
                System.out.println(clientes[i]+"-Pago-pendiente "+facturasPendientes[i]+"$");
            }
        }
    }
}
