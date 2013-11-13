package Task6;

public class AddingTheArrays {

	/*
	 * Spews out an error that I've got no idea why... scary stuff
	 */
	public static void main(String[] args) {
		Integer[][] A = {{2,3,4,5},{6,7,8,9},{10,11,12,13}}, B = {{1,3,5,7},{2,4,6,8},{3,6,9,12}}, C = new Integer[4][4];
		for(int i = 0; i < C.length; i++){
			for(int j = 0; j < C[i].length; j++){
				C[i][j] = A[i][j] + B[i][j];
				System.out.print(C[i][j] + "\t");
			}
			System.out.println("");
		}
	}
}
