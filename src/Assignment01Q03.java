public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        System.out.println("The first " + x + " Fibonacci numbers are:");

        int[] Fibonacci = new int[x];
        int first = 1;
        int second = 1;
        Fibonacci[0] = 1;
        Fibonacci[1] = 1;
        for (int i = 0; i < x - 2; i++){
            int sum = first + second;
            Fibonacci[i + 2] = sum; 
            first = second;
            second = sum;   
        } 
        
        int numOdd = 0;
        for (int i = 0; i < x; i++) {
            System.out.print(Fibonacci[i]);
            if (Fibonacci[i]%2 == 1)
                numOdd += 1;
            if (i < x - 1) 
                System.out.print(" "); // Make sure we don't print a trailing space
        }
        System.out.println();
        
        ////////////////////////////////////////////////////////////////
        
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
