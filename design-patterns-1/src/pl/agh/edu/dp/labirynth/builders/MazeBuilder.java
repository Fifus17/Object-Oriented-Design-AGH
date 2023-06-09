package pl.agh.edu.dp.labirynth.builders;

import pl.agh.edu.dp.labirynth.Direction;
import pl.agh.edu.dp.labirynth.rooms.Room;
import pl.agh.edu.dp.labirynth.walls.Wall;

public class MazeBuilder {


    public Room createRoom(int number) {
        Room room = new Room(number);
        for (Direction d: Direction.values()) { room.setSide(d, new Wall()); }
        return room;
    }
}
