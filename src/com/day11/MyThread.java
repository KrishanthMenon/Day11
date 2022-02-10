package com.day11;

class ThreadClass extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Thread "+i+" "+currentThread().getName());
			try {
				currentThread().sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class MyThread 
{
	public static void main(String args[])
	{
		ThreadClass t1=new ThreadClass();
		t1.setName("T1");
		t1.start();
		
		Thread t2=new Thread();
		t2.setName("T2");
		t2.start();
	}
}

