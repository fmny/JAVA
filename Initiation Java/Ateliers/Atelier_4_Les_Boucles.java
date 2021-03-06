//Exercice 1
//Qu’affiche le programme suivant ? 

for (int i = 0; i <= 10; i++) {
 System.out.println(i);
}

//Prévision ex1: 0,1,2,...,10
//Resultat: ok

//Exercice 2
//Qu’affiche le programme suivant ?

for (int i = 12; i > 2; i--) {
 System.out.println(i);
}
//Prévision ex2: 12,11,10,...,3
//Resultat: ok


/*
Exercice 3
Qu’affiche le programme suivant ? L’utilisateur saisira successivement les valeurs suivantes :
1. 3
2. 5 
3. 8 
*/

Scanner scan = new Scanner(System.in);
int x = scan.nextInt();
for (int i = 0; i < 11; i++) {
 System.out.println(i * x);
}

//Prévision1 ex3: 0,3,6,...,30
//Prévision2 ex3: 0,5,10,...,50
//Prévision3 ex3: 0,8,16,...,80
//Resultat: ok


//Exercice 4
//Qu’affiche le programme suivant ?

for (int i = 0; i < 4; i++) {
 for (int j = 1; j < 4; j++) {
 System.out.println(j);
 }
}
//Prévision ex4: 1,1,1,1,2,2,2,2,3,3,3,3
//Resultat: Erreur de débutant: 1,2,3,1,2,3,1,2,3,1,2,3


//Exercice 5
//Proposez un code qui demande à l’utilisateur de saisir un nombre, puis affiche le carré de tous 
//les nombres jusqu’à atteindre cette valeur.
//Par exemple, si l’utilisateur saisit 5, on attendra les valeurs (1, 4, 9, 16, 25).

import java.util.Scanner;

class Main {  
  public static void main(String args[]) { 

  int valmax;
  System.out.println("Veuillez saisir un nombre entiers<100)");
  Scanner scan = new Scanner(System.in);
  valmax=scan.nextInt();

  for (int i=1;i<=valmax;i++)
    {
    System.out.println(i*i);
    }
     
  }
}


//Exercice 6
//Qu’affiche le programme suivant ? L’utilisateur saisira successivement les valeurs suivantes :
//1. 1
//2. 8 
//3. 512
//4. 2048 

Scanner scan = new Scanner(System.in);
int x = scan.nextInt();
while (x != 1) {
 System.out.println(x);
 x = x / 2;
}

//Prevision
//1. 1     ====> "rien"
//2. 8     ====> 8,4,2
//3. 512   ====> 512,256,128,64,32,16,8,4,2
//4. 2048  ====> 2048,1024,512,256,128,64,32,16,8,4,2
//OK

//Exercice 7
//Qu’affiche le programme suivant ? L’utilisateur saisira successivement les valeurs suivantes :
//1. 4
//2. 5 
//3. 7
//Cette suite mathématique est connue sous le nom de suite de Syracuse et reste encore 
//aujourd’hui une énigme mathématique
//La vraie suite de suite de Syracuse aurait été non pas x=x+1
//Mais x=3*x+1


import java.util.Scanner;

class Main {  
  public static void main(String args[]) { 

  Scanner scan = new Scanner(System.in);
  int x = scan.nextInt();
  while (x > 1) 
    {
     if (x % 2 == 0)
     x = x / 2;
     else
     x = x + 1;
     System.out.println(x);
    }  
  }
}

//prev ex7: 
//1. 4		====> 2,1 fin
//2. 5 		====> 6,3,4,2,1 fin
//3. 7		====> 8,4,2,1, fin
//OK

//Exercice 8
//Proposez un code qui demande à l’utilisateur de saisir un nombre, puis affiche tous les carrés 
//inférieurs à cette valeur.
//Par exemple, si l’utilisateur saisit 12, on attendra les valeurs (1, 4, 9)


import java.util.Scanner;

class Main {
	public static void main(String args[]) { 

	System.out.println("Veuillez saisir un nombre");

	Scanner scan = new Scanner(System.in);
	int valmax = scan.nextInt();
	int i=1;
  
	while (i*i <=valmax) {
		System.out.println(i*i);
		i++;
	}  
    
  
  }
}


/*Exercice 9
Qu’affiche le programme suivant ? L’utilisateur saisira successivement les valeurs suivantes :
1. 5
2. 0 
3. 1
*/
//Rappel: Dans une boucle "Do .... While", l'instruction après le Do 
//s'exécute toujours au moins une fois 
Scanner scan = new Scanner(System.in);
int x = scan.nextInt();
do {
 System.out.println(x);
 x--;
} while (x < 0)

/*
prevision ex 9:
1. 5	====> 5,4,3,2,1,0
2. 0 	====> 0
3. 1	====> 1,0

Ne va pas du tout (prévisions exécrables)
Mauvaise interprétation de la condition while (x < 0) (tant que x<0)
qui ne s'exécute que dans l'exemple 2

1-5 	=======>  5
2-Boucle infinie: 0,-1,-2,-3,....
3-1		======>	  1
*/
//Ce genre de boucle n'a d'intérêt que si la condition est
//while (x > 0)


import java.util.Scanner;

class Main {  
  public static void main(String args[]) { 


//System.out.println("Veuillez saisir un nombre");

    for (int i=1;i<1025;i++)
    //System.out.println(Math.pow(2,i));
	  //System.out.println(i);
      {
    System.out.println(i);
    System.out.println(Math.pow(2,i));
      }
    //un double contient la valeur infinity si on depasse le seuil
    }
  }

//i=1023
//2^i=8.988465...E307
//i=1024
//Infinity








