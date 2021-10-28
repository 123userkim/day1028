package com.sist.draw01;

import java.awt.Graphics;

import javax.swing.JPanel;

public class LinePanel extends JPanel {

	@Override
	protected void paintComponent(Graphics g) {  //Graphics 안에 있는 메소드를 활용해서
		g.drawLine(10,10,110,10);  //선이 그려짐 
	}
	
}
