//Atelier 3 : les conditions
//Exercice 1
//Qu’affiche le programme suivant ?

//Prévision: x=100;y=25;z=4;
//z est inférieur à 0.5

class Main {  
 public static void main(String args[]) { 
  float x,y,z;
  x=100f;
  y=25f;
  z=y/x;
  if (z>=0.5f) {
   System.out.println("z est supérieur à 0.5");
  } else {
 System.out.println("z est inférieur à 0.5");
  } 
   }
}

//Exercice 2
//Qu’affiche le programme suivant ? L’utilisateur choisira successivement les valeurs suivantes : 
//1. ‘F’ ‘Y’ 
//2. ‘Z’ ‘A’ 
//3. ‘G’ ‘G’ 

//Prévision 1: ‘F’ ‘Y’ 
//Prévision 2: "swap!" ‘A’ ‘Z’
//Prévision 3: ‘G’ ‘G’

//Boucle infinie (???)

import java.util.Scanner;

class Main {  
 public static void main(String args[]) { 
 char x,y,z;
  Scanner scan=new Scanner(System.in);
  x=scan.nextLine().charAt(0);
  y=scan.nextLine().charAt(0);
  if (x>y) 
    {
     System.out.println("swap !");
     z = y;
     y = x;
     x = z;
    }
  System.out.println(x);
  System.out.println(y);
  }
} 

//Exercice 3 : 
//Qu’affiche le programme suivant ? L’utilisateur saisira successivement les valeurs suivantes :
//1. 8 
//2. 27 
//3. 13

import java.util.Scanner;

class Main {  
   public static void main(String args[]) { 
    Scanner scan = new Scanner(System.in);
	  int x=scan.nextInt();
	  if (x % 3 == 0)
    {System.out.println(x/3);}
	  else if (x%3== 1)
    {System.out.println(x*2);}
	  else 
    {x = x + 1;
 	  System.out.println(x/3);}

  }
}


//Prévision 1: 3
//Prévision 2: 9
//Prévision 3: 26

//resultat 1: ok
//resultat 2: ok	
//resultat 3: ok


//Exercice 4
//Proposez un code demandant à l’utilisateur quelle opération il souhaite réaliser (1 : addition, 2 : 
//soustraction) ainsi que deux nombres de son choix. Puis, réalisez l’opération associée


import java.util.Scanner;

class Main {  
   public static void main(String args[]) { 
     System.out.println("souhaitez-vous faire une addition ou une multiplication (1 : addition, 2 :soustraction)");
//Optionnel faire ("+" ou "-")
     int x;
    Scanner scan = new Scanner(System.in);
	  x=scan.nextInt();

 if (x!=1 && x!=2)
{System.out.println("vous devez choisir 1 ou 2");
  return;}

  System.out.println("Ecrivez 1 chiffre");
     int a,b;
      a=scan.nextInt();

    System.out.println("Ecrivez 1 2e chiffre"); 
      b=scan.nextInt();
  
     
    if (x == 1)
      {System.out.println(a+b);}
	else if (x==2)
    {System.out.println(a-b);}
	else
	{{System.out.println("vous devez choisir 1 ou 2");}

  }
}


//Refait avec + et -

import java.util.Scanner;

class Main {  
  public static void main(String args[]) { 

   System.out.println("souhaitez-vous faire une addition ou une multiplication (+ : addition, - :soustraction)");
    Character x;
    Scanner scan = new Scanner(System.in);
	  x=scan.nextLine().charAt(0);

    if (!x.equals('+') && !x.equals('-'))
{System.out.println("vous devez choisir + ou -");
  return;}
    
  System.out.println("Ecrivez 1 chiffre");
     int a,b;
      a=scan.nextInt();

    System.out.println("Ecrivez 1 2e chiffre"); 
      b=scan.nextInt();
  
     
    if (x.equals('+'))
      {System.out.println(a+b);}
	  else if (x.equals('-'))
    {System.out.println(a-b);}
	  else
	  {System.out.println("vous devez choisir + ou -");}

    
        } 
  }


//Comparaison de 2 string
//Attention, pour les string on met " et ' pour un character
import java.util.Scanner;


class Main {  
  public static void main(String args[]) { 

   System.out.println("Ecrivez Albert");
    String x;
    Scanner scan = new Scanner(System.in);
	  x=scan.nextLine();

    if (x.equals("Albert"))
        {System.out.println("Vous avez écrit Albert");}
 else  {System.out.println("Vous ne savez pas écrire Albert");}

   
   }
  }


