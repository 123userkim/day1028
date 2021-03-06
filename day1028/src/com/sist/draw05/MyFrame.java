package com.sist.draw05;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


//MyFrame클래스 자신이 "JMenuItem"을 눌렀을때에 "이벤트처리 담당자"가 되도록 하기 위하여 
//ActionListener인터페이스를 구현하도록 합니다.
public class MyFrame extends JFrame implements ActionListener {
	private LinePanel lp;
	
	public MyFrame() {
		lp = new LinePanel();
		add(lp);
		
		
		//메뉴바를 생성합니다.
		JMenuBar jmb = new JMenuBar();
		
		//주메뉴 "파일"을 생성합니다.
		JMenu  mn_file = new JMenu("파일");
		
		//주메뉴 "그리기도구"를 생성합니다.
		JMenu mn_draw = new JMenu("그리기도구");
		
		//부메뉴 "새파일"을 생성합니다.
		JMenuItem file_new = new JMenuItem("새파일");
		
		//부메뉴 "열기"를 생성합니다.
		JMenuItem file_open = new JMenuItem("열기");
		
		//부메뉴 "저장"을 생성합니다.
		JMenuItem file_save = new JMenuItem("저장");
		
		//"부메뉴"들을 "주메뉴"에 담아요
		mn_file.add(file_new);
		mn_file.add(file_open);
		mn_file.add(file_save);
		
		
		//주메뉴 "그리기도구"에 담길 부메뉴들을 만들어요
		JMenuItem draw_line = new JMenuItem("선");
		JMenuItem draw_rect = new JMenuItem("사각형");
		JMenuItem draw_oval = new JMenuItem("원");
		
		//선,사각형,원 부메뉴들을 "그리기도구"주메뉴에 담아요
		mn_draw.add(draw_line);
		mn_draw.add(draw_rect);
		mn_draw.add(draw_oval);		
		
		//"주메뉴"를 "메뉴바"에 담아요
		jmb.add(mn_file);
		
		//"그리기도구" 주메뉴를 "메뉴바"에 담아요
		jmb.add(mn_draw);
		
		//"메뉴바"를 "프레임"에 설정해요!
		setJMenuBar(jmb);
		
		//각각의 JMenuItem에 대하여 이벤트를 등록합니다.
		file_new.addActionListener(this);
		file_open.addActionListener(this);
		file_save.addActionListener(this);
		
		//그리기도구의 부메뉴들에 대해서도 이벤트를 등록합니다.
		draw_line.addActionListener(this);
		draw_rect.addActionListener(this);
		draw_oval.addActionListener(this);
		
		setSize(600,400);
		setVisible(true);
		setTitle("선그리기");
		
	}

	
	//각각의 JMenuItem을 누르면 actionPerformed메소드가 동작합니다.
	@Override
	public void actionPerformed(ActionEvent e) {
		//JMenuItem중에 어떤 메뉴가 눌러졌는지 파악하기 위하여 매개변수 ActionEvent의 getActionCommand()를 이용합니다.
		String cmd = e.getActionCommand();
		//System.out.println(cmd+"가 눌러짐");
		
		if(cmd.equals("저장")) {
			try {
				// 현재 화면에 그려진 모든 "선"들을 파일로 저장해요.("c:/myData/data.pan")
				// 현재화면에 그려진 모든 "선"들의 정보는 LinePanel 객체인 lp의 list에 담겨져 있어요.
				// list객체를 통째로 파일로 출력하기 위하여 ObjectOutputStream을 이용합니다.
				ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("c:/myData/data.pan"));
				
				//LinePanel 객체의 맴버변수인 list를 파일로 출력합니다.
				oos.writeObject(lp.list);
				
				oos.close();
			}catch (Exception ex) {
				System.out.println("예외발생:"+ex.getMessage());
			}
		}else if(cmd.equals("열기")) {
			//"c:/myData/data.pan"파일의 내용을 읽어 들여
			// LinePanel 객체인 lp의 list 에 저장하도록 합니다.
			// 화면을 다시 그리개 위하여 Linepanel 객체를 lp의 repaint를 호출합니다.
			
			try {
				//객체단위로 파일의 내용을 읽어들이기 위하여 ObjectInputStream객체를 생성합니다.
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream("c:/myData/data.pan"));
				
				//파일로 데이터를 읽어들여 Linpanel 객체인 lp의 list에 담아요
				lp.list = (ArrayList<GraphicInfo>)ois.readObject();
				
				//파일의 내용을 읽어와서 list에 담긴 그래픽의 정보만큼 다시 그려주기 위하여 repaint를 호출합니다.
				lp.repaint();
				
				//파일을 닫아줍니다.
				ois.close();
							
				
			}catch (Exception ex) {
				System.out.println("예외발생:"+ex.getMessage());
			}
			
		}else if(cmd.equals("새파일")) {
			System.out.println("새파일의 처리입니다.");
		}else if(cmd.equals("선")) {
			lp.drawType = 0;
		}else if(cmd.equals("사각형")) {
			lp.drawType = 1;
		}else if(cmd.equals("원")) {
			lp.drawType = 2;
		}
		
	}
}




// 프로그램을 진행하다가 보면
// 예외가 발생이 될일이 없는데
// try~catch를 써야하는 이유는
// ObjectInputStrea, ObjectOutStream을 써야하기 때문인가요?
//	==> 네, 맞습니다.
// ObjectInputStream, ObjectOutStream등의 
// java.io 패키지의 모든 클래스의 생성자와 메소드들을 예외를 포함하고 하고 있어요.
// 생성자 이름 뒤에 메소드 이름뒤에 모두 throws ~~~~Exception으로 되어 있어요
// 그래서 이러한 것드를 사용하려면 반드시 예외처리 해야 합니다.












