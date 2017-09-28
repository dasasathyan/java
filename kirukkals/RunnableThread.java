class RunnableThread implements Runnable{
public void run(){
System.out.println("thread is running...");
}

public static void main(String args[]){
RunnableThread m1=new RunnableThread();
Thread t1 =new Thread(m1);
t1.start();
 }
}
