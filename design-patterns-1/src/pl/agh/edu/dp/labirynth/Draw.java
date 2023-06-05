package pl.agh.edu.dp.labirynth;

import pl.agh.edu.dp.labirynth.doors.Door;
import pl.agh.edu.dp.labirynth.rooms.Room;

public class Draw {

    public static void draw(Room room) {
        System.out.println("Room number: " + room.getRoomNumber());
        System.out.println();
        String leftSide = (room.getSide(Direction.West) instanceof Door) ? " " : "#";
        String rightSide = (room.getSide(Direction.East) instanceof Door) ? " " : "#";
        if (room.getSide(Direction.North) instanceof Door)  System.out.println("####   ####");
        else System.out.println("###########");
        System.out.println("#         #");
        System.out.println("#         #");
        System.out.println(leftSide + "         " + rightSide);
        System.out.println("#         #");
        System.out.println("#         #");
        if (room.getSide(Direction.South) instanceof Door)  System.out.println("####   ####");
        else System.out.println("###########");
    }
}
