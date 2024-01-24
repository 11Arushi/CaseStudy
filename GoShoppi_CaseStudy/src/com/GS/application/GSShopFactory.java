package com.GS.application;

import com.shopping.framework.ShopFactory;
import com.shopping.framework.NormalAcc;
import com.shopping.framework.PrimeAcc;

public class GSShopFactory implements ShopFactory{

    @Override
	public GSPrimeAcc getNewPrimeAccount(int accNo, String accNm, int charges, boolean isPrime) {
		return new GSPrimeAcc(accNo,accNm,charges,isPrime);
}
	
	@Override
	public GSNormalAcc getNewNormalAccount(int accNo, String accNm, int charges) {
		return new GSNormalAcc(accNo,accNm,charges);
	}

}
