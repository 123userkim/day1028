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
	
	//���콺 �̺�Ʈ�� �������
	public LinePanel() {
		//this�� �ǹ̴� ���콺 �̺�Ʈ�� �߻����� �� �̺�Ʈó�� ��㰴ü�� �ڽ�
		addMouseListener(this);
	}

	@Override
	protected void paintComponent(Graphics g) {  //Graphics �ȿ� �ִ� �޼ҵ带 Ȱ���ؼ�
		System.out.println("�ٽ� �׷��ݴϴ�!");
		g.drawLine(x1,y1,x2,y2);  //���� �׷��� 
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
		repaint();  //�ٽ� �׷��ֱ� ���ؼ� ȣ���ϱ�
		
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
