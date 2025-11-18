public class zad{
	public static void main(String[] args){
	int[]x = new int[10];
	int[] y = new int[x.length];
	
	IO.println("x: ");
	for(int i = 0; i < x.length; i++){
		x[i] = (int)(Math.random() * 20) - 10;
		IO.print(x[i] + " ");	
	}
	IO.println();
	
	IO.println("y: ");
		for(int i = 0; i < x.length; i++){		
		y[i] = (int)(Math.random() * 20) - 10;
		IO.print( y[i] + " ");
	}
	IO.println();
	
	for(int minIndex = 0; minIndex < x.length; minIndex++){
		for(int i = minIndex; i < x.length; i++){
			if(x[i] < x[minIndex]){
				int tmp = x[minIndex];
				x[minIndex] = x[i];
				x[i] = tmp;}
			if(y[i] < y[minIndex]){
				int tmp = y[minIndex];
				y[minIndex] = y[i];
				y[i] = tmp;
			}
		}	
	}		
	int miX = x[0], maX = x[x.length - 1];
	
	int miY = y[0], maY = y[x.length - 1];
	
	int szer = maX - miX;
	int wys = maY - miY;
	
	IO.println("szerokość: " + szer + " wysokość: " + wys + " środek x: " + (((double)(szer))/2) + " y: " + (((double)(wys))/2)); 
	}
}	