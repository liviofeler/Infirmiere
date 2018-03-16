package com.infirmiere.beans;

import java.sql.*;

import com.infirmiere.epsi.ConnexionBDD;

public class GestionPatient {
	
	public static void AjoutPatient() {
		
	}

	public static void ModifPatient(String id, String nom, String prenom, String insee, String patho, String date) {
		
		Connection conn = ConnexionBDD.MySql();
		String requeteModif = "UPDATE PATIENT SET NOMPATIENT = '" + nom + "', PRENOMPATIENT ='" + prenom + "', INSEEPATIENT = '" + insee +"', PATHOPATIENT ='" + patho + "', DATEPATIENT ='" + date + "' WHERE IDPATIENT =" + id;
		
		try {
			Statement state = conn.createStatement();
			state.executeUpdate(requeteModif);
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	public static void SupprPatient(String id) {
		Connection conn = ConnexionBDD.MySql();
		String requeteModif = "UPDATE PATIENT SET ACTIFPATIENT = 0 WHERE IDPATIENT =" + id;
		
		try {
			Statement state = conn.createStatement();
			state.executeUpdate(requeteModif);
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
}
