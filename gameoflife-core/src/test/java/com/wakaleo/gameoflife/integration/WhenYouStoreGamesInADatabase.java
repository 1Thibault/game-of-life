package com.wakaleo.gameoflife.integration;

import org.junit.Test;

public interface Slow{}

@Category(Slow.class)
public class WhenYouStoreGamesInADatabase {

    @Test
    public void should_store_games() {

    }

    @Test
    public void should_load_saved_games() {
    }

}
