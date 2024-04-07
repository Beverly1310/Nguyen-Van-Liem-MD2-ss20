package bai6;

public class OptimizedPrimeFactorization implements Runnable{
    private final int number=100;
    @Override
    public void run() {
        for (int i = 2; i < 1000; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i%j==0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.println("luong 2 "+i+" la so ngto");
            }
        }
    }
}
