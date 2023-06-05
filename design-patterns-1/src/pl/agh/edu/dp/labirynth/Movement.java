package pl.agh.edu.dp.labirynth;

import pl.agh.edu.dp.labirynth.doors.Door;
import pl.agh.edu.dp.labirynth.rooms.BombedRoom;
import pl.agh.edu.dp.labirynth.rooms.Room;
import pl.agh.edu.dp.labirynth.walls.BombedWall;

import java.util.Vector;

public class Movement {

    private Maze maze;
    private Player player;

    private Vector<Room> rooms;

    private int noRoom;

    public Movement(Maze maze, Player player) {
        this.maze = maze;
        this.player = player;
        this.rooms = maze.getRoomsInstance();
        noRoom = player.getNoRoom();
    }

    public boolean go(Direction d) {
        int noRoom = player.getNoRoom();
        Room room = rooms.get(noRoom-1);
        MapSite ms = room.getSide(d);
        if (ms instanceof Door) {
            player.setNoRoom(((Door) ms).getOtherRoom(room).getRoomNumber());
            this.noRoom = ((Door) ms).getOtherRoom(room).getRoomNumber();
            Room currentRoom = rooms.get(noRoom-1);
            if (currentRoom instanceof BombedRoom) {
                if (((BombedRoom) currentRoom).wasVisited()) return true;
                ((BombedRoom) currentRoom).visited();
            }
        }
        return (ms instanceof BombedWall)  ? true : false;
    }

    public int getNoRoom() { return this.noRoom; }
}
