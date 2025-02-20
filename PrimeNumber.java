import java.util.Scanner;
public class PrimeNumber
{

public static Boolean isPrime(int num)
{
int count=0;
// if the 2 -> root over n
for(int i=2;i*i<num;i++)
{
if( num % i == 0)
{
count++;
}
}
if(count==0)
{
return true;
}
return false;
}

public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter  a number");
Integer num = sc.nextInt();
System.out.println(isPrime(num));
}
}
