import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CodingProblem2 {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("abc","","PQR",null,"pass", "fail");
		
		//1)Removing spaces and null values from string
		//2) all the string should be in capital case
		List<String> finalString = strings.stream().filter(s -> 
			 s != null && !s.trim().equalsIgnoreCase("")
		).collect(Collectors.toList()).stream().map(s -> s.toUpperCase()).collect(
			Collectors.toList());
		
		System.out.println(finalString);
		
		//Find out the evene number form list using java8
		List<Integer> listInt = Arrays.asList(22,33,44,56,77);
		List<Integer> listIntFinal = listInt.stream().filter(i -> i%2==0).collect(Collectors.toList());
		System.out.println(listIntFinal);
		
		//Find out the sum of even number from list using java8
		int sumvalue = listIntFinal.stream().collect(Collectors.summingInt(Integer :: intValue));
		System.out.println("Sum of::"+sumvalue);
		
		//Remove the special character  from string
		String str = "aB-E/Te1";
		String strFinal = str.replaceAll("[^A-Za-z0-9]", "");
		System.out.println("Final Value::"+strFinal);
		
		//Find out the employee name and employee id form employee list using stream

		 /*Map<String,Double> empnameandsalary = employeeList.stream()
		                .collect(Collectors.toMap(Employee::getName, Employee::getEmpId));*/
		
		//Find out the employee whose name starting with A
		List<String> empList = Arrays.asList("john","Alice","Bob","aziz","Alice","john");
		System.out.println("final employee List with 'A' character::"
				+empList.stream().filter(e -> e.toUpperCase().charAt(0) == 'A').collect(
						Collectors.toList())
				);
		//remove all leading zeroes
		String intValue = "00000123569";
		System.out.println("Without leading zeroes::"+Integer.parseInt(intValue));
		
		//remove all trailing zeroes
		String intValue1 = "12356900000";
		StringBuilder intValue1SB = new StringBuilder(intValue1);
		String intValue1Final = intValue1SB.reverse().toString();
		
			
		System.out.println("Without trailing zeroes::"
				+new StringBuilder().append(""+Integer.parseInt(intValue1Final)).reverse().toString());
		
		//Find out the number form list starting with 4
		List<Integer>list =  Arrays.asList(1,2,3,4,11,124,43,40,431);
		      list .stream().filter(a-> String.valueOf(a).startsWith("4"))
		                .collect(Collectors.toList()).forEach(System.out::println);
		      
		//Write a Program to remove duplicates in an ArrayList.
		List<String> empListFinal = empList.stream().distinct().collect(Collectors.toList()); 
		System.out.println(empListFinal);
		 
	}
	
}
