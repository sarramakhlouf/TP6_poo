class Periodique extends Document 
{
    private int FrequenceParution;
    public Periodique (String title,int id,int nbpages,int Frequence)
    {
        super(title,id,nbpages);
        this.FrequenceParution=Frequence;
    }
}