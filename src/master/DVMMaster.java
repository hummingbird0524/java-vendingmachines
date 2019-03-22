package master;

import java.util.ArrayList;
import java.util.HashMap;

public class DVMMaster{
	/** アプリケーション名 */
	public static final String	APP_NAME = "[飲料]自動販売機";
	
	/** コーヒー系飲料     */
	public static final ArrayList<HashMap<String, Object>>	COFFEES;
	/** ジュース系飲料     */
	public static final ArrayList<HashMap<String, Object>>	JUICES;
	/** お茶系飲料         */
	public static final ArrayList<HashMap<String, Object>>	TEAS;
	
	/**
	 * Staticイニシャライザー
	 */
	static{
		HashMap<String, Object>	drink;
		
		/* **************************************************
		 * コーヒー初期化
		 * **************************************************/
		COFFEES = new ArrayList<>();
		
		drink = new HashMap<>();
		drink.put("code"    , "01");
		drink.put("name"    , "ﾌﾞﾗｯｸ(HOT)");
		drink.put("price"   , 120);
		drink.put("hot"     , true);
		drink.put("capacity", 180);
		drink.put("suger"   , false);
		drink.put("milk"    , false);
		COFFEES.add(drink);
		
		drink = new HashMap<>();
		drink.put("code"    , "02");
		drink.put("name"    , "ﾌﾞﾗｯｸ(ICE)");
		drink.put("price"   , 120);
		drink.put("hot"     , false);
		drink.put("capacity", 180);
		drink.put("suger"   , false);
		drink.put("milk"    , false);
		COFFEES.add(drink);
		
		drink = new HashMap<>();
		drink.put("code"    , "03");
		drink.put("name"    , "ｺｰﾋｰ(HOT)");
		drink.put("price"   , 130);
		drink.put("hot"     , false);
		drink.put("capacity", 180);
		drink.put("suger"   , true);
		drink.put("milk"    , true);
		COFFEES.add(drink);
		
		drink = new HashMap<>();
		drink.put("code"    , "04");
		drink.put("name"    , "ｺｰﾋｰ(ICE)");
		drink.put("price"   , 130);
		drink.put("hot"     , true);
		drink.put("capacity", 180);
		drink.put("suger"   , true);
		drink.put("milk"    , true);
		COFFEES.add(drink);
		
		/* **************************************************
		 * ジュース初期化
		 * **************************************************/
		JUICES = new ArrayList<>();
		
		drink = new HashMap<>();
		drink.put("code"    , "05");
		drink.put("name"    , "ﾘﾝｺﾞ(炭酸)");
		drink.put("price"   , 130);
		drink.put("capacity", 250);
		drink.put("flavor"  , "リンゴ");
		drink.put("soda"    , true);
		JUICES.add(drink);
		
		drink = new HashMap<>();
		drink.put("code"    , "06");
		drink.put("name"    , "ﾘﾝｺﾞ");
		drink.put("price"   , 130);
		drink.put("capacity", 250);
		drink.put("flavor"  , "リンゴ");
		drink.put("soda"    , false);
		JUICES.add(drink);
		
		drink = new HashMap<>();
		drink.put("code"    , "07");
		drink.put("name"    , "ｵﾚﾝｼﾞ(炭酸)");
		drink.put("price"   , 130);
		drink.put("capacity", 250);
		drink.put("flavor"  , "オレンジ");
		drink.put("soda"    , true);
		JUICES.add(drink);
		
		drink = new HashMap<>();
		drink.put("code"    , "08");
		drink.put("name"    , "ｵﾚﾝｼﾞ");
		drink.put("price"   , 130);
		drink.put("capacity", 250);
		drink.put("flavor"  , "オレンジ");
		drink.put("soda"    , false);
		JUICES.add(drink);
		
		drink = new HashMap<>();
		drink.put("code"    , "09");
		drink.put("name"    , "ｸﾞﾚｰﾌﾟ(炭酸)");
		drink.put("price"   , 130);
		drink.put("capacity", 250);
		drink.put("flavor"  , "グレープ");
		drink.put("soda"    , true);
		JUICES.add(drink);
		
		drink = new HashMap<>();
		drink.put("code"    , "10");
		drink.put("name"    , "ｸﾞﾚｰﾌﾟ");
		drink.put("price"   , 130);
		drink.put("capacity", 250);
		drink.put("flavor"  , "グレープ");
		drink.put("soda"    , false);
		JUICES.add(drink);
		
		/* **************************************************
		 * お茶初期化
		 * **************************************************/
		TEAS = new ArrayList<>();
		
		drink = new HashMap<>();
		drink.put("code"    , "11");
		drink.put("name"    , "緑茶(HOT)");
		drink.put("hot"     , true);
		drink.put("price"   , 110);
		drink.put("capacity", 300);
		TEAS.add(drink);
		
		drink = new HashMap<>();
		drink.put("code"    , "12");
		drink.put("name"    , "緑茶(ICE)");
		drink.put("hot"     , false);
		drink.put("price"   , 110);
		drink.put("capacity", 300);
		TEAS.add(drink);
		
		drink = new HashMap<>();
		drink.put("code"    , "13");
		drink.put("name"    , "ｳｰﾛﾝ茶(HOT)");
		drink.put("hot"     , true);
		drink.put("price"   , 120);
		drink.put("capacity", 300);
		TEAS.add(drink);
		
		drink = new HashMap<>();
		drink.put("code"    , "14");
		drink.put("name"    , "ｳｰﾛﾝ茶(ICE)");
		drink.put("hot"     , false);
		drink.put("price"   , 120);
		drink.put("capacity", 300);
		TEAS.add(drink);
		
		drink = new HashMap<>();
		drink.put("code"    , "15");
		drink.put("name"    , "紅茶(HOT)");
		drink.put("hot"     , true);
		drink.put("price"   , 130);
		drink.put("capacity", 300);
		TEAS.add(drink);
		
		drink = new HashMap<>();
		drink.put("code"    , "16");
		drink.put("name"    , "紅茶(ICE)");
		drink.put("hot"     , false);
		drink.put("price"   , 130);
		drink.put("capacity", 300);
		TEAS.add(drink);
	}
}
