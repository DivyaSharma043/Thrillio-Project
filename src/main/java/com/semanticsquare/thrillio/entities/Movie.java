
package com.semanticsquare.thrillio.entities;

import com.semanticsquare.thrillio.constants.MovieGenre;
import java.util.Arrays;

public class Movie extends Bookmark{
    private int releaseYear;
    private String[] Cast;
    private String[] directors;
    private String genre;
    private double imdbRating;

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String[] getCast() {
        return Cast;
    }

    public void setCast(String[] Cast) {
        this.Cast = Cast;
    }

    public String[] getDirectors() {
        return directors;
    }

    public void setDirectors(String[] directors) {
        this.directors = directors;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getImdbRating() {
        return imdbRating;
    }

    public void setImdbRating(double imdbRating) {
        this.imdbRating = imdbRating;
    }

    @Override
    public String toString() {
       return "Movie [releaseYear=" + releaseYear+ ", cast=" + Arrays.toString(Cast) + ", directors=" +Arrays.toString(directors) +",genre=" +genre +",imdbRating=" +imdbRating +"]"; 
    
    }

    @Override
    public boolean isKidFriendlyEligible() {
        if (genre.equals(MovieGenre.THRILLERS)|| genre.equals(MovieGenre.HORROR))
        {
            return false;
        }
        return true;
    }
    
    
}
