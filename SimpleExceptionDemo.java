public class SimpleExceptionDemo {
    public static void safeDivide(int numerator, int denominator){

        try
        {
            System.out.println(numerator/denominator);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot divide by zero");
        }
        finally
        {
            System.out.println("Operation is complete");
        }

    }


    public static void main(String [] args){
        safeDivide(10,5);
        safeDivide(20, 0);
        safeDivide(-20, 5);

        
    }
}
