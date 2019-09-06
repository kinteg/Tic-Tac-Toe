package com.kinteg.tic_tac_toe;

import android.util.Log;

import java.util.ArrayList;

public class Checking {

    private ArrayList<Integer> hits;
    private static int i;

    public boolean isWin(ArrayList<Integer> hits) {
        this.hits = hits;
        return i++ >= 4 && check();
    }

    private boolean check() {
//        Log.wtf("horizontal1()1", horizontal1() + " " + i);
//        Log.wtf("horizontal2()1", horizontal2() + " " + i);
//        Log.wtf("horizontal3()1", horizontal3() + " " + i);
//        Log.wtf("vertical1()1", vertical1() + " " + i);
//        Log.wtf("vertical2()1", vertical2() + " " + i);
//        Log.wtf("vertical3()1", vertical3() + " " + i);
//        Log.wtf("diagonally1()1", diagonally1() + " " + i);
//        Log.wtf("diagonally2()1", diagonally2() + " " + i);
        return horizontal1() || horizontal2() || horizontal3()
                || vertical1() || vertical2() || vertical3()
                || diagonally1() || diagonally2();
    }

    private boolean horizontal1() {
        return hits.get(0) + hits.get(1) + hits.get(2) == 3;
    }

    private boolean horizontal2() {
        return hits.get(3) + hits.get(4) + hits.get(5) == 3;
    }

    private boolean horizontal3() {
        return hits.get(6) + hits.get(7) + hits.get(8) == 3;
    }

    private boolean vertical1() {
        return hits.get(0) + hits.get(3) + hits.get(6) == 3;
    }

    private boolean vertical2() {
        return hits.get(1) + hits.get(4) + hits.get(7) == 3;
    }

    private boolean vertical3() {
        return hits.get(2) + hits.get(5) + hits.get(8) == 3;
    }

    private boolean diagonally1() {
        return hits.get(0) + hits.get(4) + hits.get(8) == 3;
    }

    private boolean diagonally2() {
        return hits.get(2) + hits.get(4) + hits.get(6) == 3;
    }

    public void restart() {
        i = 0;
    }

}
