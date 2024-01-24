package com.GS.application;

import com.shopping.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc {

	public GSNormalAcc(int accNo, String accNm, int charges) {
		super(accNo, accNm, charges);
	}
	
	@Override
	public void bookProduct(float amt) {
		int charges=(this.getCharges());
		int newcharges=(int) (charges-amt);
		System.out.println("After bookProduct the charge is"+newcharges);
		this.setCharges(newcharges);
	}
		
		@Override
		public void items(float amt) {
			
		}

}
