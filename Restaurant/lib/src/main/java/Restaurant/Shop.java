package Restaurant;
import java.util.ArrayList;
import java.util.List;

public class Shop implements IReview {
    String name;
    String description;
    int dollar;
    List<Review> reviews = new ArrayList<>();


    public Shop(String name, String description, int dollar) {
        this.name = name;
        this.description = description;
        this.dollar = dollar;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", dollar=" + dollar +
                ", reviews=" + reviews +
                '}';
    }

    @Override
    public void addReview(String body, String author, int numOfStars) {
        Review newRev = new Review(body,author,numOfStars);
        if(! reviews.contains(newRev))
            reviews.add(newRev);
    }
}