class Fibonacci{
  public static void main (String args[]){
  int a,b=1,c,n,i;
    System.out.println(a+" "+b);
    for(i=0;i<n;++i){
      c=a+b;
      System.out.println(" "+c);
      a=b;
      b=c;
    }
  }
}
