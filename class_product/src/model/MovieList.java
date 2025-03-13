package model;

    import java.util.*;

    class Movie {
        private int id;
        private String uuid;
        private String title;
        private String description;
        private int time;
        private List<String> categories;

        // Constructor
        public Movie(int id, String uuid, String title, String description, int time, List<String> categories) {
            setMovieDetail(id, uuid, title, description, time, categories);
        }

        // Method to set movie details
        public void setMovieDetail(int id, String uuid, String title, String description, int time, List<String> categories) {
            this.id = id;
            this.uuid = uuid;
            this.title = title;
            this.description = description;
            this.time = time;
            this.categories = categories;
        }

        // Override toString to display movie details
        @Override
        public String toString() {
            return "Movie{" +
                    "id=" + id +
                    ", uuid='" + uuid + '\'' +
                    ", title='" + title + '\'' +
                    ", description='" + description + '\'' +
                    ", time=" + time +
                    ", categories=" + categories +
                    '}';
        }
    }

    public class MovieList {
        public static void main(String[] args) {
            List<Movie> movies = new ArrayList<>();

            // Creating and adding movies to the list
            movies.add(new Movie(1, UUID.randomUUID().toString(), "Inception", "Sci-Fi thriller", 150, Arrays.asList("Sci-Fi", "Thriller")));
            movies.add(new Movie(2, UUID.randomUUID().toString(), "Titanic", "Romantic drama", 195, Arrays.asList("Romance", "Drama")));
            movies.add(new Movie(3, UUID.randomUUID().toString(), "The Dark Knight", "Action-packed Batman movie", 165, Arrays.asList("Action", "Crime")));
            movies.add(new Movie(4, UUID.randomUUID().toString(), "Avengers: Endgame", "Superhero epic", 180, Arrays.asList("Action", "Adventure")));
            movies.add(new Movie(5, UUID.randomUUID().toString(), "The Godfather", "Crime drama", 175, Arrays.asList("Crime", "Drama")));

            // Printing all movies
            for (Movie movie : movies) {
                System.out.println(movie);
            }
        }
    }