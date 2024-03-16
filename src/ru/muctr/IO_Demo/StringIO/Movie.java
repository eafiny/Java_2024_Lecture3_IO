package ru.muctr.IO_Demo.StringIO;

import java.util.Objects;

public class Movie implements Comparable<Movie>{
    private String title;
    private String producer;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public Movie(String title, String producer) {
        this.title = title;
        this.producer = producer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return Objects.equals(title, movie.title) && Objects.equals(producer, movie.producer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, producer);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", producer='" + producer + '\'' +
                '}';
    }

    @Override
    public int compareTo(Movie o) {
        return getTitle().compareToIgnoreCase(o.getTitle());
    }
}


