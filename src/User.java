public class User {

    public static void main(String[] args) {
        Controller controller = new Controller(new HeaterOnCommand());
        controller.execute();

        controller = new Controller(new HeaterOffCommand());
        controller.execute();

        controller = new Controller(new PlayMusicCommand());
        controller.execute();
    }
}
