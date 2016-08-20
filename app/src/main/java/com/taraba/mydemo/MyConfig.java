package com.taraba.mydemo;

        import android.app.Application;

/**
 * Created by Mayuri on 8/5/16.
 * Modified By Mayuri on 8/5/16,
 */
public class MyConfig extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //hi form mayuri kele
        TypefaceUtil.overrideFont(getApplicationContext(), "SERIF", "System San Francisco Display Regular.ttf"); // font from assets: "assets/fonts/Roboto-Regular.ttf
    }
}