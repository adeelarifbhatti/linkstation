package calculation;
import java.util.ArrayList;
import java.util.List;

import model.Points;
import model.PowerStation;
import model.Output;

public class Calculation {	
	public static void calculatePower(List<PowerStation> pStation, List<Points> points ) {

		for (int i=0; i < points.size();i++) {
			double distance=0;
			double power=0;
			double previousPower=0;
			List<Output> check =new ArrayList<>();

				for (int j=0; j < pStation.size();j++) {			
					distance = Math.sqrt((points.get(i).getY() - pStation.get(j).getY()) *
										(points.get(i).getY() - pStation.get(j).getY()) 
											+
										(points.get(i).getX() - pStation.get(j).getX()) * 
								     	(points.get(i).getX() - pStation.get(j).getX()));	

				 	if(distance < pStation.get(j).getR()) {				 
						 power = (pStation.get(j).getR()) - distance;
						 power = Math.pow(power, 2);
						 if(power>previousPower) {						 
						 check.add(new Output(pStation.get(j).getX(), pStation.get(j).getY(),pStation.get(j).getR(),points.get(i).getX(),points.get(i).getY(),
								 power,distance));
						 previousPower=power;
						 }
					 }
					 if(j==pStation.size()-1 && check.isEmpty()) {
						 System.out.println("No link station within reach for point "+points.get(i).getX()+","+points.get(i).getY() );
					 }					 
				}				
				for(int k=0;k<=check.size()-1;k++) {
					if(!check.isEmpty() && check.size()>0) {
					System.out.println("Best link station for point "+check.get(k).getX()+","+check.get(k).getY()+" is "+check.get(k).getIx()+","+check.get(k).getIy()
							+" with power "+check.get(k).getPower());
					}
										
				}

		}
	}
}

