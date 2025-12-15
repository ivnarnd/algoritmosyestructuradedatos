package tp1.ejercicio5;

public class Datos {
    private int min;
    private int max;
    private int prom;

    public Datos(){
        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;
        prom = 0;
    }
    public int getMin(){
        return this.min;
    }
    public int getMax(){
        return this.max;
    }
    public int getProm(){
        return this.prom;
    }
    public void setMin(int min){
        this.min = min;
    }
    public void setMax(int max){
        this.max = max;
    }
    public void setProm(int prom){
        this.prom = prom;
    }
}
