package JavaLadder.domain;

import java.util.Objects;

public class Point {
    private int point = 0;

    public Point(int point) {
        this.point = point;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point1 = (Point) o;
        return point == point1.point;
    }

    @Override
    public int hashCode() {
        return Objects.hash(point);
    }

    public int getPoint() {
        return point;
    }

    public void moveRight() {
        point++;
    }

    public void moveLeft() {
        point--;
    }

    @Override
    public String toString() {
        return "Point{" +
                "point=" + point +
                '}';
    }

    public boolean isEqualToPoint(int number) {
        return point == number;
    }
}
