import java.awt.*;
public abstract class Shape extends Frame {
    protected int start_x;
    protected int start_y;
    protected Color color;

    public int getStart_x() {
        return start_x;
    }

    public void setStart_x(int start_x) {
        this.start_x = start_x;
    }

    public int getStart_y() {
        return start_y;
    }

    public void setStart_y(int start_y) {
        this.start_y = start_y;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Shape(int start_x, int start_y, Color color) throws HeadlessException {
        this.start_x = start_x;
        this.start_y = start_y;
        this.color = color;

        Button btn = new Button("Click me!!");
        btn.setBounds(100, 50, 80, 30);
        this.add(btn);
        this.setSize(800, 600);
        this.setTitle("Basic AWT example");
        this.setLayout(null);
        this.setBackground(Color.BLACK);
        this.setVisible(true);

        /*Label lbl = new Label("Rectangle");
        lbl.setBounds(110, 110, 200, 30);
        lbl.setForeground(Color.GRAY);
        this.add(lbl);*/
    }

    /*public void paint(Graphics g)
    {
        g.setColor(color);
        g.drawRect(start_x, start_y, 300, 200);
    }*/
}
