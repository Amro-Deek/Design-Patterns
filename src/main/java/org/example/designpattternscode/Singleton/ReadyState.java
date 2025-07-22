package org.example.designpattternscode.Singleton;

public class ReadyState implements State {
    private final AudioPlayer player;
    private Logger logger;

    public ReadyState(AudioPlayer player) {
        this.player = player;
        logger =Logger.getInstance();
    }

    public void clickLock() {
        player.changeState(new LockedState(player));
    }

    public void clickPlay() {
        player.startPlayBack();
        player.changeState(new PlayingState(player));
    }

    public void clickNext() {
        player.nextSong();
    }

    public void clickPrevious() {
        player.previousSong();
    }
}

