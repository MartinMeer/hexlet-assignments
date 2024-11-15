package exercise;

// BEGIN
public class Cottage implements Home{

    private final double area;
    private final int floorCount;

    public Cottage(double area, int floorCount) {
        this.area = area;
        this.floorCount = floorCount;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public boolean compareTo(Home another) {
        return this.getArea() == another.getArea();
    }

    @Override
    public String toString() {
        return floorCount
        + " этажный коттедж площадью "
        + getArea()
        + " метров";
    }
}
// END
