package com.india.deva;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

import java.io.IOException;

public class SplashScreenActivity extends AbstractProjectBaseActivity {

    // Splash screen timer
    private static int SPLASH_TIME_OUT = 5000;
    private String userId;
    private LottieAnimationView imgWelcome;
    TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //        Transparent Status Bar
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        }
        setContentView(R.layout.activity_splash_screen);
        imgWelcome = findViewById(R.id.img_welcome);
        title = findViewById(R.id.title);
        imgWelcome.playAnimation();
        imgWelcome.loop(true);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startAnimatedActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
        }, SPLASH_TIME_OUT);
    }

    private void startAnimatedActivity(Intent intent) {
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        overridePendingTransition(R.anim.trans_left_in, R.anim.trans_left_out);
    }
}
