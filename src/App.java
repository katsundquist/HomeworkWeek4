import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class App {
	public static void main(String[] args) {
		List<String> employeeNames = new ArrayList<String>();
		
		Set<Integer> ids = new HashSet<Integer>();
		
		Map<Integer, String> employeeMap = new HashMap<Integer, String>();
		
		employeeNames.add("Sam Smith");
		employeeNames.add("Robert Redd");
		employeeNames.add("Kirsten Kestrel");
		employeeNames.add("Amelia Acton");
		employeeNames.add("Annie Oakley");
		
		ids.add(101);
		ids.add(102);
		ids.add(103);
		ids.add(104);
		ids.add(105);
		
		int i = 0;
		
		for (int id : ids) {
			employeeMap.put(id, employeeNames.get(i));
			i++;
		}
				
		for(int key : employeeMap.keySet()) {
			System.out.println(key + employeeMap.get(key));
		}
		
		StringBuilder idsBuilder = new StringBuilder();
		
		for(int id : ids) {
			idsBuilder.append(id + "-");
		}
		
		System.out.println(idsBuilder.toString());
		
		StringBuilder namesBuilder = new StringBuilder();
		
		for(String name : employeeNames) {
			namesBuilder.append(name + " ");
		}
		
		System.out.println(namesBuilder.toString());
	}
}
