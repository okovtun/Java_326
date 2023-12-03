import java.awt.*;

public class Circle extends Shape {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, int start_x, int start_y, Color color) throws HeadlessException {
        super(start_x, start_y, color);
        this.radius = radius;
    }
    public void paint(Graphics g)
    {
        g.setColor(color);
        g.drawOval(start_x, start_y, (int)radius*2, (int)radius*2);
    }
}
