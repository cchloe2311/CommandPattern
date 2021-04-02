public class HeaterOffCommand implements Command {
    @Override
    public void execute() {
        Heater.getInstance().turnHeaterOff();
    }

    @Override
    public void undo() {
        Heater.getInstance().turnHeaterOn();
    }
}
