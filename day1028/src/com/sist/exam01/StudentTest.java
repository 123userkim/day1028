package com.sist.exam01;

import java.io.FileReader;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//FileReader�� �����ڴ� ���ܸ� �Ȱ� ����->����ó��
		try {
		FileReader fr = new FileReader("c:/MyData/student.txt");
		//���Ϸκ��� �� ���ھ� �о���̴� �޼ҵ�->read(), �о���� ������ �������� ��ȯ��
		//������ ���� �����ϸ� -1�� ��ȯ��
		//������ ������ �б�
		
		
		//�о���� ���ڵ��� ��Ƽ� ���ڿ��� ����� ���� ����
		//�� ���ھ� �о �ʱⰪ "" ��������
		String str=""; 
		int ch ;  //���Ϸκ��� �� ���ھ� �о���̱� ���� ����
		while(true) {
			ch=fr.read();
			if(ch==-1) {  //���Ϸκ��� �� ���ھ� ����
				break;  //�ݺ��� Ż��
			}
			
			//�о���� ������ ���ڰ��� �ٽ� ���ڿ��� ��ȯ�Ͽ� ������ �����ϱ�
			char data = (char)ch;
			//System.out.print(data);
			
			//�Ͼ���� ���ڸ� ���ڿ� ���� str�� ����
			str = str+data;
		}
		//������ ������ ��� �а��� �ݺ����� Ż��
		//������ ����� ������ �ݾ���
		fr.close();		
		System.out.println(str);
		//,�� ���� �и��ϱ�
		//String �� split�޼ҵ带 �̿��� �и�
		//split ���ڿ� �迭�� ��ȯ
		String []arr=str.split(",");
		String name = arr[0];
		int kor =Integer.parseInt( arr[1] ) ;
		int eng =Integer.parseInt( arr[2] ) ;
		int math =Integer.parseInt( arr[3] ) ;
		int tot =kor+eng+math;
		int avg =tot/3;
		
		System.out.println("�̸�"+name);
		System.out.println("����"+kor);
		System.out.println("����"+eng);
		System.out.println("����"+math);
		System.out.println("����"+tot);
		System.out.println("���"+avg);
		//�ݺ����� Ż���ϸ� str�� ���� ������ �ٴ��
		}catch(Exception e) {
			//���� �߻��� �Ǹ� ���� �޽����� ���
			System.out.println("���ܹ߻�  : "+e.getMessage());
		}

	}

}
