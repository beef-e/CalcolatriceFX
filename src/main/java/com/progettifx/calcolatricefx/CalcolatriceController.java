package com.progettifx.calcolatricefx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class CalcolatriceController {
	@FXML
	private Label displayLabel;
	@FXML
	Button number1;
	@FXML
	Button number2;
	@FXML
	Button number3;
	@FXML
	Button number4;
	@FXML
	Button number5;
	@FXML
	Button number6;
	@FXML
	Button number7;
	@FXML
	Button number8;
	@FXML
	Button number9;
	@FXML
	Button number0;
	private boolean flgSostituisci = true;
	String dispString;
	private double operando1;
	private double operando2;
	private int tipoOp;
	/*
	* 1=addizione
	* 2=sottrazione
	* 3=molti
	* 4=divisione
	* */

	@FXML
	protected void onHelloButtonClick() {
		displayLabel.setText("WLF");
	}

	protected void onNumberClick(String numero){
		if (flgSostituisci) {
			displayLabel.setText(numero);
			flgSostituisci = false;
		} else {
			dispString = displayLabel.getText() + numero;
			displayLabel.setText(dispString);
		}

	}

	@FXML
	protected void onLessClick(){
		dispString=displayLabel.getText();
		int lunghezza=dispString.length()-1;
		dispString=dispString.substring(0, lunghezza);
		if (dispString.isEmpty()){
			displayLabel.setText("0");
		}else {
			displayLabel.setText(dispString);
		}
	}

	@FXML
	protected void onEraseClick(){
		displayLabel.setText("0");
		operando1=0;
		operando2=0;
		tipoOp=0;
	}

	@FXML
	protected void on7click() {
		onNumberClick("7");
	}

	@FXML protected void on8click(){
		onNumberClick("8");
	}

	@FXML protected void on9click(){
		onNumberClick("9");
	}

	@FXML protected void on4click(){
		onNumberClick("4");
	}

	@FXML protected void on5click(){
		onNumberClick("5");
	}

	@FXML protected void on6click(){
		onNumberClick("6");
	}

	@FXML protected void on1click(){
		onNumberClick("1");
	}

	@FXML protected void on2click(){
		onNumberClick("2");
	}

	@FXML protected void on3click(){
		onNumberClick("3");
	}

	@FXML
	protected void onPiuClick(){
		String operando1Stringa =displayLabel.getText();
		if(operando1Stringa.isEmpty()){
			operando1 =Double.parseDouble(operando1Stringa);
			flgSostituisci=true;
			tipoOp=1;
		}else{
			operando1=operando1+Double.parseDouble(operando1Stringa);
			flgSostituisci=true;
			tipoOp=1;
		}


	}

	@FXML
	private void onUgualeClick(){
		String operando2Stringa=displayLabel.getText();
		operando2=Double.parseDouble(operando2Stringa);
		flgSostituisci=true;

		switch (tipoOp){
			case 1:
				String risultato= String.valueOf(operando1+operando2);
				displayLabel.setText(risultato);
				tipoOp=0;
				break;

			case 2:
				risultato= String.valueOf(operando1-operando2);
				displayLabel.setText(risultato);
				tipoOp=0;
				break;

			case 3:
				risultato= String.valueOf(operando1*operando2);
				displayLabel.setText(risultato);
				tipoOp=0;
				break;

			case 4:
				risultato= String.valueOf(operando1/operando2);
				displayLabel.setText(risultato);
				tipoOp=0;
				break;
		}
	}

	@FXML
	protected void onMenoClick(){
		String operando1Stringa =displayLabel.getText();
		if (operando1Stringa.isEmpty()){
			operando1 =Double.parseDouble(operando1Stringa);
			flgSostituisci=true;
			tipoOp=2;
		}else{
			operando1=operando1-Double.parseDouble(operando1Stringa);
			flgSostituisci=true;
			tipoOp=2;
		}


	}

	@FXML
	protected void onPerClick(){
		String operando1Stringa =displayLabel.getText();
		if (operando1Stringa.isEmpty()){
			operando1 =Double.parseDouble(operando1Stringa);
			flgSostituisci=true;
			tipoOp=3;
		}else{
			operando1=operando1*Double.parseDouble(operando1Stringa);
		}
	}

	@FXML
	protected void onDivClick(){
		String operando1Stringa =displayLabel.getText();
		if (operando1Stringa.isEmpty()){
			operando1 =Double.parseDouble(operando1Stringa);
			flgSostituisci=true;
			tipoOp=4;
		}else{
			operando1=operando1/Double.parseDouble(operando1Stringa);
		}

	}

}