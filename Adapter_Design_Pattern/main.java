package Adapter_Design_Pattern;

public class main {
    public static void main(String args[]){
        MediaPlayer obj=new mp3Player();
        obj.play("file.mp3");

        MediaPlayer obj1=new AdapterClass(new mp4Player());
        obj1.play("file.mp4");

        MediaPlayer obj2=new AdapterClass(new VLCPlayer());
        obj2.play("file.avi");

    }
}
