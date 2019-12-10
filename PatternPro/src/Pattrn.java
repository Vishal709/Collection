import java.util.Scanner;

public class Pattrn {
public static void main(String[] args)
{int i,j;
	for(i=1; i<=5; i++){
		for(j=1; j<=i ; j++){
		System.out.print("*");
		}
		System.out.println();
		}
		for(i=5; i>=1; i--){
		for(j=1; j<=i ; j++){
		System.out.print("*");
		}
		System.out.println();
		}	
		
		
		
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		//int s=0;
		for(i=1; i<=no; i++){
			for(j=1; j<=i ; j++){
			System.out.print(i);
			}
			System.out.println();
			}sc.close();
}
}

