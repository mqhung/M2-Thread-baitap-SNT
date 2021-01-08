public class Main {
    public static void main(String[] args) {
        LazyPrimeFactorization lazy = new LazyPrimeFactorization();
        OptimizedPrimeFactorization optimized = new OptimizedPrimeFactorization();
        Thread lazyPrime = new Thread(lazy);
        Thread optimizedPrime = new Thread(optimized);
        lazyPrime.start();
        optimizedPrime.start();
    }
}
