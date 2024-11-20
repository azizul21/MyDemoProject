// You have an arrays of zeros (0) and (1) keep all zeros at the left hand side and all 1 to right hand side ?

import java.util.ArrayList;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CodingProblem3 {
	public static void main(String[] args) {
		Integer array[] = {1,1,0,1,0 };
		///-> output : [0,0,1,1,1]
		System.out.println(Arrays.stream(array).sorted().collect(Collectors.toList()));
		/////-> output : [1,1,1,0,0]
		System.out.println(Arrays.stream(array).sorted((e1,e2) -> e2.compareTo(e1)).collect(Collectors.toList()));
		
		ArrayList<User> userList = new ArrayList<>();
		userList.add(new User("ABC", "Engg", 100000));
		userList.add(new User("DEF", "Engg", 130000));
		userList.add(new User("GHI", "DR", 200000));
		userList.add(new User("JKL", "DR", 170000));
		userList.add(new User("MNO", "CAR", 70000));
		
		
		System.out.println(userList);	
		
		//using goupingBy method
		
		Map<String,List<User>> catMap = userList.stream().collect(Collectors.groupingBy(User::getCat));
		// Printing the grouped result 
		catMap.forEach((cat, users) -> { System.out.println(cat + ": " + users); });
		//printing sum of salary using groupingy
		Map<String,Integer> catMap2 = userList.stream().collect(Collectors.groupingBy(User::getCat,Collectors.summingInt(User::getSal)));
		catMap2.forEach((cat, sum) -> { System.out.println(cat + ": " + sum); });
		
		//printing average of salary using groupingy
		Map<String,Double> catMap3 = userList.stream().collect(Collectors.groupingBy(User::getCat,Collectors.averagingInt(User::getSal)));
		catMap3.forEach((cat, avg) -> { System.out.println(cat + ": " + avg); });
		
		//printing summerize of salary using groupingy
		Map<String,DoubleSummaryStatistics> catMap4 = userList.stream().collect(Collectors.groupingBy(User::getCat,Collectors.summarizingDouble(User::getSal)));
		System.out.println(catMap4);
	}
}