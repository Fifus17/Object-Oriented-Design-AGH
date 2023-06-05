package pl.agh.edu.dp.labirynth;

public enum Direction {
    North, South, East, West;

    public static Direction getOpposite(Direction d) {
        switch (d) {
            case North: { return South; }
            case East: { return West; }
            case South: { return North; }
            case West: { return East; }
        }
        return null;
    }
}