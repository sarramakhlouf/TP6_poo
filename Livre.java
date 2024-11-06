class Livre extends Article
{
    private String NomEditeur;
    public Livre (String title,int id,int nbpages,String Auteur,String Editeur)
    {
        super(title,id,nbpages,Auteur);
        this.NomEditeur=Editeur;
    }
}