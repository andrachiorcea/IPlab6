# IPlab6
Software Evolution

Scrum Master / Developer: Victor Pescaru
Developer: Andra Chiorcea, Ilinca Topciu
Testers: Alexandru Drumea, Oana Hriscu

Victor Pescaru: Search Class -  dev + testing

Andra Chiorcea: Search Class - dev + testing

Ilinca Topciu: Swing Interface

Alexandru Drumea: Testing

Oana Hriscu: Testing

SOLID analiza

1. Single Responsibility
	
	Clasa Search storeaza criteriile dupa care se efectuaza un search. Aceasta arunca exceptii este cazul, seteaza datele si suparta querry-uri asupra datelor.
	Clasa Grafica se ocaupa doar de displayul grafic, nu si de datele in sine, acestea fiind gestionate prin clasa search.

2. Open to Extension/ Closed to Modification
	
	Clasa Search permite adaugarea de noi componente intrucat campurile nu sunt initializate in constructor, ci printr-un builder,
	astfel incat se pot adauga noi componenete de search si extinsa cu usurinta.

3. LSP
	
	Principiu LSP are loc intrucat singurule caz de subtip este pentru clasa de exceptie InvalidLanguageException si clasele de grafica GPanel si GInteface
	care pastreaza comportamentul claselor de baza.
	
4. ISP

	Toate metodele sunt folosite asadar functionale.
	
5. DIP
	
	Modulele High Level nu depind de cele Low Level. De exemplu clasele de grafica nu depind de clasele de date.