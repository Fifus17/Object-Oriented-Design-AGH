package pl.agh.edu.dp.labirynth;

import pl.agh.edu.dp.labirynth.builders.StandardMazeBuilder;
import pl.agh.edu.dp.labirynth.factories.MazeFactory;

public class MazeGame {
    public Maze createMaze(MazeFactory factory){


        return factory.generateRandomMaze();
    }
}
