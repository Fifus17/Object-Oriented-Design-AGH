package pl.agh.edu.dp.main;

import pl.agh.edu.dp.labirynth.*;
import pl.agh.edu.dp.labirynth.builders.CountingMazeBuilder;
import pl.agh.edu.dp.labirynth.builders.StandardMazeBuilder;

public class Main {

    public static void main(String[] args) {

        MazeGame mazeGame = new MazeGame();
        StandardMazeBuilder builder = new StandardMazeBuilder();
        Maze maze = mazeGame.createMaze(builder);
        CountingMazeBuilder countingMazeBuilder = new CountingMazeBuilder();
        countingMazeBuilder.getCounts(maze);

        System.out.println(maze.getRoomNumbers());
    }
}



