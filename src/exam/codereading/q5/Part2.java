package exam.codereading.q5;

import java.util.HashMap;
import java.util.Map;

public class Part2 {

	public static void main(String[] args) {
		//What will print?
		String [] words = {"heart", "earth", "water",
				"fire", "wind"};
		Map<String , Integer> order = new HashMap<>();
		order.put("earth", 4);
		order.put("water", 3);
		order.put("fire", 0);
		order.put("wind", 2);
		Integer x = 1;
		String y = "hi";
		while (x != null ) {
			y = words [x];
			System.out.println (y);
			x = order.get(y);
		}
	}
}
// x=1 y=hi > y=earth x=4
// x=4 y=wind x=2
// x=2 y=water x = 3
// x=3 y=fire x=0 
// x=0 y=heart x=null
//earth, wind, water, fire, heart