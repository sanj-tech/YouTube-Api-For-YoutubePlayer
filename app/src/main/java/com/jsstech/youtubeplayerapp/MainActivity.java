package com.jsstech.youtubeplayerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class MainActivity extends YouTubeBaseActivity {
    public static final String API_KEY="Your YouTube ApI_Key";

    YouTubePlayerView youTubePlayerView;
    //youTubePlayerView2;
//    youTubePlayerView3,youTubePlayerView4,youTubePlayerView5;
    YouTubePlayer.OnInitializedListener onInitializedListener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        youTubePlayerView=findViewById(R.id.youtube);
       // youTubePlayerView2=findViewById(R.id.youtube1);


        onInitializedListener=new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider,YouTubePlayer youTubePlayer,boolean b) {
                youTubePlayer.loadVideo("TbrZwYoCEm4");
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider,YouTubeInitializationResult youTubeInitializationResult) {

            }
        };
//        onInitializedListener=new YouTubePlayer.OnInitializedListener() {
//            @Override
//           public void onInitializationSuccess(YouTubePlayer.Provider provider,YouTubePlayer youTubePlayer,boolean b) {
//                youTubePlayer.loadVideo("yH76c4ibeK4");
//           }
//
//            @Override
//            public void onInitializationFailure(YouTubePlayer.Provider provider,YouTubeInitializationResult youTubeInitializationResult) {
//
//            }
//        };

        youTubePlayerView.initialize(API_KEY,onInitializedListener);
        //youTubePlayerView2.initialize(API_KEY,onInitializedListener);

    }
}