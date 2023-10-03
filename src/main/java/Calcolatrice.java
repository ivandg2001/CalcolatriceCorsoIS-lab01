public class Calcolatrice {

    private int a , b;

    public Calcolatrice(){
        this.a = 0;
        this.b = 0;
    }

    public int somma(int a , int b){
        return a + b;
    }

    public int moltiplicazione(int a , int b){
        return a * b;
    }

    public boolean compare(int a, int b){
        if(a==b){
            return true;
        }else{
            return false;
        }
    }
}
