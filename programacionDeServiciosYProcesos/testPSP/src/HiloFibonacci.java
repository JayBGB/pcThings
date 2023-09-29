import java.util.ArrayList;

public class HiloFibonacci extends Thread {

    int N;

    public HiloFibonacci (int N){

        this.N = N;
    }

    public void run(){

        try {
        int [] fibonacciList = new int[N+1];
        fibonacciList[0]=1;
        fibonacciList[1]=1;


            if (N >= 2) {

                System.out.println("Fibonacci [1]: "+fibonacciList[0]);
                System.out.println("Fibonacci [2]: "+fibonacciList[1]);
                int b = 1;
                for (int i = 2; i < N; i++) {
                    fibonacciList[i] = fibonacciList[i-2] + fibonacciList[i-1];
                    System.out.println("Fibonacci ["+(i+1)+"] : " + fibonacciList[i]);
                }

            } else if (N == 1) {

                System.out.println("Fibonacci  : " + fibonacciList[0]);

            } else {

                System.out.println("Fibonacci : " + fibonacciList[0]);
            }

        }catch(ArrayIndexOutOfBoundsException e){

            System.out.println("No.");
        }
    }


}
