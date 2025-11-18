public class zad{
	public static void main (String[] args){
		java.util.Scanner in = new java.util.Scanner(System.in);
		IO.println("Enter n: ");
		int n = in.nextInt();
		int[] tab = new int [n];
		int[] counTab = new int[5];
		int minIndex = 0; boolean contain = false;
	
	
	for(int i = 0; i < tab.length; i++){
		tab[i] = (int)(Math.random() * 10) + 1;
		IO.print(tab[i] + " ");
	}
	IO.println();
	
	for(int i = 0; i < tab.length; i++){
		for(int j = 0; j < counTab.length; j++){
			if(tab[i] == counTab[j])
				contain = true;
		}
		
		
		if(contain == false){
			if(minIndex >= counTab.length){
			int[] tmp = new int[counTab.length * 2];
			for(int k = 0; k < counTab.length; k++)
				tmp[k] = counTab[k];
			counTab = tmp;	
		}
			counTab[minIndex] = tab[i];
			minIndex++;
		}
		contain = false;
	}
	for(int i = 0; i < counTab.length - (counTab.length - minIndex); i++){
		IO.print(counTab[i] + " ");
	}
		
}}