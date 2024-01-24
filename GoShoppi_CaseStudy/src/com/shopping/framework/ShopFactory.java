package com.shopping.framework;

public interface ShopFactory {
	public PrimeAcc getNewPrimeAccount(int accNo, String accNm, int charges, boolean isPrime);
	public NormalAcc getNewNormalAccount(int accNo, String accNm, int charges);
}



