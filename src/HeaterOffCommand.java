public class HeaterOffCommand implements Command {
    @Override
    public void execute() {
        Heater.getInstance().turnHeaterOff();
    }
}
