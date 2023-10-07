package Adapter_Design_Pattern;

public class mp4Player implements AdvanceMediaPlayer{
    public void playFile(String filename){
        System.out.println("Playing mp4file  "+filename);
    }
}
