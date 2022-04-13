/*==========================================================
-- TP module 5
===========================================================*/

/*Correction (a refaire)
-- Suppression des contraintes
ALTER TABLE fiches DROP FOREIGN KEY FK_fiches_clients;
ALTER TABLE lignes_fic DROP FOREIGN KEY FK_lig_fiches_fiches;
ALTER TABLE lignes_fic DROP FOREIGN KEY FK_lig_fiches_articles;
ALTER TABLE articles DROP FOREIGN KEY FK_articles_grille;
ALTER TABLE grille_tarifs DROP FOREIGN KEY FK_grille_gammes;
ALTER TABLE grille_tarifs DROP FOREIGN KEY FK_grille_categories;
ALTER TABLE grille_tarifs DROP FOREIGN KEY FK_grille_tarifs;


-- Suppression des tables
DROP TABLE clients, fiches, lignes_fic, articles, grille_tarifs, gammes, categories, tarifs;

*/


-- Création des tables
CREATE TABLE clients (
    noCli 	int(6)             	PRIMARY KEY,
    nom   	varchar(30)        	not null,
    prenom 	varchar(30)       	null,	-- attention ici au null
    adresse varchar(120)		null,
    cpo     char(5)        		not null,  -- char à cause des 0 (pas de int)
    ville   varchar(80)    		not null DEFAULT 'Nantes'
);
/* Nantes peut être avec ' ou "=> voir le mieux (?) 
Rem.: Les " permettent d'insérer des apostrophes, cependant, il peut y avoir des " aussi
E.Cassin: préfère les ' => moins de pb de bords
Dans ce cas il existe des caractères d'échappement
*/

CREATE TABLE fiches (
    noFic 		int(6)          PRIMARY KEY,
    noCli   	int(6)        	not null, -- foreign key
    dateCrea  	datetime     	not null DEFAULT CURRENT_TIMESTAMP,
    datePaye 	datetime			,
    etat     	char(2)        	not null DEFAULT 'EC'
);
-- CHECK(etat=='EC')
-- contrainte (etat doit valoir EC,RE,SO)
-- ex de CHECK: CHECK(mois > 0 AND mois < 12)


-- primary key (noFic,noLig)
CREATE TABLE lignesfic (
    noFic 		int(6)          				, -- pour construire primary Key
    noLig   	int(3)     		not null		, -- pour construire primary Key
    refart  	char(8)		   	not null		, -- ref article
    depart 		datetime			not null DEFAULT CURRENT_TIMESTAMP,
    retour     	datetime
	CONSTRAINT PK_lignes_fic 	PRIMARY KEY (noFic, noLig)
);


CREATE TABLE articles (
    refart  	char(8)		    PRIMARY KEY, -- ref article
	designation	varchar(80)		not null,	
    codeGam		char(5)			not null,
	codeCate	char(5)			not null
);


CREATE TABLE gammes (
    codeGam  	char(5)		    PRIMARY KEY, -- ref article
    libelle		varchar(30)		UNIQUE not null
);

CREATE TABLE grilletarifs (
    codeGam  	char(5)		 	not null, -- pour construire primary Key
	codeCate	char(5)			not null,	-- pour construire primary Key
    codeTarif	char(5)			not null,
	CONSTRAINT PK_grille_tarif 	PRIMARY KEY (codeGam, codeCate)
);

CREATE TABLE categories (
	codeCate	char(5)			primary Key,
    libelle		varchar(30)		UNIQUE 			not null  
);

CREATE TABLE tarifs (
	codeTarif	char(5)			primary Key,
    libelle		varchar(30)		UNIQUE not null,
	prixJour	decimal(5,2)	not null
);


-- Ajout des contraintes d'intégrité

-- FK_nocli (est-ce correcte de la nommer comme ça? Non, lié à la table sinon répétition après
ALTER TABLE fiches ADD CONSTRAINT FK_fiches_clients FOREIGN KEY (noCli) REFERENCES clients(noCli) ON DELETE CASCADE;
 --ON DELETE CASCADE => en supprimant un client, on supprime toutes les fiches associées à ce client

/* Correction
ALTER TABLE fiches ADD CONSTRAINT FK_fiches_clients FOREIGN KEY (noCli) REFERENCES clients(noCli) ON DELETE CASCADE;
*/

ALTER TABLE lignesfic ADD CONSTRAINT FK_lig_fiches_fiches FOREIGN KEY (noFic) REFERENCES fiches(noFic) ON DELETE CASCADE;

ALTER TABLE lignesfic ADD CONSTRAINT FK_lig_fiches_articles FOREIGN KEY (refart) REFERENCES articles(refart);

ALTER TABLE grilletarifs ADD CONSTRAINT FK_grilletarifs_gammes FOREIGN KEY (codeGam) REFERENCES gammes(codegam);

ALTER TABLE grilletarifs ADD CONSTRAINT FK_grilletarifs_categories FOREIGN KEY (codeCate) REFERENCES categories(codeCate);

ALTER TABLE grilletarifs ADD CONSTRAINT FK_grilletarifs_categories FOREIGN KEY (codeCate) REFERENCES categories(codeCate);

ALTER TABLE articles ADD CONSTRAINT FK_articles_grilletarifs FOREIGN KEY (codeGam,codeCate) REFERENCES grilletarifs(codeGam,codeCate);

ALTER TABLE grilletarifs ADD CONSTRAINT FK_grilletarifs_tarifs FOREIGN KEY (codeTarif) REFERENCES grilletarifs(codeTarif);



/*Corrections 
-- Creation des contraintes
ALTER TABLE fiches ADD CONSTRAINT FK_fiches_clients FOREIGN KEY (noCli) REFERENCES clients(noCli) ON DELETE CASCADE;
article rendu cond1)

ALTER TABLE lignes_fic ADD CONSTRAINT FK_lig_fiches_fiches FOREIGN KEY (noFic) REFERENCES fiches(noFic) ON DELETE CASCADE;
Supprimer un client supprime les lignes associées (aux articles)

ALTER TABLE lignes_fic ADD CONSTRAINT FK_lig_fiches_articles FOREIGN KEY (refart) REFERENCES articles(refart);

ALTER TABLE articles ADD CONSTRAINT FK_articles_grille FOREIGN KEY (codeGam, codeCate) REFERENCES grille_tarifs(codeGam, codeCate);

ALTER TABLE grille_tarifs ADD CONSTRAINT FK_grille_gammes FOREIGN KEY (codeGam) REFERENCES gammes(codeGam);

ALTER TABLE grille_tarifs ADD CONSTRAINT FK_grille_categories FOREIGN KEY (codeCate) REFERENCES categories(codeCate);

ALTER TABLE grille_tarifs ADD CONSTRAINT FK_grille_tarifs FOREIGN KEY (codeTarif) REFERENCES tarifs(codeTarif);
Fin correction */