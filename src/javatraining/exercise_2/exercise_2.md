# Übungsblatt 2

#### <u>Hinweis:</u>
Dieses Übungsblatt ist bis spätestens 13.04.2017 abzugeben.

<br/>

###### <u>Übung 1:</u> Week.java
Schreiben Sie Sie ein Java-Programm, das vom Nutzer einen Termin (Tag, Monat)
abfragt und daraus den Folgetermin eine Woche später berechnet. Die Berechnung muss über
Monats- bzw. Jahresgrenzen hinweg funktionieren und die unterschiedliche Länge der Monate
berücksichtigen (stets 28 für den Februar). Ihre Lösung sollte möglichst kurz und verständlich sein.

Beispiele:

```$xslt
    Bitte Tag eingeben: 12
    Bitte Monat eingeben: 11
    Naechster Termin: 19.11.
    
    Bitte Tag eingeben: 25
    Bitte Monat eingeben: 10
    Naechster Termin: 1.11.
    
    Bitte Tag eingeben: 30
    Bitte Monat eingeben: 12
    Naechster Termin: 6.1.
```
<br/>

###### <u>Übung 2:</u> FairBears.java

Susi, Fred und Paul haben eine Packung mit roten und gelben Gummibärchen geschenkt bekommen. Um sie so fair wie möglich aufzuteilen, nehmen sie sich reihum je
ein rotes Bärchen, also zuerst Susi, dann Fred, dann Paul, dann wieder Susi etc., bis die roten Bärchen alle sind. Danach beginnt der nächste mit den gelben Bärchen, d.h., wenn Susi das
letzte rote Bärchen genommen hat, nimmt Fred das erste gelbe etc., bis auch diese aufgeteilt sind. Schreiben Sie ein Java-Programm, das für jeden der drei ausrechnet, wieviele rote und gelbe
Bärchen sie bekommen. Die Anzahl der Gummibärchen ist zunächst vom Nutzer abzufragen; Sie können davon ausgehen, dass er nur sinnvolle Werte eingibt. Das Programm darf nur die bisher behandelten Sprachkonstrukte (z.B. if , % , / ) verwenden, jedoch keine Schleifen!

Hier sind einige Beispiele, bei Ihnen müssen sich die gleichen Ergebnisse ergeben:

```$xslt
    Anzahl rote: 9
    Anzahl gelbe: 5
    Susi erhaelt 3 rote und 2 gelbe Gummibaerchen.
    Fred erhaelt 3 rote und 2 gelbe Gummibaerchen.
    Paul erhaelt 3 rote und 1 gelbe Gummibaerchen.
    
    Anzahl rote: 10
    Anzahl gelbe: 4
    Susi erhaelt 4 rote und 1 gelbe Gummibaerchen.
    Fred erhaelt 3 rote und 2 gelbe Gummibaerchen.
    Paul erhaelt 3 rote und 1 gelbe Gummibaerchen.
    
    Anzahl rote: 4
    Anzahl gelbe: 1
    Susi erhaelt 2 rote und 0 gelbe Gummibaerchen.
    Fred erhaelt 1 rote und 1 gelbe Gummibaerchen.
    Paul erhaelt 1 rote und 0 gelbe Gummibaerchen.
    
    Anzahl rote: 1001
    Anzahl gelbe: 9
    Susi erhaelt 334 rote und 3 gelbe Gummibaerchen.
    Fred erhaelt 334 rote und 3 gelbe Gummibaerchen.
    Paul erhaelt 333 rote und 3 gelbe Gummibaerchen.
```

<br/>

###### <u>Übung 3:</u> Phone.java

Schreiben Sie ein Java-Programm zum Abruf von Telefonnummern, das wie in
den beiden folgenden Beispielen arbeitet. Verwenden Sie
    *  eine switch -Anweisung und
    * ausschliesslich int -Variablen.
    
Beispiele:

```$xslt
    Verfuegbare Nummern:
        1   Susi
        2   Paul
        3   Fritz
        4   Eva
        5   Jan
    Wen moechtest du anrufen (bitte Zeilennummer eingeben): 2
    Pauls Telefonnummer lautet: (030) 6677195
    
    Verfuegbare Nummern:
        1   Susi
        2   Paul
        3   Fritz
        4   Eva
        5   Jan
    Wen moechtest du anrufen (bitte Zeilennummer eingeben): 0
    Fehlerhafte Eingabe
```

<br/>

###### <u>Übung 4:</u> Middle.java

Schreiben Sie ein Java-Programm, das vom Nutzer drei int -Zahlen abfragt und
dann die mittlere der drei Zahlen ausgibt. Sie dürfen voraussetzen, dass die eingegebenen Zah-
len verschieden sind.

Beispiel:
```$xslt
    Bitte 3 voneinander verschiedene Zahlen eingeben: 7 1 5
    Die mittlere Zahl ist  5
```
Zusatzanforderung: Versuchen Sie, mit möglichst wenigen Vergleichen auszukommen. Genauer gesagt soll das Programm nach Aufruf
mit konkreten Zahlen nur höchstens drei Vergleiche ausführen. Im Programmtext selbst dürfen
mehr Vergleiche stehen.

<br/>

###### <u>Übung 5:</u> AlarmClock.java

Schreiben Sie ein Java-Programm, das vom Nutzer die aktuelle Uhrzeit
sowie die Weckzeit abfragt und daraus berechnet, wieviele Minuten man noch schlafen kann.
Sie dürfen davon ausgehen, dass der Nutzer nur sinnvolle Werte eingibt, also 0 ≤ Stunde ≤
23 und 0 ≤ Minute ≤ 59. Hinweis: Sie erleichtern sich die Lösung, wenn Sie die Uhrzeiten
zunächst in Minuten umrechnen, z.B. 2.17 Uhr entspricht 2 · 60 + 17 = 137 Minuten. 

Beispiele:
```$xslt
    Aktuelle Uhrzeit (Stunde): 12
    Aktuelle Uhrzeit (Minute): 15
    Weckzeit (Stunde): 13
    Weckzeit (Minute): 30
    Du kannst noch 75 Minuten schlafen.
    
    Aktuelle Uhrzeit (Stunde): 23
    Aktuelle Uhrzeit (Minute): 10
    Weckzeit (Stunde): 0
    Weckzeit (Minute): 40
    Du kannst noch 90 Minuten schlafen.
    
    Aktuelle Uhrzeit (Stunde): 3
    Aktuelle Uhrzeit (Minute): 3
    Weckzeit (Stunde): 3
    Weckzeit (Minute): 3
    Du kannst noch 0 Minuten schlafen.
```