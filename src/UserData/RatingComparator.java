package UserData;

import Exercises.Exercises;

import java.util.Comparator;
import Enums.Exercise;

public class RatingComparator implements Comparator<Exercises> {

    @Override
    public int compare(Exercises object1, Exercises object2) {

        int rating = object2.getRating() - object1.getRating();
        if (rating == 0) {
            int rates = object2.getRates() - object1.getRates();
            if (rates == 0) {
                return object2.getClass().hashCode() - object1.getClass().hashCode();
            }
            return rates;
        }
        return rating;
    }
}
