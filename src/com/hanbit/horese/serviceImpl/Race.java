package com.hanbit.horese.serviceImpl;

import java.util.List;
import java.util.Random;
import java.util.Vector;


public class Race implements Runnable {
	//Thread를 사용한다고 하면 service 안만들고 Runnable을 사용해야한다.
	public static List<String> list= new Vector<>();
	
	@Override
	public void run() {
		Random ran =new Random();// 랜덤 클래스
		//this(이 클래스이 객체)를 대상으로 동기화를 한다.
		// synchronized가 한개의 Thread만 허용한다.
		for(int i=0;i<11;i++){
		synchronized (this){
			String name =Thread.currentThread().getName();
			System.out.println(name + "라인" + (i*100)+"m 통과!!!");
			if(i*100 == 1000){
			 list.add(name);// add 메서드로 name 받음.	
			}
		}
		try{
			Thread.sleep(ran.nextInt(300));// int 값으로 변한다
		} catch(Exception e){
			e.printStackTrace();
		}
	}

}
}