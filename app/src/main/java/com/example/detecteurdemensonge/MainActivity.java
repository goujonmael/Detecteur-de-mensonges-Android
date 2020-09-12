package com.example.detecteurdemensonge;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.unity3d.ads.IUnityAdsListener;
import com.unity3d.ads.UnityAds;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;
import com.unity3d.ads.IUnityAdsListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.services.banners.UnityBanners;
import com.unity3d.services.banners.view.BannerPosition;
import android.view.View;
import java.io.*;
import java.util.concurrent.TimeUnit;

import static android.os.SystemClock.sleep;


public class MainActivity extends AppCompatActivity {

    String unityGameID = "3054608";


    final private UnityAdsListener unityAdsListener = new UnityAdsListener();

    private static final String TAG = "MainActivity";

    RelativeLayout mRelativeLayout;
    Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mButton = findViewById(R.id.button);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (UnityAds.isReady()) {
                    UnityAds.show(MainActivity.this);
                }

                    Random random = new Random();
                    int nb;
                    nb = random.nextInt(2);
                TextView mytextview = (TextView)findViewById(R.id.mytextview);
                    if (nb == 1) {
                        mytextview.setText("VRAI !");
                        mytextview.setTextColor(Color.GREEN);
                    }
                    else {
                        mytextview.setText("FAUX !");
                        mytextview.setTextColor(Color.RED);
                    }
                    UnityAds.initialize(MainActivity.this, "3815613", unityAdsListener);


            }
        });
    }
    private class UnityAdsListener implements IUnityAdsListener{
        @Override
        public void onUnityAdsReady(String s) {
            }

        @Override
        public void onUnityAdsStart(String s) {
            Toast.makeText(MainActivity.this, "Merci de me soutenir !", Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onUnityAdsFinish(String s, UnityAds.FinishState finishState) {

        }

        @Override
        public void onUnityAdsError(UnityAds.UnityAdsError unityAdsError, String s) {

        }
    }
}