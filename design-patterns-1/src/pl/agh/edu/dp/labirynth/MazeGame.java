package pl.agh.edu.dp.labirynth;

import pl.agh.edu.dp.labirynth.builders.StandardMazeBuilder;

public class MazeGame {
    public Maze createMaze(StandardMazeBuilder builder){
        Maze maze = new Maze();
        builder.setCurrentMaze(maze);
        Room r1 = builder.createRoom(1);
        Room r2 = builder.createRoom(2);
        builder.createDoor(r1, r2, Direction.East);
        // zmiany znacząco uprościły kod, tworząc funkcję do dość powtarzalnego procesu oraz przenosząc ją do dedykowanej klas

        return maze;
    }
}
