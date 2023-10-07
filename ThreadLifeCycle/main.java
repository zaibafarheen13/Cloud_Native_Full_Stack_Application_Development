package ThreadLifeCycle;

class thread1 extends Thread{
    public void run(){
        System.out.println("Before giving a name to Thread1, name of the thread: "+Thread.currentThread().getName());
        Thread.currentThread().setName("Thread1");
        System.out.println("After giving a name to Thread1, name of the thread: "+Thread.currentThread().getName());

        for(int i=0;i<5;i++){
            System.out.println("Thread1: "+i);
            try{
                sleep(2000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

class thread2 extends Thread{
    public void run(){
        System.out.println("Before giving a name to Thread2, name of the thread: "+Thread.currentThread().getName());
        Thread.currentThread().setName("Thread2");
        System.out.println("After giving a name to Thread2, name of the thread: "+Thread.currentThread().getName());;

        for(int i=0;i<5;i++){
            System.out.println("Thread2: "+i);
            try{
                sleep(2000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}


public class main {
    public static void main(String args[]){
        thread1 t1=new thread1();
        thread2 t2=new thread2();

        System.out.println("State of Thread1: "+t1.getState());
        System.out.println("State of Thread2: "+t2.getState());

        t1.start();
        System.out.println("State of Thread1: "+t1.getState());

        t2.start();
        System.out.println("State of Thread2: "+t2.getState());

        

        while(t1.isAlive() || t2.isAlive()){
            System.out.println("State of Thread1: "+t1.getState());
            System.out.println("State of Thread2: "+t2.getState());
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
            e.printStackTrace();
            }

        }

        System.out.println("State of Thread1: "+t1.getState());
        System.out.println("State of Thread2: "+t2.getState());
    }
}
