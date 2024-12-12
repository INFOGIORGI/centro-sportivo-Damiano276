public class CentroSportivo {
    private Map<String, Socio> soci;
    private Map<String, Istruttore> istruttori;
    private Map<Istruttore, List<Socio>> assegnazioni;
    private List<Attivita> attivita;

    public CentroSportivo() {
        soci = new HashMap<>();
        istruttori = new HashMap<>();
        assegnazioni = new HashMap<>();
        attivita = new ArrayList<>();
    }

    // Gestione Soci
    public boolean aggiungiSocio(String nome, String cognome, String codiceSocio) {
        if (soci.containsKey(codiceSocio)) return false;
        soci.put(codiceSocio, new Socio(nome, cognome, codiceSocio));
        return true;
    }
    public boolean rimuoviSocio(String codiceSocio) {
        Socio socio = soci.get(codiceSocio);
        if (socio == null) return false;
        for (List<Socio> listaSoci : assegnazioni.values()) {
            if (listaSoci.contains(socio)) return false;
        }
        soci.remove(codiceSocio);
        return true;
    }

    public Socio getSocio(String codiceSocio) {
        return soci.get(codiceSocio);
    }
     public boolean aggiungiIstruttore(String nome, String cognome, String codiceIstruttore) {
        if (istruttori.containsKey(codiceIstruttore)) return false;
        istruttori.put(codiceIstruttore, new Istruttore(nome, cognome, codiceIstruttore));
        return true;
    }

    public boolean rimuoviIstruttore(String codiceIstruttore) {
        Istruttore istruttore = istruttori.get(codiceIstruttore);
        if (istruttore == null || assegnazioni.containsKey(istruttore) && !assegnazioni.get(istruttore).isEmpty()) return false;
        istruttori.remove(codiceIstruttore);
        assegnazioni.remove(istruttore);
        return true;
    }

    public Istruttore getIstruttore(String codiceIstruttore) {
        return istruttori.get(codiceIstruttore);
    }