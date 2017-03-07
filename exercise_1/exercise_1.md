# Übungsblatt 1

#### <u>Hinweis:</u>
Dieses Übungsblatt ist bis spätestens 06.04.2017 abzugeben. Danach wird jede Woche ein Übungsblatt hochgeladen, dessen Abgabe am Ende der Woche(spätestens am Freitag) erfolgen muss.

<br/>

###### <u>Übung 1:</u> Polymonial.java

Sie möchten für verschiedene Eingaben x das Polynom 7x^2 + 5x + 3 berechnen. Schreiben Sie ein Programm, welches die drei vorgegebenen Faktoren als Konstanten anlegt, eine Eingabe für x entgegen nimmt und das Ergebnis am Bildschirm ausgibt.
Ein Beispielablauf könnte sein:

  ```
  Wir berechnen das Polynom 7x^2 + 5x + 3.
  Bitte eine Zahl fuer "x" eingeben: 3
  Ergebnis: 81
  ```

<br/>

###### <u>Übung 2:</u> Fraction.java

Schreiben Sie ein Java-Programm, das vom Nutzer die Zahlen <i><b>wholePart1,
numerator1, denominator1, wholePart2, numerator2 </b></i>und <i><b>denominator2</b></i> abfragt und
dann die Brüche sowie das Ergebnis der Addition in der folgenden Form am Bildschirm aus-
gibt.
Dabei sollen weder das Zwischen- noch das Endergebnis gekürzt werden.

```
  Ganzzahl1 eingeben: 1
  Zaehler1 eingeben: 1
  Nenner1 eingeben: 2
  Ganzzahl2 eingeben: 1
  Zaehler2 eingeben: 2
  Nenner2 eingeben: 3
  1 + 1/2 + 1 + 2/3 = 2 + 7/6 = 19/6
```

<br/>

###### <u>Übung 3:</u> Dach.java

Geben Sie ein Programm an, die folgenden Satz am Bildschirm ausgibt. Achten Sie auf eine identische Darstellung inklusive der Anführungszeichen:
```
Das hier ist ein schoenes Dach: "/\"
```

<br/>

###### <u>Übung 4:</u> Swap.java

Programmieren Sie den Algorithmus zum Vertauschen zweier Variableninhalte. Fragen Sie Werte für x und y vom Nutzer ab. Beachten Sie, dass die Inhalte von Variablen getauscht werden müssen; es genügt nicht, dass die korrekte Ausschrift erscheint. Ihre Ausgabe sollte bezüglich der Zeilenaufteilung genauso aussehen wie im folgenden Beispiel gezeigt. Am Programmende soll in die nächste Zeile gewechselt werden, d.h., die nächste Eingabeaufforderung des Betriebssystems darf nicht hinter y = 3 stehen.

```
  Bitte x eingeben: 3
  Bitte y eingeben: 4
  Variableninhalte nach Tausch: x = 4, y = 3
```

<br/>

###### <u>Übung 5:</u> Refund.java

Ein Supermarkt verkauft Mineralwasser in Kisten zu je 9 Flaschen. Pro Flasche wird ein Pfand von 20 Cent, pro leerer Kiste ein Pfand von 500 Cent erhoben. Schreiben Sie ein Java-Programm für die Leergut-Rückgabe. Das Programm soll die Anzahl zurückgegebener voller Kisten sowie die Anzahl zusätzlich zurückgegebener Einzelflaschen abfragen. Es soll daraus den zu erstattenden Betrag (in Cent) berechnen.<br/>
Beispiel:
```
  Anzahl zurueckgegebener voller Kisten: 2
  Anzahl zurueckgegebener Einzelflaschen: 3
  Sie erhalten 1420 Cent.
```
Sie dürfen ohne Überprüfung davon ausgehen, dass der Nutzer nur kleine nichtnegative Zahlen
eingibt. Die Ausgabe sollte bezüglich Leerzeichen und Zeilenwechseln genauso aussehen wie im Beispiel gezeigt. Verwenden Sie in sinnvoller Weise benannte Konstanten.

<br/>

###### <u>Übung 6:</u> RefundPlus.java

Erweitern Sie Ihr Programm aus Übung 5, so dass es den Betrag zusätzlich in Euro und Cent ausgibt. <br/>
Beispiele:
```
  Anzahl zurueckgegebener voller Kisten: 2
  Anzahl zurueckgegebener Einzelflaschen: 3
  Sie erhalten 1420 Cent.
  Das sind 14 Euro und 20 Cent.

  Anzahl zurueckgegebener voller Kisten: 0
  Anzahl zurueckgegebener Einzelflaschen: 5
  Sie erhalten 100 Cent.
  Das sind 1 Euro und 0 Cent.

  Anzahl zurueckgegebener voller Kisten: 0
  Anzahl zurueckgegebener Einzelflaschen: 2
  Sie erhalten 40 Cent.  
  Das sind 0 Euro und 40 Cent.
```
