package Problem;

import java.util.ArrayList;
import java.util.List;

public class AllSubsetsOfASet {

	public static void main(String[] args) {
		List<Integer> lst=new ArrayList<>();
		List<String> strLst=new ArrayList<>();
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(4);
		for(int i=0;i<lst.size();i++) {
			strLst.add(lst.get(i)+"");
		}
		 for(int i=0;i<lst.size();i++) {
			 for(int j=0;j<lst.size();j++) {
				 strLst.add(lst.get(i)+","+lst.get(j));
			 }
		 }
		
		for(int i=0;i<strLst.size();i++) {
			System.out.println(strLst.get(i)+", "+i);
		}
	}

}
