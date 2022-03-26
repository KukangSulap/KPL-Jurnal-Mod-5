package com.barney.kpljurnalmod5;

import android.widget.TextView;

import java.util.Random;

class SayaTubeVideo {
    int id, playCount;
    String title;
    TextView ushi;

    public SayaTubeVideo(String title) {
        Random rand = new Random();
        playCount = 0;
        id = rand.nextInt(99999);
        if (title.length() < 200 && title.length() > 0) {
            this.title = title;
        } else {
            System.out.println("kelebihan");
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void IncreasePlayCount(int playCount) {
        int result = this.playCount;
        if (result != this.playCount) {
            throw new RuntimeException("play count reach limit: " + playCount);
        }

        if (playCount <= 25000000){
            this.playCount += playCount;
        }

    }

    public void PrintVideoDetails() {
        IncreasePlayCount(playCount);
        String makan = " id: " + id +
                "\n title: " + title +
                "\n PlayCount: " + playCount +"\n";
        ushi.setText(makan);
    }
}
