package com.infirmiere.epsi;

import java.util.ArrayList;
import java.sql.*;

public class AffichageAccueil {

	public static ArrayList<Object> find(int id){
		
		Connection conn = ConnexionBDD.MySql();
		Statement state = null;
		ResultSet result = null;
		
		String requetePatient = "Select * from patient where idinfpatient = " + id;
		ArrayList<Object> Patients = new ArrayList<Object>();
		
		try {
			state = conn.createStatement();
			result = state.executeQuery(requetePatient);
			while(result.next()) {
				Patients.add(result.getInt("idpatient"));
				Patients.add(result.getString("nompatient"));
				Patients.add(result.getString("prenompatient"));
				Patients.add(result.getString("inseepatient"));
				Patients.add(result.getString("pathopatient"));
				Patients.add(result.getString("datepatient"));
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}

		int test = Patients.size();
		
		return Patients;
		
	}
	
	public static int nbPatient(int id) {
		
		Connection conn = ConnexionBDD.MySql();
		Statement state = null;
		ResultSet result = null;
		String requeteCount = "select count(*) as count from patient where idinfpatient =" + id;
		int compteur = 0;
		
		try {
			state = conn.createStatement();
			result = state.executeQuery(requeteCount);
			while(result.next()) {
				compteur = result.getInt("count");
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
		return compteur;
		
	}
}
