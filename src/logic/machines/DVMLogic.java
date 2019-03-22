package logic.machines;

import java.util.ArrayList;
import java.util.HashMap;

import logic.bases.Product;
import logic.bases.VendingMachine;
import logic.products.Coffee;
import logic.products.Juice;
import logic.products.Tea;
import master.DVMMaster;

/**
 * 飲料自動販売機Class
 * 
 * @author	y_nishikawa
 */
public class DVMLogic extends VendingMachine{
	/**
	 * コンストラクター
	 */
	public DVMLogic(){
		super();
		
		initProducts();
	}
	
	/*
	 * (非 Javadoc)
	 * @see	bases.VendingMachine#initProducts()
	 */
	@Override
	public void initProducts(){
		ArrayList<Product>	products = new ArrayList<>();
		
		// コーヒー系飲料の初期化
		for(HashMap<String, Object> drink : DVMMaster.COFFEES){
			products.add(new Coffee(
					(String) drink.get("name")
				  , (int)     drink.get("price")
				  , (boolean)drink.get("hot")
				  , (int)     drink.get("capacity")
				  , (boolean)drink.get("suger")
				  , (boolean)drink.get("milk")
			));
		}
		
		// ジュース系飲料の初期化
		for(HashMap<String, Object> drink : DVMMaster.JUICES){
			products.add(new Juice(
					(String) drink.get("name")
				  , (int)     drink.get("price")
				  , false
				  , (int)     drink.get("capacity")
				  , (String) drink.get("flavor")
				  , (boolean)drink.get("soda")
			));
		}
		
		// お茶系飲料の初期化
		for(HashMap<String, Object> drink : DVMMaster.TEAS){
			products.add(new Tea(
					(String) drink.get("name")
				  , (int)     drink.get("price")
				  , (boolean)drink.get("hot")
				  , (int)     drink.get("capacity")
			));
		}
		
		setProducts(products);
	}
}
