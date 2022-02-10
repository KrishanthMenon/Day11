package com.day11;

class RunnableThread implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++)
		{
			System.out.println("Thread "+i+" "+Thread.currentThread().getName());
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

public class MyRunnableThread 
{
	public static void main(String args[])
	{
	RunnableThread thread = new RunnableThread();
	Thread T1=new Thread(thread);
	T1.setName("T1");
	T1.start();
	}
}
