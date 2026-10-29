# Bibliotekssystemet

## Om projektet

Bibliotekssystemet är ett Java-baserat konsolprogram som hjälper ett litet bibliotek att hålla reda på sina böcker och utlåningar.

Programmet låter användaren registrera böcker, söka efter titlar, låna ut böcker och registrera återlämningar. Det kontrollerar även att varje bok har ett unikt bok-ID och att en redan utlånad bok inte kan lånas ut igen.

## Funktioner

- [x] Registrera nya böcker med titel, författare och bok-ID.
- [x] Kontrollera att bok-ID är ett heltal mellan 1000 och 9999.
- [x] Förhindra att samma bok-ID registreras flera gånger.
- [x] Visa alla registrerade böcker.
- [x] Söka efter en bok med titel, oberoende av stora och små bokstäver.
- [x] Låna ut en bok.
- [x] Förhindra utlåning av en redan utlånad bok.
- [x] Registrera återlämning av en bok.
- [x] Förhindra att en redan återlämnad bok återlämnas igen.
- [x] Visa endast tillgängliga böcker.
- [x] Visa antalet registrerade böcker.
- [x] Hantera felaktig inmatning i menyn och vid registrering av bok-ID.
- [x] Avsluta programmet via menyn.

## Klassstruktur

### `Book`

Representerar en bok och ansvarar för dess information och utlåningsstatus.

Klassen innehåller:
- Titel, författare och unikt bok-ID.
- Information om boken är tillgänglig.
- Metoder för att låna ut och återlämna en bok.
- Getters för att läsa bokens information.

### `Library`

Hanterar bibliotekets samling av böcker.

Klassen ansvarar för att:
- Registrera böcker och kontrollera att bok-ID är unikt.
- Visa alla böcker.
- Söka efter böcker med titel.
- Visa tillgängliga böcker.
- Räkna antalet registrerade böcker.

### `Main`

Innehåller programmets meny och hanterar användarens val.

Klassen ansvarar för att:
- Ta emot och hantera användarens inmatning.
- Anropa rätt metoder i `Library` och `Book`.
- Hantera felaktiga menyval och bok-ID:n.
- Fortsätta visa menyn tills användaren väljer att avsluta.

## Testning

Följande funktioner har testats manuellt:

- Registrering av böcker med giltiga bok-ID:n.
- Avvisning av bokstäver och ID:n utanför det tillåtna intervallet.
- Avvisning av redan registrerade bok-ID:n.
- Sökning med både stora och små bokstäver.
- Utlåning och återlämning av böcker.
- Avvisning av upprepad utlåning och återlämning.
- Visning av tillgängliga böcker och totalt antal böcker.
- Hantering av felaktiga menyval och avslut av programmet.

## Teknik

- Java
- `ArrayList` och `List` för att lagra böcker.
- `Scanner` för att läsa användarens inmatning.
- Git och GitHub för versionshantering.

