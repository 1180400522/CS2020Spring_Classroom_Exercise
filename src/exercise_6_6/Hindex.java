package exercise_6_6;




import java.util.Scanner;

public class Hindex {
	public static void sortingarray(int inputdata[]) {		//sorting
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
	}
	public static int calculatehindex(int inputdata[]) {		//calculate hindex
		int hindex=0;
		for (int i = 0; i < inputdata.length; i++) 
		{
			if(inputdata[i]>=i+1)
				hindex=i+1;
			else 
				break;
		}
		return hindex;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		System.out.println("plz input an array (spilted by ,)");
		String string=new String();
		String strs[];
		int[] inputdata=new int[100];
		while (true) {//loop to check illegal input
			string=in.nextLine();
			if (string.length()==0) {//deal with empty input
				System.out.println("input empty plz reinput");
				continue;
			}
			boolean legalnumber=true;
			strs=string.split(",");
			for (int i = 0; i < strs.length; i++) {
				if(!strs[i].matches("[0-9]+"))
				{
					System.out.println(strs[i]+"is illegal ,plz input again");
					legalnumber=false;
					break;
				}
				inputdata[i]=Integer.parseInt(strs[i]);
			}
			if(!legalnumber) {
				continue;
			}
			else {
				sortingarray(inputdata);
				int hindex=calculatehindex(inputdata);
				System.out.println("the h-index is:"+hindex);
				break;
			}
		}

	}
}
