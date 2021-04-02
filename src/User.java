public class User {

    public static void main(String[] args) {
        Controller controller = new Controller();

        controller.setCommand(new HeaterOnCommand());
        controller.pressButton();

        controller.setCommand(new HeaterOffCommand());
        controller.pressButton();

        controller.setCommand(new PlayMusicCommand());
        controller.pressButton();
    }
}
