package com.example.shaun.dogshow;

import java.util.HashMap;

public class SaveToDatabase {

    HashMap<String, Contestants> contestants = new HashMap<>();

    public SaveToDatabase()
    {

    }

    public void addContestant(Contestants contest) {
        contestants.put(contest.getName(), contest);
    }

}
