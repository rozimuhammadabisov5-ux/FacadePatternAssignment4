
public class DvdPlayer {
    private boolean isOn = false;
    private String currentMovie;

    public void turnOn() {
        isOn = true;
        System.out.println("DVD Player is ON");
    }

    public void play(String movie) {
        if (!isOn) {
            throw new IllegalStateException("DVD Player is OFF");
        }

        if (movie == null || movie.isBlank()) {
            throw new IllegalArgumentException("Movie name cannot be empty");
        }

        currentMovie = movie;
        System.out.println("Playing movie: " + currentMovie);
    }

    public void stop() {
        if (!isOn) {
            throw new IllegalStateException("DVD Player is OFF");
        }

        if (currentMovie != null) {
            System.out.println("Stopped movie: " + currentMovie);
            currentMovie = null;
        }
    }

    public void turnOff() {
        currentMovie = null;
        isOn = false;
        System.out.println("DVD Player is OFF");
    }
}
