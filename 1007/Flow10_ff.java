class Flow10_ff{
   public static void main(String[] args){
      java.util.Scanner cin= new java.util.Scanner(System.in);
      int n;
      int i, j;
      System.out.println("n="); n = cin.nextInt();
      for(i = 1; i <= n; i = i + 1){
         System.out.print(i + ":");
         for(j = 1; j <= n; j = j + 1){
            System.out.print(j + " ");
         }
      System.out.println("\n");
      }
   System.out.println("OK\n");
   }
}