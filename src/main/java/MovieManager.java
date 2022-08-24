public class MovieManager {
    private String[] movies = new String[0];
    private int limit;

    public MovieManager() {
        limit = 10;
    }

    public MovieManager(int limit) {
        this.limit = limit;
    }

    public void add(String movie) {

        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public String[] findall() {
        return movies;
    }
    public String[] findlast() {
        int resultLength;
        if (limit > movies.length) {
            resultLength = movies.length;
        }
        else {
            resultLength = limit;
        }

        String[] result = new String[resultLength];
        for (int i=0; i < resultLength; i++) {
            result[i] = movies[movies.length - 1 - i];
        }
        return result;
    }
}
