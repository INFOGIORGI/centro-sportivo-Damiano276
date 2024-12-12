public class Istruttore{
private String nome;
private String cognome;
private String codiceIstruttore;

public Istruttore(String nome,String cognome,String codiceIstruttore){
this.nome=nome;
this.cognome=cognome;
this.codiceIstruttore=codiceIstruttore;
}
public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getCodiceIstruttore() {
        return codiceIstruttore;
    }

}