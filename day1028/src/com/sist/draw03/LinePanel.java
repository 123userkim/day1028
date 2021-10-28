package com.sist.draw03;

import java.awt.Graphics;

import javax.swing.JPanel;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class LinePanel extends JPanel implements MouseListener{
	
	int x1=0;
	int y1=0;
	int x2=0;
	int y2=0;
	
	//마우스 이벤트를 등록해줌
	public LinePanel() {
		//this의 의미는 마우스 이벤트가 발생했을 때 이벤트처리 담담객체가 자신
		addMouseListener(this);
	}

	@Override
	protected void paintComponent(Graphics g) {  //Graphics 안에 있는 메소드를 활용해서
		System.out.println("다시 그려줍니다!");
		g.drawLine(x1,y1,x2,y2);  //선이 그려짐 
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		x1= e.getX();
		y1= e.getY();
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		x2=e.getX();
		y2=e.getY();
		repaint();  //다시 그려주기 위해서 호출하기
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
