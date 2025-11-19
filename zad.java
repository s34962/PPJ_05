public class zad{
	public static void main(String[] args){
		float[][] qube = new float[8][8];
		for(int i = 0; i < qube.length; i++){
			for(int j = 0; j < qube[i].length; j++){
				qube[i][j] = (float)(Math.random() * 10) + 1;
				IO.print(qube[i][j] + " ");
			}
		IO.println();
		}
		float rightPrzek = 0;
		for(int y = 0, x = 0; x < qube.length; y++, x++)
			rightPrzek += qube[x][y];
			
		IO.println(rightPrzek);
		
		float leftPrzek = 0;
		for(int y = 0, x = qube.length - 1; x >= 0; y++, x--)
			leftPrzek += qube[x][y];
		
		IO.println(leftPrzek);
	}
}