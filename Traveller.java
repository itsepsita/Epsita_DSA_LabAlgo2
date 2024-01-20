import java.util.*;
import java.util.Arrays;
public class Traveller
{
	public static void main(String[] args) {
	    int i,quo = 0,temp,rem;
	    
		Scanner in = new Scanner(System.in);
		
		System.out.println("enter the size of currency denominations");
		int size_of_denom = in.nextInt();
		
		System.out.println("enter the currency denominations value");
		int curr_denom[] = new int[size_of_denom];
		for(i=0;i<size_of_denom;i++)
		{
		   curr_denom[i] = in.nextInt();
		}
		
		System.out.println("enter the amount you want to pay");
		int pay= in.nextInt();
		
		Arrays.sort(curr_denom);
		temp = pay;
		System.out.println("Your payment approach in order to give min no of notes will be");
		for(i=size_of_denom-1;i>=0;i--) {
		    
		    quo = temp/curr_denom[i];
		    rem = temp%curr_denom[i];
		    if(quo==0) {
		        continue;
		    } else {
		        System.out.println(curr_denom[i]+":"+quo);
		        temp = rem;
		        quo = 0;
		    }
		}
	}
}
