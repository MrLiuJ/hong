package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class as {
	double zong = 1; // �ܽ��
	static int renshu = 200;// ����
	static double qian=0;
	List<Integer> qi=new ArrayList<>();

	public static void main(String[] args) {
		as as=new as();
		
		if(as.fen()) {
			for (int i = 0; i < renshu; i++) {
				new Thread(new Runnable() {
					
					@Override
					public void run() {
						System.out.println(Thread.currentThread().getName()+":"+as.qiang());
			
					}
				}).start();

			}
		}
		else {
			System.out.println("111");
		}
		
	}

	public boolean fen() {
		Random rand = new Random(); // random
		int fen = (int) (zong * 100);
		if (fen < renshu) {
			System.out.println("��Ǯ������������");
			return false;
		}

		else {
			// ѭ������ÿ��Ϊ1
			for (int i = 0; i < renshu; i++) {
				qi.add(1);
			}
			// ������˼�1
			for (int i = 0; i < fen - renshu; i++) {
				int ren=rand.nextInt(renshu);
				qi.set(ren, qi.get(ren)+1);
			}
			return true;
			
		}
	}
	public synchronized double qiang() {
		int temp=qi.get(0);
		qi.remove(0);
		System.out.println("\t �������"+(qian=qian+temp)/100);
		return ((double)(temp))/100;
		
		}

}
