public class Ball {

    public int x_axis;
    public int y_axis;
    public int speed;
    public int diameter;

    Ball(int x_axis, int y_axis, int speed, int diameter) {
        this.x_axis = x_axis;
        this.y_axis = y_axis;
        this.speed = speed;
        this.diameter = diameter;
    }

    public void move() {
        this.x_axis += speed;
    }
}
