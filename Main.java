import java.util.Optional;

interface Calculator{
    public Integer add(int a, int b);
    public Integer sub(int a, int b);
    public Integer mul(int a, int b);
    public Float div(int a, int b);
}


interface  OptionalCalculator {
    public Optional<Integer> add(int a, int b);
    public Optional<Integer> sub(int a, int b);
    public Optional<Integer> mul(int a, int b);
    public Optional<Float> div(int a, int b);
}

class BasicCalculator implements Calculator
{

    @Override
    public Integer add(int a, int b) {
        return a+b;
    }

    @Override
    public Integer sub(int a, int b) {
        return a-b;
    }

    @Override
    public Integer mul(int a, int b) {
        return a*b;
    }

    @Override
    public Float div(int a, int b) {
        if(b==0)
        {
            return null;
        }
        return (float)a/b;
    }

}


class  OptionalCalculatorImpl implements OptionalCalculator
{

    @Override
    public Optional<Integer> add(int a, int b) {
        return Optional.of(a+b);
    }

    @Override
    public Optional<Integer> sub(int a, int b) {
        return Optional.of(a-b);
    }

    @Override
    public Optional<Integer> mul(int a, int b) {
       return Optional.of(a*b);
    }

    @Override
    public Optional<Float> div(int a, int b) {
       return b==0?Optional.empty():Optional.of((float)a/b);
    }

    private OptionalCalculatorImpl()
    {

    }

    public static OptionalCalculatorImpl getInstance()
    {
        return new OptionalCalculatorImpl();
    }
}


public class Main{
    public static void main(String[] args)  {
       OptionalCalculator calculator = OptionalCalculatorImpl.getInstance();
       Float result;
     
    try {
        result = calculator.div(5, 0).orElseThrow(
            ()-> 
            {
            return new Exception("Some error occured");
            }
          
        );
        System.out.println(result);
    } catch (Exception e) {  
        System.out.println(e.getMessage());
    }

  
    }
}