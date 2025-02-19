
// () -> expression;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

@FunctionalInterface // stereotype
interface Calculate
{
int operation(int a, int b);

default int subtract(int a, int b)
{
return a-b;
}

}


public class Lambda
{
public static void main(String args[])
{
//Calculate c = (a,b)->a+b;
//Calculate m = (a,b)-> a*b;
//System.out.println(c.operation(5,3));


List<String> names = new ArrayList<>(Arrays.asList("Joe","Rohan", "Harry"));
Collections.sort(names,(a,b)->a.compareTo(b));
System.out.println(names);


}
}
