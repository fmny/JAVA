/* TP module_6 */

-- Ajouter toutes les colonnes pour indiquer qu'on insère pas ligne par ligne (fait)
-- mais bien ligne /ligne en respectant les noms de colonnes (a faire)
-- si l'ordre des colonnes changent, ça marchera
-- Les clés étrangères FOREIGN KEY nous indique l'ordre dans lequel on va insérer
-- les données en base

-- INSERT [INTO] table_name VALUES (val, …)

/*insertion client 14:

14 Boutaud Sabine Rue des platanes 75002 Paris
INSERT INTO clients(14,Boutaud,Sabine,Rue des platanes,75002,Paris);

Table fiches:
1001 14 DDJ –15* DDJ – 13 SO

Table lignes_fic
1001 1 F05 DDJ – 15 DDJ – 13
1001 2 F50 DDJ – 15 DDJ – 14
1001 3 F60 DDJ – 13 DDJ – 13**

Table articles
F05 Fischer Cruiser EG FOA
F50 Fischer SOSSkating VASA HG FOP
F60 Fischer RCS CARBOLITE Skating PR FOP

Table grille tarif
EG FOA T1
EG FOA T1
PR FOP T6

Table gammes
PR Matériel Professionnel
HG Haut de gamme
EG Entrée de gamme

Table categories
FOA Ski de fond alternatif
FOP Ski de fond patineur

table tarifs
T1 Base 10
T4 Argent 30
T6 Platine 90
*/

-- tout faire en spécifiant les colonnes
INSERT INTO clients(noCli,nom,prenom,adresse,cpo,ville) VALUES (14,'Boutaud','Sabine','Rue des platanes','75002','Paris');

/*1001 14 DDJ –15* DDJ – 13 SO*/

INSERT INTO fiches(noFic,noCli,dateCrea,datePaye) VALUES (1001,14,date_add(current_date,interval -15 DAY),date_add(current_date,interval -13 DAY),'SO');

/*On va tenter gammes voir remarque 1
Table gammes
PR Matériel Professionnel
HG Haut de gamme
EG Entrée de gamme
*/
INSERT INTO gammes(codeGam,libelle) VALUES ('PR','Matériel Professionnel');
INSERT INTO gammes(codeGam,libelle) VALUES ('HG','Haut de gamme');
INSERT INTO gammes(codeGam,libelle) VALUES ('EG','Entrée de gamme');



/*=========================================================
Table categories
FOA Ski de fond alternatif
FOP Ski de fond patineur
*/
INSERT INTO categories(codeCate,libelle) VALUES ('FOA','Ski de fond alternatif');
INSERT INTO categories(codeCate,libelle) VALUES ('FOP','Ski de fond patineur');


/*
table tarifs
T1 Base 10
T4 Argent 30
T6 Platine 90
*/
INSERT INTO tarifs(codeTarif,libelle,prixJour) VALUES ('T1','Base',10.);
INSERT INTO tarifs(codeTarif,libelle,prixJour) VALUES ('T4','Argent',30.);
INSERT INTO tarifs(codeTarif,libelle,prixJour) VALUES ('T6','Platine',90.);
-- pourquoi cette table accepte le code 'T1' qui est un Char(5)?
-- en fait 5 est le max, donc pas de problème
-- du coup char et varchar sont pareil sur MySQL

/*
Table grille_tarifs (attention ici, si je prends les noms de table de la correction ok, 
sinon mettre
les bons noms de variables grilletarifs et non grille_tarifs
Cependant dans l'énoncé on a grilletarifs
EG FOA T1
EG FOA T1
PR FOP T6
*/

INSERT INTO grille_tarifs(codeGam,codeCate) VALUES ('EG','FOA','T1');
INSERT INTO grille_tarifs(codeGam,codeCate) VALUES ('HG','FOP','T4');
INSERT INTO grille_tarifs(codeGam,codeCate) VALUES ('PR','FOP','T6');
-- ok, attention, si on insère une val qui n'est pas dans les codeGam
-- les contraintes de la clé étrangère va bloquer


/*
Table articles
F05 Fischer Cruiser EG FOA
F50 Fischer SOSSkating VASA HG FOP
F60 Fischer RCS CARBOLITE Skating PR FOP
Faire grilletarif avant
*/

INSERT INTO articles(refart,designation,codeGam,codeCate) VALUES ('F05','Fischer Cruiser','EG','FOA');
INSERT INTO articles(refart,designation,codeGam,codeCate) VALUES ('F50','Fischer SOSSkating VASA','HG','FOP');
INSERT INTO articles(refart,designation,codeGam,codeCate) VALUES ('F60','RCS CARBOLITE Skating','PR','FOP');
-- En résumé, on commence par saisir les TABLES qui n'ont que des "pointes de flèche", 
-- avant ceux qui ont "l'empennage" (trouvé sur google: autre côté de la flèche)
-- effectivement la table gamme fonctionne


/*Table lignes_fic 
remarque 1:apparemment je dois insérer d'abord les enregistrements de la Table article en 1er
1001 1 F05 DDJ – 15 DDJ – 13
1001 2 F50 DDJ – 15 DDJ – 14
1001 3 F60 DDJ – 13 DDJ – 13**
*/

INSERT INTO lignes_fic(noFic,noLig,refart,depart,retour) 
VALUES (1001,1,'F05',date_add(current_date,interval -15 DAY),date_add(current_date,interval-13 DAY));
INSERT INTO lignes_fic(noFic,noLig,refart,depart,retour) 
VALUES (1001,2,'F50',date_add(current_date,interval -15 DAY),date_add(current_date,interval-14 DAY));
INSERT INTO lignes_fic(noFic,noLig,refart,depart,retour) 
VALUES (1001,3,'F60',date_add(current_date,interval -13 DAY),date_add(current_date,interval-13 DAY));

/*Suppression d'enregistrement:
Si je dois supprimer des enregistrements, je démarre ligne_fic 
(le dernier à insérer est le premier à supprimer)
*/


/*Réinitialiser les base: (a faire)
DROP ligne_fic;*/


/*=====================================================================
				TRANSACTION

/*Exemple de transaction (leger probleme d'encodage sur les fichiers zippés)
BEGIN TRAN [MAJ_DATA];

	insert into [Services] (codeService,libelle)
		values ('SERV3','Service 3');
	insert into [Services] (codeService,libelle)
		values ('SERV4','Service 4');
	
	--placer un point de controle dans la transaction
	SAVE TRAN [BEFORE_DELETE];	
	
	delete from Employes 
		where nom like '%emp _%';

--Select interne � la transaction, on visualise les modifications en cours
--Les donn�es sont v�rrouill�es pour les autres utilisateurs
select * from [Services];
select * from Employes;

--Invalider totalement la transaction et lib�rer les verrous
--ROLLBACK TRAN [MAJ_DATA];
--Invalider la transaction jusqu'au point de contr�le
ROLLBACK TRAN [BEFORE_DELETE];

--Valider la transaction et lib�rer les verrours
COMMIT TRAN [MAJ_DATA];
*/


/* Rien ne marche avec les transactions
BEGIN TRAN [MAJ_DATA];

	INSERT INTO clients VALUES (14,'Boutaud','Sabine','Rue des platanes','75002','Paris');

	
	--placer un point de controle dans la transaction
	SAVE TRAN [BEFORE_DELETE];	
	

--Invalider totalement la transaction et lib�rer les verrous
--ROLLBACK TRAN [MAJ_DATA];
--Invalider la transaction jusqu'au point de contr�le
ROLLBACK TRAN [BEFORE_DELETE];

--Valider la transaction et lib�rer les verrours
COMMIT TRAN [MAJ_DATA];
*/
/*
=====================================================================
				TRANSACTION											*/