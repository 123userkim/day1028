package com.sist.draw02;

import java.awt.Graphics;

import javax.swing.JPanel;

public class LinePanel extends JPanel {
	
	int x1 = 10;
	int y1 =10;
	int x2=200;
	int y2=200;

	@Override
	protected void paintComponent(Graphics g) {  //Graphics 안에 있는 메소드를 활용해서
		g.drawLine(x1,y1,x2,y2);  //선이 그려짐 
	}
	
}
