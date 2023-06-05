package pl.agh.edu.dp.main;

import pl.agh.edu.dp.labirynth.*;
import pl.agh.edu.dp.labirynth.builders.CountingMazeBuilder;
import pl.agh.edu.dp.labirynth.builders.StandardMazeBuilder;
import pl.agh.edu.dp.labirynth.factories.BombedMazeFactory;
import pl.agh.edu.dp.labirynth.factories.EnchantedMazeFactory;
import pl.agh.edu.dp.labirynth.factories.MazeFactory;

public class Main {

    public static void main(String[] args) {

//        MazeFactory factory = EnchantedMazeFactory.getInstance(); // normal maze
        MazeFactory factory = BombedMazeFactory.getInstance(); // player dies when going into bombed wall or going back to once visited room
        MazeGame mazeGame = new MazeGame(factory);
        CountingMazeBuilder countingMazeBuilder = new CountingMazeBuilder();
        countingMazeBuilder.getCounts(mazeGame.getMaze());
        mazeGame.play();
    }
}



