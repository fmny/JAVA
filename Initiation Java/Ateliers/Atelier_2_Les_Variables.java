//Ex.1:
//Prévision: 15

class Main {  
 public static void main(String args[]) { 
  int a, b;
  a=5;
  b=a-2;
  System.out.println(a*b);
 } 
}

//Résultat: 15


//Ex.2:
//Prévision: 10

class Main {  
 public static void main(String args[]) { 
  int a;
  a=5;
  a=a-2;
  a=a*a+1;
  System.out.println(a);
 } 
}

//Résultat: 10

Ex.3:
//Prévision: 9

class Main {  
 public static void main(String args[]) { 
  int a,b;
  a=7;
  b=a-1;
  System.out.println((b/2)*(b/2));
 } 
}
//Résultat: 9



Ex.4:
//Prévision: 6

class Main {  
 public static void main(String args[]) { 
 int a,b;
  a=22;
  b=5;
  System.out.println((a/b)+(a%b));
 } 
}
//Résultat: 6

Ex.5:
import java.util.Scanner;

class Main {  
 public static void main(String args[]) { 
//Exercice 5 
//Proposez un code qui demande le nom et l’âge d’un utilisateur, puis les affiche à l’écran. 

  String nom;
  int age;
  System.out.println("Veuillez saisir votre nom, puis votre âge");
  Scanner scan = new Scanner(System.in);
  nom = scan.next();
  age=scan.nextInt();
  scan.close();
  //System.out.println("Veuillez saisir votre âge");

  System.out.println("Vous vous appelez "+nom+" et vous avez "+age+" ans");

 } 
}

//J'aurais bien aimé le faire en posant 2 questions, en ouvrant et refermant Scanner

/Ex5-bis
//Solution plus esthétique

import java.util.Scanner;

class Main {  
  public static void main(String args[]) { 

  String nom;
  int age;
  System.out.println("Veuillez saisir votre nom");
  Scanner scan = new Scanner(System.in);
  nom = scan.next();

    System.out.println("Veuillez saisir  votre âge");
  age=scan.nextInt();
  scan.close();
  //System.out.println("Veuillez saisir votre âge");

  System.out.println("Vous vous appelez "+nom+" et vous avez "+age+" ans");
  } 
}


Ex.6:

//Proposez un code qui demande à l’utilisateur de saisir un nombre, et renvoie sa valeur au carré

import java.util.Scanner;

class Main {  
 public static void main(String args[]) { 
//Exercice 6:
//Proposez un code qui demande à l’utilisateur de saisir un nombre, et renvoie sa valeur au carré
int carre;
  System.out.println("Veuillez saisir un nombre entier");
  Scanner scan = new Scanner(System.in);
  carre=scan.nextInt();
  scan.close();
  System.out.println("Le carré de votre nombre est "+(carre*carre));

 } 
}


//Exercice 7
import java.util.Scanner;

class Main {  
 public static void main(String args[]) { 

//Proposez un code qui demande deux chiffres à un //utilisateur, et restitue leur somme, leur 
//produit, leur différence, leur quotient, leur modulo et leur moyenne
  int a, b, total;
  System.out.println("Veuillez saisir deux nombres entiers");
  Scanner scan = new Scanner(System.in);
  a=scan.nextInt();
  b=scan.nextInt();
  int somme, diff,quotient,reste,prod;
  float moyenne;
   
  somme=a+b;
  prod=a*b;
  diff=a-b;
  quotient=a/b;
  reste=a%b;

  
 	System.out.println("La somme de vos 2 nombres vaut: " + somme);
 	System.out.println("Le produit de vos 2 nombres vaut: " + prod);
 	System.out.println("La différence de vos 2 nombres vaut: " + diff);
	System.out.println("Le quotient par la division euclidienne de vos 2 nombres vaut: " + quotient);
	System.out.println("Le restede la division euclidienne de vos 2 nombres vaut: " + reste);


	//Moyenne
	double moyenneDecimale= somme/2.0;
   	System.out.println("La moyenne vaut: "+moyenneDecimale);


   scan.close();

 } 
}

//Résultat
//Veuillez saisir deux nombres entiers
//11
//5
//La somme de vos 2 nombres vaut: 16
//Le produit de vos 2 nombres vaut: 55
//La différence de vos 2 nombres vaut: 6
//Le quotient par la division euclidienne de vos 2 nombres vaut: 2
//Le reste de la division euclidienne de vos 2 nombres vaut: 1




