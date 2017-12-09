public class Solution {
	public int sqrt(int a) {
	    int start = 1;
	    int end = a;
	    int ans = 0;
	   // System.out.println("a = " + a);
	    while (start <= end) {
	        int mid;
	        if (end == Integer.MAX_VALUE) 
	            mid = end/2;
	        else 
	            mid = (start + end)/2;
	       // System.out.println("start = " + start + ", end = " + end + ", mid = " + mid);
	       // System.out.println("mid*mid = " + (mid*mid));
	        if ((((double)mid) * mid) > Integer.MAX_VALUE) {
	            
	            end = mid - 1;
	        } else {
    	        if ((mid * mid) == a)
	                return mid;
	            if ((mid * mid) < a) {
	                // System.out.println("mid * mid < " + a);
	                start = mid+1;
	                ans = mid;
	            } else {
	                // System.out.println("mid * mid > " + a);
	                end = mid - 1;
	            }
	        }
	    }
	    return ans;
	}
}
