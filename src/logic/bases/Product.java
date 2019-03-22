package logic.bases;

/**
 * 商品Class
 * 
 * @author	y_nishikawa
 */
public class Product{
	/** 名称 */
	private String	name;
	/** 価格 */
	private int		price;
	
	// ====================================================================================================
	
	/**
	 * 商品コンストラクター
	 * 
	 * @param	name	(String)名称
	 * @param	price	(int)価格
	 */
	public Product(String name, int price){
		setName(name);
		setPrice(price);
	}
	
	/**
	 * 名称を取得する
	 * 
	 * @return	(String)名称
	 */
	public String getName(){
		return	name;
	}
	
	/**
	 * 名称を設定する
	 * 
	 * @param	name	(String)名称
	 */
	public void setName(String name){
		this.name = name;
	}
	
	/**
	 * 価格を取得する
	 * 
	 * @return	(int)価格
	 */
	public int getPrice(){
		return	price;
	}
	
	/**
	 * 価格を設定する
	 * 
	 * @param	price	(int)価格
	 */
	public void setPrice(int price){
		if(price < 0){
			price = 0;
		}
		
		this.price = price;
	}
}
