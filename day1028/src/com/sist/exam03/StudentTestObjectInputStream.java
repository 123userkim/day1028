package com.sist.exam03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class StudentTestObjectInputStream{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 
		
		try {
			//객체단위로 입력을 위한 objectinputStream의 객체를 생성
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(   "c:/MyData/Lee.stu"  ));
			
			//파일로부터 객체를 읽어들여 객체참조변수에 저장
			Student lee= (Student)ois.readObject();
			System.out.println("이름 : "+lee.getName());
			System.out.println("국어 : "+lee.getKor());
			System.out.println("영어 : "+lee.getEng());
			System.out.println("수학 : "+lee.getMath());
		
			ois.close();
			
		}catch(Exception e) {
			System.out.println("예외발생 "+e.getMessage());
		}

	}

}
