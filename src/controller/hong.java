package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class hong {
	double zong = 1; // �ܽ��
	static int renshu = 20;// ����
	static double qian=0;
	int a=0;
	int q;
	List<Integer> qi=new ArrayList<>();
	public static void main(String[] args) {
		hong h=new hong();
		h.fen();
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
			fen=fen-renshu;
			// ������˼�1
			for (int i = 0; i < fen - renshu-1; i++) {
				int s=(int)(Math.random()*fen);
				qi.set(i,s+1);
				System.out.println(i+"==="+qi.get(i));
				a+=s;
				fen=fen-a;
			}
			int d=fen-a-renshu;
			System.out.println("���һ�˵�ǩ����"+d);
			return true;
		}
	}
	

}
