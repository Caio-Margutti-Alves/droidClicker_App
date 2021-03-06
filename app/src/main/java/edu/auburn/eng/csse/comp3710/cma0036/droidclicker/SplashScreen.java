package edu.auburn.eng.csse.comp3710.cma0036.droidclicker;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

import edu.auburn.eng.csse.comp3710.cma0036.droidclicker.login.LoginActivity;


/**
 * Created by caioa_000 on 16/04/2015.
 */

public class SplashScreen extends Activity {

    // Splash screen timer
    private static int SPLASH_TIME_OUT = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        YoYo.with(Techniques.FadeIn)
                .duration(2000)
                .playOn(findViewById(R.id.imgLogo));

        new Handler().postDelayed(new Runnable() {

            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */

            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activityYoYo.with(Techniques.ZoomOut)
                YoYo.with(Techniques.ZoomOut)
                        .duration(2000)
                        .playOn(findViewById(R.id.imgLogo));

                Intent i = new Intent(SplashScreen.this, LoginActivity.class);
                startActivity(i);

                // close this activity
                finish();
            }
        }, SPLASH_TIME_OUT);

    }

}