
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
                IPC1Tarea3_201602935 a=new IPC1Tarea3_201602935();
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
 
   private String[] user;
   public void RegistroDeUsuario(){
       Scanner var = new Scanner(System.in);
       user = new String[5];               
       System.out.println("1. Ingresar usuarios");
       System.out.println("2. Mostrar usuarios ascendentes");
       System.out.println("3. Mostrar usuarios descendentes");
       System.out.println("4. Menú principal");
       String eleccion = var.nextLine();
       switch(eleccion){
           case "1":
               for(int i=0; i<5; i ++){
                    System.out.println("Ingresar usuario "+i);
                    String nombre = var.nextLine();
                    user[i]= nombre;
                    for(int j= 0; j<i; j++){
                        if(nombre.equals(user[j])){
                            System.out.println("YA EXISTE USUARIO");
                            j=i;
                            i=i-1;
                        }                        
                    }
               } 
               IPC
            break; 
           case "2":
               for(int i=4; i>=0; i--){
                   System.out.println(user[i]);
                   
               }
        }
    }
}
