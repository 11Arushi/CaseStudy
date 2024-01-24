package com.shopping.framework;

public abstract class PrimeAcc extends ShopAcc {

	private boolean isPrime;
	private final static float deliveryCharges=500;
	
	public PrimeAcc(int accNo, String accNm, int charges, boolean isPrime) {
		super(accNo, accNm,charges);
		this.isPrime = isPrime;
	}
	public boolean isPrime() {
		return isPrime;
	}
	public static float getdeliveryCharges() {
		return deliveryCharges;
	}
	@Override
	public String toString() {
		return "PrimeAcc [isPrime=" + isPrime + "]";
	}
	

}
