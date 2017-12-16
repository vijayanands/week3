public class Solution {
	public int pow(int x, int n, int d) {
	    if (x == 0) {
	        return 0;
	    }
	    long power = powerOf(x,n, d);
	   // System.out.println("power = " + power);
	   // System.out.prin
	   int res;
	   if ((x < 0) && ((n%2) != 0)) {
	       res = ((int)power % d) + d;
	   } else {
	       res = (int)power % d;
	   }
	    return res;
	}
	
	public long powerOf(int x, int n, int d) {
	    long power = 0;
	    if (n == 1)
	        return x;
	    if (n == 0)
	        return 1;
	    power = powerOf(x,n/2,d)%d;
	    if ((n%2) == 0) { // n is even
	        power = (power * power) % d;
	    } else {
	        n = n - 1;
	        power = (((power * power)%d) * (x%d))%d;
	    }
	    return power;
	}
}
