package ProducerConsumerProblem;

class Shop{
    private int materials;
    private boolean available=false;

    public synchronized int get(){

        while(available==false){
            try{
                wait();
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        available=false;
        notifyAll();
        return materials;
    }

    public synchronized void put(int value){

        while(available==true){
            try{
                wait();
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        materials=value;
        available=true;
        notifyAll();
    }
}

class Consumer extends Thread{
    private Shop shop;
    private int number;

    public Consumer(Shop shop,int number){
        this.shop=shop;
        this.number=number;
    }

    public void run(){
        int value=0;
        for(int i=1;i<=10;i++){
            value=shop.get();
            System.out.println("Consumed: "+i+" and have got: "+value);
        }
    }
}


class Producer extends Thread{
    private Shop shop;
    private int number;

    public Producer(Shop shop,int number){
        this.shop=shop;
        this.number=number;
    }

    public void run(){
        for(int i=1;i<=10;i++){
            shop.put(i);
            System.out.println("Produced: "+i+" and have put: "+i);
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
        Shop shop=new Shop();
        Producer p=new Producer(shop, 1);
        Consumer c=new Consumer(shop, 1);

        p.start();
        c.start();
    }
}
