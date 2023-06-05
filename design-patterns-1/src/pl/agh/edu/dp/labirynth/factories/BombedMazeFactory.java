package pl.agh.edu.dp.labirynth.factories;

import pl.agh.edu.dp.labirynth.Direction;
import pl.agh.edu.dp.labirynth.Maze;
import pl.agh.edu.dp.labirynth.rooms.Room;
import pl.agh.edu.dp.labirynth.builders.BombedMazeBuilder;

import java.util.Random;
import java.util.Vector;

public class BombedMazeFactory extends MazeFactory {

    private final static BombedMazeFactory factory = new BombedMazeFactory();
    private BombedMazeFactory() {}

    public Maze generateRandomBombedMaze() {
        BombedMazeBuilder builder = new BombedMazeBuilder();
        Random random = new Random();
        int noRooms = random.nextInt(20) + 5;

        // creating rooms
        for (int i = 0; i < noRooms; i++) { builder.createRoom(i); }

        Vector<Room> rooms = builder.getCurrentMaze().getRoomsInstance();
        // creating doors between rooms
        for (int i = 0; i < (noRooms / 2); i++) {
            int r1 = random.nextInt(rooms.size());
            Room room1 = rooms.get(r1);
            rooms.remove(r1);
            int r2 = random.nextInt(rooms.size());
            Room room2 = rooms.get(r2);
            rooms.remove(r2);
            builder.createDoor(room1, room2, Direction.values()[random.nextInt(Direction.values().length)]);
        }
        return builder.getCurrentMaze();
    }

    public static BombedMazeFactory getInstance() { return factory; }
}
