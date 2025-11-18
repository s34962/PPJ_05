public class zad{
	public static void main (String[] args){
		int[] A = new int[10];
		int[] B = new int[A.length];
		int[] C = new int[8];
		int ilosC = 0;
		for(int i = 0; i < A.length; i++){
			A[i] = (int)(Math.random() * 100) + 1;
			B[i] = (int)(Math.random() * 100) + 1;
		}
		
		for(int minIndex = 0; minIndex < A.length; minIndex++){
			for(int i = minIndex; i < A.length; i++){
				if(A[i] < A[minIndex]){
					int tmp = A[i];
					A[i] = A[minIndex];
					A[minIndex] = tmp;
				}
			}
			IO.print(A[minIndex] + " ");
		}
		IO.println();
		
		for(int maxIndex = 0; maxIndex < A.length; maxIndex++){
			for(int i = maxIndex; i < A.length; i++){
				if(B[i] > B[maxIndex]){
					int tmp = B[i];
					B[i] = B[maxIndex];
					B[maxIndex] = tmp;
				}
			}
			IO.print(B[maxIndex] + " ");
		}
		IO.println();
		
		for(int i = 0; i < A.length + B.length; i++){
			if(i >= C.length-1){
				int[] tmp = new int[C.length * 2];
				for(int j = 0; j < C.length; j++)
					tmp[j] = C[j];
				C = tmp;
			}
			if(i < A.length){
			C[i] = A[i]; ilosC++;}
			
			else{
			C[i] = B[i - A.length]; ilosC++;}
		}
		for(int i = 0; i < C.length - (C.length - ilosC); i++)
			IO.print(C[i] + " ");
		
	}
}