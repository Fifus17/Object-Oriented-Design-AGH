package pl.agh.edu.dp.labirynth;

public class MazeGame {
    public Maze createMaze(MazeBuilder builder){
        Maze maze = new Maze();

        Room r1 = builder.createRoom(1);
        Room r2 = builder.createRoom(2);

        // zmiany znacząco uprościły kod, tworząc funkcję do dość powtarzalnego procesu oraz przenosząc ją do dedykowanej klasy

        Door door = new Door(r1, r2);

        maze.addRoom(r1);
        maze.addRoom(r2);

        return maze;
    }
}
