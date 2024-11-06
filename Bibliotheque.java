public class Bibliotheque {
    private Document[] ListDoc;
    private int capacite;
    private int nbDocs;

    public Bibliotheque(int capacite) {
        this.ListDoc = new Document[capacite]; 
        this.capacite = capacite;
        this.nbDocs = 0; 
    }

    public int getCapacite() {
        return capacite;
    }

    public void Ajout_doc(Document d) {
        if (nbDocs < capacite) { 
            ListDoc[nbDocs] = d;
            nbDocs++;
            for (int i = 0; i < nbDocs - 1; i++) {
                int min = i;
                for (int j = i + 1; j < nbDocs; j++) {
                    if (ListDoc[j].GetNumId() < ListDoc[min].GetNumId()) {
                        min = j;
                    }
                }
                Document temp = ListDoc[min];
                ListDoc[min] = ListDoc[i];
                ListDoc[i] = temp;
            }
        } else {
            System.out.println("La bibliothèque est pleine.");
        }
    }

    public void Supprim_doc(int num) {
        boolean trouve = false;
        for (int i = 0; i < nbDocs; i++) {
            if (ListDoc[i].GetNumId() == num) { 
                trouve = true;
                for (int j = i; j < nbDocs - 1; j++) {
                    ListDoc[j] = ListDoc[j + 1];
                }
                ListDoc[nbDocs - 1] = null;
                nbDocs--;
                break;
            }
        }
        if (!trouve) {
            System.out.println("Document non trouvé");
        }
    }

    public void Inventaire_doc() {
        System.out.println("Inventaire dans la bibliothèque");
        for (int i = 0; i < nbDocs; i++) {
            ListDoc[i].Edition(); 
        }
    }

    public Bibliotheque liste_livre() {
        Bibliotheque Livres = new Bibliotheque(capacite);
        for (int i = 0; i < nbDocs; i++) {
            if (ListDoc[i] instanceof Livre) { 
                Livres.Ajout_doc(ListDoc[i]);
            }
        }
        return Livres;
    }

    public Bibliotheque liste_article() {
        Bibliotheque Articles = new Bibliotheque(capacite);
        for (int i = 0; i < nbDocs; i++) {
            if (ListDoc[i] instanceof Article) {
                Articles.Ajout_doc(ListDoc[i]);
            }
        }
        return Articles;
    }

    public Bibliotheque liste_docsimples() {
        Bibliotheque DocsSimples = new Bibliotheque(capacite);
        for (int i = 0; i < nbDocs; i++) {
            if (!(ListDoc[i] instanceof Article) && !(ListDoc[i] instanceof Periodique)) {
                DocsSimples.Ajout_doc(ListDoc[i]);
            }
        }
        return DocsSimples;
    }

    public Bibliotheque liste_periodique() {
        Bibliotheque Periodiques = new Bibliotheque(capacite);
        for (int i = 0; i < nbDocs; i++) {
            if (ListDoc[i] instanceof Periodique) {
                Periodiques.Ajout_doc(ListDoc[i]);
            }
        }
        return Periodiques;
    }
}
