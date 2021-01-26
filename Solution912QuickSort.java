public class Solution912QuickSort {
    public int NumberOf1Between1AndN_Solution(int n) {
        int digit = 1, low = 0;
        int cnt = 0;
        while(n > 0){
            int res = n%10;
            n /= 10;
            if(res == 0){
                cnt += digit*n;
            }else if(res == 1){
                cnt += digit*n + low + 1;
            }else{
                cnt += digit*(n + 1);
            }
            low += res*digit;
            digit *= 10;
        }
        return cnt;
    }
}