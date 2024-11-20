import java.util.Arrays;
import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Problems {
	public static void main(String args[]) {
		String s1 = "ABCDEFG";
		StringBuilder s2 = new StringBuilder();
				
		for(int i=s1.length()-1;i>=0;i--)
			s2.append(s1.charAt(i));
			
				
		System.out.println("Reverse String without using reverse method::"+s2);
		
		//1 Removing leading and trailing space::
		String s3 = "    saghasd    ";
		System.out.println("before removing spaces::"+s3);
		System.out.println("After removing spaces::"+s3.trim());
		
		//2 Palindrom String
		String s4 = "GREvERG";
		StringBuilder s5 = new StringBuilder();
		
		for(int i=s4.length()-1;i>=0;i--)
			s5.append(s4.charAt(i));
		
		if(s5.toString().equalsIgnoreCase(s4))
			System.out.println("Palindrom::"+s4);
		else
			System.out.println("Not a Palindrom::"+s4);
		
		
		//3 swapping 2 number without 3 number::
		int a = 10;
		int b = 20;
		System.out.println("Before swaping.. A:"+a+" B:"+b);
		a= a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swaping A:"+a+" B:"+b);
		
		//4 Find a prime number
		int primeNum = 26;
		boolean isPrime = true;
		if(primeNum == 2 || primeNum==3) {
			isPrime = true;
		}else {
			for(int i =2 ; i<=primeNum/2 ; i++) {
				if(primeNum%i == 0) {
					isPrime = false;
					break;
				}
				else
					isPrime = true;
			}
		}
		
		System.out.println(primeNum + " is prime number ::"+isPrime);
		
		//5 List of integer contains only odd number
		Integer[] intArr = {11,23,55,65,45};
		List<Integer> l1 = Arrays.asList(intArr);
		
		System.out.println(l1 + " is contains only odd number ::"+l1.stream().allMatch(num -> num%2 != 0));
			
		//6 finding the summarize statictics for list of integers
		
		LongSummaryStatistics lSS = l1.stream().collect(Collectors.summarizingLong(Integer::intValue));
		System.out.println("LongSummaryStatistics max number ::"+lSS.getMax());
		System.out.println("LongSummaryStatistics min number ::"+lSS.getMin());
		System.out.println("LongSummaryStatistics average number ::"+lSS.getAverage());
		
		//7 finding factorial value of list of numbers
		Integer[] intArr1 = {1,2,3,4,5};
		List<Integer> l2 = Arrays.asList(intArr1); 
		Function<Integer, Long> factorial = num -> { 
			long result = 1; 
			for (int i = 1; i <= num; i++) { 
				result *= i; 
			} 
			return result; 
		}; 
		l2.forEach(num -> { 
			long fact = factorial.apply(num); 
			System.out.println("Factorial of " + num + "=is " + fact);
			}
		);
		
		//finding nearest palindrom number
		Long numPalindrom = 77677L;
		
		//String sPalindrom= "";
		Function<Long,Long> funcPalimdrom = lPalim -> {
			Long retValue = 0L;
			if(lPalim<=9)
				return lPalim;
			else {
				while(true) {
					String sPalimrom = ""+lPalim;
					StringBuilder revPalimrom = new StringBuilder().append(sPalimrom).reverse(); 	
					if(revPalimrom.toString().equalsIgnoreCase(sPalimrom)) {
						retValue = lPalim;
						break;
					}
					else {
						lPalim++;
					}							
					revPalimrom = null;
				}
			}
			return retValue;
		};
		
		
		System.out.println("Nearest Palindrome number is::"+funcPalimdrom.apply(numPalindrom));		
		
		
	}

}
