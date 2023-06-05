package pl.agh.edu.dp.labirynth.rooms;

public class BombedRoom extends Room {
    public BombedRoom(int number) {
        super(number);
    }

    boolean visited = false;

    public void visited() { visited = true; }

    public boolean wasVisited() { return visited; }
}
