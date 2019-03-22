import java.awt.EventQueue;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import gui.DVMGui;
import logic.bases.Drink;
import logic.machines.DVMLogic;

/**
 * [飲料]自動販売機Mainクラス
 * 
 * @author	y_nishikawa
 */
public class DVMMain{
	/** [飲料]自動販売機GUI      */
	private DVMGui		win;
	/** [飲料]自動販売機ロジック */
	private DVMLogic		logic;
	
	/** 金額フォーマッター       */
	private NumberFormat	nf;
	
	// ====================================================================================================
	
	/**
	 * main処理
	 * 
	 * @param	args	(String[])引数
	 */
	public static void main(String[] args){
		DVMMain	main = new DVMMain();
		
		main.execute();
	}
	
	/**
	 * [飲料]自動販売機の起動
	 */
	private void execute(){
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				try{
					win   = new DVMGui();
					logic = new DVMLogic();
					
					nf    = NumberFormat.getCurrencyInstance();
					
					/* **************************************************
					 * 初期表示
					 * **************************************************/
					win.lblFare.setText(nf.format(logic.getInsFare()));
					win.txaOutput.setText("");
					
					/* **************************************************
					 * Action付与
					 * **************************************************/
					addActionListener();
					
					/* **************************************************
					 * 画面表示
					 * **************************************************/
					win.setVisible(true);
					
				}catch(Exception e){
					dispErrorMsg(e.getMessage());
				}
			}
		});
	}
	
	/**
	 * ActionListener付与
	 */
	private void addActionListener(){
		/* **************************************************
		 * 飲料ボタン押下イベント生成
		 * **************************************************/
		ActionListener	al = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				try{
					// 押されたボタンに対応した飲料を取得
					Drink	d = (Drink)logic.takeProduct(Integer.parseInt(e.getActionCommand()));
					
					// 飲んだ結果を出力領域に表示
					win.txaOutput.setText(d.drink());
					
					// 入金金額を更新
					win.lblFare.setText(nf.format(logic.getInsFare()));
					
				}catch(NumberFormatException nfe){
					dispErrorMsg(nfe.getMessage());
					
				}catch(IllegalArgumentException iae){
					dispErrorMsg(iae.getMessage());
				}
			}
		};
		
		/* **************************************************
		 * 飲料ボタン押下イベント付与
		 * **************************************************/
		// コーヒー系ボタンへの付与
		for(JButton btn : win.btnCoffies){
			btn.addActionListener(al);
		}
		
		// ジュース系ボタンへの付与
		for(JButton btn : win.btnJuices){
			btn.addActionListener(al);
		}
		
		// お茶系ボタンへの付与
		for(JButton btn : win.btnTeas){
			btn.addActionListener(al);
		}
		
		/* **************************************************
		 * 入金ボタン押下イベント
		 * **************************************************/
		win.btnInsert.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				try{
					// 入力ダイアログより入金金額を入力
					String	inputFare = JOptionPane.showInputDialog("入金金額：");
					
					// 入力された金額を格納
					logic.setInsFare(Integer.parseInt(inputFare));
					
					// 入力金額表示を更新
					win.lblFare.setText(nf.format(Integer.parseInt(inputFare)));
					
				}catch(HeadlessException he){
					dispErrorMsg(he.getMessage());
					
				}catch(NumberFormatException nfe){
					dispErrorMsg(nfe.getMessage());
				}
			}
		});
		
		/* **************************************************
		 * 返金ボタン押下イベント
		 * **************************************************/
		win.btnReturn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				// 返金額を取得
				int	retCharge = logic.retChange();
				
				// 返金額をメッセージ表示
				win.txaOutput.setText(nf.format(retCharge) + "返金されました");
				
				// 入金金額表示を更新
				win.lblFare.setText(nf.format(logic.getInsFare()));
			}
		});
	}
	
	/**
	 * エラーメッセージ表示
	 * 
	 * @param	errMsg	(String)エラーメッセージ
	 */
	private void dispErrorMsg(String	errMsg){
		try{
			JOptionPane.showMessageDialog(win, errMsg);
			
		}catch(HeadlessException e){
			// nop.
		}
	}
}
