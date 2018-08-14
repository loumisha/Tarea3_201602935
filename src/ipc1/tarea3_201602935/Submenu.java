
package ipc1.tarea3_201602935;

import java.util.Scanner;

public class Submenu{
    
   public void RegistroDeUsuario(){
       Scanner var = new Scanner(System.in);
       System.out.println("1. Ingresar usuarios");
       System.out.println("2. Mostrar usuarios ascendentes");
       System.out.println("3. Mostrar usuarios descendentes");
       System.out.println("4. Menú principal");
       String eleccion = var.nextLine();
       switch(eleccion){
           case "1":
               String[] user = new String[5];
               for(int i=0; i<6; i ++){
               System.out.println("Ingresar primer usuario");
               user[1] = var.nextLine();
               System.out.println("Ingresar segundo usuario");
               user[2] = var.nextLine();
               System.out.println("Ingresar tercer usuario");
               user[3] = var.nextLine();
               System.out.println("Ingresar cuarto usuario");
               user[4] = var.nextLine();
               System.out.println("Ingresar quinto usuario");
               user[5] = var.nextLine();
               
               
               } 
       }
   } 
   public void Contador(){
       System.out.println("1. Ingresar número");
       System.out.println("2. Ingresar número a buscar");
       System.out.println("3. Mostrar número de digitos");
       System.out.println("4. Menú principal");
   }
   public void TresNumeros(){
       // Tres numeros de mayor a menor
       System.out.println("1. Ingresar numeros");
      
   }
   public void Promedio(){
       System.out.print(" PENDIENTE");
   }
}
