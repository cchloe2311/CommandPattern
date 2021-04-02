public class MusicCommand implements Command {
    @Override
    public void execute() {
        Speaker.getInstance().playMusic();
    }
}
