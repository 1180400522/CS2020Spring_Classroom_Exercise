package exercise_6_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		System.out.println("plz input an array (spilted by ,)");
		String string=in.nextLine();
		//spilt str to int
		int[] inputdata=new int[100];
		String strs[];
		strs=string.split(",");
		for (int i = 0; i < strs.length; i++) 
		{
			inputdata[i]=Integer.parseInt(strs[i]);
		}
		//sorting
		for (int i = 0; i < inputdata.length-1; i++) 
		{
			for (int j = i; j < inputdata.length; j++) 
			{
				if (inputdata[i]<inputdata[j]) 
				{
					int temp;
					temp=inputdata[i];
					inputdata[i]=inputdata[j];
					inputdata[j]=temp;
				}
			}
		}
		int hindex=0;
		for (int i = 0; i < inputdata.length; i++) 
		{
			if(inputdata[i]>=i+1)
				hindex=i+1;
			else 
				break;
		}
		System.out.println("the h-index is:"+hindex);
	}

}
