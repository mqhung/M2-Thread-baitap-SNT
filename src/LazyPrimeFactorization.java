public class LazyPrimeFactorization implements Runnable {
    @Override
    public void run() {
        int numberOfPrime = 15;
        for (int i = 0; i < numberOfPrime; i++) {
            if (checkPrime(i)) {
                System.out.print(i + "\t");
            }
        }
    }

    public boolean checkPrime(int number) {
        if (number < 2) {
            return false;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
