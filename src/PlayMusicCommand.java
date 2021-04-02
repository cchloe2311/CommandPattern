public class PlayMusicCommand implements Command {
    @Override
    public void execute() {
        Speaker.getInstance().playMusic();
    }

    @Override
    public void undo() {
        Speaker.getInstance().stopMusic();
    }
}
