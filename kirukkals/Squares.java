import java.io.*;
class Calculate{
  public int n;
  public int value;
  public void square(){
    try{
  BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter the number till what you want the square");
  n=Integer.parseInt(br.readLine());
  for(byte i=1;i<n;i++){
    if((i%2)!=0){
      value=i*i;
      System.out.println(value);
    }
    else{
      value=i*i*i;
      System.out.println(value);
    }
  }
}
catch(Exception e){

}
}
}
public class Squares{
public static void main(String args[])throws IOException{
  Calculate obj = new Calculate();
  obj.square();

}
}
