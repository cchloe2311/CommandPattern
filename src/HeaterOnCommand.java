public class HeaterOnCommand implements Command {
    @Override
    public void execute() {
        Heater.getInstance().turnHeaterOn();
    }

    @Override
    public void undo() {
        Heater.getInstance().turnHeaterOff();
    }
}
