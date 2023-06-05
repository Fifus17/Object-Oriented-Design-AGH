package pl.agh.edu.dp.labirynth;

import pl.agh.edu.dp.labirynth.builders.StandardMazeBuilder;
import pl.agh.edu.dp.labirynth.factories.MazeFactory;
import pl.agh.edu.dp.labirynth.rooms.Room;

import java.util.Scanner;
import java.util.Vector;

public class MazeGame {

    private MazeFactory factory;
    private Maze maze;
    private Movement movement;

    public Maze createMaze(MazeFactory factory){

        return factory.generateRandomMaze();
    }

    public MazeGame(MazeFactory factory) {
        this.factory = factory;
        this.maze = createMaze(factory);
        this.movement = new Movement(maze, new Player());
    }

    public void play() {
        System.out.println("Move using 'w', 'a', 's', 'd'");
        System.out.println("To quit the game press 'q' + Enter");
        boolean isRunning = true;
        Vector<Room> rooms = maze.getRoomsInstance();
        Scanner scanner = new Scanner(System.in);

        while (isRunning) {
            Draw.draw(rooms.get(movement.getNoRoom()-1));
            String input = scanner.nextLine();
            switch (input) {
                case "w": {
                    if (movement.go(Direction.North)) {
                        System.out.println("You died");
                        isRunning = false;
                    }
                    break;
                }
                case "d": {
                    if (movement.go(Direction.East)) {
                        System.out.println("You died");
                        isRunning = false;
                    }
                    break;
                }
                case "s": {
                    if (movement.go(Direction.South)) {
                        System.out.println("You died");
                        isRunning = false;
                    }
                    break;
                }
                case "a": {
                    if (movement.go(Direction.West)) {
                        System.out.println("You died");
                        isRunning = false;
                    }
                    break;
                }
                case "q": {
                    isRunning = false;
                }
            }
        }
    }

    public Maze getMaze() { return maze; }
}
