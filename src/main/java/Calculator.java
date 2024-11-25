class Calculator {

    // change the structure
    Calculator(){

    }

    int add(int a , int b){
        return a + b;
    }

    int subtract(int a , int b){
        return a - b;
    }

    int multiply(int a , int b){
        return a * b;
    }

    int divide(int a , int b){
        return a / b;
    }


    /*
    Returns the n'th number in the fibonacci sequence
    https://en.wikipedia.org/wiki/Fibonacci_number
    Example below
    n = x
    1 = 1
    2 = 1
    3 = 2
    4 = 3
    5 = 5
    .
    .
    .
    etc
     */
    int fibonacciNumberFinder(int n){
        if (n <= 0) {
            throw new IllegalArgumentException("n must be positive");
        }
        if (n == 1 || n == 2) {
            return 1;
        }

        int prev = 1;
        int curr = 1;

        for (int i = 3; i <= n; i++) {
            int next = prev + curr;
            prev = curr;
            curr = next;
        }

        return curr;
    }


    /*
    Returns binary value of the given int number
    The binary number will be stored as a string
    if int a = 0 then this method returns: 0
    if int a = 10 then this method returns: 1010
    if int a = 16 then this method returns: 10000
     */
    String intToBinaryNumber(int number){
        return Integer.toBinaryString(number);
    }

    /*
    Create a completely unique String identifier for a given string
    Each createdID must contain the string n in its unaltered Form
    if String n = "Jason"
    then the created ID could be = Jasonklfgn3jknnvksdfm - Because it contains the unaltered String n and is unique

    if you run this function twice with the same String input, it must return 2 unique String IDs
     */
    String createUniqueID(String n){
        if (n == null) {
            throw new IllegalArgumentException("Input string cannot be null");
        }

        // Use current timestamp and random number for uniqueness
        long timestamp = System.currentTimeMillis();
        int random = (int)(Math.random() * 1000);

        // Create a random suffix of alphanumeric characters
        String alphabet = "abcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder suffix = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            suffix.append(alphabet.charAt((int)(Math.random() * alphabet.length())));
        }

        // Combine the original string with the unique elements
        return n + timestamp + random + suffix.toString();
    }
}