public class Attività {
    private String nome;
    private String descrizione;
    private Date scadenza;
    private boolean completata;
    public Attività(String nome, String descrizione, Date scadenza, boolean completata) {
        this.nome = nome;
        this.descrizione = descrizione;
        this.scadenza = scadenza;
        this.completata = completata;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public Date getScadenza() {
        return scadenza;
    }

    public void setScadenza(Date scadenza) {
        this.scadenza = scadenza;
    }

    public boolean isCompletata() {
        return completata;
    }

    public void setCompletata(boolean completata) {
        this.completata = completata;
    }


    }
// Costruttore, metodi getter e setter
}
