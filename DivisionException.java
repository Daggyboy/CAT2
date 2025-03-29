public class DivisionException {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Enter the numerator:");
            int numerator=scanner.nextInt();

            System.out.println("Enter the denominator:");
            int denominator=scanner.nextInt();

            int result = numerator/denominator;
            System.out.println("Result:"+ result);

        }catch(ArithmeticException c){
            System.out.println("Cannot divide by zero!");
        }finally{
            scanner.close();
        }
    }
}