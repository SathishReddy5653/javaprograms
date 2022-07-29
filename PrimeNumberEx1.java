public class PrimeNumberEx1
{
public static void main(String args[])
{
int number=15;
int count=0;
int i;
for(i=1;i<=number;i++)
{
if(number%i==0)
count++;
}
if(count==2 && number!=1)
{
System.out.println(number+" is prime number");
}
else
{
System.out.println(number+" is not prime number");
}
}
}