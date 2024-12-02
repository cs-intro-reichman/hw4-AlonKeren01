public class Primes {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        boolean[] isPrime = new boolean[number + 1];
        int p = 0;

        for(int i = 2; i < isPrime.length; i++){
            isPrime[i] = true;
        }

        System.out.println("Prime numbers up to " + number + ":");

        for(int j = 2; j <= Math.sqrt(number); j++){
                
            if(isPrime[j]){
                for(int x = j + 1; x < isPrime.length; x++){

                    if(x % j == 0) isPrime[x] = false;
                }
            }
        }

        for(int y = 2; y < isPrime.length; y++){

            if(isPrime[y]){
                System.out.println(y);
                p += 1;
            }
        }

        System.out.println("There are " + p + " primes between 2 and " + number + " (" + (int) (100 * ((double) p / number)) + "% are primes)");
    }
}