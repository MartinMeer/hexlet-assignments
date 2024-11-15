package exercise;

// BEGIN
public class Flat implements Home{

    private final double area;
    private final double balconyArea;
    private final int floor;

    public Flat(double area, double balconyArea, int floor) {
        this.area = area;
        this.balconyArea = balconyArea;
        this.floor = floor;
    }

    @Override
    public double getArea() {
        return area + balconyArea;
    }

    @Override
    public boolean compareTo(Home another) {
        return this.getArea() == another.getArea();
    }

    @Override
    public String toString() {
        return "Квартира площадью "
        + getArea()
        +" метров на "
        + floor
        + " этаже";
    }

}
// END
