package bai6;

public class LazyPrimeFactorization implements Runnable{
    private final int number=100;
    @Override
    public void run() {
        for (int i = 2; i < 1000; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i%j==0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.println("luong 1 "+i+" la so ngto");
            }
        }
    }
}
