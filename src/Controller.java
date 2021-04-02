public class Controller {

    private Command command;

    public Controller(Command command) {
        this.command = command;
    }

    public void execute() {
        command.execute();
    }
}