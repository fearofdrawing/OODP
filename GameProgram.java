package com.roadmap;

import com.roadmap.facade.GameFacade;

public class GameProgram {

    public static void main(String[] args) {
        GameFacade gameFacade = new GameFacade();
        gameFacade.start();
    }
}
