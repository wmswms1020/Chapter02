package com.javaex.ex04;

public class Point {

	//필드
	
	int xpoint;
	int ypoint;
	
	//생성자
	
	//메소드 - 겟터세터
	
	public void setX(int x) {
		xpoint = x;
	}
	public void setY(int y) {
		ypoint = y;
	}
	public int getX() {
		return xpoint;
	}
	public int getY() {
		return ypoint;
	}
	
	//메소드 - 일반
	
	public void draw() {
		System.out.println("점[x="+xpoint+", y="+ypoint+"]을 그렸습니다");
	}
	
	
	
	
	
	
	
	
}
