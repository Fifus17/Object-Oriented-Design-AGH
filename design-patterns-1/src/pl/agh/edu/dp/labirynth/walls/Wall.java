package pl.agh.edu.dp.labirynth.walls;

import pl.agh.edu.dp.labirynth.MapSite;

public class Wall extends MapSite {

    int noAdjacentRooms = 0;
    public Wall(){
        noAdjacentRooms = 1;
    }

    public void setAsCommonWall() { noAdjacentRooms = 2; }

    @Override
    public void Enter(){

    }

    public int getNoAdjacentRooms() { return noAdjacentRooms; }
}
