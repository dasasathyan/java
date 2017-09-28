import java.io.*;
class Palindrome{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the sentence");
        String str;
        int count=0;
        str=br.readLine();
        String output="", ar[]= str.split(" ");
        for(int i=0;i < ar.length;i++){
            if(palindromeCheck(ar[i])){
                count++;
                output += ar[i] + " ";
            }
        }
        System.out.println("The Palindromes in the sentences are "+output);
        System.out.println("Number of Palindromes is "+count);
    }
    public static boolean palindromeCheck(String str){
        char ch;
        int len=str.length(),mid=len/2;
        for(int i=0;i < mid;i++){
            if(str.charAt(i)!=str.charAt(len-i-1)) return false;
        }
        return true;
    }
}
