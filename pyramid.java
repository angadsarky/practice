import java.util.Scanner;

public class pyramid {

	public static void main(String[] args) {
		System.out.println("enter rows");
		Scanner scan=new Scanner(System.in);
		int rows;
		rows=scan.nextInt();
		double i,j,k,l;
		for(i=0;i<=rows/2;i++)
		{ for(j=rows+2;j>i;j--)
			System.out.print(" ");
		  for(k=1;k<=i;k++)
			System.out.print("* ");
		 System.out.println();
		}
		for(i=(rows/2)+1;i<=rows;i++)
		{ l=i+1;

			for(j=rows+1;j>i;j=j-1)
			System.out.print(" ");
		  for(k=1;k<=l;k=k+1)
			{System.out.print("* ");
                        }
		 System.out.println();
		l++;
		}
	}

}
