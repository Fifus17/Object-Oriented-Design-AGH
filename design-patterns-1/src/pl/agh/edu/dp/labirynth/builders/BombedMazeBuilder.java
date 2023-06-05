package pl.agh.edu.dp.labirynth.builders;

import pl.agh.edu.dp.labirynth.*;
import pl.agh.edu.dp.labirynth.doors.BombedDoor;
import pl.agh.edu.dp.labirynth.doors.Door;
import pl.agh.edu.dp.labirynth.rooms.BombedRoom;
import pl.agh.edu.dp.labirynth.rooms.Room;
import pl.agh.edu.dp.labirynth.walls.BombedWall;
import pl.agh.edu.dp.labirynth.walls.Wall;

public class BombedMazeBuilder extends MazeBuilder {
    Maze currentMaze;

    public BombedMazeBuilder() {
        currentMaze = new Maze();
    }

    public BombedMazeBuilder(Maze maze) {
        currentMaze = maze;
    }

    @Override
    public Room createRoom(int number) {
        Room room = new BombedRoom(number);
        for (Direction d: Direction.values()) { room.setSide(d, new BombedWall()); }
        currentMaze.addRoom(room);
        return room;
    }

    public Door createDoor(Room r1, Room r2, Direction d) { // direction of the wall in the first room
        CommonWall(r1, r2, d);
        Door door = new BombedDoor(r1, r2);
        r1.setSide(d, door);
        r2.setSide(Direction.getOpposite(d), door);
        return door;
    }

    public Maze getCurrentMaze() {
        return currentMaze;
    }

    public void setCurrentMaze(Maze maze) {
        this.currentMaze = maze;
    }

    private void CommonWall(Room r1, Room r2, Direction d) {
        Wall wall = new BombedWall();
        wall.setAsCommonWall();
        r1.setSide(d, wall);
        r2.setSide(Direction.getOpposite(d), wall);
    }
}
