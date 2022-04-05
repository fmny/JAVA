
//===============================================
Atelier 6 : les fonctions
//===============================================

//===============================================
Exercice 1
Qu’affiche l’algorithme suivant ? 
//===============================================

class Main 
{  
  public static void main(String args[]) 
  { 
  int x = 5;
  x=doubler(x);
  System.out.println(x);
  }
  
public static int doubler(int x) 
{return x*2;}
  
}

//prévision: Renvoie 10
//OK

/*
Exercice 2
Qu’affiche le programme suivant ? L’utilisateur saisira successivement les valeurs suivantes :
1. 1
2. 4 
3. 0
4. 5 
*/

Scanner scan = new Scanner(System.in);
int x = scan.nextInt();
if (x%2 == 0) {
 x = doubler(x);
 x = decrementer(x);
} else {
 x = decrementer(x);
 x = doubler(x);
}
System.out.println(x);
public int doubler(int x) {
 return x*2;
}
public int decrementer(int x) {
 return x-1 ;
}

//Réponse
//Ecrire un entier, s'il est pair: x=2*x-1; 
//sinon x=2*(x-1);
/*Prévision: 
1. 1	===>0	ok
2. 4 	===>7	ok
3. 0	===>-1	ok
4. 5	===>8	ok
*/


/*
Exercice 3
Qu’affiche le programme suivant ?
*/

class Main 
{  
  public static void main(String args[]) 
  { 
  int[] tab = new int[] {1, 3, 4, 8, 9};
  doubler(tab);
  for (int i=0; i<tab.length; i++) 
  {System.out.println(tab[i]);}
  }
  
public static void doubler(int[] arr) 
  {
   for (int i=0; i<arr.length; i++) 
   {arr[i] = arr[i] * 2;} 
  } 
}

/*Prévision: 
renvoie: 2,6,8,16,18
OK
*/


/*
Exercice 4
Quel est le rôle de la fonction mystere ? Quel sera le résultat affiché ?
*/

char[] texte = new char[] {'b','o','n','j','o','u','r'};
mystere(texte);
System.out.println(texte);

public static void mystere(char[] arr) {
 for (int i=0; i<arr.length; i++) {
 arr[i] = (char)(arr[i]+1);
 }
}

/*Prevision:
La fonction mystere remplace un caractère de l'alphabet par le suivant 
(exemple a devient b,...)
Voir table ASCII pour plus de détails
ici le programme renvoie:
plutôt: cpokpvs
*/

//Le programme ci-dessus  renvoie une erreur car il ne peut additionner 
//2 éléments de types différents (int +char) 
//il faut forcer le type d'une variable



//Question 1: peut-on convertir un entier en double? Apparemment pas sans copie
//Question 2 :J'ai l'impression qu'on ne peut utiliser aucune fonction Java hors du 
//"public static void main(String args[])"
//Ex:Character.toChars ci-dessous


class Main {  
  public static void main(String args[]) { 
    
      char[] texte = new char[]     {'b','o','n','j','o','u','r'};
  mystere(texte);
  System.out.println(texte);
    }

   public static void mystere(char[] arr)
  {
   for (int i=0; i<arr.length;i++) 
   {arr[i]=(char)(arr[i]+1);}
  }
}
//Permet de changer le type d'une variable (ici en character:(char)(arr[i]+1) )
//On force l'opération : "arr[i]+1" à renvoyer un char
//Ici on a vu l'algorithme de chiffrement de Caesar
//On peut le décrypter avec une fonction mystere_inverse!


/*
Exercice 5
Quel est le rôle de la variable resultat ? Quel est le rôle de la fonction mystere ? Quel sera le 
résultat affiché ?
*/

char[] texte = new char[] {'b','o','n','j','o','u','r'};
char[] resultat = new char[texte.length * 2];
mystere(texte, resultat);
System.out.println(resultat);

public static void mystere(char[] in, char[] out) {
 for (int i=0; i<in.length; i++) {
 out[i*2] = in[i];
 out[i*2 +1] ='x';
 }
}
//Prevision:
/*
bonjour a 7 caracteres et resultat en aura donc 14
Dans la fonction mystere qui possède 2 arguments in et out qui sont des "listes" de caractères
out[indice paire]=in[i]
out[indice impaire]='x'
Résulat prévu:'bxoxnxjxoxuxrx'
Verif OK
*/

//Autre façon de faire la fonction mystere:


//==================================================
//Méthode 2

import java.util.Scanner;


class Main 
{  
  public static void main(String args[]) 
    { 
      char[] texte = new char[] {'b','o','n','j','o','u','r'};
      char[] resultat = new char[texte.length*2];
      mystere(texte, resultat);
      System.out.println("mystere 1");
      System.out.println(resultat);

      System.out.println("mystere 2");
      System.out.println(mystere_2(texte));
    }

public static void mystere(char[] in, char[] out) 
  {
   for (int i=0; i<in.length; i++) 
    {
     out[i*2] = in[i];
     out[i*2 +1] ='x';
    }
  }

//On peut modifier la fonction mystere de maniere à ce que le out soit la sortie

public static char[] mystere_2(char[] in) 
  {
    char[] out=new char[in.length*2];
    for (int i=0; i<in.length; i++) 
      {
        out[i*2] = in[i];
        out[i*2 +1] ='x';
      }
    return out;
  }
}
//Fin méthode 2
//=====================================================


/*
Exercice 6
Ecrivez une fonction pour chacune des opérations suivantes : 
● ADDITIONNER
● SOUSTRAIRE
● MULTIPLIER
● DIVISER
Chacune de ces fonctions prend en paramètres deux nombres et retourne le résultat.
*/


class Main 
{  
  public static void main(String args[]) 
  { 
  /*Scanner scan = new Scanner(System.in)
    System.out.println("Veuillez entrer 2 nombres entier SVP")
  int x = scan.nextInt();
  Pas très envie de gérer des flux étant donné qu'il faut tester des fonctions
   */
  int a,b;
  a=18;
  b=8;
  System.out.println("a="+a);
  System.out.println("b="+b);
  System.out.println("addition");
  System.out.println(additionner(a,b));

  System.out.println("soustraction");
  System.out.println(soustraire(a,b));
  System.out.println("multiplication");         
  System.out.println(multiplier(a,b));
  System.out.println("division");      
  System.out.println(diviser(a,b));

  double c,d;
  c=0.5;
  d=0.1;
  System.out.println("c="+c);
  System.out.println("d="+d);
  System.out.println("division_reelle");
  System.out.println(diviser_reel(c,d));
  }
  
public static int additionner(int n1, int n2) 
  {return n1+n2;}
  
public static int soustraire(int n1, int n2) 
  {return n1-n2;}

  public static int multiplier(int n1, int n2) 
  {return n1*n2;}
  
public static int diviser(int n1, int n2) 
  {return n1/n2;}

  public static double diviser_reel(double n1, double n2) 
  {return n1/n2;}

}

//===============================================================
/*
Exercice 7
Réécrivez les fonctions de l’exercice 6 sans utiliser les symboles +, -, * et /. Les symboles ++ et 
-- sont autorisés.
*/

//Revoir, ne marche pas avec les nombres négatifs (tester ++,+-,-+,--)
//on se contente des nombres positifs
class Main 
{  
  public static void main(String args[]) 
  { 

  int a,b;
  a=18;
  b=8;
  System.out.println("a="+a);
  System.out.println("b="+b);
  System.out.println("addition");
  System.out.println(additionner(a,b));

  System.out.println("soustraction");
  System.out.println(soustraire(a,b));
  System.out.println("multiplication");         
  System.out.println(multiplier(a,b));
  System.out.println("division");      
  System.out.println(diviser(a,b));

  }

public static int additionner(int n1, int n2) 
  { 
    int n=0;
    for (int i=1;i<=n1;i++)
    n++;
    for (int i=1;i<=n2;i++)
    n++;
    return n;
  }

/*2eme méthode
public static int additionner(int n1, int n2) 
  { 
    while(n2>0);
	{
		n1++;
		n2--;
	}
	return n1;
  }
//		nb1   nb2 
//		5  		2
//		6		1
//		7		0


*/

public static int soustraire(int n1, int n2) 
  {
   int n=0;
   if (n1>0)
   {for (int i=1;i<=n1;i++)
    n++;}
  else 
   {for (int i=n1;i<0;i++)
    n--;}
 
   if (n2>0)
   {for (int i=1;i<=n2;i++)
    n--;}
  else 
   {for (int i=n2;i<0;i++)
    n++;}
    return n;
    
  }

  public static int multiplier(int n1, int n2)
  { 
    int n=0;
    for (int i=1;i<=n1;i++)
      {
        for (int j=1;j<=n2;j++)
          {n++;}
      }
    return n;
  }
  
  /*2eme méthode (à revoir, ne fonctionne pas)
public static int multiplier(int n1, int n2) 
  { 
	int somme=0;
		while(n2>0);
		{
			somme=additionner(somme,n1);
			n2--;
		}
	return n1;
  }
*/

 //On va considérer que les nombres sont positifs
public static int diviser(int n1, int n2) 
  {
      int quotient=0;
    	if (n1<n2)
    	{return 0;}
    	else
    	{	
    		while (n1>n2)
    		{
    			quotient+=1;
    			n1-=n2;
				//Vérifier les itérations
				//System.out.println("n1="+n1+" et q="+quotient);
    		}
        return quotient;
    	
      }  
  
    }
/* 2eme méthode
 //On va considérer que les nombres sont positifs
public static int diviser(int n1, int n2) 
  {
      int quotient=0;
    	while (n1>=n2)
        {
    	    quotient++;
    			n1=soustraire(n1,n2);
    		}
        return quotient;
    	
  }
    
*/
}


/*
//condition à la fin selon le signe de n1 et de n2
//Condition si les nombres sont négatifs
//Idée : a=bq+r
    //int r=n1%n2;
    //A chercher (distinguer les cas >0 et <0)
    //Voir si n2>n1
    //sinon peut etre retirer n2 à n1 avec un compteur qui indiquera le quotient de la division
    //peut-être 
	n1=
	//n1=Math.abs(n1);
	//n2=Math.abs(n2);
	int quotient=0;
	*/
	//A finir
//Fin exercice 7
//===========================================================



/*
Exercice 8
En réutilisant les fonctions précédemment écrites, proposez un programme “calculatrice” à un 
utilisateur. Le programme propose à l’utilisateur de choisir le type d’opération qu’il souhaite 
réaliser, puis permet de saisir les deux nombres nécessaires à l’opération
*/

/*
a=args[0];
b=args[1];
Manière d'utiliser les arguments du main
public static void main(String args[])
Le main se lance par défaut lorsqu'on l'exécute
ces arguments permettraient d'utiliser la console
avec par ex sur la calculatrice de l'exercice 8
    console:
    calculatrice.exe 1 5 2
    Choix 1, 5+2 => renvoie 7
*/


import java.util.Scanner;

class Main 
{  
  public static void main(String args[]) 
  { 
    Scanner scan = new Scanner(System.in);

    System.out.println("Je suis votre calculatrice, je vais faire votre opération!");
    System.out.println("Veuillez choisir votre opération!");
    System.out.println("1 : addition");
    System.out.println("2 : soustraction");
    System.out.println("3 : multiplication");
    System.out.println("4 : division");
  
    int x = scan.nextInt();
  
    if (x!=1 && x!=2 && x!=3 && x!=4 )
      //Ajouter si x n'est pas entier
    {  System.out.println("Veuillez saisir un nombre entier entre 1 et 4!");
      return;}
  
       System.out.println("Veuillez saisir un entier");
    int a = scan.nextInt();
  System.out.println("Veuillez saisir un 2ème entier");
    int b = scan.nextInt();
      
    if (x==1)
    {  
    System.out.println("addition");
    System.out.println(additionner(a,b));
    }
    else if (x==2)
    {  
    System.out.println("soustraction");
    System.out.println(soustraire(a,b));
    }
    else if (x==3)
    {  
    System.out.println("multiplication");         
    System.out.println(multiplier(a,b));
    }
    else
    {
    System.out.println("division");      
    System.out.println(diviser(a,b));
    }
  }

//Pour alléger le code, on utilise les versions courtes
public static int additionner(int n1, int n2) 
{return n1+n2;}
  
public static int soustraire(int n1, int n2) 
{return n1-n2;}

public static int multiplier(int n1, int n2) 
{return n1*n2;}
  
public static int diviser(int n1, int n2) 
{return n1/n2;}

public static double diviser_reel(double n1, double n2) 
{return n1/n2;}

}


///Méthode 2: (A faire tourner)
import java.util.Scanner;

class Main {  
  public static void main(String args[]) { 
    Scanner scan = new Scanner(System.in);
    // Déclaration de la variable "operation"
    // Dans le main, donc accessible partout dans le main
    int operation;
    
    do {
      System.out.println("Veuillez saisir votre opération :");
      System.out.println("1. Addition");
      System.out.println("2. Soustraction");
      System.out.println("3. Multiplication");
      System.out.println("4. Division");
      // affectation d'une valeur à operation
      operation = scan.nextInt();
    } while (operation < 1 || operation > 4);

    int a, b;
    System.out.println("Veuillez saisir vos deux chiffres");
    a = scan.nextInt();
    b = scan.nextInt();
    
    if (operation == 1) {
      System.out.println(additionner(a, b));
    } else if (operation == 2) {
      System.out.println(soustraire(a, b));
    } else if (operation == 3) {
      System.out.println(multiplier(a, b));
    } else if (operation == 4) {
      System.out.println(diviser(a, b));
    }

    /*
    switch(operation) {
      case 1 : {
        System.out.println(additionner(a, b));
        break;
      }
      case 2 : {
        System.out.println(soustraire(a, b));
        break;
      }
      case 3 : {
        System.out.println(multiplier(a, b));
        break;
      }
      case 4 : {
        System.out.println(diviser(a, b));
        break;
      }
      default : {
        System.out.println("Rien a voir ici, circulez");
        break;
      }
    }
    */
  }

  public static int additionner(int nbUn, int nbDeux) {
    while (nbDeux > 0) {
      nbUn++;
      nbDeux--;
    }
    // nbUn nbDeux
    // 5    2
    // 6    1
    // 7    0
    return nbUn;
    /*
    for (int i = 0; i < nbDeux; i++) {
      nbUn++;
    }
    return nbUn;
    */
  }

  public static int soustraire(int nbUn, int nbDeux) {
    while (nbDeux > 0) {
      nbUn--;
      nbDeux--;
    }
    // nbUn nbDeux
    // 5    2
    // 4    1
    // 3    0

    return nbUn;
  }

  public static int multiplier(int nbUn, int nbDeux) {
    int acc = 0;
    while (nbDeux > 0) {
      acc = additionner(acc, nbUn);
      nbDeux--;
    }
    // acc  nbUn  nbDeux
    // 0    5     4
    // 5    5     3
    // 10   5     2
    // 15   5     1
    // 20   5     0
    // Equivalent avec le for
    /*
    for (int i = 0; i < nbDeux; i++) {
      acc = additionner(acc, nbUn);
    }
    */
    // Version double boucle
    /*
    for (int i = 0; i < nbUn; i++) {
      for (int j = 0; j < nbDeux; j++) {
        acc++;
      }
    }
    */
    return acc;
  }

  public static int diviser(int nbUn, int nbDeux) {
    int cpt = 0;
    while (nbUn >= nbDeux) {
      cpt++;
      nbUn = soustraire(nbUn, nbDeux);
    }
    // cpt  nbUn  nbDeux
    // 0    5     2
    // 1    3     2
    // 2    1     2
    return cpt;
  }
}

//fin méthode 2