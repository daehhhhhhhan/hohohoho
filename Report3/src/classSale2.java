public class classSale2 {

	public static void main(String[] args) {
        int sale[][] = new int[][] {{63,84,140,130},{157,209,251,312}};
		
		for(int i=0; i<2; i++) {
			for(int j=0; j<4; j++)
				System.out.printf("%d/4ºÐ±â: sale[%d][%d]= %d%n", j+1,i,j,sale[i][j]);
			                    //                           0+1,0,0,sake[0][0]
			                    //  1/4ºÐ±â: sale[0][0]  = sale[0][0]
			                    //  1/4ºÐ±â: sale[0][0]  = 63 
		}
	}
}