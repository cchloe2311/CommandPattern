public class Heater {

    private static volatile Heater instance;

    private Heater() {}
    public static Heater getInstance() {
        synchronized (Heater.class) {
            if (instance == null) instance = new Heater();
        }
        return instance;
    }

    public void turnHeaterOn() {
        System.out.println("turn on the heater");
    }

    public void turnHeaterOff() {
        System.out.println("turn off the heater");
    }
}
