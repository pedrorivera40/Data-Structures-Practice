
public class Main {

	public static void main(String[] args) {
		int[] randomNumbers = {4, 2, 3, 1, 4, 5, 6, 8,6 ,3 , 3, 1, 22};
		int[] sortedNumbers;
		for(int i : randomNumbers){System.out.print(i + " ");}
		System.out.println();
		sortedNumbers = insertionSort(randomNumbers);
		for(int i : sortedNumbers){System.out.print(i + " ");}
	}
	private static int[] insertionSort(int[] a){
		for(int i = 1; i < a.length; i++){
			int actualPosition = i;
			int value = a[i];
			while(actualPosition > 0 && value < a[actualPosition-1]){
				a[actualPosition] = a[actualPosition-1];
				actualPosition--;
			}
			a[actualPosition] = value;
		}
		return a;
	}

}
