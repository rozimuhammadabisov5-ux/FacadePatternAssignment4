public class Amplifier {
    private boolean isOn = false;
    private int volume = 0;

    public void turnOn() {
        isOn = true;
        System.out.println("Amplifier is ON");
    }

    public void setVolume(int level) {
        if (!isOn) {
            throw new IllegalStateException("Amplifier is OFF");
        }

        if (level < 0 || level > 100) {
            throw new IllegalArgumentException("Volume must be between 0 and 100");
        }

        volume = level;
        System.out.println("Volume set to " + volume);
    }

    public void turnOff() {
        isOn = false;
        volume = 0;
        System.out.println("Amplifier is OFF");
    }
}
