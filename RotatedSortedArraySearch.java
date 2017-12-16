public class Solution {
	// DO NOT MODIFY THE LIST
	public int search(final List<Integer> a, int b) {
	    int size = a.size();
	    int pivot = findPivot(a, 0, size-1);
	   // System.out.println("pivot = " + pivot);
	    if (pivot == -1)
	        pivot = (size-1)/2;
	    if (b == a.get(pivot))
	        return pivot;
	    if (b >= a.get(0)) {
	        // search left
	        return binarySearch(a, b, 0, pivot-1);
	    } else {
	        // search right
	        return binarySearch(a, b, pivot+1, size-1);
	    }
	}
	
	public int binarySearch(final List<Integer> a, int b, int low, int high) {
	    if (low > high)
	        return -1;
	    int mid = (low+high)/2;
	    if (a.get(mid) == b)
	        return mid;
	    if (a.get(mid) > b) {
	        // search left
	        return binarySearch(a, b, low, mid-1);
	    } else {
	        // search right
	        return binarySearch(a, b, mid+1, high);
	    }
	}
	
	public int findPivot(final List<Integer> a, int low, int high) {
	    if (high < low) // could not find pivot
	        return -1;
	    if (high == low) 
	        return low;
	    int mid = (low + high)/2;
	    // check if mid is a pivot
	    if ((mid < high) && (a.get(mid) > a.get(mid+1)))
	        return mid;
	    if ((mid > low) && (a.get(mid) < a.get(mid-1)))
	        return mid-1;
	    if (a.get(mid) > a.get(high)) {
	        // pivot is in the right
	        return findPivot(a, mid+1, high);
	    } else {
	        // pivot is in the left
	        return findPivot(a, low, mid-1);
	    }
	}
}
