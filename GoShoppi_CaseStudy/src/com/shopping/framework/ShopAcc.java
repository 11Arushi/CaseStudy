package com.shopping.framework;

public abstract class ShopAcc {

	
		
		private int accNo;
		private String accNm;
		private int charges;
		
		
		public ShopAcc(int accNo, String accNm, int charges) {
			this.accNo = accNo;
			this.accNm = accNm;
			this.charges = charges;
		}


		public int getAccNo() {
			return accNo;
		}

		public String getAccNm() {
			return accNm;
		}


		public void setAccNm(String accNm) {
			this.accNm = accNm;
		}


		public int getCharges() {
			return charges;
		}


		public void setCharges(int charges) {
			this.charges = charges;
		}
		
		@Override
		public String toString() {
			return super.toString();
		}
		public abstract  void bookProduct(float amt);
		public abstract void items(float amt);
		
		
}
