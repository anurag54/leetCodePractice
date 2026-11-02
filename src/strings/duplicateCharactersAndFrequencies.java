package strings;

import java.util.*;


public class duplicateCharactersAndFrequencies {

	public static void main(String[] args) {
		String str = "abcabcaaa";
		duplicateCharactersAndFrequency(str);
	}

	public static void duplicateCharactersAndFrequency(String str){
		Map<Character,Integer> map = new HashMap<>();

		char[] ch = str.toCharArray();
		for(int i=0;i<ch.length;i++){
			if(map.containsKey(ch[i])){
				map.put(ch[i],map.get(ch[i])+1);
			}
			else {
				map.put(ch[i],1);
			}     
		}
		for(Map.Entry<Character,Integer> maEntry : map.entrySet()){
			char key = maEntry.getKey();
			int value = maEntry.getValue();
			if(value>1)
				System.out.println(key +" "+ value);
		}
	}
}
