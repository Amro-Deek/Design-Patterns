package org.example.designpattternscode.Singleton;

public class AudioPlayer {
    private State state ;
    private Boolean isPlaying;
    private Logger logger;

    public AudioPlayer (){
        logger=Logger.getInstance();
        this.changeState(new ReadyState(this));

    }
    public void changeState(State state){
        this.state=state;
        logger.log("State changed to: " + state.getClass().getSimpleName());
    }
    public void clickPlay(){ state.clickPlay();}
    public void clickLock(){state.clickLock();}
    public void clickNext(){state.clickNext();}
    public void clickPrevious(){state.clickPrevious();}

    public void startPlayBack(){
        isPlaying=true;
        logger.log("Starting playback...");
    }

    public void stopPlayback() {
        isPlaying = false;
        logger.log("Stopping playback...");
    }

    public void nextSong() {
        logger.log("Skipping to next song...");
    }

    public void previousSong() {
        logger.log("Going back to previous song...");
    }

    public void fastForward(int seconds) {
        logger.log("Fast forwarding " + seconds + " seconds...");
    }

    public void rewind(int seconds) {
        logger.log("Rewinding " + seconds + " seconds...");
    }
    public Boolean getPlaying() {
        return isPlaying;
    }
}
