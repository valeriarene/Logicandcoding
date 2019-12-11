import java.util.Arrays;

public class PrimeSieve {
    public static boolean[] sieve = new boolean [1000];
    
    public static void main(String[] args) {
        Arrays.fill(sieve, true); //sets all values to true
        sieve[0] = false;
        sieve[1] = false;
        for(int i = 2; i < sieve.length; i++) {
            for(int j = 2 * i; j < sieve.length; j+=i) {
                sieve[j] = false;
            }
        }
        /*for(int i = 2; i < 1000; i++) {
            for(int n = 3; n < 1000; n++) {
                if(n % i == 0 ) {
                    sieve[i] = false;
                }
            }
        }*/
        int[] result = collectPrimes();
        System.out.println(Arrays.toString(result));
    }
        //write and implement the sieve algorithm
    public static int[] collectPrimes() {
        int count = 0;
        for(int i = 0; i < sieve.length; i++) {
            if(sieve[i] == true) {
                count = count + 1;
            }
        }
        int[] primes = new int [count];
        for(int i = 0; i < count; i++){
            for(int m = 0; m < count - 1; m++) {
                if(sieve[i] == true) {
                    primes[m] = i;
                }
            }
        }
        return primes;
        //print a list of prime numbers to the console
    }
}