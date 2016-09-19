package prob1;

public class Prob1 {
	
	public static void main(String args[]) {
		
		char[] array1 = reverse("Hello World");
		printCharArray(array1);
		
		char[] array2 = reverse("Java Programming!");
		printCharArray(array2);
		
	}
	
	public static char[] reverse(String str){
		char[] tmp = str.toCharArray();
		int length = tmp.length;
		char[] result = new char[length];
		
		for(int i = 0 ; i<tmp.length ; i++){
			result[i] = tmp[--length]; 
		}
		return result;
	}
	
	public static void printCharArray(char[] array){
		for(char c : array){
			System.out.print(c);
		}
	}
}
