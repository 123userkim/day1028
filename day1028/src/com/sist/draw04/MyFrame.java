package com.sist.draw04;

import javax.swing.JFrame;

public class MyFrame extends JFrame {   //LinePanle�� �����ؼ� �� ���� ��
		private LinePanel lp; //���� �г��� ������ ����
	
		public MyFrame() {
			lp= new LinePanel();
			add(lp);
			setSize(600,400);
			setVisible(true);
			setTitle("�� �׸���");
		}
}
