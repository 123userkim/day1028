package com.sist.exam02;

import java.io.FileWriter;

public class StudentTest {
	public static void main(String[] args) {
		
		//���� ��ü�� ���� ����
		Student lee= new Student("�̰ǿ�", 100, 100, 100);
		
		//Lee�� ������ ���Ϸ� ����ϰ� ����
		//=>���ڴ��� ���  (�̸�, ����, ����, ���� ��� ���ڿ��� ����� ���)
		//=>����Ʈ ���� ���(��ü�� ��°�� ���)
		
		//���ڴ����� ���
		try {
			FileWriter fw= new FileWriter("c:/Mydata/lee.txt");
			 
			//��ü�� �̸��� ���Ϸ� ���
			fw.write(lee.getName());
			fw.write(lee.getKor()+",");
			fw.write(lee.getEng()+",");
			fw.write(lee.getMath()+"");
			fw.close();
			System.out.println("������ �����߽��ϴ�.");
		}catch(Exception e) {
			System.out.println("���ܹ߻� "+e.getMessage());
		}
		
		
		
	}
}
