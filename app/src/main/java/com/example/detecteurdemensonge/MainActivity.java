package com.example.detecteurdemensonge;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
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



public class MainActivity extends AppCompatActivity {

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
                Random random = new Random();
                int nb;
                nb = random.nextInt(2);
                if (nb == 1)
                    Toast.makeText(MainActivity.this, "Vrai !", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, "Faux !", Toast.LENGTH_SHORT).show();

            }
        });
    }
}