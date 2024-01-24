package com.GS.application;

import com.shopping.framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc {

	public GSPrimeAcc(int accNo, String accNm, int charges, boolean isPrime) {
		super(accNo, accNm, charges, isPrime);
		
	}
	
	@Override
	public void bookProduct(float amt) {
		int charges=(this.getCharges());
		if((charges-amt)>this.getdeliveryCharges())
		{
		int newcharges=(int) (charges-amt);
		
		System.out.println("After bookProduct the charges is"+newcharges);
		this.setCharges(newcharges);
		}
		else
			System.out.println("Insufficient charge");
	}
	
	@Override
	public void items(float amt) {
	}

}
