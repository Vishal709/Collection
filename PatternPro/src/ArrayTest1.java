import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayTest1 {
static ArrayList<String> arr = null;
public static void main(String[] args) {
	arr=new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	System.out.println("enter no. of testcases:");
	int testCases = sc.nextInt();
	
	if(testCases >= 1 && testCases <= 100){
		System.out.println("enter no. of characters to be entered:");
		for(int testcases=0; testcases<testCases; testcases++){
		int numberOfchars = sc.nextInt();
		if(numberOfchars >=1 && numberOfchars <= (int)Math.pow(10, 5)){
			for(int i = 0; i<numberOfchars; i++){
				
				System.out.println("enter option to execute insert or frequency:");
					String flag = sc.next();
					if(flag.equalsIgnoreCase("i")){
						System.out.println("insert a character:");
						String alphabets=sc.next();
						arr.add(alphabets);
						//numberOfQueries++;
					}
					else if(flag.equalsIgnoreCase("f")){
						System.out.println(" enter character to check for frequency:");
						String findAplphabet=sc.next();
						if(arr.contains(findAplphabet)){
							int freq=Collections.frequency(arr, findAplphabet);
							System.out.println("frequency is:"+freq);
							//numberOfQueries++;
						}
						else{
							System.out.println(" character doesnt exist.");
						}
					}
					else{
						System.out.println(" option doesnot exist");
					}
			}
		}
		arr.clear();
	}
		}
		
	
}
}
