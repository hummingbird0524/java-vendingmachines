package logic.products;

import logic.bases.Drink;

/**
 * お茶Class
 * 
 * @author	y_nishikawa
 */
public class Tea extends Drink{
	/**
	 * コンストラクター
	 * 
	 * @param	name		(String)名称
	 * @param	price		(int)価格
	 * @param	isHot		(boolean)True: HOT/ Flase: ICE
	 * @param	capacity	(int)内容量
	 */
	public Tea(String name, int price, boolean isHot, int capacity){
		super(name, price, isHot, capacity);
	}
	
	/*
	 * (非 Javadoc)
	 * @see	logic.bases.Drink#drink()
	 */
	@Override
	public String drink(){
		String	msg = "";
		
		msg += super.drink();
		
		msg += "\n";
		msg += "<<< 気分が落ち着いた！ >>>";
		
		return	msg;
	}
}
