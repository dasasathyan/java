import java.io.*;
class Palindrome{
  public static void main(String args[])throws IOException{
    String original,reverse="";
    int length;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the string");
    original=br.readLine();
    length=original.length();
    for(int i=length-1;i>=0;i--){
      reverse=reverse+original.charAt(i);
    }
    if(original.equals(reverse)){
      System.out.println("Palindrome");
    }
    else{
        System.out.println("Not a Palindrome");
    }
}
}
