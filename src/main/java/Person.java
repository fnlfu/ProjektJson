public class Person {

    private String imie;
    private String nazwisko;


    public String getImieNazwisko(){
        return imie+" "+nazwisko;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
}
