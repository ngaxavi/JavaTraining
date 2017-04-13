# Übungsblatt 3


###### <u>Übung 1:</u> Numbers0to9.java
Schreiben Sie ein Java-Programm, das vom Nutzer die gewünschte Zeilenzahl abfragt und dann in der ersten Zeile eine 1, in der zweiten Zeile zwei 2en etc. ausgibt.
Dabei soll jeweils nur die letzte Ziffer der Zeilennummer erscheinen, also statt zehn 10en nur
zehn 0en etc. Beispiel:

```$xslt
    Anzahl Zeilen: 12
    1
    22
    333
    4444
    55555
    666666
    7777777
    88888888
    999999999
    0000000000
    11111111111
    222222222222
```
<br/>

###### <u>Übung 2:</u> Factoring.java
Schreiben Sie ein Java-Programm, das vom Nutzer eine Zahl abfragt und
dann die zugehörige Primzahlzerlegung ausgibt. Achten Sie darauf, dass am Anfang/Ende der
Ausgabe keine zusätzlichen * -Zeichen stehen dürfen. Beispiele:

```$xslt
    Zahl eingeben: 24
    24 = 2 * 2 * 2 * 3
    
    Zahl eingeben: 50
    50 = 2 * 5 * 5
    
    Zahl eingeben: 29
    29 = 29
```
<br/>

###### <u>Übung 3:</u> Chessboard.java
Modifizieren Sie Ihr Programm aus a), so dass es n Zeilen mit je n Zeichen
’*’ bzw. ’o’ im Schachbrettmuster ausgibt, z.B.

```$xslt
    n = 8
    o*o*o*o*
    *o*o*o*o
    o*o*o*o*
    *o*o*o*o
    o*o*o*o*
    *o*o*o*o
    o*o*o*o*
    *o*o*o*o
```

Hinweis: Ob die Zeichen exakt untereinander stehen, hängt von der Schriftart ab und ist für die
Lösung egal.

<br/>

###### <u>Übung 4:</u> BestDistance.java
Schreiben Sie ein Programm, welches eine ”Basiszahl” vom Nutzer einliest. Anschließend soll das Programm so lange Vergleichszahlen vom Nutzer einlesen,
bis dieser das Programm durch Eingabe von -1 beendet. Das Programm soll von den eingegebenen Vergleichszahlen die jenige herausfinden, deren Betrag dem Betrag der Basiszahl am
nächsten liegt und außerdem ausgeben, um die wievielte Vergleichszahl es sich dabei handelt.
Damit ist auch das Programm beendet.<br/>
Setzen Sie <b>mindestens eine Methode</b> ein. Sie dürfen davon ausgehen, dass der Nutzer nur sinnvolle Eingaben durchführt.
Sollte jedoch als erste Vergleichszahl bereits eine -1 eingegeben werden, brechen Sie das Programm mit einer entsprechenden Meldung ab.

```$xslt
    Geben Sie die Basiszahl ein: 12.1
    Geben Sie eine Zahl ein: -9
    Geben Sie eine Zahl ein: 6.8
    Geben Sie eine Zahl ein: -1
    Die 1. Zahl mit dem Wert -9.0 ist am naechsten dran.
    
    Geben Sie die Basiszahl ein: -6.99
    Geben Sie eine Zahl ein: 7.034
    Geben Sie eine Zahl ein: -6.66
    Geben Sie eine Zahl ein: 10.1
    Geben Sie eine Zahl ein: -1
    Die 1. Zahl mit dem Wert 7.034 ist am naechsten dran.
    
    Geben Sie die Basiszahl ein: 3.33
    Geben Sie eine Zahl ein: 6.2
    Geben Sie eine Zahl ein: 1.21
    Geben Sie eine Zahl ein: -2
    Geben Sie eine Zahl ein: -1
    Die 3. Zahl mit dem Wert -2.0 ist am naechsten dran.
    
    Geben Sie die Basiszahl ein: 76.6
    Geben Sie eine Zahl ein: -1
    Es wurde keine Vergleichszahl angegeben.
```

<br/>

###### <u>Übung 5:</u> Carpets.java

Der Preis pro Quadratmeter Teppichboden beträgt 15 Euro falls eine der Seiten kürzer als 2 Meter ist und 10 Euro sonst. Schreiben Sie ein Programm, das vom Nutzer
wiederholt die Seitenlänge gewünschter rechteckiger Teppichstücke abfragt und als Ergebnis
den Gesamtpreis ausgibt. Die Längenangaben sollen ganzzahlig sein. Die Abfrage soll abbrechen, sobald der Nutzer bei Länge oder Breite eine 0 eintippt. <b>Verwenden Sie eine Methode</b>,
um den Preis eines einzelnen Teppichstücks zu berechnen. Der Methode sollen als Parameter
Länge und Breite des Teppichstücks übergeben werden.

```$xslt
    Nächster Teppich
    Länge: 4
    Breite: 6
    
    Nächster Teppich
    Länge: 7
    Breite: 3
    
    Nächster Teppich
    Länge: 0
    Preis: 450 Euro
```