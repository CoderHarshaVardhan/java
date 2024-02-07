public class TestCalculator {
    public static void main(String[] args){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        
        long outputAdd = 0;
        long outputSub = 0;
        long outputDiv = 0;
        long outputMul = 0;

        Calculator calc = new Calculator();

        outputAdd = calc.add(a,b);
        outputSub = calc.sub(a,b);
        outputDiv = calc.div(a,b);
        outputMul = calc.mul(a,b);

        System.out.println("a" + "=" + a + "," + "b" + "=" + b);


        System.out.println(a + "+" + b + "=" + outputAdd);
        System.out.println(a + "-" + b + "=" + outputSub);
        System.out.println(a + "/" + b + "=" + outputDiv);
        System.out.println(a + "*" + b + "=" + outputMul);

    }
}
