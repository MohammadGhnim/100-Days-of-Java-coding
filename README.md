** Java 25-Kurs:**
Lektion 1 (Befehle und das erste Programm in Java): 

1. Einführung in Befehle:
Ein Programm ist eine Menge (Liste) von Befehlen. Zuerst wird der erste Befehl ausgeführt, dann der zweite, der dritte und so weiter. Wenn alle Befehle ausgeführt wurden, endet das Programm.
Ein Befehl ist eine einfache Anweisung an den Computer: Tu dies! Das Wichtigste – der Computer führt genau das aus, was Sie ihm sagen, nicht das, was Sie wollen.
/System.out.println("Der Roboter ist der Freund des Menschen");/
Dieser Befehl sagt dem Computer: „Gib den Text "Der Roboter ist der Freund des Menschen" auf dem Bildschirm aus.“

2. Methode main():
Ihr Programm kann, je nach Größe, aus einer oder mehreren Dateien bestehen. Und jede Datei enthält Befehle, die in Funktionen gruppiert sind (in Java nennt man sie auch Methoden). Ein minimales Java-Programm muss mindestens eine Methode haben, mit der seine Ausführung beginnt. Diese Methode heißt main().
Die Methode main() ist der Einstiegspunkt in Ihr Programm. Mit ihr beginnt die Ausführung des Codes immer. In Java 21 und höher kann ein minimales Programm aus nur einer Methode main() bestehen, die sogar keine Befehle enthalten muss.
Ein minimales Programm in Java 25 sieht so aus:
_____________________
|                    |
|    void main()     |
|    {               |
|    }               |
|                    |
______________________


3. Reihenfolge der Programmausführung
Ihr Programm führt die Befehle einfach von oben nach unten, Zeile für Zeile, aus. Wenn die Befehle zu Ende sind, beendet sich das programm.

void main() 
{
   System.out.println("Hallo zusammen!");
   System.out.println("Heute lernen wir, in Java zu programmieren!");
}

4. Wir schreiben und starten das erste Programm:

********************************************************************************************************************************
Schreiben Sie ein Java-Programm, das die folgende Zeile auf dem Bildschirm ausgibt: "Es ist toll, Programmierer zu sein!😎"

Anforderungen:
•	Das Programm soll die Zeile auf dem Bildschirm ausgeben: Es ist toll, Programmierer zu sein!😎
•	Zum Ausgeben des Textes soll der Ausdruck System.out.println verwendet werden.
*******************************************************************************************************************************

Lektion 2 (Ausgabe auf dem Bildschirm in Java: System.out.println und System.out.print):


