package Problem;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class FirstRecurringCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Character>lst=new ArrayList<>();
		while (sc.hasNext()) {
			String str = sc.next();

			for (int i = 0; i < str.length(); i++) {				
				if(lst.contains(str.charAt(i))) {
					System.out.println(str.charAt(i));
					break;
				}else {
					lst.add(str.charAt(i));
				}
			}
			lst.clear();

		}

	}

}
