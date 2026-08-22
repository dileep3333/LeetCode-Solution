class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int prod=1;
        int ori=n;
        while(n>0){
            int num=n%10;
            prod*=num;
            sum+=num;
            n/=10;
        }
        return (ori%(prod+sum))==0;
    }
}