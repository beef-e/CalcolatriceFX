module com.progettifx.calcolatricefx {
	requires javafx.controls;
	requires javafx.fxml;


	opens com.progettifx.calcolatricefx to javafx.fxml;
	exports com.progettifx.calcolatricefx;
}