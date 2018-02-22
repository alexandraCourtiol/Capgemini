	
	************************************************************************************
	************************************  READ ME  *************************************
	************************************************************************************
		
	-------------------------------------------------------------------------------------
	-------------------------------------PREREQUIS---------------------------------------
	-------------------------------------------------------------------------------------
	
	1) Installer JRE version 8 sur votre ordinateur et intégrer JAVA dans les variables
	 d'environnement Windows.
				
	2) Installer l'IDE Eclipse Oxygen.
	
	-------------------------------------------------------------------------------------
	-------------------------------------EXECUTION---------------------------------------
	-------------------------------------------------------------------------------------
	
	1) Dézipper le fichier "capgemini.zip".
	2) Ouvrir Eclipse et importer le dossier dézippé tel un " Existing Maven Projects".
	3) Vérifier que le port 8080 ne soit pas en cours d'utilisation (Spring Boot utilise
 	ce port par défaut).
	4) Lancer le projet Maven avec "Run as Java Application" ou encore "Spring Boot App"
 	si Spring STS est installé sur votre ordinateur.
	5) Vous avez deux possibilités pour tester le web service proposé par l'application :

		--> Installer et lancer le logiciel Postman et insérer dans le champ "GET"
 		l'URL "http://localhost:8080/YES_I_CAN".
		Vous devez obtenir comme résultat "YES_I_CAN_AND_DID_IT".
		Si vous insérer autre chose à la place de "YES_I_CAN", vous devez obtenir
 		"NOTHING_TO_SAY".

		--> Lancer un navigateur web et utiliser la barre d'URL pour obtenir le même
 		résultat.


	
	
	
	 
