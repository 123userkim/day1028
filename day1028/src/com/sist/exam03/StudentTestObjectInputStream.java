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
			//��ü������ �Է��� ���� objectinputStream�� ��ü�� ����
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(   "c:/MyData/Lee.stu"  ));
			
			//���Ϸκ��� ��ü�� �о�鿩 ��ü���������� ����
			Student lee= (Student)ois.readObject();
			System.out.println("�̸� : "+lee.getName());
			System.out.println("���� : "+lee.getKor());
			System.out.println("���� : "+lee.getEng());
			System.out.println("���� : "+lee.getMath());
		
			ois.close();
			
		}catch(Exception e) {
			System.out.println("���ܹ߻� "+e.getMessage());
		}

	}

}
