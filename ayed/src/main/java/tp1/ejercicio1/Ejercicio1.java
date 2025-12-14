package tp1.ejercicio1;

public class Ejercicio1 {
    public static void entreFor(int a, int b){
        for(int i =a; i<=b;i++){
            System.out.print(i+" ");
        }
        System.out.println(" ");
    }
    public static void entreWhile(int a, int b){
        while(a<=b){
            System.out.print(a+" ");
            a++;
        }
        System.out.println(" ");
    }
    public static void entreRecursivo(int a,int b){
        if(a<=b){
            System.out.print(a+" ");
            entreRecursivo(a+1,b);
        }
    }

    public static void main(String []args){
        int a = 10;
        int b = 20;
        Ejercicio1.entreFor(a,b);
        Ejercicio1.entreWhile(a,b);
        Ejercicio1.entreRecursivo(a,b);
    }
}
