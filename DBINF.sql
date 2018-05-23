CREATE TABLE infirmiere
(
	id INT PRIMARY KEY AUTO_INCREMENT,
	idPatientACharge Int,
	nom VARCHAR(38),
	prenom VARCHAR(38)
	
);

CREATE TABLE patient
(
	id INT PRIMARY KEY AUTO_INCREMENT ,
	nom VARCHAR(38),
    	prenom VARCHAR(38),
	numSecu VARCHAR(15),
	Pathologie VARCHAR(50),
	dateRecenteVisite Date,
	idInfirmiere INT
	
);

CREATE TABLE utilisateur
(
	id INT PRIMARY KEY AUTO_INCREMENT,
	loginPatient VARCHAR(40),
	passwordPatient VARCHAR(40),
	PRIMARY KEY (idPatient)
);
	
	
