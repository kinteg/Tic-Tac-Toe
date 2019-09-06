package com.kinteg.tic_tac_toe;

import java.util.ArrayList;

public interface Gamer {

    String getName();
    void setName(String name);

    String getSide();
    void setSide(String side);

    int getWins();
    void addWins();
    void clearWins();

    void clearHits();
    ArrayList<Integer> getHits();
    void setHits(int position);

    int getColor();

}
