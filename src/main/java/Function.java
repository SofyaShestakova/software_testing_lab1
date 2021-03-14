

public class Function {
    public static double sec(double x){
        double result = 1;
        short sign = 1;
        long factorial = 1;
        double xPower = 1;
        if(Math.sin(x) == 1|| Math.sin(x) == -1){
            throw new ArithmeticException("Undefined value");
        }
        else{
        for (int n = 1; n < 11; n++) {
                xPower *= x * x;
                factorial *= (n * 2 - 1) * (n * 2);
                sign *= -1;
                result += sign * (xPower / factorial);
        }
            return 1/result;
        }
        }
    }




