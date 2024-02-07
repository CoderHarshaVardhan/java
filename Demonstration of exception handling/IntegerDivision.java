public class IntegerDivision {
    public static void main(String args[]){
        try{
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            System.out.println("num1/num2 = "+ (num1/num2));
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Give exactly two inputs");
            System.out.println("Ex Java IntegerDivision 10 20");
        }catch(NumberFormatException e){
            System.out.println("Give exactly two integer inputs");
            System.out.println("Ex Java IntegerDivision 10 20");
        }catch(ArithmeticException e){
            System.out.println("The second input should be a non zero value");
            System.out.println("Ex Java IntegerDivision 10 20");
        }catch(Exception e){
           System.out.println("Ex Java IntegerDivision 10 20");
        }finally{
            System.out.println("End of the program!");
        }
    }
}
