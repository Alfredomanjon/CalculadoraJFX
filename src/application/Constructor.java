package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Constructor implements Initializable {

	@FXML
	private Button sumar;
	@FXML
	private Button restar;
	@FXML
	private Button multi;
	@FXML
	private TextField num1;
	@FXML
	private TextField num2;
	@FXML
	private TextField result;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}

	public void suma(ActionEvent event) {
		int x1 = Integer.parseInt(num1.getText());
		int x2 = Integer.parseInt(num2.getText());

		int resulta = x1 + x2;

		result.setText(Integer.toString(resulta));

	}

	public void resta(ActionEvent event) {
		int x1 = Integer.parseInt(num1.getText());
		int x2 = Integer.parseInt(num2.getText());

		int resulta = x1 - x2;

		result.setText(Integer.toString(resulta));

	}

	public void multiplicacion(ActionEvent event) {
		int x1 = Integer.parseInt(num1.getText());
		int x2 = Integer.parseInt(num2.getText());

		int resulta = x1 * x2;

		result.setText(Integer.toString(resulta));

	}

}
