
public class Arrays_bidimensionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		/*forma manual de rellenar una matriz
		 
	 	int [][]matrix=new int[4][5];
		
		matrix[0][0]=15;
		matrix[0][1]=67;
		matrix[0][2]=34;
		matrix[0][3]=16;
		matrix[0][4]=19;
		
		matrix[1][0]=67;
		matrix[1][1]=68;
		matrix[1][2]=97;
		matrix[1][3]=25;
		matrix[1][4]=35;
		
		matrix[2][0]=24;
		matrix[2][1]=45;
		matrix[2][2]=65;
		matrix[2][3]=76;
		matrix[2][4]=88;
		
		matrix[3][0]=33;
		matrix[3][1]=22;
		matrix[3][2]=13;
		matrix[3][3]=21;
		matrix[3][4]=41;*/
		
	//forma mas rápida de rellenar una matriz
		int [][] matrix={
				
				{10,15,18,19,21},{25,95,87,42,65},{98,74,88,73,29},{71,5,94,18,22}
		};
		
	//bucle for para mostrar por pantalla todo el contenido de la matriz
		
		/*for (int i=0;i<4;i++){
			//salto de linea en el primer bucle for para que el resultado se muestre en forma de tabla
			
			System.out.println();
			
			for (int j=0;j<5;j++){
				
				System.out.print(matrix[i][j]+" ");
			}
		}*/
		//bucle for each
		
		for(int[]fila:matrix){
			
			System.out.println();
			
			for(int z: fila){
				
				System.out.print(z+ " ");
			}
		}
		
	}
}
