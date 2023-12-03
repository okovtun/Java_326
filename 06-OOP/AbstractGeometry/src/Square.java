import java.awt.*;

public class Square extends Rectangle {

    public Square(double side, int start_x, int start_y, Color color) throws HeadlessException {
        super(side, side, start_x, start_y, color);
    }
}
