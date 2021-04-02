public class Speaker {

    private static volatile Speaker instance;

    private Speaker() {}
    public static Speaker getInstance() {
        synchronized (Speaker.class) {
            if (instance == null) instance = new Speaker();
        }
        return instance;
    }

    public void playMusic() {
        System.out.println("♫♪♬♫♪♬♫♪♬");
    }
}
