public class PlayMusicCommand implements Command {
    @Override
    public void execute() {
        Speaker.getInstance().playMusic();
    }
}
