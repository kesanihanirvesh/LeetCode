class Solution {
    public int fib(int n) {
        int[] arr=new int[n+2];
        int data=helper(n,arr);
        return data;

    }
    public int helper(int n,int[] arr){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        
        return helper(n-1,arr)+helper(n-2,arr);
    }
}