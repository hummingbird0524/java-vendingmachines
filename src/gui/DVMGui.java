package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EtchedBorder;

import master.DVMMaster;

/**
 * 飲料自動販売機フレームクラス
 * 
 * @author	y_nishikawa
 */
public class DVMGui extends JFrame{
	/* **************************************************
	 * 飲料パネル系フィールド
	 * **************************************************/
	/** 飲料パネル             */
	public JPanel		pnlDrink;
	/** コーヒー系パネル       */
	public JPanel		pnlCoffie;
	/** ジュース系パネル       */
	public JPanel		pnlJuice;
	/** お茶系パネル           */
	public JPanel		pnlTea;
	
	/** コーヒー系ボタン       */
	public JButton[]	btnCoffies;
	/** ジュース系ボタン       */
	public JButton[]	btnJuices;
	/** お茶系ボタン           */
	public JButton[]	btnTeas;
	
	/** ボタン幅               */
	private final int	BUTTON_WIDTH  = 100;
	/** ボタン高さ             */
	private final int	BUTTON_HEIGHT = 50;
	
	/* **************************************************
	 * 入出金パネル系フィールド
	 * **************************************************/
	/** 入出金パネル           */
	public JPanel		pnlMoney;
	
	/** 入金金額ラベル         */
	public JLabel		lblFare;
	/** 入金ボタン             */
	public JButton	btnInsert;
	/** 返金ボタン             */
	public JButton	btnReturn;
	
	/* **************************************************
	 * 結果表示パネル系フィールド
	 * **************************************************/
	/** 結果表示パネル         */
	public JPanel		pnlOutput;
	
	/** 結果表示テキストエリア */
	public JTextArea	txaOutput;
	
	// ====================================================================================================
	
	/**
	 * コンストラクター
	 */
	public DVMGui(){
		/* **************************************************
		 * フレーム関連設定
		 * **************************************************/
		setTitle(DVMMaster.APP_NAME);														// タイトル指定
		setBounds(100, 100, 640, 400);														// サイズ・位置指定
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);									// 閉じるボタン処理
		setResizable(false);																// サイズ変更不可
		getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));	// レイアウト指定
		
		/* **************************************************
		 * 各パネル生成
		 * **************************************************/
		createDrinkPanel();
		createMoneyPanel();
		createOutputPanel();
		
		/* **************************************************
		 * 各パネル配置
		 * **************************************************/
		getContentPane().add(pnlDrink);
		getContentPane().add(pnlMoney);
		getContentPane().add(pnlOutput);
	}
	
	/**
	 * 飲料パネル生成
	 */
	public void createDrinkPanel(){
		pnlDrink  = new JPanel();
		
		/* **************************************************
		 * レイアウト設定
		 * **************************************************/
		pnlDrink.setLayout(new GridLayout(3, 1));
		
		/* **************************************************
		 * コーヒーパネル／ボタン生成
		 * **************************************************/
		pnlCoffie = new JPanel();
		pnlCoffie.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		btnCoffies = new JButton[DVMMaster.COFFEES.size()];
		
		for(int i=0; i<btnCoffies.length; i++){
			btnCoffies[i] = new JButton();
			
			btnCoffies[i].setActionCommand((String)DVMMaster.COFFEES.get(i).get("code"));
			btnCoffies[i].setText("<html>" + DVMMaster.COFFEES.get(i).get("name") + "<br>\\" + DVMMaster.COFFEES.get(i).get("price") + "</html>");
			btnCoffies[i].setPreferredSize(new Dimension(BUTTON_WIDTH, BUTTON_HEIGHT));	// サイズ指定
			btnCoffies[i].setFont(new Font("メイリオ", Font.PLAIN, 12));				// フォント指定
			btnCoffies[i].setMargin(new Insets(0, 0, 0, 0));							// マージン指定
			
			pnlCoffie.add(btnCoffies[i]);
		}
		
		/* **************************************************
		 * ジュースパネル／ボタン生成
		 * **************************************************/
		pnlJuice = new JPanel();
		pnlJuice.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		btnJuices  = new JButton[DVMMaster.JUICES.size()];
		
		for(int i=0; i<btnJuices.length; i++){
			btnJuices[i] = new JButton();
			
			btnJuices[i].setActionCommand((String)DVMMaster.JUICES.get(i).get("code"));
			btnJuices[i].setText("<html>" + DVMMaster.JUICES.get(i).get("name") + "<br>\\" + DVMMaster.JUICES.get(i).get("price") + "</html>");
			btnJuices[i].setPreferredSize(new Dimension(BUTTON_WIDTH, BUTTON_HEIGHT));	// サイズ指定
			btnJuices[i].setFont(new Font("メイリオ", Font.PLAIN, 12));				// フォント指定
			btnJuices[i].setMargin(new Insets(0, 0, 0, 0));								// マージン指定
			
			pnlJuice.add(btnJuices[i]);
		}
		
		/* **************************************************
		 * お茶パネル／ボタン生成
		 * **************************************************/
		pnlTea = new JPanel();
		pnlTea.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		btnTeas    = new JButton[DVMMaster.TEAS.size()];
		
		for(int i=0; i<btnTeas.length; i++){
			btnTeas[i] = new JButton();
			
			btnTeas[i].setActionCommand((String)DVMMaster.TEAS.get(i).get("code"));
			btnTeas[i].setText("<html>" + DVMMaster.TEAS.get(i).get("name") + "<br>\\" + DVMMaster.TEAS.get(i).get("price") + "</html>");
			btnTeas[i].setPreferredSize(new Dimension(BUTTON_WIDTH, BUTTON_HEIGHT));	// サイズ指定
			btnTeas[i].setFont(new Font("メイリオ", Font.PLAIN, 12));					// フォント指定
			btnTeas[i].setMargin(new Insets(0, 0, 0, 0));								// マージン指定
			
			pnlTea.add(btnTeas[i]);
		}
		
		/* **************************************************
		 * 各パネル配置
		 * **************************************************/
		pnlDrink.add(pnlCoffie);
		pnlDrink.add(pnlJuice);
		pnlDrink.add(pnlTea);
	}
	
	/**
	 * 入出金パネル生成
	 */
	public void createMoneyPanel(){
		pnlMoney = new JPanel();
		
		/* **************************************************
		 * レイアウト設定
		 * **************************************************/
		pnlMoney.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		/* **************************************************
		 * 入出金関連部品生成
		 * **************************************************/
		// 入金金額ラベル
		lblFare = new JLabel("");
		lblFare.setPreferredSize(new Dimension(150, 30));				// サイズ指定
		lblFare.setFont(new Font("メイリオ", Font.PLAIN, 18));			// フォント指定
		lblFare.setHorizontalAlignment(JLabel.CENTER);					// 水平位置指定
		lblFare.setOpaque(true);										// 不透明化
		lblFare.setBackground(Color.BLACK);								// 背景色設定
		lblFare.setForeground(Color.WHITE);								// 前景色設定
		
		// 入金ボタン
		btnInsert = new JButton("入金");
		btnInsert.setPreferredSize(new Dimension(100, 30));				// サイズ指定
		btnInsert.setFont(new Font("メイリオ", Font.PLAIN, 18));		// フォント指定
		btnInsert.setBackground(Color.CYAN);							// 背景色設定
		
		// 返金ボタン
		btnReturn = new JButton("返金");
		btnReturn.setPreferredSize(new Dimension(100, 30));				// サイズ指定
		btnReturn.setFont(new Font("メイリオ", Font.PLAIN, 18));		// フォント指定
		btnReturn.setBackground(Color.YELLOW);							// 背景色設定
		
		/* **************************************************
		 * 各部品配置
		 * **************************************************/
		pnlMoney.add(lblFare);
		pnlMoney.add(btnInsert);
		pnlMoney.add(btnReturn);
	}
	
	/**
	 * 結果表示パネル生成
	 */
	public void createOutputPanel(){
		pnlOutput = new JPanel();
		
		/* **************************************************
		 * レイアウト設定
		 * **************************************************/
		pnlOutput.setLayout(new FlowLayout());
		
		/* **************************************************
		 * テキストエリア生成
		 * **************************************************/
		txaOutput = new JTextArea("");
		txaOutput.setPreferredSize(new Dimension(600, 75));				// サイズ指定
		txaOutput.setBorder(new EtchedBorder(EtchedBorder.RAISED));	// 枠線指定
		txaOutput.setEditable(false);									// 編集不可
		
		/* **************************************************
		 * テキストエリア配置
		 * **************************************************/
		pnlOutput.add(txaOutput);
	}
}
