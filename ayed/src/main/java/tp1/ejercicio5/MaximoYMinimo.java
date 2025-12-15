package tp1.ejercicio5;

public class MaximoYMinimo {
    public static int[] atravesReturn(int[]numeros){
        int[] valores = new int[3]; //maximo[0] minimo[1] promedio[2]
        valores[0]=Integer.MIN_VALUE;
        valores[1] = Integer.MAX_VALUE;
        valores[2] = 0;
        for(int i=0;i<numeros.length;i++) {
            if(numeros[i]>valores[0]){
                valores[0] = numeros[i];
            }
            if(numeros[i]<valores[1]){
                valores[1] = numeros[i];
            }
            valores[2] = valores[2] + numeros[i];
        }
        valores[2] = valores[2]/numeros.length;
        return valores;
    }
    public static void atravesParam(int[]numeros,Datos d){
        int sumatoria = 0;
        for(int i=0;i<numeros.length;i++){
            if(numeros[i]>d.getMax()){
                d.setMax(numeros[i]);
            }
            if(numeros[i]<d.getMin()){
                d.setMin(numeros[i]);
            }
            sumatoria = sumatoria + numeros[i];
        }
        d.setProm(sumatoria/numeros.length);
    }
    
}
