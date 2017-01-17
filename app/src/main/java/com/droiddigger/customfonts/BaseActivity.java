package com.droiddigger.customfonts;

import android.support.annotation.LayoutRes;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by mufad on 1/17/2017.
 */

public class BaseActivity extends AppCompatActivity {
    @Override
    public void setContentView(@LayoutRes int layoutResID) {
        super.setContentView(layoutResID);
        FontChangeCrawler fontChanger = new FontChangeCrawler(getAssets(), "fonts/Roboto-Light.ttf");
        fontChanger.replaceFonts((ViewGroup)this.findViewById(android.R.id.content));

    }
}
