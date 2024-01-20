import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size_of_transaction = in.nextInt();
		int sum =0,check=0;
		int val_of_arr[] = new int[size_of_transaction];
		for(int i=0;i<size_of_transaction;i++)
		{
		    val_of_arr[i]=in.nextInt();
		}
		int tno_targetsv = in.nextInt();
		int val_of_target[] = new int[tno_targetsv];
		for(int j=0;j<tno_targetsv;j++) {
		    val_of_target[j]=in.nextInt();
		}
		
		for(int l = 0;l<tno_targetsv;l++) {
		    sum = 0;check=0;
		    for(int k=0;k<size_of_transaction;k++) {
		        sum = sum + val_of_arr[k];
		        if (sum >= val_of_target[l]) {
		            check=1;
		            System.out.println("Target achieved after "+(k+1)+" transactions");
		            break;
		        }
		    }
		    if(check==0)
		    {
		     System.out.println("Given target is not achieved");
		    }
		    
		}

	}
}
