package com.pdf.iotFactory;

public enum CellSide {

	NONE(0), TOP(1), RIGHT(8), BOTTOM(2), LEFT(4);
	
	private int value;
	
	CellSide(int value){
		this.value = value;
	}
	
	public int value() {
		return value;
	}

}
