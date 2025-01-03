package hashMap;
import java.util.HashMap;

public class Maps {

	public static void main(String[] args) {
		HashMap<String, Integer> empIds = new HashMap<>();
		empIds.put("Komal", 12345);
		empIds.put("Jerry", 45345);
		empIds.put("John", 22345);
		System.out.println(empIds);
		
		System.out.println(empIds.get("Jerry"));
		System.out.println(empIds.containsKey("Komal"));
		System.out.println(empIds.containsValue(5));
		empIds.putIfAbsent("Sasha", 33345);
		System.out.println(empIds);

	}

}
