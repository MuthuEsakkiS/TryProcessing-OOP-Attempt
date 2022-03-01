import processing.core.PApplet;

public class TryProcessing extends PApplet {

    static final int HEIGHT = 640;
    static final int WIDTH = 480;
    static final int DIAMETER = 10;
    static Ball[] balls = new Ball[4];

    public static void main(String[] args) {
        PApplet.main("TryProcessing", args);

        for(int ball = 0; ball < 4; ball++) {
            balls[ball] = new Ball(0, (ball + 1) * HEIGHT / 5, ball + 1, DIAMETER);
        }
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        for(int ball = 0; ball < 4; ball++) {
            ellipse(balls[ball].x_axis, balls[ball].y_axis, balls[ball].diameter, balls[ball].diameter);
            balls[ball].move();
        }
    }
}