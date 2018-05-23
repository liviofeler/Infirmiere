CREATE TABLE infirmiere
(
	id INT,
	idPatientACharge Int,
	nom VARCHAR(38),
	prenom VARCHAR(38),
	PRIMARY KEY (id)
);

CREATE TABLE patient
(
	idPatient INT ,
	nom VARCHAR(38),
    	prenom VARCHAR(38),
	numSecu VARCHAR(15),
	Pathologie VARCHAR(50),
	dateRecenteVisite Date,
	idInfirmiere int,
	PRIMARY KEY (id)
);

CREATE TABLE utilisateur
(
	idUtilisateur int NOT NULL ,
	loginPatient VARCHAR(40),
	passwordPatient VARCHAR(40),
	PRIMARY KEY (idPatient)
);
	
	
