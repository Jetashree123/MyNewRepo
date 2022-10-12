package ShoppingCart;

public class ProductsDetails {

	        private int productName;
	        private int productPrice;
	        private int productQuanity;
	        
	        
	     public ProductsDetails()
	     {
	    	 

	     }
	     
			public ProductsDetails(int productName, int productPrice, int productQuanity) {
			super();
			this.productName = productName;
			this.productPrice = productPrice;
			this.productQuanity = productQuanity;
		}

			/**
			 * @return the productName
			 */
			public int getProductName() {
				return productName;
			}
			/**
			 * @param productName the productName to set
			 */
			public void setProductName(int productName) {
				this.productName = productName;
			}
			/**
			 * @return the productPrice
			 */
			public int getProductPrice() {
				return productPrice;
			}
			/**
			 * @param productPrice the productPrice to set
			 */
			public void setProductPrice(int productPrice) {
				this.productPrice = productPrice;
			}
			/**
			 * @return the productQuanity
			 */
			public int getProductQuanity() {
				return productQuanity;
			}
			/**
			 * @param productQuanity the productQuanity to set
			 */
			public void setProductQuanity(int productQuanity) {
				this.productQuanity = productQuanity;
			}
	        
	        
	        
	        
	
}
