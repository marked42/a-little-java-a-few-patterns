package ch1;

public abstract class Point {
    public static void main(String[] args) {
        ManhattanPt pt = new ManhattanPt(3, 4);
        pt.distanceToO();
    }

    int x;
    int y;

    abstract int distanceToO();
    Point(int _x, int _y) {
        x = _x;
        y = _y;
    }

    boolean closerTo(Point pt) {
        return distanceToO() < pt.distanceToO();
    }
}

class CartesianPt extends Point {
    CartesianPt(int _x, int _y) {
        super(_x, _y);
    }

    @Override
    int distanceToO() {
        return (int) Math.sqrt(x * x + y * y);
    }
}

class ManhattanPt extends Point {
    ManhattanPt(int _x, int _y) {
        super(_x, _y);
    }

    @Override
    int distanceToO() {
        return x + y;
    }
}
