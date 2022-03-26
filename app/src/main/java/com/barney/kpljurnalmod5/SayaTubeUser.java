package com.barney.kpljurnalmod5;

import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

class SayaTubeUser {
    int id;
//    List<SayaTubeVideo> uploadedVideos;
    String username;
    TextView myomyo;

    List <SayaTubeVideo> uploadedVideos = new ArrayList<SayaTubeVideo>();

    public SayaTubeUser(String username) {
        this.username = username;
        Random rand = new Random();
        id = rand.nextInt(99999);
        if (username.length() < 200 && username.length() > 0) {
            this.username = username;
        } else {
            System.out.println("kelebihan");
        }

    }

    public String GetTotalVideoPlayCount() {
        return "";
    }

    public void AddVideo(SayaTubeVideo mio) {
        uploadedVideos.add(mio);

    }

    public void PrintAllVideoPlaycount() {
        String sting2 = "user: " + username;
        String cryo = "";
        int i = 1;
        SayaTubeVideo video = uploadedVideos.get(i);
        int index = 0;
        for (i=0; i < uploadedVideos.size(); i++) {
            cryo = ("Video " + (index+1) + " judul: " + video.getTitle() + "\n");

        }
        myomyo.setText(sting2 + "\n" + cryo);
    }
}
