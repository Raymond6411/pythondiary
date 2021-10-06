class Flow3{
   public static void main(String[] args) {
      java.util.Scanner cin= new java.util.Scanner(System.in);
      int begin, step, end;
      int i;
      System.out.print("begin = "); begin = cin.nextInt();
      System.out.print("step = "); step = cin.nextInt();
      System.out.print("end = "); end = cin.nextInt();
      i = begin;
      do{
         System.out.print(i + " ");
         i = i + step;
      }while(i <=end);
      System.out.println("OK");
   }
}