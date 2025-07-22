package org.example.designpattternscode.Singleton;


public class LockedState implements State {
    private final AudioPlayer player;
    private Logger logger;
    public LockedState(AudioPlayer player) {
        this.player = player;
        logger =Logger.getInstance();
    }

    @Override
    public void clickLock() {
        if (player.getPlaying()) {
            player.changeState(new PlayingState(player));
        } else {
            player.changeState(new ReadyState(player));
        }
    }

    public void clickPlay()     { logger.log("Locked. Play ignored."); }
    public void clickNext()     { logger.log("Locked. Next ignored."); }
    public void clickPrevious() { logger.log("Locked. Previous ignored."); }
}
