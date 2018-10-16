import java.util.List;

public class Movies {
    private String title, date;
    private String[] genres;
    private List<Person> director;
    private List<Person> aktor1;
    private List<Person> aktor2;



    private String ShowGenre() {
        String tmp = "";
        for (String genre : genres) {
            tmp = tmp + genre + ",  ";
        }
        return tmp;
    }

    public void showFilm() {
        System.out.println("Movies pt. " + title + ". Rerzyserii " + director.get(0).getImieNazwisko() + ". Gatunki " + ShowGenre());
    }

    public String getTitle() {
        return title;
    }

    public String getDate() {
        return date;
    }

    public String  getDirector() {
        return director.toString();
    }
}