public class MovieManager {
    private String [] movies = new String []

    public void addMovie(String movie) {
        String [] tmp = new String [movies.length+1];
        for (int i=0, i<movies.length; i++) {

            tmp [i] = movies [i];

        }
        tmp [tmp.length-1]= movie;
        movies = tmp;

    }

    public String [] findAll() {



    }

    public String [] findLast() {

    }
}



