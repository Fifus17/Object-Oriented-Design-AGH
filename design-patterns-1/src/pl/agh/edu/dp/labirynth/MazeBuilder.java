package pl.agh.edu.dp.labirynth;

public class MazeBuilder {


    public Room createRoom(int number) {
        Room room = new Room(number);
        for (Direction d: Direction.values()) { room.setSide(d, new Wall()); }
        return room;
    }
}
