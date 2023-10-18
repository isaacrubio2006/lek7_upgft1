import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner tangentbord = new Scanner(System.in)){

          int poäng = 0;
          int maxpoäng =5;
        System.out.println("Vad är en elephant: ");
        String svar = tangentbord.nextLine();
       if(svar.equalsIgnoreCase("Djur"))
       {
        System.out.println("Rätt svar");
        poäng++; //poäng=poäng+1;
       }
       else{
        System.out.println("Du är dum");
       }

        System.out.println("Vad är en banan: ");
        String svar2 = tangentbord.nextLine();
       if(svar2.equalsIgnoreCase("Frukt"))
       {
        System.out.println("Rätt svar");
        poäng++; 
       }
       else{
        System.out.println("Du är speciell");
       }

        System.out.println("Vad är ett bord: ");
        String svar3 = tangentbord.nextLine();
       if(svar3.equalsIgnoreCase("objekt"))
       {
        System.out.println("Rätt svar");
        poäng++; 
       }
       else{
        System.out.println("Du borde göra mer kahoot");
       }

        System.out.println("Vem är bästa fotboll spelaren: ");
        String svar4 = tangentbord.nextLine();
       if(svar4.equalsIgnoreCase("Messi"))
       {
        System.out.println("Rätt svar");
        poäng++; 
       }
       else{
        System.out.println("Det är inte rätt svar men nära nog ");
       }

        System.out.println("Vad är en apa: ");
        String svar5 = tangentbord.nextLine();
       if(svar5.equalsIgnoreCase("Djur"))
       {
        System.out.println("Rätt svar");
        poäng++; 
       }
       else{
        System.out.println("Du är dum");
       }
       System.out.println(poäng);
       System.out.println("maxpoäng är " + maxpoäng);

    }
}
}
