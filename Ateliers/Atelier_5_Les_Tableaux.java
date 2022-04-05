/*Exercice 1
Qu’affiche le programme suivant ? 
*/
int[] tab = new int[] {1, 3, 4, 8, 9};
for (int i = 0; i < tab.length; i++) {
 System.out.println(i);
}
/*Prévision:
0,1,2,3,4

OK
*/

/*
Exercice 2
Qu’affiche le programme suivant ? L’utilisateur saisira successivement les valeurs suivantes :
1. 1
2. 4 
3. 0
4. 5 
*/

 Scanner scan = new Scanner(System.in);
 int[] tab = new int[] {1, 3, 4, 8, 9};
 int x = scan.nextInt();
 System.out.println(tab[x]);
 
 /*Prévision:
1. 1	===> 3
2. 4 	===> 9
3. 0	===> 1
4. 5 	===> "index 5 out of bounds"
OK
*/
 
 
 /*
Exercice 3
Qu’affiche le programme suivant ? Voyez-vous un risque à ce genre d’algorithme ? Si oui, 
quelle solution permettrait d’éviter ce problème ?
*/

 int[] tab1 = new int[] {1, 3, 4, 8, 9};
 int[] tab2 = new int[] {4, 8, 7, 9, 5};
 for (int i=0; i<tab1.length; i++) {
 System.out.println(tab1[i] + tab2[i]);
 }
 /*additionne les éléments des tableaux tab1 et tab2 (attention à la taille des 
 tableaux qui doit être identique (sinon index out of bounds))
 5,11,11,17,14
 OK
 */
 //Il faut que le tableau 1 ne soit pas plus grand que tableau 2
 //si le tableau 2 est plus long que le tableau 1, il n'y a pas d'erreur, mais on new
 //voit pas forcément que "certaines sommes ne sont pas calculées"
 
/*
Exercice 4
Ecrivez un programme qui demande un nombre à un utilisateur. Le programme recherche ce 
nombre dans un tableau d’entiers (par exemple, [1, 5, 7, 4, 9]). Si le nombre est trouvé, 
l’algorithme affiche la position de ce nombre. Dans le cas contraire, l’algorithme signale que le 
nombre recherché n’existe pas.
*/
import java.util.Scanner;

//Indentation acceptable en fonction de l'équipe dans laquelle on travaille

class Main 
{  
  public static void main(String args[]) 
  { 

  System.out.println("Veuillez saisir un nombre entre 0 et 10");
    
  Scanner scan = new Scanner(System.in);
  int x = scan.nextInt();

  int[] tab1 = new int[] {1, 3, 4, 8, 9};


      for (int i=0;i<tab1.length;i++)
      {
        if(tab1[i]==x)
        {System.out.println("gagné");}
          //break;}
        else if(i==4 && x==tab1[4])
        {System.out.println("perdu");}
      }
     
    
  }
    
    
}
//Chercher à faire plus simple


//Correction E.Cassin
import java.util.Scanner;

class Main 
{  
  public static void main(String args[]) 
  { 
  int[] tab=new int[] {1,3,4,8,9};
  Scanner scan = new Scanner(System.in);
  System.out.println("Quel nombre recherchez-vous");
  int nbRecherche = scan.nextInt();
  boolean trouve=false;
  int position=-1;
    
  for (int i=0;i<tab.length;i++)
    {
    int current=tab[i];
    if (current==nbRecherche)
      {
      System.out.println("Nombre trouvé en position: "+i);
      trouve=true;
      }
    }
    /*
    Solution innaceptable
    else {"System.out.println("Nombre non trouvé");}
    */
    
  if (!trouve)
    {System.out.println("Le nombre n'a pas été trouvé");}

    //seconde possibilité
    /*
    if (possition==-1)
    {System.out.println("Le nombre n'a pas été trouvé");}
    else
      {
    System.out.prinln("nombre trouvé en position "+position);
      }
    */
  }
}
//refaire la fin en commentaire


/*
Exercice 5
Ecrivez un programme inversant les valeurs d’un tableau. Par exemple, le tableau suivant : 
1 | 3 | 8 | 2 | 5 
doit être transformé ainsi : 
5 | 2 | 8 | 3 | 1
*/

class Main 
{  
  public static void main(String args[]) 
  { 

    
  int[] tab1 = new int[] {1, 3, 8, 2, 5};
  int n=tab1.length;
  int[] tab2 = new int[n];
    
  for (int i=0;i<n;i++)
  {
    tab2[i]=tab1[n-1-i]; 
    System.out.println(tab2[i]); 
  }
 
 
  }
}
//OK

//Correction Etienne Cassin ex5 (1ere méthode)
import java.util.Scanner;
//Version facile mais qui consomme de la mémoire


class Main 
{  
  public static void main(String args[]) 
  { 
    int[] tab=new int[] {1,3,4,8,9};
    //objectif {9,8,4,3,1}
    int[] copie=new int[tab.length];
    for (int i=0;i<tab.length;i++)
      {
      copie[copie.length-1-i]=tab[i];
      }
    for (int i=0;i<copie.length;i++)
    {
    System.out.println(copie[i]);
    }
  }
}
//Fin Correction Etienne Cassin ex5 (1ere méthode)

//Correction Etienne Cassin ex5 (2eme méthode)
int[] tab=new int[] {1,3,4,8,9};
    //objectif {9,8,4,3,1}
  
      for (int i=0;i<tab.length/2;i++)
      {
        //Je mémorise la première valeur dans tmp
      int tmp=tab[i];
      tab[i]=tab[tab.length-1-i];
        //J'affecte l'ancienne valeur de la 1e case à la dernière
        tab[tab.length-1-i]=tmp;
        
      }
    //A modifier je n'ai pas suivi la fin
    for (int i=0;i<tab.length;i++)
    {
    System.out.println(tab[i]);
    }

//Fin Correction Etienne Cassin ex5 (2eme méthode)
//Fonctionne que tab.length soit paire ou impaire

/*
Exercice 6
Ecrivez un programme qui double toutes les valeurs contenues dans un tableau. Par exemple, 
le tableau suivant : 
1 | 3 | 8 | 2 | 5 
doit être transformé ainsi : 
2 | 6 | 16 | 4 | 10
*/

  int[] tab1 = new int[] {1, 3, 8, 2, 5};
  int n=tab1.length;
  int[] tab2 = new int[n];
    
  for (int i=0;i<n;i++)
  {
    tab2[i]=tab1[i]*2; 
   System.out.println(tab2[i]); 
  }
 //Beaucoup plus facile que le précédent
 



/*
Exercice 7
1-Demander à l'utilisateur combien de note il veut saisir
2-Demander de saisir les note une par une
Ecrivez un programme gérant une liste de notes pour une classe. Les notes sont stockées dans 
un tableau. Lors de l’exécution, l'algorithme affiche la moyenne, la note minimum et la note 
maximum. 
*/
//D'abors les notes sont figées {1, 3, 8, 2, 5}
import java.util.Scanner;


class Main 
{  
  public static void main(String args[]) 
  { 

    
  int[] note1 = new int[] {1, 3, 8, 2, 5};
  int n=note1.length;
  //int[] tab2 = new int[n];
  int min,max;
  double moy;
    moy=0.;
    min=20;
    max=0;
    
  for (int i=0;i<n;i++)
  {
    moy+=note1[i];
      if( min>=note1[i])
      {min=note1[i];}
    
      if( max<=note1[i])
      {max=note1[i];}
    
  }
  System.out.println(min); 
  System.out.println(max); 
  System.out.println(moy/n); 
  }
}

//Refait avec des valeurs à saisir par le professeur:
import java.util.Scanner;

class Main 
{  
  public static void main(String args[]) 
  { 

 System.out.println("Veuillez indiquer le nombre de copies que vous avez corrigé");
   Scanner scan = new Scanner(System.in);
   int nb_copie=scan.nextInt();
 // int n=note1.length;
int note1[]=new int[nb_copie];
    
for (int i=0;i<nb_copie;i++) 
  {
     System.out.println("Veuillez indiquer la note de la "+(i+1)+"ème copie");
    note1[i]=scan.nextInt();
    }


  //int[] note1 = new int[] {1, 3, 8, 2, 5};
  
  int min,max;
  double moy;
    moy=0.;
    min=20;
    max=0;
    
  for (int i=0;i<nb_copie;i++)
  {
    moy+=note1[i];
      if( min>=note1[i])
      {min=note1[i];}
    
      if( max<=note1[i])
      {max=note1[i];}
    
  }
  System.out.println("la note minimale est "+min); 
  System.out.println("la note maximale est "+max); 
  System.out.println("la note moyenne est "+moy/nb_copie); 
  }
}


//Correction exercice 7 (E.Cassin)
import java.util.Scanner;


class Main 
{  
  public static void main(String args[]) 
  { 

    Scanner scan=new Scanner(System.in);

    System.out.println("Combien de notes voulez vous saisir?");
  int nbNotes=scan.nextInt();

    float[] notes=new float[nbNotes];

    for(int i=0;i<nbNotes;i++)
      {
      System.out.println("Veuillez saisir la "+(i+1)+"ème note");
        notes[i]=scan.nextFloat();
      }
    float somme,min,max,moyenne;
    min=100;  //ou min=notes[0]
    max=0;    //ou max=notes[0]
    somme=0;

    for (int i=0;i<nbNotes;i++)
      {
        somme+=notes[i];
        
        if (notes[i]<min)
        {min=notes[i];}
        if(notes[i]>max)
          {max=notes[i];}
      }

    moyenne=somme/nbNotes;
  System.out.println("la note minimale est "+min); 
  System.out.println("la note maximale est "+max); 
  System.out.println("la note moyenne est "+moyenne);

  
  }
}

//Fin Correction exercice 7 (E.Cassin)



/*
Exercice 8 (bonus)
Ecrivez un algorithme capable d'afficher la N premiers termes de la suite de Fibonnaci, où N est 
un nombre saisi par l’utilisateur. Les différentes valeurs doivent être stockées dans un tableau 
La suite de Fibonnaci est une suite mathématique dont les premiers termes sont les suivants : 
1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144... 
Elle est calculée ainsi : 
fibo (x) = fibo(x-1) + fibo(x-2) 
Les deux premiers chiffres sont toujours deux 1. 
Ainsi : 
1 + 1 = 2 
1 + 2 = 3 
2 + 3 = 5 
*/

import java.util.Scanner;

class Main 
{  
  public static void main(String args[]) 
  { 
  
  System.out.println("Veuillez indiquer un nombre d'éléments à afficher");
   Scanner scan = new Scanner(System.in);
   int n=scan.nextInt();

    if (n<1)
    {
     System.out.println("Saisie invalide");
      return;
    }
    
    int[] fibo=new int[n];
    fibo[0]=1;

    if (n==1)
    {System.out.println(fibo[0]);
    return;}

    fibo[1]=1;
    
  for (int i=0;i<n-2;i++)
  {fibo[i+2]=fibo[i+1]+fibo[i];}

  for (int i=0;i<n;i++)
  {System.out.println(fibo[i]);}
  

  }
}

