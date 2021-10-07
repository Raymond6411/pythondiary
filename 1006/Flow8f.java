class Flow8f{
   public static void main(String[] args) {
      java.util.Scanner cin= new java.util.Scanner(System.in);
      int bound;
      int k = 0;
      int power = 1;
      System.out.print("bound = ");
      bound = cin.nextInt();
      for(  ; power < bound ;  ){
         k = k + 1;
         power = power * 2;
         System.out.println("k = " + k + " power = " + power);
      }
      System.out.println("k = " + k);
   }
}
