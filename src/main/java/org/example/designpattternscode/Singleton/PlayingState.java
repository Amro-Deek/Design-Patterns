package org.example.designpattternscode.Singleton;

public class PlayingState implements State {
    private final AudioPlayer player;
    private Logger logger;
    public PlayingState(AudioPlayer player) {
        this.player = player;
        logger =Logger.getInstance();
    }

    public void clickLock() {
        player.changeState(new LockedState(player));
    }

    public void clickPlay() {
        player.stopPlayback();
        player.changeState(new ReadyState(player));
    }

    public void clickNext() {
        logger.log("Double-click detected? Skipping song.");
        player.nextSong(); // Simulate double click
    }

    public void clickPrevious() {
        logger.log("Double-click detected? Rewinding.");
        player.rewind(5); // Simulate single click
    }
}

