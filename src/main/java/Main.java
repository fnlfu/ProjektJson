import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args)
    {
        Movies[] Lista;
        Loader load = new Loader();
        Lista = load.LoadJson();
        //Lista = load.LoadXML();
        Menu menu = new Menu(Lista);
        menu.menu(parseInt(menu.getValue(menu.menu1,true)));
        System.out.println("SSS");
    }


}
