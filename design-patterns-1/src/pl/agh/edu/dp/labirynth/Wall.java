package pl.agh.edu.dp.labirynth;

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
