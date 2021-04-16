package ui;
import java.util.ArrayList;
import java.util.Scanner;

import model.*;

public class Main {
	
	private static Scanner in;
	private static Hanoi n;
	
	public static void main(String[] args) {
		in = new Scanner(System.in);
		n = new Hanoi();
		read();
	}
	
	public static void read() {
		int cases = in.nextInt();
		ArrayList<Integer> disks = new ArrayList<Integer>(); 
		for(int i=0;i<cases;i++) {
			int disk = in.nextInt();
			disks.add(disk);
		}
		for(int i=0;i<disks.size();i++) {
			n.setTowers(disks.get(i));
			n.printTowers();
			n.solve(disks.get(i), 1, 2, 3);
			System.out.println("");
		}
	}
}
