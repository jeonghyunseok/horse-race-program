package com.hanbit.horese.controller;

import com.hanbit.horese.domain.Horse;
import com.hanbit.horese.serviceImpl.Race;

public class Stadium {
	public static void main(String[] args) {
	Race target = new Race();
	Horse h1 =new Horse("1번말","a");
	Horse h2 =new Horse("2번말","b");
	Horse h3 =new Horse("3번말","c");
	Thread th1 = new Thread(target, h1.getNumber() + h1.getName());
	Thread th2 = new Thread(target, h2.getNumber() + h2.getName());
	Thread th3 = new Thread(target, h3.getNumber() + h3.getName());
	th1.start();
	th2.start();
	th3.start();
	try{
		th1.join(); //join은 th1,th2,이 끝날때까지 기다린다.
		th2.join(); //두개다 언제끝날지 모르기 때문에 join은 두개 걸어준다.
		th3.join(); 
	}catch(Exception e){
		e.printStackTrace();
	}
	for(int i=0;i<Race.list.size();i++){
		System.out.println((i+1)+"등은"+Race.list.get(i));
		//Race.list는 class(static)변수가 때문에 바로 콜할 수 있다.
	}
	}
	}


