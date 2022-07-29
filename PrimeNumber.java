public class PrimeNumbers
{
   public static void main(String[] args)
   {
      int num = 100;
      boolean flag = true;

      for(int i=25;i<=num;i++)   //i = 5
      {
         flag = true;

         for(int j=2;j<i;j++)   //j = 2
         {
            if(i%j == 0)        //flag = false
            {
               flag = false;      
               break;
            }
         }

         if(flag == true && i != 1) {
           System.out.print(i + "  ");
         }
      } 
   }
}