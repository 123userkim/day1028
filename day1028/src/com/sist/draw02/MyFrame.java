package com.sist.draw02;

import javax.swing.JFrame;

public class MyFrame extends JFrame {   //LinePanle을 생성해서 걍 담음 끝
		private LinePanel lp; //라인 패널을 변수로 받음
	
		public MyFrame() {
			lp= new LinePanel();
			add(lp);
			setSize(600,400);
			setVisible(true);
			setTitle("선 그리기");
		}
}
