package pl.agh.edu.dp.labirynth.builders;

import pl.agh.edu.dp.labirynth.*;
import pl.agh.edu.dp.labirynth.rooms.Room;
import pl.agh.edu.dp.labirynth.walls.Wall;

public class CountingMazeBuilder {

    private int noRooms;
    private int noWalls;
    private int noDoors;

    public void getCounts(Maze maze) {
        int noCommonWalls = 0;
        for (Room r: maze.getRoomsInstance()) {
            noRooms++;
            for (Direction d: Direction.values()) {
                if (r.getSide(d) instanceof Wall) {
                    noWalls++;
                    if (((Wall) r.getSide(d)).getNoAdjacentRooms() == 2) noCommonWalls++;
                }
                else noDoors++;
            }
        }
        noWalls -= noCommonWalls; // common walls were counted twice
        noDoors /= 2; // every door was counted twice
        System.out.println("Liczba pokoi: " + noRooms);
        System.out.println("Liczba ścian: " + noWalls);
        System.out.println("Liczba drzwi: " + noDoors);
    }

    public int getNoRooms() { return noRooms; }
    public int getNoWalls() { return noWalls; }
    public int getNoDoors() { return noDoors; }
}
