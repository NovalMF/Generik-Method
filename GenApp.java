//generik method ARRAY

public class GenApp {
	
	private static <T> void printArray (T[] a) {

		for (Object o : a ) {
			System.out.println(o);
			
		}
	}

	public static void main (String[] args) {
		Integer iArr[] = new Integer[3];
		iArr[0] = 10;
		iArr[1] = 20;
		iArr[2] = 30;
		printArray(iArr);

		String sArr[] = new String[3];
		sArr[0] = "sepuluh";
		sArr[1] = "duapuluh";
		sArr[2] = "tigapuluh";
		printArray(sArr);

		Character cArr[] = new Character[3];
		cArr[0] = '1';
		cArr[1] = '2';
		cArr[2] = '3';
		printArray(cArr);

		Double dArr[] = new Double[3];
		dArr[0] = 10.01;
		dArr[1] = 20.01;
		dArr[2] = 30.01;
		printArray(dArr);
	} 
}