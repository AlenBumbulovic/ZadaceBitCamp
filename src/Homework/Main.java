package Homework;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Main {

	public static void main(String[] args) {
		DrawWindow w = new DrawWindow();
		draw(w);
	}

	public static void draw(DrawWindow w) {
		BufferedImage img = new BufferedImage(1200, 800, BufferedImage.TYPE_INT_ARGB);
		Graphics g = img.getGraphics();
		// **** Draw here ****
		
		g.setColor(Color.BLACK);
		g.setFont(new Font ("Cambria", Font.BOLD, 17));
		
		g.drawString("An array of numbers", 200, 20);
		g.drawString("Type int: ", 230, 130);
		
		g.drawLine(50, 50, 550, 50);
		g.drawLine(50, 100, 550, 100);
		
		int x = 50;
		int y = 50;
		int y1 = 100;
		
		g.drawLine(x, y, x, y1);
		
		Integer num = 0;
		
		for(int i = 0; i < 10; i++){
			x += 50;
			g.drawLine(x, y, x, y1);
			
			num = (int) (Math.random()*10);
			g.drawString(num.toString(), x - 28, 80);
		}
		
		
		
		
		
		
	//	g.setColor(Color.ORANGE);
	//	g.drawOval(100, 100, 400, 100);
		
	//	g.setColor(Color.RED);
	//	g.setFont(new Font("Cambria", Font.BOLD, 18));
	//	g.drawString("BitCamp <3", 250, 150);
		
	//	g.setColor(Color.BLUE);
	//	g.drawLine(100, 200, 500, 200);
		
		// *******************
		w.setImage(img);
	}
}
