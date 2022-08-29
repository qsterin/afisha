import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {
    String movie1 = "movie1";
    String movie2 = "movie2";
    String movie3 = "movie3";
    String movie4 = "movie4";
    String movie5 = "movie5";

    @Test
    public void moviesList() {
        MovieManager movieManager = new MovieManager();

        movieManager.add(movie1);
        movieManager.add(movie2);
        movieManager.add(movie3);
        movieManager.add(movie4);
        movieManager.add(movie5);

        String[] expected = {
                movie1,
                movie2,
                movie3,
                movie4,
                movie5
        };
        String[] actual = movieManager.findall();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast() {
        MovieManager movieManager = new MovieManager();

        movieManager.add(movie1);
        movieManager.add(movie2);
        movieManager.add(movie3);
        movieManager.add(movie4);

        String[] expected = {
                movie4,
                movie3,
                movie2,
                movie1
        };
        String[] actual = movieManager.findlast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastParameter() {
        MovieManager movieManager = new MovieManager(50);

        movieManager.add(movie1);
        movieManager.add(movie2);
        movieManager.add(movie3);
        movieManager.add(movie4);

        String[] expected = {
                movie4,
                movie3,
                movie2,
                movie1
        };
        String[] actual = movieManager.findlast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastParameterLowLimit() {
        MovieManager movieManager = new MovieManager(2);

        movieManager.add(movie1);
        movieManager.add(movie2);
        movieManager.add(movie3);
        movieManager.add(movie4);

        String[] expected = {
                movie4,
                movie3
        };
        String[] actual = movieManager.findlast();

        Assertions.assertArrayEquals(expected, actual);
    }
}