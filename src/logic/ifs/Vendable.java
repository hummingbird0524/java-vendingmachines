package logic.ifs;

import logic.bases.Product;

/**
 * 販売能力インターフェース
 * 
 * @author	y_nishikawa
 */
public interface Vendable{
	/**
	 * 入金する
	 * 
	 * @param	fare	(int)入金額
	 */
	void payment(int fare);
	
	/**
	 * 商品を提供する。
	 * 
	 * @param	code	(int)商品コード
	 * @return			(Product)商品
	 */
	Product takeProduct(int code);
	
	/**
	 * 釣銭を返却する。
	 * 
	 * @return	(int)釣銭
	 */
	int retChange();
}
