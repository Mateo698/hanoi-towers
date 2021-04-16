package model;

public class Hanoi {
	
	private int tower1;
	private int tower2;
	private int tower3;
	
	public Hanoi() {
		tower1 = 0;
		tower2 = 0;
		tower3 = 0;
	}
	
	
	public void solve (int disk,int origin, int aux, int destiny) {
		if(disk == 1) {
			//System.out.println("Move disk from " + origin + " to " + destiny);
			passDisk(origin,destiny);
			printTowers();
		}
		else {
			solve(disk-1,origin,destiny,aux);
			//System.out.println("Move disk from " + origin + " to " + destiny);
			passDisk(origin,destiny);
			printTowers();
			solve(disk-1,aux,origin,destiny);
		}
	}
	
	public void printTowers() {
		System.out.println(tower1+ " " +tower2+" "+tower3);
	}
	
	public void passDisk(int from,int to) {
		switch(from) {
		case 1:
			tower1--;
		break;
		
		case 2:
			tower2--;
		break;
		
		case 3:
			tower3--;
		break;
		default:
		}
		
		switch(to) {
		case 1:
			tower1++;
			break;

		case 2:
			tower2++;
		break;
		
		case 3:
			tower3++;
		break;
		default:
			
		}
	}


	public void setTowers(int tower1) {
		this.tower1 = tower1;
		tower2 = 0;
		tower3 = 0;
	}
}
