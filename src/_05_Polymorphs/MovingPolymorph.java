package _05_Polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MovingPolymorph extends Polymorph{

	public MovingPolymorph(int x, int y) {
		super(x, y);

	}

	@Override
	public void update() {
int direction = 1;
	x=x+direction;
	y=y+direction;
		
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.green);
		g.fillRect(x, y, 50, 50);
		
	}

}
