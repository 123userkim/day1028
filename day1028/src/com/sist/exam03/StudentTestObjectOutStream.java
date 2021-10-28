package com.sist.exam03;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectOutputStream;

public class StudentTestObjectOutStream {
	public static void main(String[] args) {
		
		//���� ��ü�� ���� ����
		Student lee= new Student("�̰ǿ�", 100, 100, 100);
		
		//Lee�� ������ ���Ϸ� ����ϰ� ����
		//=>���ڴ��� ���  (�̸�, ����, ����, ���� ��� ���ڿ��� ����� ���)
		//=>����Ʈ ���� ���(��ü�� ��°�� ���)
		
		//����Ʈ����(��ü����)�� ���
		try {
			//��ü ������ ����ϱ� ���ؼ� ObjetOutputStream��ü�� ����
			//��ü�� ����ϴ� �Ŵϱ� ->txt������ �ƴ� stu
			ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream("c:/MyData/Lee.stu"));
			oos.writeObject(lee);
			oos.close();
			System.out.println("���� ���� ����!");
			
		}catch(Exception e) {
			System.out.println("���ܹ߻� "+e.getMessage());
		}
		
		
		
	}
}
