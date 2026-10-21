package strings;

import java.util.*;


class commonElementsInArray {
	public static void main(String[] args) {
		String[] str1 = {"Java","Python","C++","Groovy","Ruby"};
		String[] str2 = {"Java","Interview","C","Scala","Ruby","Python"};

		Set<String> result = new HashSet<>();

		for(int i =0; i <str1.length;i++){
			for(int j=0; j<str2.length;j++){
				if(str1[i] == str2[j]){
					result.add(str1[i]);
					break;
				}
			}
		}
		for(String s : result){
			System.out.println("Common elements==>"+s);
		}
	}
}