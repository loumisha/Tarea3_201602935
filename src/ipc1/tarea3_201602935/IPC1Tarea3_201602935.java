package ipc1.tarea3_201602935;
import java.util.Scanner;

public class IPC1Tarea3_201602935 {
    public static IPC1Tarea3_201602935 a=new IPC1Tarea3_201602935();
    public static void main(String[] args) {        
       a.menu();
    }
    public void menu(){
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
            case "4":
                a.Promedio();
                break;
            default:
                System.out.println("Opción inválida");
                break;
        }
    }
    public String [] user=new String[5]; 
    public void RegistroDeUsuario(){
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
               a.menu();
               break;
           default:
               System.out.println("Opción Inválida");
               break;
        }                         
    }
    public void llenarUser(String[] user){
       
       Scanner var = new Scanner(System.in);
       for(int i =0; i<5; i++){
            System.out.println( i +" Ingrese usuario");
            String eleccion = var.nextLine();
            //otro for para hacer comparaciones
            for(int j=0; j<5; j++){
                if(eleccion.equals(user[j])){
                    System.out.println("USUARIO YA EXISTE");
                    j=i;//para romper el ciclo
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
    String num = "";
    int contador =0;
    int posicion;
    int resultado;
    public void Contador(){
       System.out.println("1. Ingresar número");
       System.out.println("2. Ingresar número a buscar");
       System.out.println("3. Mostrar número de digitos");
       System.out.println("4. Menú principal");
       String eleccion = var.nextLine();
       switch(eleccion){
           case "1":
               a.Case1();
               a.Contador();
               break;
           case "2":
               num = Integer.toString(numero);//Convertir un entero a un string
               char[] valores =num.toCharArray();// de un string a un char
               int i;
               System.out.println("Ingrese la posición que desea");
               i = var.nextInt();
               if(i< valores.length){
                    System.out.println("El Valor " + valores[i]+" Ocupa el : " +(i)+" Lugar");
                   }
                   else{
                       System.out.println("Esa posición no existe");
                   }
               a.Contador();
               break;
           case "3":
               a.Case3();
               a.Contador();
               break;
           case "4":
              a.menu();
           default:
               System.out.println("Opción inválida");
               break;
       }
   }
    public void Case1(){
       System.out.println("Ingresar un número");
               numero = var.nextInt();
               a.Contador();
   }
    public void Case3(){
        while(numero !=0){
                   numero = numero/10;
                   contador++;
               }
               System.out.println(contador + " digitos ");
    }
    private int num1 = 0, num2= 0, num3= 0, menor= 0, medio= 0, mayor= 0;
    public void TresNumeros(){
       // Tres numeros de mayor a menor
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
               System.out.println("Números ingresados:" + num1+" "+num2+" "+num3);//revisar
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
               System.out.println( "Ordeanados de mayor a menor" +mayor  +","+  medio + ","+  menor );
               a.TresNumeros();
               break;
           case 2:
               System.out.println( "Ordeanados de menor a mayor" +menor  +","+  medio + ","+  mayor );
               a.TresNumeros();
               break;
           case 3:
               a.menu();
               break;
        }
    }
    public void Promedio(){
      System.out.println("1. Ingresar notas");
      System.out.println("2. Mostrar promedio");
      System.out.println("3. Menu principal");
      int eleccion = var.nextInt();
      switch(eleccion){
          case 1:
              int id =0, n=0, prom=0, suma=0;
              for( int i=0;i<6;i++){
                    for( int j= 0; j<6; j++){
                        System.out.println("Ingrese ID");
                        n = var.nextInt();
                        System.out.println("Ingresar  primer nota");
                        n = var.nextInt();
                        System.out.println("Ingresar segunda nota");
                        n = var.nextInt();
                        System.out.println("Ingresar tercer nota");
                        n= var.nextInt();
                        System.out.println("Ingresar cuarta nota");
                        n= var.nextInt();
                    }
                }
          break;
          case 2:
          break;
        }
    }
    public void Llenarprom(){
        String[] encabezado = {"ID", "N1","N2","N3", "N4", "PROM"}; 
        int [][] matriz = new int[6][6] ;
        Scanner var = new Scanner(System.in);
        for(int i=0; i<6;i++){
            System.out.print("| "+encabezado[i]+" |");
        }
   }    
}