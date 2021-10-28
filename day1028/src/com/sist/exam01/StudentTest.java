package com.sist.exam01;

import java.io.FileReader;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//FileReader의 생성자는 예외를 안고 있음->예외처리
		try {
		FileReader fr = new FileReader("c:/MyData/student.txt");
		//파일로부터 한 글자씩 읽어들이는 메소드->read(), 읽어들인 문자의 정수값을 반환함
		//파일의 끝에 도달하면 -1을 반환함
		//파일의 끝까지 읽기
		
		
		//읽어들인 문자들을 모아서 문자열을 만들기 위한 변수
		//한 문자씩 읽어서 초기값 "" 을설정정
		String str=""; 
		int ch ;  //파일로부터 한 글자씩 읽어들이기 위한 변수
		while(true) {
			ch=fr.read();
			if(ch==-1) {  //파일로부터 한 글자씩 읽음
				break;  //반복문 탈출
			}
			
			//읽어들인 글자의 숫자값을 다시 문자열로 변환하여 변수에 저장하기
			char data = (char)ch;
			//System.out.print(data);
			
			//일어들인 문자를 문자열 변수 str에 누적
			str = str+data;
		}
		//파일의 내용을 모두 읽고나면 반복문을 탈출
		//파일의 사용이 끝나면 닫아줌
		fr.close();		
		System.out.println(str);
		//,를 갖고 분리하기
		//String 의 split메소드를 이용해 분리
		//split 문자열 배열로 반환
		String []arr=str.split(",");
		String name = arr[0];
		int kor =Integer.parseInt( arr[1] ) ;
		int eng =Integer.parseInt( arr[2] ) ;
		int math =Integer.parseInt( arr[3] ) ;
		int tot =kor+eng+math;
		int avg =tot/3;
		
		System.out.println("이름"+name);
		System.out.println("국어"+kor);
		System.out.println("영어"+eng);
		System.out.println("수학"+math);
		System.out.println("총점"+tot);
		System.out.println("평균"+avg);
		//반복문을 탈출하면 str에 파일 내용이 다담김
		}catch(Exception e) {
			//예외 발생이 되면 예외 메시지를 출력
			System.out.println("예외발생  : "+e.getMessage());
		}

	}

}
