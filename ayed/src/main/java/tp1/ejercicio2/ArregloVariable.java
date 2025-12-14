package tp1.ejercicio2;
import java.util.Scanner;
public class ArregloVariable {
    public static int[] devolverArray(int n){
        int[] arr = new int[n];
        for(int i=0;i < n;i++){
            arr[i] = (i+1)*n;
        }
        return arr;
    }
    public static void main(String[] args){
        int num;
        int[] arreglo;
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese un Numero");
        num = s.nextInt();
        while(num!=0) {
            arreglo = devolverArray(num);
            for (int i = 0; i < arreglo.length; i++) {
                System.out.print(arreglo[i] + " ");
            }
            System.out.println("Ingrese un Numero");
            num = s.nextInt();
        }
    }
}
