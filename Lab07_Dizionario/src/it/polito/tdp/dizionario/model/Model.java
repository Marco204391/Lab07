package it.polito.tdp.dizionario.model;

import java.util.ArrayList;
import java.util.List;

import org.jgrapht.UndirectedGraph;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.DirectedWeightedMultigraph;
import org.jgrapht.graph.SimpleGraph;

import it.polito.tdp.dizionario.db.WordDAO;

public class Model {
	
	WordDAO dao = new WordDAO();
	
	public List<String> createGraph(int numeroLettere) {

		UndirectedGraph<String, DefaultWeightedEdge> grafo = new SimpleGraph<String, DefaultWeightedEdge>(DefaultWeightedEdge.class);
		List<String> parole = dao.getAllWordsFixedLength(numeroLettere);
		
		for(String n :parole){
			grafo.addVertex(n);
		}
		for(String n :parole){
		List<String> paroleSimili = dao.getAllSimilarWords(n, numeroLettere);

		for (String parolaSimile : paroleSimili) {

			grafo.addEdge(n, parolaSimile);

				}
			}
		System.out.println(grafo);
		return parole;
	}

	public List<String> displayNeighbours(String parolaInserita) {

		System.out.println("Model -- TODO");
		return new ArrayList<String>();
	}

	public String findMaxDegree() {
		System.out.println("Model -- TODO");
		return "";
	}
}
