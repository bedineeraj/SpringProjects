package com.neerajb.shapes;

public class Triangle {
	int sideA;
	int sideB;
	int sideC;
	
	public double getArea(){
		return sideA*sideB*sideC;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + sideA;
		result = prime * result + sideB;
		result = prime * result + sideC;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Triangle other = (Triangle) obj;
		if (sideA != other.sideA)
			return false;
		if (sideB != other.sideB)
			return false;
		if (sideC != other.sideC)
			return false;
		return true;
	}



	public int getSideA() {
		return sideA;
	}



	public void setSideA(int sideA) {
		this.sideA = sideA;
	}



	public int getSideB() {
		return sideB;
	}



	public void setSideB(int sideB) {
		this.sideB = sideB;
	}



	public int getSideC() {
		return sideC;
	}



	public void setSideC(int sideC) {
		this.sideC = sideC;
	}
	
	
}
