package com.example.oikeecardview;

import android.support.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class Entry {

    private final String title;
    private final String body;
    private final int id;

    private static int numberOfInstances = 0;
    private static List<Entry> instances = new ArrayList<Entry>();


    public Entry(String title, String body) {
        this.title = title;
        this.body = body;

        this.id = numberOfInstances++;
        instances.add(this);

    }

    public String getContent() { return body; }

    public String getBody() {
        return body;
    }

    public String getTitle() {
        return title;
    }

    public String getShortenedBody() {
        if (body.length() < 300) {
            return body;
        }
        else {
            return body.substring(0, 297) + "...";
        }

    }

    public int getId() {return id;}

    @Nullable
    public static Entry findEntryById(int iId) {
        int index = -1;

        for (int i = 0; i < instances.size(); i++) {
            if (instances.get(i).id == iId) {
                index = i;


            }
        }

        if (!(index == -1)) {
            return instances.get(index);
        }
        else {
            return null;
        }

    }
}

