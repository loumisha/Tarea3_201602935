
package ipc1.tarea3_201602935;

import java.util.Scanner;

public class IPC1Tarea3_201602935 {

    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        System.out.println("1. Usuarios");
        System.out.println("2. Contador de dígitos repetidos");
        System.out.println("3. Tres números de mayor a menor");
        System.out.println("4. Calcular promedio");
        System.out.println("5. Salir");
        String eleccion = var.nextLine();
        //menu principal
        
        switch(eleccion){
            case "1": {
                Submenu a = new Submenu();
                a.RegistroDeUsuario();
                break;
            }
            case "2":{
                Submenu b = new Submenu();
                b.Contador();
                break;
            }
            case "3":{
                Submenu c = new Submenu();
                c.TresNumeros();
                break;
            }
            case "4":{
                Submenu d = new Submenu();
                d.Promedio();
                break;
            }
            default:
                System.out.println("No es una opción válida");
                break;
                
    }
        
    }
    
}
