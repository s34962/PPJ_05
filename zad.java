public class zad{
	public static void main(String[] args){
		int[] tabA = new int[(int)(Math.random()*10) + 1];
		int[] tabB = new int[(int)(Math.random()*10) + 1];
		int[] tabC = new int[(int)(Math.random()*10) + 1];
		int[][] abc = {tabA, tabB, tabC};
		
		for(int i = 0; i < tabA.length; i++){
			tabA[i] = (int)(Math.random()*10) + 1;
			IO.print(tabA[i] + " ");
		}
		IO.println();
		for(int i = 0; i < tabB.length; i++){
			tabB[i] = (int)(Math.random()*10) + 1;
			IO.print(tabB[i] + " ");
		}
		IO.println();
		for(int i = 0; i < tabC.length; i++){
			tabC[i] = (int)(Math.random()*10) + 1;
			IO.print(tabC[i] + " ");
		}
		IO.println();
		
		
		for(int i = 0; i < abc.length; i++){
			for(int j = 0; j < abc[i].length; j++){
				 IO.print(abc[i][j] + " ");
			}
		}
	}
}