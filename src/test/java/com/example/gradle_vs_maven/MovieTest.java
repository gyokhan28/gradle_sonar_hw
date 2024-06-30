package com.example.gradle_vs_maven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MovieTest {
    @Test
    void testNoArgsConstructor(){
        Movie movie = new Movie();
        assertNotNull(movie);
    }

    @Test
    void testAllArgsConstructor(){
        Integer[] genreIds = {1,2,3};
        Movie movie = new Movie(
                true, "backdrop_path", genreIds, 123, "en",
                "Original Title", "Overview", 7.5, "poster_path",
                "2021-12-15", "Title", true, 8.3, 1500
        );

        assertTrue(movie.getAdult());
        assertEquals("backdrop_path", movie.getBackdrop_path());
        assertArrayEquals(genreIds, movie.getGenre_ids());
        assertEquals(123, movie.getId());
        assertEquals("en", movie.getOriginal_language());
        assertEquals("Original Title", movie.getOriginal_title());
        assertEquals("Overview", movie.getOverview());
        assertEquals(7.5, movie.getPopularity());
        assertEquals("poster_path", movie.getPoster_path());
        assertEquals("2021-12-15", movie.getRelease_date());
        assertEquals("Title", movie.getTitle());
        assertTrue(movie.isVideo());
        assertEquals(8.3, movie.getVote_average());
        assertEquals(1500, movie.getVote_count());
    }
}
