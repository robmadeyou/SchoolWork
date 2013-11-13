package Task6;

public class FindingTheVolume {

	public static void main(String[] args) {
		Double[][] data = {{4.0,5.0,6.0,0.0},{2.3,7.8,4.2,0.0},{13.2,16.7,2.1,0.0}};
		System.out.println("The volume is:");
		for(int i = 0; i < data.length; i++){
			data[i][3] = data[i][0] * data[i][1] * data[i][2];
			System.out.println("Index: " +i + " Volume: "+ data[i][3]);
		}
	}
}
