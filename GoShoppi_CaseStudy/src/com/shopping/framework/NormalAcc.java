package com.shopping.framework;

public abstract class NormalAcc extends ShopAcc{
 
	private float deliveryCharges=200;
	
	

	public float getDeliveryCharges() {
		return deliveryCharges;
	}


	public NormalAcc(int accNo, String accNm, int charges) {
		super(accNo, accNm, charges);
	}
	

}
