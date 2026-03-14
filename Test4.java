package best;

public class Test4 {

	public static void main(String[] args) {
		 int size = 2 * 4- 1;

	        for (int i = 0; i < size; i++) {
	            for (int j = 0; j < size; j++) {

	                int top = i;
	                int left = j;
	                int right = size - 1 - j;
	                int bottom = size - 1 - i;

	                int min = Math.min(Math.min(top, bottom), Math.min(left, right));

	                System.out.print((4 - min) + " ");
	            }
	            System.out.println();
	        }
	}

}
