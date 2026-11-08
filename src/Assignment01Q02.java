public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;

        int n = Integer.parseInt(args[0]);
        double result = 0;
        int sign = 1;

        for (int i = 0; i < n; i++){
            double new_num = 1.0/(1+2*i);
            result += new_num*sign;
            sign *= (-1);

        }
        approxPi = 4*(result);

        System.out.println(approxPi + " " + actualPi);
    }
}
