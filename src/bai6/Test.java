package bai6;

public class Test {
    public static void main(String[] args) {
        Runnable runnable1 = new LazyPrimeFactorization();
        Runnable runnable2 = new OptimizedPrimeFactorization();
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
    }
}
