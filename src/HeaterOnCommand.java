public class HeaterOnCommand implements Command {
    @Override
    public void execute() {
        Heater.getInstance().turnHeaterOn();
    }
}
