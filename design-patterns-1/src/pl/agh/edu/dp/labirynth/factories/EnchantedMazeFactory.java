package pl.agh.edu.dp.labirynth.factories;

import pl.agh.edu.dp.labirynth.Direction;
import pl.agh.edu.dp.labirynth.Maze;
import pl.agh.edu.dp.labirynth.doors.Door;
import pl.agh.edu.dp.labirynth.rooms.Room;
import pl.agh.edu.dp.labirynth.builders.EnchantedMazeBuilder;

import java.util.Random;
import java.util.Vector;

public class EnchantedMazeFactory extends MazeFactory {

    private static final EnchantedMazeFactory factory = new EnchantedMazeFactory();

    private EnchantedMazeFactory() {}

    @Override
    public Maze generateRandomMaze() {
        EnchantedMazeBuilder builder = new EnchantedMazeBuilder();
        Random random = new Random();
        int noRooms = random.nextInt(20) + 5;

        // creating rooms
        for (int i = 1; i <= noRooms; i++) { builder.createRoom(i); }

        Vector<Room> rooms = builder.getCurrentMaze().getRoomsInstance();
        // creating doors between rooms
        Room room2 = rooms.get(0);
        for (int i = 0; i < noRooms; i++) {
            Room room1 = room2;
            int r2 = random.nextInt(rooms.size());
            room2 = rooms.get(r2);

            Direction d = Direction.values()[random.nextInt(Direction.values().length)];

            for (int j = 0; j < 4; j++) {
                if (!(room1.getSide(d) instanceof Door)) {
                    builder.createDoor(room1, room2, d);
                    break;
                }
                d = Direction.getNext(d);
            }

        }
        return builder.getCurrentMaze();
    }

    public static EnchantedMazeFactory getInstance() { return factory; }

}
