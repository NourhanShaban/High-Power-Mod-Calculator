
package highpowermodulo;


import static java.lang.Math.ceil;
import static java.lang.Math.floor;
import java.util.Scanner;

/**
 *
 * @author NORHAN
 */
public class HighPowerModulo {

         public static double gcd(double key1,double key2)
       {
      
       
       double max=0;
        
        if(key2>key1)
        {
            while(key1!=0)
            {max=key2%key1;
            key2=key1;
            key1=max;
            
            }
           return key2; 
        }
        else{
             while(key2!=0)
            {max=key1%key2;
            key1=key2;
            key2=max;
            
            }
            return key1; 
            
        }
       }
         public static long modulus(long f)
         {
             if(f<256)
			return f;

		f=f^283;
		return f;
         }
    public static void main(String[] args) {
        
        
        Scanner s1=new Scanner (System.in);
       long num1=s1.nextLong();
        long num2=s1.nextLong();
       long num3=s1.nextLong();
      long result = 1;
      long temp=1;


while(num2 > 0)
 	{
 		if(num2%2 == 1)
 	{
 		result=(result*num1);
 		if(result>num3) result%=num3;
 	}
 	num1 = (num1*num1);
 	if(num1>num3) num1%=num3; 
 	num2 /= 2;
 	}
        
        System.out.println(result);
}
   
    }
