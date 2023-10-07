package Adapter_Design_Pattern;

public class mp3Player implements MediaPlayer{
    public void play(String filename){
        System.out.println("Playing mp3file "+filename);
    }
}
