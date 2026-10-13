
# Assignment 4 - Facade Design Pattern

## Project Description

This project demonstrates the Facade structural
design pattern using a Home Theater System.

The HomeTheaterFacade provides a simplified
interface to control multiple home theater devices.

## Technologies

- Java 17
- IntelliJ IDEA
- Facade Design Pattern

## Project Structure

- Main.java - Client
- HomeTheaterFacade.java - Facade
- Amplifier.java - Audio system
- DvdPlayer.java - Movie playback
- Projector.java - Video projection
- Lights.java - Lighting control
- Screen.java - Screen control

## How It Works

The client interacts only with HomeTheaterFacade.

The watchMovie() method:
1. Lowers the screen
2. Dims the lights
3. Turns on the projector
4. Configures the amplifier
5. Starts the DVD player
6. Plays the movie

The endMovie() method:
1. Stops the movie
2. Turns off the DVD player
3. Turns off the amplifier
4. Turns off the projector
5. Restores the lights
6. Raises the screen

## How to Run

1. Open the project in IntelliJ IDEA.
2. Configure Java JDK 17.
3. Open Main.java.
4. Run the main() method.

## Benefits of the Facade Pattern

- Simplifies client interaction
- Hides subsystem coordination
- Reduces coupling
- Improves maintainability
- Provides a clear API

## Author

Individual assignment
Astana IT University
Software Design Patterns
