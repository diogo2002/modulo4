package oi;

public class fibomacci {

    static long fibo(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }
 
    public static void main(String[] args) {   
	
	// Imprime os 13 primeiros termos       
	for (int i = 0; i < 13; i++) {
            System.out.print("(" + i + "):" + fibomacci.fibo(i) + "\t");
        }
 
    }
 
}

