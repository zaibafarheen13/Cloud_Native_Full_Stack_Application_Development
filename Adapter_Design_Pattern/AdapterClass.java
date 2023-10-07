package Adapter_Design_Pattern;

public class AdapterClass implements MediaPlayer{
    AdvanceMediaPlayer advanceMediaPlayer;

    public AdapterClass(AdvanceMediaPlayer advanceMediaPlayer){
        this.advanceMediaPlayer=advanceMediaPlayer;
    }
    public void play(String filename){
        System.out.println("From Adapter Class");
        advanceMediaPlayer.playFile(filename);
    }
}
