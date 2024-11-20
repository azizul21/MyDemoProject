import java.time.LocalDate;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class AppTestStream {

	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<>();
		l.add("Pavan");
		l.add("Chiranjeevi");
		l.add("Nagarjuna");
		l.add("Ravidra");
		l.add("Venkatesh");
		System.out.println(l);
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(0);
		list.add(10);
		list.add(20);
		list.add(5);
		list.add(15);
		list.add(25);
		System.out.println(list);
		
		Double[] d = {10.0,10.1,10.2,10.3};
		
		LocalDate ld = LocalDate.now();
		
		//filter configuration
		ArrayList<String> l1 = (ArrayList<String>) l.stream().filter(s -> s.length()>=9).collect(Collectors.toList());
		System.out.println(l1);
		
		//count() method
		Long count = l.stream().filter(s -> s.length()>=9).count();
		System.out.println("total :: "+count);
		
		//map configuration
		ArrayList<String> l2 = (ArrayList<String>) l.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(l2);
		
		//sorted method
		System.out.println("Sorted Methods:: ");
		ArrayList<String> l3 = (ArrayList<String>) l.stream().sorted().collect(Collectors.toList());
		System.out.println(l3);
		
		ArrayList<String> l4 = (ArrayList<String>) l.stream().sorted((s1,s2) -> s2.compareTo(s1)).collect(Collectors.toList());
		System.out.println(l4);
		
		//min() and max() methods
		int minimum = list.stream().min((i1,i2)-> i1.compareTo(i2)).get();
		int maximum = list.stream().max((i1,i2)-> i1.compareTo(i2)).get();
		System.out.println("Minimum value :"+minimum);
		System.out.println("Maximum value :"+maximum);
		
		//forEach Method
		System.out.println("For Each method");
		l.stream().forEach(e -> System.out.println(e.toLowerCase()));
		
		//Stream.Of method use for group of elements and arrays
		System.out.println("For Stram.of method");
		Stream<Integer> s1 = Stream.of(3,33,333,3333,33333);
		Stream<Double> s2 = Stream.of(d);
		s1.forEach(System.out::println);
		s2.forEach(System.out::println);
		
		int dd = ld.getDayOfMonth();
		int mm = ld.getMonthValue();
		int yyyy = ld.getYear();
		
		System.out.println("Todays Date is:" + dd +"."+mm+"."+yyyy);
		System.out.printf("%d/%d/%d", dd,mm,yyyy);
	}

}
