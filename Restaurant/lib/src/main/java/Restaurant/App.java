package Restaurant;

public class App {
    public static void main(String[] args) {

        Restaurant restaurant1 = new Restaurant("bader",3,"mohamad");
        System.out.println(restaurant1.toString());
        restaurant1.addReview("good", "bader", 2);
        restaurant1.addReview("bad", "khaled", 2);
        restaurant1.addReview("amazing", "noor", 4);

        System.out.println(restaurant1.toString());


        System.out.println();
        System.out.println();
        Shop lipsy = new Shop("lipsy london", "sales", 20);
        System.out.println(lipsy.toString());
        lipsy.addReview("good lipsy", "noor", 2);
        lipsy.addReview(" russa", "ahmad", 5);
        lipsy.addReview(" food", "abdalla", 1);
        System.out.println(lipsy.toString());
        System.out.println();
        System.out.println();
        Theater theater = new Theater("ASAC");
        System.out.println(theater.toString());
        theater.addMovie("LORD OF THE RING");
        theater.addMovie("GAME OF THRONE ");
        theater.addMovie("HANGER GAMES");
        theater.addMovie("JOKER");
        theater.addMovie("VIKING");
        theater.addReview("good toys", "aseel", 2);;
        System.out.println(theater.toString());
        theater.removeMovie("LORD OF THE RING");
        theater.removeMovie("JOKER");
        System.out.println(theater.toString());

    }
}