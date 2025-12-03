package exam.codereading.q3;

import java.util.HashMap;

public class Part2 {

	public static void main(String[] args) {
		//What will print?
		HashMap < Integer , Integer > map= new HashMap < >();
		map.put(131 , 0);
		map.put(247 , 12);
		map.put(0, 247);
		map.put(15 , 131);
		Integer x = 15;
		while (x!= null) {
			System.out.println(x);
			x = map.get(x);
		}
	}
}
// x=15 > x= 131
// x = 131 > x=0
// x=0 > x = 247
// x = 247 > x= 12
// x = 12 > x = null 
//15, 131, 0, 24, 12