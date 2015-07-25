public class Calculator{
    private double result = 0;

    public void reset(){
        result = 0;
    }

    public double getResult(){
        return result;
    }

    public void add(double ... numbers){
        for(double temp : numbers) result += temp;
    }

    public void substruct(double number){
        result -= number;
    }

    public void multiply(double ... numbers){
        for(double temp : numbers) result *= temp;
    }

    public void divide(double number){
        result /= number;
    }
}