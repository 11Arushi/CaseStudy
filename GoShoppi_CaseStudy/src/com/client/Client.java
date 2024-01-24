package com.client;

import com.GS.application.GSShopFactory;
import com.GS.application.GSNormalAcc;
import com.GS.application.GSPrimeAcc;

public class Client {

	public static void main(String[] args) {
		GSShopFactory mmf=new GSShopFactory();
        GSNormalAcc obj=mmf.getNewNormalAccount(1, "Arushi", 300);
        obj.bookProduct(600);
        System.out.println(obj.getCharges());
        
        
        GSPrimeAcc obj1=mmf.getNewPrimeAccount(obj.getAccNo(),obj.getAccNm(),obj.getCharges(), true);
        obj1.items(500);
	}

}
