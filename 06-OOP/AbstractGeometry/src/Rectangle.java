import java.awt.*;

public class Rectangle extends Shape {
    private double side_1;
    private double side_2;

    public double getSide_1() {
        return side_1;
    }

    public void setSide_1(double side_1) {
        this.side_1 = side_1;
    }

    public double getSide_2() {
        return side_2;
    }

    public void setSide_2(double side_2) {
        this.side_2 = side_2;
    }

    public Rectangle(double side_1, double side_2,int start_x, int start_y, Color color) throws HeadlessException {
        super(start_x, start_y, color);
        this.side_1 = side_1;
        this.side_2 = side_2;

//        Label lbl = new Label("Rectangle:\n\nSide 1: %f;\n\nSide 2: %f;\n".formatted(side_1, side_2));
        Label lbl_name = new Label("Rectangle:");
        Label lbl_side_1 = new Label("Side 1: %f".formatted(side_1));
        Label lbl_side_2 = new Label("Side 2: %f".formatted(side_2));
        lbl_name.setBounds(start_x+10, start_y+10, 100, 10);
        lbl_side_1.setBounds(start_x+10, start_y+20, 100, 10);
        lbl_side_2.setBounds(start_x+10, start_y+30, 100, 10);
        lbl_name.setForeground(Color.GRAY);
        lbl_side_1.setForeground(Color.GRAY);
        lbl_side_2.setForeground(Color.GRAY);
        this.add(lbl_name);
        this.add(lbl_side_1);
        this.add(lbl_side_2);
    }
    public void paint(Graphics e)
    {
        e.setColor(color);
        e.drawRect(start_x, start_y, (int)side_1, (int)side_2);
    }
}
