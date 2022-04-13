-- A refaire tourner

CREATE TABLE employes (
	code_emp 		int				PRIMARY KEY,
    nom 			varchar(20)		not null,
    prenom 			varchar(50)		null,
    date_naissance 	date			not null,
    date_embauche 	datetime		DEFAULT CURRENT_TIMESTAMP,
    salaire 		decimal(8,2)	DEFAULT 0,
    code_service 	char(5)			not null,
    code_chef 		int				null
);

CREATE TABLE services (
	code_service 	char(5)			PRIMARY KEY,
    libelle 		varchar(30)		not null
);

CREATE TABLE conges (
	code_emp 		int				not null,
    annee 			int(4)			not null,
    nb_jours_acquis int(2)			DEFAULT 30,
    CONSTRAINT PK_conges PRIMARY KEY(code_emp, annee)
);

/*CONSTRAINT PK_conges PRIMARY KEY(code_emp, annee) permet de créer une clé primaire
à partir de 2 variables */

CREATE TABLE conges_mens (
	code_emp 		int			not null,
    annee 			int(4)		not null,
    mois 			int(2)		not null,
    nb_jours_pris 	int(2)		DEFAULT 0,
    CONSTRAINT PK_conges_mens PRIMARY KEY(code_emp, annee, mois),
    CHECK(mois > 0 AND mois < 12)
);


/*On va supprimer les contraintes existantes pour pouvoir réexecuter
les scripts*/



/*Suppression des contraintes d'intégrité (=lien entre TABLE)*/
/*Pour supprimer les CONSTRAINT, il faut supprimer les foreign key;*/
/*Je supprime les contraintes avant de les réexécuter*/
ALTER TABLE employes DROP FOREIGN KEY FK_Employes_Service;
ALTER TABLE employes DROP FOREIGN KEY FK_Employes_CodeChef;
ALTER TABLE conges DROP FOREIGN KEY FK_Conges_Employes;
ALTER TABLE conges_mens DROP FOREIGN KEY FK_Conges_mens;

/*Commentaire, ne marche pas toujours (utiliser de préférence "-- " espace à la fin*/
-- En supprimant les relations avant de supprimer les TABLES on n'est pas obligé
-- de les supprimer dans un ordre données par les FOREIGN KEY

-- Suppression des TABLES
DROP TABLE employes; -- ajouter if exist
DROP TABLE conges;  -- ajouter if exist
DROP TABLE conges_mens;  -- ajouter if exist
DROP TABLE services;  -- ajouter if exist

/* Contraintes d'intégrité référentielle entre les tables Conges et Employes, 
ainsi qu'entre les tables Conges_Mens et Conges
on ajoute une contrainte à la table employes:
le code_service de la table services fera le lien entre les 2 tables
Modification de TABLE
Création des relations entre les tables
*/

ALTER TABLE employes ADD
	CONSTRAINT FK_Employes_Service FOREIGN KEY (code_service)
	REFERENCES services(code_service);

ALTER TABLE employes ADD
	CONSTRAINT FK_Employes_CodeChef FOREIGN KEY (code_chef)
	REFERENCES employes(code_emp);

ALTER TABLE conges ADD
	CONSTRAINT FK_Conges_Employes FOREIGN KEY (code_emp)
	REFERENCES employes(code_emp);

ALTER TABLE conges_mens ADD
	CONSTRAINT FK_Conges_mens FOREIGN KEY (code_emp,annee)
	REFERENCES conges(code_emp,annee);










