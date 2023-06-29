class FizzBuzz {
    public static void main(String[] args) {
        int start = 1;
        int end = 100;
        int fizz = 3;
        int buzz = 5;

        for (int num = start; num <= end; num++) {
            if (num % (fizz * buzz) == 0)
                System.out.println("FizzBuzz");
            else if (num % fizz == 0)
                System.out.println("Fizz");
            else if (num % buzz == 0)
                System.out.println("Buzz");
            else
                System.out.println(num);
        }
    }
}
