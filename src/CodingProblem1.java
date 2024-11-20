import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class CodingProblem1 {
	public static void main(String[] args) {
		String input="Azizul Haque";
		List<String> duplicateCharacter = findDuplicateChracter(input);
		System.out.println("Duplicate character::::"+duplicateCharacter);
	}
	private static List<String> findDuplicateChracter(String input){
		return Arrays.stream(input.toLowerCase().split(""))
				.collect(Collectors.groupingBy(ch->ch , Collectors.counting()))
				.entrySet().stream().filter(cha->cha.getValue()>1).
				map(in->in.getKey()).collect(Collectors.toList());
		
		
	}
}