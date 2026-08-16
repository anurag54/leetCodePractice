package mathsProgram;

class Solution {
    public int mySqrt(int x) {
        long low = 1; long high = x;
        while(low<=high){
             long mid = (high+low)/2;
             long val = mid * mid;
            if (val <= x){
                low = mid + 1;
            }
            else
                high = mid - 1;
        }
    return (int) high;
    }
    
}
public class squareRoot {
	public static void main(String[] args) {
		Solution solution = new Solution();
		int x = 8;
		int y = 8192;
		int result = solution.mySqrt(x);
		int result1 = solution.mySqrt(y);
		System.out.println("The square root of " + x + " is: " + result);
		System.out.println("The square root of " + y + " is: " + result1);
	}
}