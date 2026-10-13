public class Projector {
    private boolean isOn = false;

    public void turnOn() {
        isOn = true;
        System.out.println("Projector is ON");
    }

    public void setWideScreenMode() {
        if (!isOn) {
            throw new IllegalStateException("Projector is OFF");
        }

        System.out.println("Projector set to widescreen mode");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Projector is OFF");
    }
}
