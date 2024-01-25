*Kruskalov algoritmus II.**
_____________________________________

Kruskalov algoritmus II. na hľadanie najlacnejšej kostry súvislého hranovo ohodnoteného grafu.

________________________________________
**Popis fungovania algoritmu**:
- Krok 1. Zoraď hrany podľa ich ohodnotenia vzostupne (zostupne) do postupnosti P.
- Krok 2. Pre každý vrchol i Є V polož k(i) = i . //k-komponent
- Krok 3. Nech prvá hrana v postupnosti P je hrana {u, v}. Vylúč hranu {u, v} z postupnosti P. Ak
k(u) != k(v), zaraď hranu {u, v} do kostry, vypočítaj kmin = min(k(u), k(v)), kmax = max(k(u),
k(v)), a i Є V , pre ktoré k(i) = kmax, polož k(i) == kmin.
- Krok 4. Ak je počet vybraných hrán rovný |V| − 1 alebo ak je postupnosť P prázdna, STOP.
Inak GOTO krok 3
________________________________________
**Ako spustiť**:

Ku algoritmu sú dostupné aj vstupné údaje(grafy). V main class stači premenovať názov vstupného súboru a spustiť.

________________________________________
Tento algoritmus som programoval na predmet Algoritmická teória grafov.
Ma slúžiť na inspiráciu a odkontrolovanie si vysledkov.
