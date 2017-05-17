package it.polito.tdp.dizionario.controller;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import it.polito.tdp.dizionario.model.Model;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class DizionarioController {
	
	private Model model;

	@FXML
	private ResourceBundle resources;
	@FXML
	private URL location;
	@FXML
	private TextArea txtResult;
	@FXML
	private TextField inputNumeroLettere;
	@FXML
	private TextField inputParola;
	@FXML
	private Button btnGeneraGrafo;
	@FXML
	private Button btnTrovaVicini;
	@FXML
	private Button btnTrovaGradoMax;


	@FXML
	void doReset(ActionEvent event) {
		txtResult.setText("Reset!");
	}

	@FXML
	void doGeneraGrafo(ActionEvent event) {
		try {

				int numeroLettere = Integer.parseInt(inputNumeroLettere.getText());
				inputNumeroLettere.setEditable(false);
				List<String> parole = model.createGraph(numeroLettere);
				if (parole != null) {
					txtResult.setText("Trovate " + parole.size() + " parole di lunghezza " + numeroLettere);
				} else {	
					txtResult.setText("Trovate 0 parole di lunghezza: " + numeroLettere);
				}



				btnGeneraGrafo.setDisable(true);



			} catch (NumberFormatException nfe) {
				txtResult.setText("Inserire un numero corretto di lettere!");
			
			} catch (RuntimeException re) {
			txtResult.setText(re.getMessage());
		}
	}

	@FXML
	void doTrovaGradoMax(ActionEvent event) {
		
		try {
			txtResult.setText("Controller -- TODO!");

		} catch (RuntimeException re) {
			txtResult.setText(re.getMessage());
		}
	}

	@FXML
	void doTrovaVicini(ActionEvent event) {
		
		try {
			txtResult.setText("Controller -- TODO!");

		} catch (RuntimeException re) {
			txtResult.setText(re.getMessage());
		}
	}

	@FXML
	void initialize() {
		assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Dizionario.fxml'.";
		assert inputNumeroLettere != null : "fx:id=\"inputNumeroLettere\" was not injected: check your FXML file 'Dizionario.fxml'.";
		assert inputParola != null : "fx:id=\"inputParola\" was not injected: check your FXML file 'Dizionario.fxml'.";
		assert btnGeneraGrafo != null : "fx:id=\"btnGeneraGrafo\" was not injected: check your FXML file 'Dizionario.fxml'.";
		assert btnTrovaVicini != null : "fx:id=\"btnTrovaVicini\" was not injected: check your FXML file 'Dizionario.fxml'.";
		assert btnTrovaGradoMax != null : "fx:id=\"btnTrovaTutti\" was not injected: check your FXML file 'Dizionario.fxml'.";
	}

	public void setModel(Model model) {
		this.model=model;
		// TODO Auto-generated method stub
		
	}
}