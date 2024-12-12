public class Socio {
    private String nome;
    private String cognome;
    private String codiceSocio;

    public Socio(String nome, String cognome, String codiceSocio) {
        this.nome = nome;
        this.cognome = cognome;
        this.codiceSocio = codiceSocio;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getCodiceSocio() {
        return codiceSocio;
    }