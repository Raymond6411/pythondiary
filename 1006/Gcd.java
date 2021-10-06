class Flow8w{
   public static void main(String[] args) {
      java.util.Scanner cin= new java.util.Scanner(System.in);
      int x = 0, y = 0;
      int a, b, r;
      System.out.print("請輸入兩個正整數, 第二個不為0:");
      x = cin.nextInt(); y = cin.nextInt();
      a = x; b = y;
      while(true) {
         System.out.println(a + "/t" + b);
         r = a%b;
         if(r ==0) break;
         a = b; b = r;
      }
      System.out.println("gcd("+ x + ", "+y+")="+b);
   }
}