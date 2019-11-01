public class fibonacci {
	public static void main (String[] args) {
		int n, a = 0, b = 0, c = 1;
               	for(int i = 1; i <= 100; i++) {
            		a = b;
           		b = c;
            		c = a + b;
            		System.out.print(a + " \n");
}}}


