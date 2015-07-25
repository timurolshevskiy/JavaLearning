public class Calculate{
    public static void main(String[] args){
        Calculator calculator = new Calculator();
        calculator.add(1, 2, 3);
        int temp = 4;
        calculator.add(temp);
        System.out.println(calculator.getResult());
    }
}