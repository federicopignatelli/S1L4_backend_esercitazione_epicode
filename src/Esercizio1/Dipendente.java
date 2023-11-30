package Esercizio1;

public class Dipendente {


    //ATTRIBUTI
    public static int stipendioBase = 1000;
    private static int matricola = 456575;
    private static int stipendio = stipendioBase;
    private static double importoOrarioStraordinario = 18.60;
    private enum Livello {
            OPERAIO,
            IMPIEGATO,
            QUADRO,
            DIRIGENTE
    }
    private Livello livello;
    private enum Dipartimento {
            PRODUZIONE,
            AMMINISTRAZIONE,
            VENDITE,
    }
    private Dipartimento dipartimento;


    //GETTER
    public int getStipendioBase() {
        return stipendioBase;
    }

    public int getMatricola() {
        return matricola;
    }

    public int getStipendio() {
        return stipendio;
    }

    public double getImportoOrarioStraordinario() {
        return importoOrarioStraordinario;
    }

    public static void setImportoOrarioStraordinario(double importoOrarioStraordinario) {
        Dipendente.importoOrarioStraordinario = importoOrarioStraordinario;
    }
    public Livello getLivello() {
        return livello;
    }
    public Dipartimento getDipartimento() {
        return dipartimento;
    }


    //COSTRUTTORI
    public Dipendente(int matricola, Dipartimento dipartimento){
        this.stipendio = stipendioBase;
        this.importoOrarioStraordinario = 30;
        this.livello = Livello.OPERAIO;
    }

    public Dipendente(
            int matricola,
            int stipendio,
            double importoOrarioStraordinario,
            Livello livello,
            Dipartimento dipartimento
            ){}


    //METODI
    @Override
    public String toString() {
        return "Dipendente{" +
                " Numero matricola: " + matricola +
                ", Stipendio dipendente: " + stipendio +
                ", Importo orario straordinario: " + importoOrarioStraordinario +
                ", Livello dipendente: " + livello +
                ", Dipartimento dipendente: " + dipartimento +
                '}';
    }

    public void promuovi(){
        if (this.livello == Livello.OPERAIO){
            this.livello = Livello.IMPIEGATO;
        }
        if (this.livello == Livello.IMPIEGATO){
            this.livello = Livello.QUADRO;
        }
        if (this.livello == Livello.QUADRO){
            this.livello = Livello.DIRIGENTE;
        }
        if (this.livello == Livello.DIRIGENTE){
            System.out.println("you're already the boss");
        }
    }


    /*  public static void stampaDatiDipendente(){
        System.out.println("Numero matricola: "+ matricola);
        System.out.println("Stipendio dipendente: "+ matricola);
        System.out.println("Importo Orario Straordinario: "+ importoOrarioStraordinario);
        System.out.println("Livello dipendente: "+ matricola);
        System.out.println("numero matricola: "+ matricola);
    }*/
}
