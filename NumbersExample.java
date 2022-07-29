import java.util.*;
class NumbersExample
{
public static void main(String args[ ])
{
int p;
Scanner sc = new Scanner(System.in);
int[] integers = new int[20];
System.out.println("enter a number :");
for(int i = 0; i < 20; i++)
{

 integers[i] = sc.nextInt();

    int n=sc.nextInt();
    if(n<1){
        System.out.println(n);
    }
    else
    {
       for(int i=2;i<n;i++){
           if(n%i==0){
               System.out.println(n);
               p=1;
               break;
              
           }
   
}
}
