import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Menu {

    String menu1 = "Serch by\n1. title\n2. director\n3. Production year\n";
    String menu2 = "1.menu\n2.exit\n";
    Movies[] Lista;

    public Menu(Movies[] lista) {
        Lista = lista;
    }

    public void menu(int i){
        switch (i){
            case 1:
                search(i,getValue("What title?",true));
//                System.out.println(Lista[0].getTitle());
                break;
            case 2:
                search(i,getValue("name and surmane of director?",true));
                break;
            case 3:
                search(i,getValue("Year of production?",true));
                break;
            default:
                break;

        }
    }
    private void search(int where,String what){
        switch (where){
            case 1:
                for (Movies movie: Lista) {
                    if (movie.getTitle().contains(what))
                        movie.showFilm();
                }
                break;
            case 2:
                for (Movies movie: Lista) {
                    if (movie.getDirector().contains(what))
                        movie.showFilm();
                }
                break;
            case 3:
                for (Movies movie: Lista) {
                    if (movie.getDate().contains(what))
                        movie.showFilm();
                }
                break;
        }

        if (getValue(menu2,false).contains("1"))
            menu(parseInt(getValue(menu1,true)));
        else
            return;
    }

    public String getValue(String txt,boolean fush){
        System.out.flush();
        System.out.println(txt);
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

}
