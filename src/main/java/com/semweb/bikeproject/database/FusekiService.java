package com.semweb.bikeproject.database;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;
import org.springframework.stereotype.Component;

import com.semweb.bikeproject.model.Station;

@Component
public class FusekiService {

	
	public List<Station> getStationsByCity(){
		
		List<Station> cityStations = new ArrayList<>();
		
		String id = UUID.randomUUID().toString();
        System.out.println(String.format("Adding %s", id));
        QueryExecution qe = QueryExecutionFactory.sparqlService(
                "http://localhost:3030/bike_dataset/sparql",
                
                //STATION DETAILS
                "PREFIX location: <http://www.w3.org/1999/02/22-rdf-syntax-ns#type>\n" + 
                "PREFIX station: <http://www.w3.org/2000/01/rdf-schema#Stations>\n" + 
                "PREFIX station_id: <http://www.w3.org/2000/01/rdf-schema#station_id>\n" + 
                "PREFIX name: <http://www.w3.org/2000/01/rdf-schema#name>\n" + 
                "PREFIX lat: <http://www.opengis.net/ont/geosparql#lat>\n" + 
                "PREFIX lon: <http://www.opengis.net/ont/geosparql#lon>\n" + 
                "PREFIX capacity: <http://www.w3.org/2000/01/rdf-schema#capacity>\n" + 
                "PREFIX num_available_bikes: <http://www.w3.org/2000/01/rdf-schema#nb_velos_dispos>\n" +
                
                //STATION LOCATIONS
                "PREFIX station_lyon: <http://www.w3.org/2000/01/rdf-schema#stations_lyon>\n" + 
                "PREFIX station_stetienne: <http://www.w3.org/2000/01/rdf-schema#stations_st_etienne>\n" + 
                "PREFIX station_paris: <http://www.w3.org/2000/01/rdf-schema#stations_paris>\n" + 
                "PREFIX station_strasbourg: <http://www.w3.org/2000/01/rdf-schema#stations_strasbourg>\n" + 
                "PREFIX station_montpellier: <http://www.w3.org/2000/01/rdf-schema#stations_montpellier>\n" + 
                "PREFIX station_rennes: <http://www.w3.org/2000/01/rdf-schema#stations_rennes>\n" +
                
                //SPARQL QUERY
                "SELECT ?name ?cap ?available_bikes ?lat ?lon\n" + 
                "WHERE {\n" + 	                 
                "?subject name: ?name .\n" + 
                "?subject capacity: ?cap .\n" + 
                "?subject num_available_bikes: ?available_bikes .\n" + 
                "?subject lat: ?lat .\n" + 
                "?subject lon: ?lon\n" + 
                "}");
        ResultSet results = qe.execSelect();

        while(results.hasNext()) {
        	QuerySolution binding = results.nextSolution();    
        	
        	Station stat = new Station(
        			binding.get("?name").toString(),
        			binding.get("?cap").toString(),
        			binding.get("?available_bikes").toString(),
        			binding.get("?lat").toString().substring(0, 6),
        			binding.get("?lon").toString().substring(0, 6));
        	      	
        	cityStations.add(stat);
        }
        qe.close();
		
		return cityStations;
	}
}