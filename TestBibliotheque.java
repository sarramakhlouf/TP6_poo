public class TestBibliotheque {
    public static void main(String[] args) {
        Bibliotheque biblio = new Bibliotheque(10);
        Document doc1 = new Document("document1", 3, 500);
        Article art1 = new Article("Article1", 3, 400, "Auteur1");
        Livre livre1 = new Livre("livre1", 3, 800, "Auteur1", "editeur1");
        Periodique periodique1 = new Periodique("periodique1", 4, 200, 8);
        biblio.Ajout_doc(doc1);
        biblio.Ajout_doc(art1);
        biblio.Ajout_doc(livre1);
        biblio.Ajout_doc(periodique1);
        System.out.println("Inventaire complet:");
        biblio.Inventaire_doc();
        System.out.println("Afficher seulement les livres:");
        Bibliotheque livres = biblio.liste_livre();
        livres.Inventaire_doc();
        System.out.println("Afficher seulement les articles:");
        Bibliotheque articles = biblio.liste_article();
        articles.Inventaire_doc();
        System.out.println("Afficher seulement les documents simples:");
        Bibliotheque docsSimples = biblio.liste_docsimples();
        docsSimples.Inventaire_doc();
        System.out.println("Afficher seulement les périodiques:");
        Bibliotheque periodiques = biblio.liste_periodique();
        periodiques.Inventaire_doc();
        System.out.println("Supprimer un document (NumId: 3)");
        biblio.Supprim_doc(3);
        System.out.println("Inventaire après suppression:");
        biblio.Inventaire_doc();
    }
}
