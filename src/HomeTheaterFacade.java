public class HomeTheaterFacade {
    private final Amplifier amplifier;
    private final DvdPlayer dvdPlayer;
    private final Projector projector;
    private final Lights lights;
    private final Screen screen;

    private boolean moviePlaying = false;

    public HomeTheaterFacade() {
        amplifier = new Amplifier();
        dvdPlayer = new DvdPlayer();
        projector = new Projector();
        lights = new Lights();
        screen = new Screen();
    }

    public void watchMovie(String movie) {
        if (moviePlaying) {
            throw new IllegalStateException(
                    "A movie is already playing");
        }

        if (movie == null || movie.isBlank()) {
            throw new IllegalArgumentException(
                    "Movie name cannot be empty");
        }

        System.out.println("\nPreparing home theater...");

        screen.down();
        lights.dim(20);

        projector.turnOn();
        projector.setWideScreenMode();

        amplifier.turnOn();
        amplifier.setVolume(50);

        dvdPlayer.turnOn();
        dvdPlayer.play(movie);

        moviePlaying = true;
        System.out.println("Enjoy your movie!\n");
    }

    public void endMovie() {
        if (!moviePlaying) {
            System.out.println("No movie is currently playing.");
            return;
        }

        System.out.println("\nShutting down home theater...");

        dvdPlayer.stop();
        dvdPlayer.turnOff();

        amplifier.turnOff();
        projector.turnOff();

        lights.turnOn();
        screen.up();

        moviePlaying = false;
        System.out.println("Home theater is OFF.\n");
    }
}
