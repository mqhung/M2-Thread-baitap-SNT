public class OptimizedPrimeFactorization implements Runnable{
    @Override
    public void run() {
        int numberOfPrime = 15;
        for (int i = 0; i < numberOfPrime; i++) {
            if (checkPrime(i)) {
                System.out.println();
                System.out.print(i + "\t");
            }
        }
    }
    public boolean checkPrime(int number) {
        if (number < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
