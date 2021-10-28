package com.sist.exam02;

import java.io.FileWriter;

public class StudentTest {
	public static void main(String[] args) {
		
		//이의 객체를 새로 만듬
		Student lee= new Student("이건우", 100, 100, 100);
		
		//Lee의 정보를 파일로 기록하고 싶음
		//=>문자단위 출력  (이름, 국어, 수학, 영어 모두 문자열로 만들어 출력)
		//=>바이트 단위 출력(객체를 통째로 출력)
		
		//문자단위의 출력
		try {
			FileWriter fw= new FileWriter("c:/Mydata/lee.txt");
			 
			//객체의 이름을 파일로 출력
			fw.write(lee.getName());
			fw.write(lee.getKor()+",");
			fw.write(lee.getEng()+",");
			fw.write(lee.getMath()+"");
			fw.close();
			System.out.println("파일을 생성했습니다.");
		}catch(Exception e) {
			System.out.println("예외발생 "+e.getMessage());
		}
		
		
		
	}
}
