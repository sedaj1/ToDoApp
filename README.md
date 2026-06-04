Egy egyszerű, JavaFX-alapú feladatkezelő (To-Do) alkalmazás, amely segít a napi teendők nyomon követésében. A projekt Maven környezetben készült.

Funkciók
Feladatok hozzáadása: Új teendők beírása egy szöveges mezőbe, majd hozzáadása a listához a "+" gombbal.

Táblázatos megjelenítés: A feladatok egy átlátható és automatikusan átméreteződő TableView listában jelennek meg.

Állapotkezelés: A kiválasztott feladat a "Kész" gombra kattintva befejezetté nyilvánítható.

Vizuális visszajelzés: A befejezett feladatok sora automatikusan világoszöld háttérszínt kap.

Követelmények
Java verzió: JDK 17

Build eszköz: Maven

Grafikus könyvtár: JavaFX 17.0.6

Projekt felépítése
Main.java: Az alkalmazás grafikus felületéért (UI) és a gombok logikájáért felelős főosztály.

Task.java: A feladatok adatmodellje (név és állapot tárolása getterekkel és setterekkel).

pom.xml: A Maven konfigurációs fájl, amely tartalmazza a JavaFX függőségeket és beállításokat.

Futtatás
Az alkalmazás elindításához kövesd az alábbi lépéseket a fejlesztőkörnyezetben (pl. IntelliJ IDEA):

Nyisd meg a Main.java fájlt.

Görgess a fájl legaljára a Launcher osztályhoz.

Kattints a Launcher osztály melletti zöld háromszög ikonra.

Válaszd a Run 'Launcher.main()' opciót.
