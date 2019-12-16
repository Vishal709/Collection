/* 
 * Enter your code here. Read input from STDIN. Print your output to STDOUT. 
 * Your class should be named CandidateCode.
*/

import java.util.*;
public class CandidateCode {

    static int evenOrOdd (int element){
        int result=element%2;
        if(result == 0){
            return 1;
        }
		return 0;
        
    }
    static List<Integer> elementsInRange(int from, int limit) {
        List<Integer> numbers = new ArrayList<>(limit);
        for (int to = limit; from < to; ++from) {
            numbers.add(from);
        }
        return numbers;
    } 

    static int countElementDigits(int element){
        int count = 0;
        while(element != 0){
        	
        	 element=element/10;
        	 ++count;
        }
        return count;
    }
    static List<Integer> splitElement(int element){
        List<Integer> list=new ArrayList<>();
        String str= String.valueOf(element);
        char[] cArray = str.toCharArray();
        for(char c : cArray) {
        	int d = Character.getNumericValue(c); 
        	list.add(d);
        }
        
        return list;
    } 

    public static void main(String args[] ) throws Exception {
    	List<Integer> list=new ArrayList <>();
        int sum=0;
        Scanner scan = new Scanner(System.in);
        int testCount = scan.nextInt();
        
        int countEven=0;
        for(int i = 0; i<testCount; i++){
            int testInput1 = scan.nextInt();
            int testInput2 = scan.nextInt();
            list=elementsInRange(testInput1,testInput2);
            for(int element : list){
                int countElementDigits=countElementDigits(element);
                if(countElementDigits ==1){
                    int isEven=evenOrOdd(element);
                    if(isEven==1) {
                    	++countEven;
                    }
                }                   
               
               else{
                   List <Integer> listSplittedElemnts=splitElement(element);
                   List<String> newList= new ArrayList<>();
                   
                   for(int k : listSplittedElemnts){
                       String s1 = String.valueOf(listSplittedElemnts.get(k));
                       newList.add(s1);
                       for(int j=k+1 ; j < listSplittedElemnts.size(); j++){
                            String s2 = String.valueOf(listSplittedElemnts.get(j));
                            String s3=s1.concat(s2);
                       newList.add(s3);
                       }
                   }
                   String s4 =  String.valueOf(element);
                   newList.add(s4);
                   for(String eachElemnt : newList){
                       int num = Integer.parseInt(eachElemnt);
                       sum+=num;
                   }

                   int isEven= evenOrOdd(sum);
                   if(isEven == 1){

                       ++countEven;
                   }
               }
            }
            System.out.println(countEven);
        }
        scan.close();
    }
}
                   