import java.io.*;
class FlRW
{
public  String names []= new String[5];
public void read() throws IOException{
  FileWriter file=new FileWriter("labnames");
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  for(int i =0;i<5;i++){
    names[i]=br.readLine();
    file.write(names[i]+"\n");
  }
  file.close();

}

public void display() throws IOException,FileNotFoundException{
  BufferedReader br= new BufferedReader(new FileReader("labnames"));
  for(int i =0;i<5;i++){
    names[i]=br.readLine();
    System.out.println(names[i]);
  }
//  file.close();
}

public void sort() throws IOException, FileNotFoundException{
  BufferedReader br = new BufferedReader(new FileReader("labnames"));
  String temp;
  for(int i=0;i<5;i++){
    for(int j=1;j<5;j++){
      if(names[j-1].compareTo(names[j])>0){
        temp=names[j];
        names[j]=names[j-1];
        names[j-1]=temp;
      }
    }
  }

  FileWriter pudhu=new FileWriter("sortednames");
  System.out.println("names after sorting is:");
  for(int i=0;i<5;i++){
    pudhu.write(names[i]+"\n");
  }
  pudhu.close();
}


public static void main(String[] args)  throws IOException{
FlRW obj = new FlRW();
System.out.println("enter the names");
obj.read();
obj.display();
obj.sort();
}
}
