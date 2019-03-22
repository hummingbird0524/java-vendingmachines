package logic.bases;

/**
 * 飲料Class
 * 
 * @author	y_nishikawa
 */
public class Drink extends Product{
	/** HOT or ICE */
	private boolean	isHot = false;
	/** 内容量     */
	private int		capacity;
	
	// ====================================================================================================
	
	/**
	 * 飲料コンストラクター
	 * 
	 * @param	name		(String)名称
	 * @param	price		(int)価格
	 * @param	isHot		(boolean)True: Hot/ Falce: ICE
	 * @param	capacity	(int)内容量
	 */
	public Drink(String name, int price, boolean isHot, int capacity){
		super(name, price);
		
		setHot(isHot);
		setCapacity(capacity);
	}
	
	/**
	 * 飲む
	 * 
	 * @return	(String)	メッセージ
	 */
	public String drink(){
		String	msg = "";
		
		msg += getName() + "を飲んだ！";
		
		if(isHot()){
			msg += "\n";
			msg += "<<< 身体が温まった！ >>>";
		}
		
		return	msg;
	}
	
	/**
	 * HOT or ICEを取得する。
	 * 
	 * @return		(boolean)True: Hot/ Falce: ICE
	 */
	public boolean isHot(){
		return	isHot;
	}
	
	/**
	 * HOT or ICEを設定する。
	 * 
	 * @param	isHot	(boolean)True: Hot/ Falce: ICE
	 */
	public void setHot(boolean isHot){
		this.isHot = isHot;
	}
	
	/**
	 * 内容量を取得する。
	 * 
	 * @return		(int)内容量
	 */
	public int getCapacity(){
		return	capacity;
	}
	
	/**
	 * 内容量を設定する。
	 * 
	 * @param	capacity	(int)内容量
	 */
	public void setCapacity(int capacity){
		if(capacity < 0){
			capacity = 0;
		}
		
		this.capacity = capacity;
	}
}
