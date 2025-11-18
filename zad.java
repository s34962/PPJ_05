public class zad{
	public static void main(String[] args){
		java.util.Scanner in = new java.util.Scanner(System.in);
		IO.println("Enter n:");
		int n = in.nextInt();
		int[] tab = new int[n];
		int[] tabCount = new int[tab.length];
		int[] tabSort = new int[tab.length];
		
		for(int i = 0; i < tab.length; i++){
			tab[i] = (int)(Math.random() * 10) + 1;
			IO.print(tab[i] + " ");
		}
		IO.println();
		
		int checkNum = 0;
		
		for(int i = 0; i < tab.length; i++){
			for(int j = 0; j < tab.length; j++)
				if(tab[i] == tab[j])
					checkNum++;
			tabCount[i] = checkNum;
			checkNum = 0;
		}
		
		for(int i = 0; i < tab.length; i++){
			for(int j = 0; j < tab.length; j++){
				if(tabCount[i] > tabCount[j]){
					int tmp = tabCount[j];
					tabCount[j] = tabCount[i];
					tabCount[i] = tmp;
					
					tmp = tab[j];
					tab[j] = tab[i];
					tab[i] = tmp;
				}
			}
		}
			
		int minIndex = 0;
		int sortIndex = 0;
		boolean exist = false;
		
		for(int i = 0; i < tab.length; i++){
			for(int j = 0; j < tab.length; j++){	
				if (tab[i] == tabSort[j])
					exist = true;		
				else	
					continue;
			}
			
		if(exist == false && tabCount[minIndex] == tabCount[i])
		tabSort[sortIndex++] = tab[i];
	
		exist = false;
		}

		for(int i = 0; i < tab.length - (tab.length - sortIndex); i++)
			IO.print(tabSort[i] + " ");
	}
}
							
						