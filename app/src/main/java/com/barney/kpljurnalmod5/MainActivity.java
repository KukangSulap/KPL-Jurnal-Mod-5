package com.barney.kpljurnalmod5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txt = findViewById(R.id.txt);

        SayaTubeUser user1 = new SayaTubeUser("naufel");
        SayaTubeVideo video1 = new SayaTubeVideo("Review Film itto oleh naufel");
        SayaTubeVideo video2 = new SayaTubeVideo("Review Film shongli oleh naufel");
        SayaTubeVideo video3 = new SayaTubeVideo("Review Film goro oleh naufel");
        SayaTubeVideo video4 = new SayaTubeVideo("Review Film 77 oleh naufel");
        SayaTubeVideo video5 = new SayaTubeVideo("Review Film mio oleh naufel");
        SayaTubeVideo video6 = new SayaTubeVideo("Review Film miomio oleh naufel");
        SayaTubeVideo video7 = new SayaTubeVideo("Review Film myomyo oleh naufel");
        SayaTubeVideo video8 = new SayaTubeVideo("Review Film ushi oleh naufel");
        SayaTubeVideo video9 = new SayaTubeVideo("Review Film benny oleh naufel");
        SayaTubeVideo video10 = new SayaTubeVideo("Review Film tiang oleh naufel");

        user1.AddVideo(video1);
        user1.AddVideo(video2);
        user1.AddVideo(video3);
        user1.AddVideo(video4);
        user1.AddVideo(video5);
        user1.AddVideo(video6);
        user1.AddVideo(video7);
        user1.AddVideo(video8);
        user1.AddVideo(video9);
        user1.AddVideo(video10);

        user1.myomyo = txt;
        user1.PrintAllVideoPlaycount();

    }
}