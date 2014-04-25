public class Robot {

    double x = 0, y = 0, course = 0;

    public void printCoordinates() {
        System.out.println(x + "," + y);
    }

    public void forward(int distance) {
        x = x + distance * Math.cos(course / 180 * Math.PI);
        y = y + distance * Math.cos(course / 180 * Math.PI);
    }
}
