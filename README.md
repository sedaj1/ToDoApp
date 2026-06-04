Todo-app (JavaFX + FXML)
Egy modern, MVC mintát követő feladatkezelő (To-Do) alkalmazás, amely JavaFX és FXML alapokon nyugszik. A felület vizuálisan is szerkeszthető a Scene Builder segítségével.

---

Funkciók
Feladatok hozzáadása: Új teendők beírása a szöveges mezőbe, majd listához adása a + gombbal.
Vizuális felület (FXML): A dizájn és a kód teljesen el van különítve egymástól a könnyebb szerkeszthetőségért.
Automatikus elrendezés: A feladatok egy dinamikusan méreteződő TableView táblázatban jelennek meg.
Állapotkezelés: A kijelölt feladat a "Kész" gombbal befejezetté tehető, ami után a sor automatikusan világoszöld háttérszínt kap.

---

Projekt felépítése
A kód a tiszta és átlátható struktúra érdekében több részre van osztva:

hello-view.fxml – A felhasználói felület (UI) XML leírása, amit Scene Builderben egérrel is lehet módosítani.
HelloApplication.java – A főprogram, amely betölti az FXML fájlt és elindítja az ablakot.
HelloController.java – A vezérlő (Controller) osztály, ez kezeli a gombok kattintásait és a táblázat logikáját.
Task.java – Az adatmodell, ami a feladat nevét és elkészültségi állapotát tárolja.
Launcher.java – Egy segédosztály, amivel a moduláris JavaFX hibák megkerülésével, simán elindítható a program.

---

Követelmények
Java verzió: JDK 17
Build eszköz: Maven
Grafikus könyvtár: JavaFX 17.0.6

---

Futtatás és Fejlesztés
Nyisd meg a projektet egy Java IDE-ben (pl. IntelliJ IDEA).
Ha a felületet szeretnéd módosítani, kattints jobb klikkel a hello-view.fxml fájlra, és válaszd az Open In Scene Builder lehetőséget.
A program futtatásához keresd meg a Launcher.java fájlt.
Kattints a Launcher osztály melletti zöld háromszög ikonra a kód szélén, és válaszd a Run 'Launcher.main()' opciót.
