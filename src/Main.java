import java.sql.SQLOutput;

/*
    public class Main {
        public static void main(String[] args){

            // This is my first Java program (It's only a comment)

            /*
                This
                is
                a
                multi-line
                comment
                smile 😂 (Windows taste + . )


            System.out.println("I like pizza!");
            System.out.println("It's really good!");
            System.out.println("Buy me pizza!");
            System.out.println("This is a smile 😂");

            Mit Boolean:
            if(isStudent){
                System.out.println("You are a student!");
            }
            else{
                System.out.println("You are NOT a student!");
            }

            System.out.println("Hallo " + name);
            System.out.println("You ara " + age + " years old");
            System.out.println("Your gpa is: " + gpa);
            System.out.println("Your average letter grad is: " + grade);

            System.out.println("Your choice is a " + color + " " + year + " " + car);
            System.out.println("The price is: " + currency + price);

            if(forSale){
                System.out.println("There is a " + car + " for sale. ");
            }
            else{
                System.out.println("The " + car + " is not for sale.");
            }



            int age = 21;
            int year = 2025;
            int quantity = 1;

            double price = 19999.99;
            double gpa = 3.5;
            double temperature = -12.5;

            char grade = 'A';
            char symbol = '!';
            char currency = '$';


            boolean isStudent = false;
            boolean forSale = true;
            boolean isOnline = true;


            String name = "Hakuna Matata";
            String food = "pizza";
            String email = "hakunamatata92@gmail.com";
            String car = "Mustang";
            String color = "red";

            // andere Beispiele von Jonas:
            int number = 15;
            int number2 = 20;
            int sum = number + number2;

            int apples= 12;

            int anzahl = 20;
            String obst = " Birnen";

            String text = "Ich habe so viele Äpfel: ";


            System.out.println("Ich möchte " + anzahl + obst);
        }
    }
*/
/*
public class Main{
    public static void main(String[] args){
        String Name="Hakuna Matata";
        System.out.println("Hallo " + Name);
    }
}
*/

//public class Main {
//    public static void main(String[] args){
//        System.out.println("Hallo Java");
//    }
//}

//------------------------------------------------------------------
//** JAVA 25 Kurs (Codegym):**

//https://codegym.cc/de/quests/lectures/de.codegym.java.core.lecture.level67.lecture01
//1- Stufe 1, Lektion 1 (Befehle und das erste Programm in Java):


/*
Schreiben Sie ein Java-Programm, das die folgende Zeile auf dem Bildschirm ausgibt: "Es ist toll, Programmierer zu sein!😎"

Anforderungen:
•	Das Programm soll die Zeile auf dem Bildschirm ausgeben: Es ist toll, Programmierer zu sein!😎
•	Zum Ausgeben des Textes soll der Ausdruck System.out.println verwendet werden.
*/

/*
public class Main{
    public static void main(String[] args){
        System.out.println("Hallo zusammmen!");
        System.out.println("Heute lernen wir, in Java zu programmieren!");
        System.out.println("Es ist toll, Programmierer zu sein!😎");
    }
}
*/

//2- Stufe 1, Lektion 2 (Ausgabe auf dem Bildschirm in Java: System.out.println und System.out.print):

/*
Aufgabe: Chatnachricht
Stellen Sie sich vor, Sie senden eine Nachricht in einen Chat. Schreiben Sie ein Programm, das das aktuelle Jahr — 2025 — und den Smiley 😅 ausgibt. Jede Nachricht soll in einer eigenen Zeile stehen.

Anforderungen:
•	Das Programm muss die Zahl 2025 auf dem Bildschirm ausgeben.
•	Das Programm muss den Smiley 😅 auf dem Bildschirm ausgeben.
•	Die Zahl 2025 und der Smiley 😅 müssen in getrennten Zeilen ausgegeben werden, nicht in derselben Zeile.
•	Zum Ausgeben von Nachrichten auf dem Bildschirm muss der Befehl System.out.println verwendet werden.
*/

/*

public class Main{
    public static  void main(String[] args){
        // Ausgabe des aktuellen Jahres 2025 in einer eigenen Zeile
        System.out.println(2025);
        // Ausgabe des Smileys 😅 in einer eigenen Zeile
        System.out.println("😅");
    }
}

*/

/*
Aufgabe Satz aus Wörtern bilden
Stellen Sie sich vor, Sie setzen einen Satz aus Teilen zusammen. Schreiben Sie ein Programm, das zwei Zeilen auf dem Bildschirm ausgibt, jeweils in einer neuen Zeile. Verwenden Sie dafür verschiedene Befehle System.out.println():

Erste Zeile: "Ich lerne Java."
Zweite Zeile: "Das interessant!"
Geben Sie jedes Wort (Ich, lerne, Java, Das, interessant) mit einem separaten Befehl System.out.print() oder System.out.println() aus.

Anforderungen:
•	Für die Ausgabe jedes Wortes muss ein separater Befehl System.out.print() oder System.out.println() verwendet werden.
•	Die Wörter müssen in folgender Reihenfolge ausgegeben werden: "Ich", "lerne", "Java", dann "Das", "interessant".
•	Auf dem Bildschirm sollten zwei Zeilen erscheinen: die erste — "Ich lerne Java.", die zweite — "Das interessant!".
•	Jede der beiden Ergebniszeilen muss in einer neuen Zeile des Bildschirms ausgegeben werden.
*/

public class Main{
    public static void main(String[] args){
        // Gib das erste Wort der ersten Zeile aus
        System.out.print("Ich");
        // Fügt ein Leerzeichen hinzu und gibt das zweite Wort der ersten Zeile aus
        System.out.print(" lerne");
        // Fügt ein Leerzeichen hinzu und gibt das dritte Wort der ersten Zeile aus
        System.out.println(" Java.");
        // Gib das erste Wort der zweiten Zeile aus
        System.out.print("Das");
        // Fügt ein Leerzeichen hinzu und gibt das zweite Wort der zweiten Zeile aus
        System.out.print(" interessant!");
    }
}
