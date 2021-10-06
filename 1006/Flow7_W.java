class Flow7_W{
   public static void main(String[] args) {
      java.util.Scanner cin= new java.util.Scanner(System.in);
      int n;
      int ans;
      int i;
      System.out.print("n = "); n = cin.nextInt();
      ans = 0;
      i = 1;
      while(i <= n) {
         ans = ans + i*i;
         System.out.println("i: " + i +", ans: " + ans);
         i = i + 1;
      }
      System.out.println("ans = " + ans);
      System.out.println("by formula: " + n*(n-1)*(2*n+1)/6);
   }
}