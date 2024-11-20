import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class AppTest {

	public static void main(String[] args) {
		Predicate<String> p = s -> s.contains("a"); 
		Function<String,String> f = s -> s.replace(" ","");
		Consumer<String> c = s -> System.out.println("Hello :"+s);
		Supplier<String> randomOtp = () ->  {
			String opt ="";
				for(int i=0;i<6;i++)
					opt = opt + (int)(Math.random()*10);
				return opt;
		};
		Supplier<String> randomPwd = () -> {	
			String password = "";
			Supplier<Integer> sup1 = () ->  (int)(Math.random()*10);
			String charac = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@&#";
			Supplier<Character> sup2 = () -> charac.charAt((int)(Math.random()*29));
			for(int i=0;i<10;i++)
			{
				if(i%2==0) {
					password = password + sup1.get();
				}else {
					password = password + sup2.get();
				}
			}
			return password;
		};
		System.out.println("Hello:"+randomOtp.get());
		System.out.println("New Password:"+randomPwd.get());
		System.out.println("Predicate ex :"+p.test("aziz"));
		System.out.println("function ex :"+f.apply("Azizul Haque"));
		c.accept("Aziz");
	}
}
