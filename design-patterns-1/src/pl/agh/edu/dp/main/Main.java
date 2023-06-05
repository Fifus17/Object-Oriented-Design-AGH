package pl.agh.edu.dp.main;

import pl.agh.edu.dp.labirynth.*;

public class Main {

    public static void main(String[] args) {

        MazeGame mazeGame = new MazeGame();
        MazeBuilder builder = new MazeBuilder();
        Maze maze = mazeGame.createMaze(builder);

        System.out.println(maze.getRoomNumbers());
    }
}



