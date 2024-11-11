package exercise;

import lombok.AllArgsConstructor;
import lombok.Getter;

// BEGIN
@Getter
@AllArgsConstructor
public class Segment {

    private Point beginPoint;
    private Point endPoint;

    public Point getMidPoint() {
        int midPointX = (beginPoint.getX() + endPoint.getX()) / 2;
        int midPointY = (beginPoint.getY() + endPoint.getY()) / 2;
        return new Point(midPointX, midPointY);
    }
}
// END