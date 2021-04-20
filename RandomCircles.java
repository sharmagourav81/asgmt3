package week2;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class RandomCircles extends GraphicsProgram {
	
	private RandomGenerator rangen = RandomGenerator.getInstance();
	private static final int CIRCLES = 10;
	private static final double MAXIMUM_RADIUS = 50;
	private static final double MINIMUM_RADIUS = 5;
	
	public void run() {
		for (int i = 0; i < CIRCLES; i++) {
		double r = rangen.nextDouble(MINIMUM_RADIUS, MAXIMUM_RADIUS);
		double x = rangen.nextDouble(0, getWidth() - 2 * r);
		double y = rangen.nextDouble(0, getHeight() - 2 * r);
		GOval circle = new GOval(x, y, 2 * r, 2 * r);
		circle.setFilled(true);
		circle.setColor(rangen.nextColor());
		add(circle);
		       }
		}
}
