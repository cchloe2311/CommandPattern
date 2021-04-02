import java.util.Stack;

public class Controller {

    private Command command;
    private Stack<Command> commandStack;

    public Controller() {
        commandStack = new Stack<>();
    }

    public void setCommand(Command command) { this.command = command; }

    public void pressButton() {
        command.execute();
        commandStack.push(this.command);
    }

    public void undo() {
        commandStack.pop().undo();
    }
}