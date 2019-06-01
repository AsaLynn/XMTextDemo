package com.zxn.xmtextdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.zxn.xm.text.FadeInTextView;

public class MainActivity extends AppCompatActivity {

    protected FadeInTextView tvXmText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main);
        initView();

    }

    private void initView() {
        tvXmText = findViewById(R.id.tv_xm_text);
        String context = getString(R.string.text_xm_mesage);
        tvXmText.setTextString(context)
                .startFadeInAnimation()
                .setTextAnimationListener(new FadeInTextView.TextAnimationListener() {
                    @Override
                    public void animationFinish() {

                    }
                });
    }
}
