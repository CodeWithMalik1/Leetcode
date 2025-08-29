class ClimbingStairsProblem{
    public static int ClimbingStairs(int n){
       if(n==1) return 1;
       if(n==2) return 2;
      int first=1,second=2,ways=0;
      for(int i=3;i<=n;i++){
          ways=first+second;
          first=second;
          second=ways;
      }
      return second;
    }
    public static void main(String[] args){
        int n=3;
        System.out.print(ClimbingStairs(n));
    }
}
