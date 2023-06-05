package pl.agh.edu.dp.labirynth;

public class StandardMazeBuilder extends MazeBuilder{

    Maze currentMaze;

    public StandardMazeBuilder() {
        currentMaze = new Maze();
    }

    public StandardMazeBuilder(Maze maze) {
        currentMaze = maze;
    }

    @Override
    public Room createRoom(int number) {
        Room room = new Room(number);
        for (Direction d: Direction.values()) { room.setSide(d, new Wall()); }
        currentMaze.addRoom(room);
        return room;
    }

    public Door createDoor(Room r1, Room r2, Direction d) { // direction of the wall in the first room
        CommonWall(r1, r2, d);
        Door door = new Door(r1, r2);
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
        Wall wall = new Wall();
        r1.setSide(d, wall);
        r2.setSide(Direction.getOpposite(d), wall);
    }
}
