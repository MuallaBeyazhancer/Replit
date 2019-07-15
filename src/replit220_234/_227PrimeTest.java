package replit220_234;
import java.util.*;
public class _227PrimeTest {
	public static void main(String[] args) {
		_227PrimeNumbersTable p = new _227PrimeNumbersTable();
		   System.out.println(p.isPrime(2));//true

		   System.out.println(Arrays.toString(p.generateTable(100, 5)));//[101, 103, 107, 109, 113]
		   System.out.println(p.checkTable(5, new int[]{5, 7, 116}));//false
		  
		  }
		}