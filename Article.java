class Article extends Document 
{
    private String NomAuteur;
    public Article (String title,int id,int nbpages,String Auteur)
    {
        super(title,id,nbpages);
        this.NomAuteur=Auteur;
    }
}