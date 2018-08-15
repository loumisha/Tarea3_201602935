meropackage ipc1.tarea3_201602935;
import java.util.Scanner;

public class IPC1Tarea3_201602935 {
    public static IPC1Tarea3_201602935 a=new IPC1Tarea3_201602935();
    public static void main(String[] args) {        
        //menu principal         
        System.out.println("1. Usuarios");
        System.out.println("2. Contador de dígitos repetidos");
        System.out.println("3. Tres números de mayor a menor");
        System.out.println("4. Calcular promedio");
        System.out.println("5. Salir");
        Scanner var = new Scanner(System.in);                
        String eleccion = var.nextLine();
        //IPC1Tarea3_201602935 a=new IPC1Tarea3_201602935();
        switch(eleccion){
            case "1": 
                a.RegistroDeUsuario();
                break;
            case "2":
                a.Contador();
                break;
            case "3":
                a.TresNumeros();
                break;
        }
    }
   
   public String [] user=new String[5]; 
   public void RegistroDeUsuario(){
       //for(int i=0;i<5;i++){
                   //System.out.println(user[i]);
              // }
       Scanner var = new Scanner(System.in);
       System.out.println("1. Ingresar usuarios");
       System.out.println("2. Mostrar usuarios ascendentes");
       System.out.println("3. Mostrar usuarios descendentes");
       System.out.println("4. Menú principal");
       String eleccion = var.nextLine();
       switch(eleccion){
           case "1":
               a.llenarUser(user);
               a.RegistroDeUsuario();
               
           break;
           case "2":
               for(int i=4;i>=0;i--){
                   System.out.println(user[i]);
               }
               a.RegistroDeUsuario();
               break;
           case "3":
               for(int i=0;i<5;i++){
                   System.out.println(user[i]);
               }
               a.RegistroDeUsuario();
               break;
           case "4":
               //pendiente
               break;
           default:
               System.out.println("Opción Inválida");
               break;
        }                         
    }
   
   public void llenarUser(String[] user){
       
       Scanner var = new Scanner(System.in);
       for(int i =0; i<5; i++){
            System.out.println( i +"Ingrese usuario");
            String eleccion = var.nextLine();
            //
            for(int j=0; j<5; j++){
                if(eleccion.equals(user[j])){
                    System.out.println("USUARIO YA EXISTE");
                    j=i;
                    if(i>0){
                        i=i-1;
                    }                                        
                }
            }
            if(eleccion != ""){
                user[i] = eleccion;
            }
       }        
   }
   Scanner var = new Scanner(System.in);
   int numero=0;
   int contador =0;
   int posicion = 0;
   public void Contador(){
       System.out.println("1. Ingresar número");
       System.out.println("2. Mostrar número de digitos");
       System.out.println("3. Ingresar número a buscar");
       System.out.println("4. Menú principal");
       String eleccion = var.nextLine();
       int[]digitos;
       switch(eleccion){
           case "1":
               a.Case1();
               a.Contador();
           break;
           
           
           case "2":
               while(numero !=0){
                   numero = numero/10;
                   contador++;
               }
               System.out.println(contador + " digitos ");
               a.Contador();
               break;
           case "3":
               System.out.println(" Ingrese la posición que desea entre 0-9 ");
               posicion = var.nextInt();
               if(posicion>contador){
                  System.out.println("No existe posicion" + posicion);  
               }
               else{
                   posicion = numero%10;
                   numero = numero/10;
               }
               break;
           case "4":
              
       }
   }
   public void Case1(){
       System.out.println("Ingresar un número");
               numero = var.nextInt();
               a.Contador();
   }
   
   
      
   int num1, num2, num3, menor, medio, mayor;
   public void TresNumeros(){
       // Tres numeros de mayor a menor
       
       num1 = 0;
       num2 = 0;
       num3 = 0;
       menor = 0;
       medio = 0;
       mayor =0;
       Scanner var = new Scanner(System.in);
       System.out.println("1. Ingresar numeros");
       System.out.println("2. Mostrar ordenados");
       System.out.println("3. Menu principal");
       int eleccion = var.nextInt();
       switch(eleccion){
           case 1:
               System.out.println("Ingrese primer número ");
               num1 = var.nextInt();
               System.out.println("Ingrese segundo número ");
               num2 = var.nextInt();
               System.out.println("Ingrese tercer número ");
               num3 = var.nextInt();
               if(num1<num2 && num2<num3){
                   menor = num1;
                   medio = num2;
                   mayor = num3;
               }
               else if(num1<num3&&num3<2){
                   menor = num1;
                   medio = num3;
                   mayor = num2;
               }
               else if(num2<num1&& num1<3){
                   menor = num2;
                   medio = num1;
                   mayor = num3;
               }else if(num2<num3&& num3<num1){
                   menor = num2;
                   medio = num3;
                   mayor = num1;
               }else if (num3<num1&& num1<num2){
                   menor = num3;
                   medio = num1;
                   mayor = num2;
               }else if(num3<num2&& num2<num1){
                   menor = num3;
                   medio = num2;
                   mayor = num1; 
               }
               System.out.println( mayor  +","+  medio + ","+  menor );
               a.TresNumeros();
               break;
           case 2:
               System.out.println( menor  +","+  medio + ","+  mayor );
               a.TresNumeros();
               break;
           }
       }
       
 
      
   
   public void Promedio(){
       System.out.print(" PENDIENTE");
   }
}
