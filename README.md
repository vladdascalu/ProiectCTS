# ProiectCTS

1.	Definirea si detalierea pattern-urilor utilizate
Am folosit 3 design pattern-uri pentru dezvoltarea unei aplicatii care scrie intr-un fisier (log) doua feluri de activitati: 
Sedinte sau Sarcini. Pentru acest pas am folosit Factory pentru a crea o sedinta sau o sarcina dintr-un obiect Activitate 
(Clasa abstracta), iar sedinta si sarcina sunt puse intr-o enumeratie pentru a evita erorile utilizatorilor. Meeting si Task 
sunt derivate din Activity.
Pentru a seta atributele obiectelor sedinta sau sarcina am folosit Builder. Exista clasele MeetingBuilder si TaskBuilder. 
Fiecare setter returneaza un obiect de tip MeetngBuilder, respectiv TaskBuilder si exista metoda build() care construieste 
obiectul Meeting, respectiv Task. 
Pentru a scrie log-uri in fisier, am creeat o clasa LoggerSingleton, care are constructor privat si metoda statica 
scrieLogInFisier(String). Aceasta apeleaza metoda statica si sincronizata specifica pattern-ului getInstance() pentru a 
exista o singura instanta de Logger care sa scrie in fisier.

2.	Definirea si descrierea Test Case-urilor si metodelor testate prin Unit Testing.
Am creat 5 Test Case-uri, fiecare pentru o anumita clasa: Factory, LoggerSingleton, Main, Meeting si Task. In TestFactory 
exista metoda de setUp() care initializeaza obiectul factory inainte de fiecare test pentru a se lucra cu el. 
Metoda tearDown() reseteaza obiectele factory si activity (le atribuie valori nule). Prin doua teste se verifica 
tipul clasei din care face parte obiectul activity, dupa ce este instantiat cu ajutorul obiectului factory.
In TestLoggerSingleton se atribuie obiectului logger instant unica, dupa care se verifica daca logger este egal cu o 
alta instantiere a clasei LoggerSingleton. In functia testScrieLogInFisier() se scrie un mesaj in fisier, dupa care se 
citeste mesajul din fisier si se verifica identitantea celor doua mesaje. 

In TestMain se pregateste fisierul si BufferedReaderu-ul in setUpBeforeClass(). In teste se verifica citirea de la 
consola, datele fiind luate dintr-un fisier de test, si functia chooseActivity() din ProcMain.

In TestMeeting se creaza obiectul meetingMock si ceea ce trebuie sa returneze fiecare getter in functia setUp().
In teste se verifica getterii si setterii cu diverse valori de input.

In TestTasj se creaza obiectul testMock si valorile pe care sa le returneze getteri, dupa care se testeaza getterii
si setterii cu diverse valori, in cadrul testelor automate.

3.	Definirea si descrierea Test Suite-ului
Am creat 2 clase de Test Suite. Una cu toate testele – AllTests – si una cu toate testele, mai putin cele care au 
nevoie de input de la consola – AllTestsNoConsoleInput.

