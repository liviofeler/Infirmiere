CREATE TABLE infirmiere
(
	id INT PRIMARY KEY AUTO_INCREMENT,
	idPatientACharge Int,
	idUtilisateur Int,
	nom VARCHAR(38),
	prenom VARCHAR(38),
	FOREIGN KEY (idPatientACharge) REFERENCES patient(id),
	FOREIGN KEY (idUtilisateur) REFERENCES utilisateur(id)
);

CREATE TABLE patient
(
	id INT PRIMARY KEY AUTO_INCREMENT ,
	idUtilisateur INT,
	nom VARCHAR(38),
    	prenom VARCHAR(38),
	numSecu VARCHAR(15),
	Pathologie VARCHAR(50),
	dateRecenteVisite Date,
	idInfirmiere INT,
	FOREIGN KEY (idInfirmiere) REFERENCES infirmiere(id),
	FOREIGN KEY (idUtilisateur) REFERENCES utilisateur(id)
);

CREATE TABLE utilisateur
(
	id INT PRIMARY KEY AUTO_INCREMENT,
	login VARCHAR(40),
	password VARCHAR(40)
);
	
	
