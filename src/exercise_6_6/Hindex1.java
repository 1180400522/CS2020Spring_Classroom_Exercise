package exercise_6_6;

import java.util.ArrayList;
import java.util.List;


public class Hindex1 {

	//representaton(rep)
	//no construction method(д╛хо)
	
	private static List<Integer> dealInput(String input){
		if(input==null||input.length()==0) {
			throw new IllegalArgumentException("Empty input");
			
		}
		
		List<Integer> citation =new ArrayList<Integer>();
		String[] strs=input.split(",");
		
		for (int i = 0; i < strs.length; i++) {
			if(!strs[i].matches("[0-9]+")) {
				throw new IllegalArgumentException(strs[i]+"is illigal");
				}
			citation.add(Integer.parseInt(strs[i]));
			}
		return citation;
		}
	public static int calculatehindex(String input) {
		List<Integer> citation=dealInput(input);
		int[] citationarray=new int[citation.size()];
		for (int i = 0; i < citationarray.length; i++) {
			citationarray[i]=citation.get(i);
		}
		sortingarray(citationarray);
		
		int hindex=0;
		for (int i = 0; i < citationarray.length; i++) {
			if(citationarray[i]>=i+1)
				hindex=i+1;
			else {
				break;
			}
		}
		return hindex;
	}
	private static void sortingarray(int inputdata[]) { // sorting
		for (int i = 0; i < inputdata.length - 1; i++) {
			for (int j = i; j < inputdata.length; j++) {
				if (inputdata[i] < inputdata[j]) {
					int temp;
					temp = inputdata[i];
					inputdata[i] = inputdata[j];
					inputdata[j] = temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		String[] inputStrings=new String[] {"6,5,4,2,1,0","5,5,5,5,5"};
		for (int i = 0; i < inputStrings.length; i++) {
			System.out.println(Hindex1.calculatehindex(inputStrings[i]));
		}
	}

}
