public class Controller {

    private Command command;

    public Controller() { }

    public void setCommand(Command command) { this.command = command; }
    public void pressButton() {
        command.execute();
    }
}