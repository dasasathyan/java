import java.io.*;
class PalindromeInt{
  public  static void main(String args[]) throws IOException{
    int num,rem=0,rev=0;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the number");
    num=Integer.parseInt(br.readLine());
    int ori=num;
    while(num!=0){
      rem=num%10;
      rev=rev*10+rem;
      num=num/10;
    }
    if(ori==rev){
      System.out.println("Palindrome");
    }
    else{
        System.out.println("Not a Palindrome");
    }
    }
}
