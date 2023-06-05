package pl.agh.edu.dp.main;

import pl.agh.edu.dp.labirynth.*;
import pl.agh.edu.dp.labirynth.builders.CountingMazeBuilder;
import pl.agh.edu.dp.labirynth.builders.StandardMazeBuilder;
import pl.agh.edu.dp.labirynth.factories.BombedMazeFactory;
import pl.agh.edu.dp.labirynth.factories.EnchantedMazeFactory;
import pl.agh.edu.dp.labirynth.factories.MazeFactory;

public class Main {

    public static void main(String[] args) {

        MazeGame mazeGame = new MazeGame();
        MazeFactory factory = BombedMazeFactory.getInstance();
        Maze maze = mazeGame.createMaze(factory);
        CountingMazeBuilder countingMazeBuilder = new CountingMazeBuilder();
        countingMazeBuilder.getCounts(maze);

        System.out.println(maze.getRoomNumbers());
    }
}



