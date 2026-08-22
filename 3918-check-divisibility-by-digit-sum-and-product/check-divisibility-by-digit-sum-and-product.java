class Solution {
    public boolean checkDivisibility(int n) {
        int a=0;
        int b=1;
        int c=n;
        while(n>0){
            int d =n%10;
            a+=d;
            b*=d;
            n/=10;
        }
        return (c%(a+b))==0;
    }
}