public class Document
{
   private String titre;
   private int NumId;
   private int nbPages; 
   public Document (String title,int id,int nbpages)
   {
        this.titre=title;
        this.NumId=id;
        this.nbPages=nbpages;
   }
   String GetTitre ()
   {
        return titre;
   }
   int GetNumId ()
   {
        return NumId;
   }
   int GetnbPages ()
   {
        return nbPages;
   }
   void SetTitre (String T)
   {
        this.titre=T;
   }
   void SetNumId (int N_id)
   {
        this.NumId=N_id;
   }
   void SetnbPages (int nbPages)
   {
        this.nbPages=nbPages;
   }
   void Edition()
   {
        System.out.println("type:Document de titre :"+titre+"");
        System.out.println ("et numéro d'identification:"+NumId+"");
        System.out.println ("et nb de pages:"+nbPages);

   }
}

