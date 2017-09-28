import java.io.*;

class Sorter{

  public int[] num = new int[10];

  public void readlist() throws IOException{
    BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

    System.out.println("Enter the 100 integers");
    for(int i=0;i<10;i++){
      num[i]=Integer.parseInt(br.readLine());
    }
  }

  public void display(){

    for(int i=0;i<10;i++){
    System.out.println("The value "+num[i]);
  }
}

public void sort(){
  int temp;
  for(int i=0; i < 10; i++){
     for(int j=1; j < (10-i); j++){
        if(num[j-1] > num[j]){
          temp = num[j-1];
          num[j-1] = num[j];
          num[j] = temp;
        }
       }
     }
}
}
class Sort{
  public static void main(String args[])throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    boolean ch=true;
    byte opt=0;
    Sorter no = new Sorter();
    while(ch){
        System.out.println("\n1. Read Data");
        System.out.println("\n2. Display");
        System.out.println("\n3. Sort");
        System.out.println("\n4. Exit");
        System.out.println("\nEnter your choice");
        opt=Byte.parseByte(br.readLine());
        switch (opt) {
          case 1:
          no.readlist();
          break;
          case 2:
          no.display();
          break;
          case 3:
          no.sort();
          break;
          case 4:
          ch=false;
}
}
  }
}
