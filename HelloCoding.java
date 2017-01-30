import java.security.KeyStore.Entry;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Abhishek Miahra
 *
 */
public class HelloCoding {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 
		System.out.println("Hello, World.");
		System.out.println("Hello, Java.");
		//2. 
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		System.out.println(a);
		//3. 
		String ans = null;
		if(a%2==1 && a>10){
			ans = "Weird";
		}
		else{
			ans = "Not Weird";
		}
		System.out.println(ans);	     
		//4. Is number Prime 
		System.out.println("Is number "+a+ " Prime ? "+isNumPrime(a));
		//5. 		
		System.out.println("First non repeated character: "+getFirstNonRepeatedChar("ahmednagar"));

	}

	public static boolean isNumPrime(int num){
		for(int i=2; i<num; i++){
			if(num%i == 0){
				return false; //number is divisible so its not prime
			}
		}
		return true; //number is prime now
	}

	private static boolean isArmStrong(int num) {
		// 153 = 1^3 + 5^3 + 3^3
		int result = 0; 
		int orig = num; 
		while(num != 0){ 
			int remainder = num%10; 
			result = result + remainder*remainder*remainder; 
			num = num/10; 
		} 
		//number is Armstrong return true 
		if(orig == result){ 
			return true; 
		} 
		return false; } 

	public static int factorial(int num){       
		//base case
		if(num == 0){
			return 1;
		}
		return num*factorial(num -1); //is this tail-recursion?
	}

	/* * Using LinkedHashMap to find first non repeated character of String 
	 * * Algorithm : 
	 * * Step 1: get character array and loop through it to build a 
	 * * hash table with char and their count. 
	 * * Step 2: loop through LinkedHashMap to find an entry with 
	 * * value 1, that's your first non-repeated character, 
	 * * as LinkedHashMap maintains insertion order. */ 
	public static char getFirstNonRepeatedChar(String str) { 
		Map<Character,Integer> counts = new LinkedHashMap<>(str.length()); 
		for (char c : str.toCharArray()) { 
			counts.put(c, counts.containsKey(c) ? counts.get(c) + 1 : 1); 
		} 
		for (java.util.Map.Entry<Character, Integer> entry : counts.entrySet()) { 
			if (entry.getValue() == 1) { 
				return entry.getKey(); 
			} 
		} throw new RuntimeException("didn't find any non repeated Character");
	}

	public static boolean iAnagram(String word, String anagram){
		char[] charFromWord = word.toCharArray(); 
		char[] charFromAnagram = anagram.toCharArray(); 
		Arrays.sort(charFromWord); 
		Arrays.sort(charFromAnagram); 
		return Arrays.equals(charFromWord, charFromAnagram); 
	}

	
	//Select D.NAME, count(*) as count
	//from Employee E right join Department D
	//on E.DEPT_ID = D.DEPT_ID
	//group by D.NAME,E.NAME
	//order by count desc, D.NAME asc
	
	//select E.ID from (Select E.ID, count(*)
	//from Employee group by ID order by ID desc limit 0,1) as Temp




}
