package logic.products;

import logic.bases.Drink;

/**
 * ジュースClass
 * 
 * @author	y_nishikawa
 */
public class Juice extends Drink{
	/** 味       */
	private String	flavor;
	/** 炭酸有無 */
	private boolean	isSoda;
	
	// ====================================================================================================
	
	/**
	 * コンストラクター
	 * 
	 * @param	name		(String)名称
	 * @param	price		(int)価格
	 * @param	isHot		(boolean)True: HOT/ Flase: ICE
	 * @param	capacity	(int)内容量
	 * @param	flavor		(String)味
	 * @param	isSoda		(boolean)炭酸有無
	 */
	public Juice(String name, int price, boolean isHot, int capacity, String flavor, boolean isSoda){
		super(name, price, isHot, capacity);
		
		setFlavor(flavor);
		setSoda(isSoda);
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
		msg += "<<< " + getFlavor() + "の味が口の中に広がる！ >>>";
		
		if(isSoda){
			msg += "\n";
			msg += "<<< 気分爽快になった！ >>>";
		}
		
		return	msg;
	}
	
	/**
	 * 味を取得する
	 * 
	 * @return	(String)味
	 */
	public String getFlavor(){
		return	flavor;
	}
	
	/**
	 * 味を設定する
	 * 
	 * @param	flavor	(String)味
	 */
	public void setFlavor(String flavor){
		this.flavor = flavor;
	}
	
	/**
	 * 炭酸有無を取得する
	 * 
	 * @return	(boolean)True: あり/ Flase: なし
	 */
	public boolean isSoda(){
		return	isSoda;
	}
	
	/**
	 * 炭酸有無を設定する
	 * 
	 * @param	isSoda	(boolean)True: あり/ Flase: なし
	 */
	public void setSoda(boolean isSoda){
		this.isSoda = isSoda;
	}
}
