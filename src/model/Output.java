package model;

public class Output {
	private int x,y,r,ix,iy;
	double power,distance;
	public double getPower() {
		return power;
	}
	public void setPower(double power) {
		this.power = power;
	}
	public Output(int x, int y, int r, int ix, int iy, double power, double distance){
		this.x=x;
		this.y=y;
		this.r=r;
		this.ix=ix;
		this.iy=iy;
		this.power=power;
		this.distance=distance;
		
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	public int getIx() {
		return ix;
	}
	public void setIx(int ix) {
		this.ix = ix;
	}
	public int getIy() {
		return iy;
	}
	public void setIy(int iy) {
		this.iy = iy;
	}
}
