package runnable;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import calculation.Calculation;
import model.Points;
import model.PowerStation;

public class Runnable {	
	private static Scanner scan;	
	public static void main(String args[]) {
		//scan = new Scanner(System.in);
		List<PowerStation> powerStation = new ArrayList<PowerStation>();
		List<Points> points = new ArrayList<Points>();
		
		
		//points.add(new Points(scan.nextInt(),scan.nextInt()));
		
		points.add(new Points(0,0));
		points.add(new Points(100,100));
		points.add(new Points(15,10));
		points.add(new Points(18,18));
		powerStation.add(new PowerStation(0,0,10));
		powerStation.add(new PowerStation(20,20,5));
		powerStation.add(new PowerStation(10,0,12));
		
		Calculation.calculatePower(powerStation,points);
		
	}

}
