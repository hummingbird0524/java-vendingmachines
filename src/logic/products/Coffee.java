package logic.products;

import logic.bases.Drink;

/**
 * コーヒーClass
 * 
 * @author	y_nishikawa
 */
public class Coffee extends Drink{
	/** 砂糖有無   */
	private boolean	isSuger = false;
	/** ミルク有無 */
	private boolean	isMilk  = false;
	
	// ====================================================================================================
	
	/**
	 * コンストラクター
	 * 
	 * @param	name		(String)名称
	 * @param	price		(int)価格
	 * @param	isHot		(boolean)True: HOT/ Flase: ICE
	 * @param	capacity	(int)内容量
	 * @param	isSuger		(boolean)True: あり/ Flase: なし
	 * @param	isMilk		(boolean)True: あり/ Flase: なし
	 */
	public Coffee(String name, int price, boolean isHot, int capacity, boolean isSuger, boolean isMilk){
		super(name, price, isHot, capacity);
		
		setSuger(isSuger);
		setMilk(isMilk);
	}
	
	/*
	 * (非 Javadoc)
	 * @see	logic.bases.Drink#drink()
	 */
	@Override
	public String drink(){
		String	msg = "";
		
		msg += super.drink();
		
		if(!(isSuger() || isMilk())){
			// ブラックコーヒーの場合
			msg += "\n";
			msg += "<<< 意識が冴えわたった！ >>>";
		}
		
		return	msg;
	}
	
	/**
	 * 砂糖有無を取得する
	 * 
	 * @return	(boolean)True: あり/ Flase: なし
	 */
	public boolean isSuger(){
		return	isSuger;
	}
	
	/**
	 * 砂糖有無を設定する
	 * 
	 * @param	isSuger	(boolean)True: あり/ Flase: なし
	 */
	public void setSuger(boolean isSuger){
		this.isSuger = isSuger;
	}
	
	/**
	 * ミルク有無を取得する
	 * 
	 * @return	(boolean)True: あり/ Flase: なし
	 */
	public boolean isMilk(){
		return	isMilk;
	}
	
	/**
	 * ミルク有無を設定する
	 * 
	 * @param	isMilk	(boolean)True: あり/ Flase: なし
	 */
	public void setMilk(boolean isMilk){
		this.isMilk = isMilk;
	}
}
