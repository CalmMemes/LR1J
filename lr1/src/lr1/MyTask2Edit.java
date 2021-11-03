package lr1;

import java.util.ArrayList;
import java.util.Scanner;

public class MyTask2Edit {
	private ArrayList<Double> aa = new ArrayList<Double>();
	private int N;
	
	public void InputArray() {
		aa.clear();
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите количество чисел > ");
		N = sc.nextInt();
		
		double a;
		for(int i = 0; i < N; i++) {
			System.out.print("Введите число " + String.valueOf(i+1) + " > ");
			a = sc.nextDouble();
			aa.add(a);
		}
		sc.close();
	}
	
	public void PrintResult() {
		double b = 0;
		System.out.print("Среднее арифметическое чисел: ");
		for(int i = 0; i < N; i++) {
			b += aa.get(i);
		}
		System.out.println(b/N);
	}
}
