package com.sist.exam03;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectOutputStream;

public class StudentTestObjectOutStream {
	public static void main(String[] args) {
		
		//이의 객체를 새로 만듬
		Student lee= new Student("이건우", 100, 100, 100);
		
		//Lee의 정보를 파일로 기록하고 싶음
		//=>문자단위 출력  (이름, 국어, 수학, 영어 모두 문자열로 만들어 출력)
		//=>바이트 단위 출력(객체를 통째로 출력)
		
		//바이트단위(객체단위)로 출력
		try {
			//객체 단위로 출력하기 위해서 ObjetOutputStream객체를 생성
			//객체로 출력하는 거니까 ->txt파일이 아닌 stu
			ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream("c:/MyData/Lee.stu"));
			oos.writeObject(lee);
			oos.close();
			System.out.println("파일 생성 성공!");
			
		}catch(Exception e) {
			System.out.println("예외발생 "+e.getMessage());
		}
		
		
		
	}
}
