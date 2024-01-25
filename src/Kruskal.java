import java.util.ArrayList;

public class Kruskal {
    private int[] k;
    private int pocetVrcholov;
    private ArrayList<Hrana> zoznamHranVzostupne;
    private ArrayList<Hrana> kostra;
    private int cenaKostry;

    public Kruskal(Input input) {
        this.cenaKostry = 0;
        this.pocetVrcholov = input.getPocetVrchol();
        this.k = new int[input.getPocetVrchol() + 1];

        for (int i = 1; i < this.k.length; i++) {
            this.k[i] = i;
        }

        input.sortZoznamHranByThirdColumn();
        this.zoznamHranVzostupne = input.getZoznamHran();

        this.kostra = new ArrayList<>();
    }

    public void zostrojKostru() {
        for (var aktualnaHrana : this.zoznamHranVzostupne) {
            if (this.kostra.size() == this.pocetVrcholov - 1) {
                break;
            }
            int u = aktualnaHrana.getVrcholZ();
            int v = aktualnaHrana.getVrcholDo();
            if (this.k[u] != this.k[v]) {
                this.cenaKostry += aktualnaHrana.getCena();
                this.kostra.add(aktualnaHrana);
                if (this.k[u] < this.k[v]) {
                    this.nastavRovnakyKomponent(this.k[v], this.k[u]);
                } else if (this.k[u] > this.k[v]) {
                    this.nastavRovnakyKomponent(this.k[u], this.k[v]);
                }
            }
        }
    }

    public void vypisKostru() {
        System.out.println("Vypis najlacnejsej kostry: ");
        for (var aktualnaHrana : this.kostra ) {
            System.out.printf("{%d, %d}; ", aktualnaHrana.getVrcholZ(), aktualnaHrana.getVrcholDo());
        }
        System.out.println("\nCena kostry je " + this.cenaKostry);
    }

    private void nastavRovnakyKomponent(int staraHodnota, int novaHodnota) {
        for (int i = 1; i < this.k.length; i++) {
            if (this.k[i] == staraHodnota) {
                this.k[i] = novaHodnota;
            }
        }
    }
}
