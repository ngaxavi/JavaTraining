# Übungsblatt 4


###### <u>Übung 1:</u> WriteReadNumbers.java
Schreiben Sie ein Java-Programm, das 20 Zufallszahlen zwischen 0 und
9 in eine Datei namens <b>20numbers.txt</b> schreibt. In der Datei soll je eine Zahl pro Zeile stehen.
Zusätzlich soll das Programm die Summe der geschriebenen Zahlen am Bildschirm ausgeben.
Danach werden die vorher geschriebenen 20 Zufallszahlen aus der Datei 20numbers.txt gelesen und die Summe der gelesenen Zahlen am Bildschirm
ausgibt. Setzen sie Methoden ein. z.B:
```$xslt
    Kontrollsumme beim Schreiben: 87
    Kontrollsumme beim Lesen: 87
```


<br/>

###### <u>Übung 2:</u> Statistics.java
Schreiben Sie ein Java-Programm, das zur Datei 20numbers.txt eine Statistik erstellt, wie oft welche der Zahlen zwischen 0 und 9 vorkommt. Lösen Sie die Aufgabe
mit Hilfe eines Arrays der Länge 10 (für die 10 möglichen Zahlen). Beispiel für Programmaufruf:
```$xslt
    Statistik:
    3-mal 0
    4-mal 1
    2-mal 2
    0-mal 3
    ...
```
<br/>

###### <u>Übung 3:</u> WriteAdvanced
Schreiben Sie ein Programm, dass folgendes leistet:
<ul>
<li> in die Datei Zufallszahlen zwischen 1 und 6 geschrieben werden,</li>
<li> die Datei mehrere Zeilen mit je mehreren Zufallszahlen (durch Leerzeichen getrennt) enthält </li>
<li> jede Zeile mit der Anzahl der Zufallszahlen in dieser Zeile beginnt, </li>
<li> die Anzahl der Zufallszahlen für jede Zeile vom Nutzer abgefragt wird,</li>
<li> das Programm bei der Nutzereingabe -1 abbricht und </li>
<li> zu jeder Zeile die Summe der geschriebenen Zahlen am Bildschirm angezeigt wird</li>
</ul>
Hier ein Beispiel für ein Programmaufruf:

```$xslt
   Anzahl Zufallszahlen  in 1-ter Zeile: 4
   Kontrollsumme: 19
   Anzahl Zufallszahlen  in 2-ter Zeile: 7
   Kontrollsumme: 28
   Anzahl Zufallszahlen  in 3-ter Zeile: 2
   Kontrollsumme: 8 
   Anzahl Zufallszahlen in 4-ter Zeile: -1
   
```
und die dabei erzeugte Datei <b>advancedNumbers.txt</b>
```$xslt
    4 6 1 6 6
    7 4 6 2 6 5 1 4
    2 2 6
```

<br/>

###### <u>Übung 4:</u> StatisticsAdvanced.java
Schreiben Sie ein Programm, das folgendes leistet:

<ul>
<li> die Zahlen aus der Datei advancedNumbers.txt mit dem in Aufgabe 3) beschriebenen
    Format eingelesen werden, </li>
<li> nach jeder Zeile eine Statistik zu dieser Zeile und </li>
<li> am Ende eine Gesamtstatistik ausgegeben wird. </li>
</ul>

Beispiel für Programmaufruf (die 1-te Zeile enthält 1-mal Eins und
3-mal Sechs etc.):

```$xslt
    1-te Zeile:     1 0 0 0 0 3
    2-te Zeile:     1 1 0 2 1 2
    3-te Zeile:     0 1 0 0 0 1
    Insgesamt:   2 2 0 2 1 6
```