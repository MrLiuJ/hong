package controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

public class qwe {
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
		      List<BigDecimal> moneys = math(BigDecimal.valueOf(0.06),5);
		      if (moneys != null) {
		        BigDecimal b = new BigDecimal(0);
		        for (BigDecimal bigDecimal : moneys) {
		          System.out.print(bigDecimal + "Ԫ  ");
		          b = b.add(bigDecimal);
		        }
		        System.out.print("  �ܶ" + b+"Ԫ ");
		        System.out.println();
		      }
		    }
		  }
		  /**
		   * ����ÿ�˻�ú�����;��Сÿ��0.01Ԫ
		   * @param mmm ����ܶ�
		   * @param number ����
		   * @return
		   */
		  public static List<BigDecimal> math(BigDecimal mmm, int number) {
		    if (mmm.doubleValue() < number * 0.01) {
		      return null;
		    }
		    Random random = new Random();
		    // ��Ǯ�����ּ��� 10����� 1000��
		    int money = mmm.multiply(BigDecimal.valueOf(100)).intValue();
		    // ������ܶ�
		    double count = 0;
		    // ÿ�˻���������
		    double[] arrRandom = new double[number];
		    // ÿ�˻��Ǯ��
		    List<BigDecimal> arrMoney = new ArrayList<BigDecimal>(number);
		    // ѭ������ �����
		    for (int i = 0; i < arrRandom.length; i++) {
		      int r = random.nextInt((number) * 99) + 1;
		      count += r;
		      arrRandom[i] = r;
		    }
		    // ����ÿ�˲�����ý��
		    int c = 0;
		    for (int i = 0; i < arrRandom.length; i++) {
		      // ÿ�˻���������� ����ÿ��ռ�ٷֱ�
		   
		    	Double x = new Double(arrRandom[i] / count);
		      // ÿ��ͨ���ٷֱȻ�ý��
		      int m = (int) Math.floor(x * money);
		      if(number==money) {
		    	  m=1;
		      }
		      // ������ 0 ����������Сֵ 1��Ǯ
		      if (m == 0) {
		        m = 1;
		      }
		   
		      // �������ܶ�
		      c += m;
		      // ����������һ��������������
		      if (i < arrRandom.length - 1) {
		        arrMoney.add(new BigDecimal(m).divide(new BigDecimal(100)));
		      } else {
		        // ��������һ���ˣ����ʣ���Ǯ�������һ����
		        arrMoney.add(new BigDecimal(money - c + m).divide(new BigDecimal(100)));
		      }
		    }
		    // �������ÿ�˻�ý��
		    return arrMoney;
		  }
		}