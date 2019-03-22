package logic.bases;

import java.util.ArrayList;

import logic.ifs.Vendable;

/**
 * 自動販売機 抽象Class
 * 
 * @author	y_nishikawa
 */
public abstract class VendingMachine implements Vendable{
	/** 取扱い商品   */
	private ArrayList<Product>	products;
	/** 入金金額     */
	private int					insFare;
	
	// ====================================================================================================
	
	/**
	 * 自動販売機コンストラクター
	 */
	public VendingMachine(){
		// 入金金額を0に初期設定
		setInsFare(0);
	}
	
	/**
	 * 取扱商品を初期化する
	 */
	public abstract void initProducts();
	
	/*
	 * (非 Javadoc)
	 * @see	logic.ifs.Vendable#payment(int)
	 */
	@Override
	public void payment(int fare) throws IllegalArgumentException{
		if(fare < 0){
			// 0円未満を入力された場合
			throw	new IllegalArgumentException("!!!!! 0円未満が入力されました !!!!!");
		}
		
		// 現在の入金金額に加算する
		setInsFare(getInsFare() + fare);
	}
	
	/*
	 * (非 Javadoc)
	 * @see	ifs.Vending#takeProduct(int)
	 */
	@Override
	public Product takeProduct(int code) throws IllegalArgumentException{
		if(code < 1 || code > getProducts().size() || getProducts().get(code-1) == null){
			// 指定された商品が存在しない場合
			throw	new IllegalArgumentException("!!!!! 指定された商品は存在しません !!!!!");
		}
		
		Product	retProduct = getProducts().get(code-1);
		
		if(getInsFare() < retProduct.getPrice()){
			// 入金金額が商品の価格に満たない場合
			throw	new IllegalArgumentException("!!!!! 入金金額が不足しています !!!!!");
		}
		
		// 入金金額より商品価格を減算する
		setInsFare(getInsFare() - retProduct.getPrice());
		
		return	retProduct;
	}
	
	/*
	 * (非 Javadoc)
	 * @see	ifs.Vending#retChange()
	 */
	@Override
	public int retChange(){
		int	retChange = 0;
		
		// 返金金額を保持する
		retChange = getInsFare();
		
		// 入金金額をクリアする
		setInsFare(0);
		
		return	retChange;
	}
	
	/**
	 * 取扱い商品を取得する
	 * 
	 * @return		(ArrayList<Product>)取扱い商品
	 */
	public ArrayList<Product> getProducts(){
		return	products;
	}
	
	/**
	 * 取扱い商品を設定する
	 * 
	 * @param	products	(ArrayList<Product>)取扱い商品
	 */
	public void setProducts(ArrayList<Product> products){
		if(products == null){
			products = new ArrayList<>();
		}
		
		this.products = products;
	}
	
	/**
	 * 入金金額を取得する
	 * 
	 * @return		(int)入金金額
	 */
	public int getInsFare(){
		return	insFare;
	}
	
	/**
	 * 入金金額を設定する
	 * 
	 * @param	insFare	(int)
	 */
	public void setInsFare(int insFare){
		this.insFare = insFare;
	}
}
