class Flow6{
   public static void main(String[] args) {
      java.util.Scanner cin= new java.util.Scanner(System.in);
      int a, b;
      int ans = 0;
      int i;
      System.out.print("begin = "); a = cin.nextInt();
      System.out.print("end = "); b = cin.nextInt();
      i = a;
      while(i <=b){
         System.out.print("i =" + i + ", ans =" + ans);
         i = i + 1;
      }
      System.out.println("ans =" + ans);
   }
}