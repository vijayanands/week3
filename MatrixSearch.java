public class Solution {
	public int searchMatrix(ArrayList<ArrayList<Integer>> a, int b) {
	    int noOfRows = a.size();
	    int i = 0;
	    int found = 0;
	    while (i < noOfRows) {
	        ArrayList<Integer> tmp = a.get(i);
	        int len = tmp.size();
	        if ((b < tmp.get(0)) || (b > tmp.get(len-1))) {
	            i++;
	            continue;
	        } else {
	            // range of row contains b if present
	            int low = 0;
	            int high = len;
	            while (low <= high) {
	                int mid = (low+high)/2;
	                if (tmp.get(mid) == b) {
	                    found = 1;
	                    break;
	                } else {
	                    if (b > tmp.get(mid)) {
	                        // look at uppper half
	                        low = mid + 1;
	                    } else {
	                        // lower half
	                        high = mid - 1;
	                    }
	                }
	            }
	        }
	        if (found == 1)
	            break;
	        i++;
	    }
	    return found;
	}
}
