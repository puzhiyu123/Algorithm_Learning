/*
   part of the learning of algorithm course,
   this is a two dimentional bouncing
   ball from (-1, -1) to (1, 1)

 */


public class BouncingBall {
    public static void main(String[] args) {

        // we set the scale of the coordinate system
        StdDraw.setXscale(-1.0, 1.0);
        StdDraw.setYscale(-1.0, 1.0);
        StdDraw.enableDoubleBuffering();

        // its initial values
        double rx = 0.480, ry = 0.860;     // its position
        double vx = 0.015, vy = 0.023;     // its velocity
        double radius = 0.05;              // its radius

        // main the animation loop
        while (true)  {

            // it willbounce off wall according to law of elastic collision
            if (Math.abs(rx + vx) > 1.0 - radius) vx = -vx;
            if (Math.abs(ry + vy) > 1.0 - radius) vy = -vy;

            // update position
            rx = rx + vx;
            ry = ry + vy;

            // clear the background
            StdDraw.setPenColor(StdDraw.GRAY);
            StdDraw.filledSquare(0, 0, 1.0);

            // draw ball on the screen
            StdDraw.setPenColor(StdDraw.BLACK);
            StdDraw.filledCircle(rx, ry, radius);

            // display and pause for 20 ms
            StdDraw.show();
            StdDraw.pause(20);
        }
    }
}