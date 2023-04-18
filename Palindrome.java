class Palindrome{
  public static void main(string args[]){
    int r;sum=0;temp;
    int n=454;
    temp=n;
    while(n>o){
      r=n%10;
      sum=(sum*10)+r;
      n=n/10;
    }
    if(temp==sum)
      System.out.println("it is palindrome");
    else
      System.out.prrintln("it is not praindrome");
  }
}
