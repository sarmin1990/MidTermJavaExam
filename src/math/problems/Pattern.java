package math.problems;

public class Pattern {

	public static void main(String[] args) {
		/* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
		 * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............
		 *
		 *
		 */
		int a=100;
		while (a>=90){
			System.out.println(a);
			a--;
		}

		int b=88;
		while (b>=70){
			System.out.println(b);
			b--;
			b--;
		}
		int c=67;
		while (c>=40){
			System.out.println(c);
			c--;
			c--;
			c--;
		}
		int d=36;
		while (d>=1){
			System.out.println(d);
			d--;
			d--;
			d--;
			d--;
		}

	}
}
