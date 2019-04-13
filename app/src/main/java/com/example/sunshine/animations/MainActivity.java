package com.example.sunshine.animations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
public class MainActivity extends AppCompatActivity {
    public void Fade(View view) {
        ImageView bart = findViewById(R.id.bart);
        // ImageView homer = findViewById(R.id.homer);
        // we assign the value of onclick in bart to Fade which is the method to be used.
            //alpha is used for the fading the image..
        // for 0f  it is invisible, for 1f it is visible..
        // and set the time to 2000ms=2sec, after

       // bart.animate().alpha(0f).setDuration(2000);
        //homer.animate().alpha(1f).setDuration(2000);
       //**bart.animate().translationXBy(1000f).setDuration(2000); = this is used to
       // translate him right the screen  and if we put -1000f so it is used to
        //tarnslate him left the screen.**

        //bart.animate().translationXBy(-1000f).setDuration(2000);****
        // ***bart.animate().y(2000f).setDuration(2000); = this is used to
        // translate him down the screen where the function is y,.
        // to translate him up the screen put -2000f.....
        //bart.animate().y(-2000f).setDuration(2000);
        //****bart.animate().translationXBy(2000f).setDuration(1000);//= means bahar ki side se bart ander ki taraf entry karenga

        //***** bart.animate().rotation(36000f).setDuration(6000); //== where 3600f is in the
        //degree and rotate in the time interavl of the 6sec *****

    //*** ***bart.animate().scaleX(0.5f).scaleY(0.5f).setDuration(2000);== means it will shrink the bart by
        // half to the original size keeping center will remain in the same position.

        //*** ****bart.animate().scaleX(-0.5f).scaleY(-0.5f).setDuration(2000); pura chota hoga fir ulta aadha paida hoga

       // bart.animate().scaleX(0.5f).setDuration(2000);  khalli x direction mein shrink hua but origin is same
        // bart.animate().scaleY(0.5f).setDuration(2000); khalli y dirction mein shrink hua but the origin will same

        bart.animate().translationXBy(1000f).translationYBy(1000f).rotationBy(3600f).setDuration(2000);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //**** ImageView bart = findViewById(R.id.bart);
        //bart.setTranslationX(-2000f); // it means that it happens instantially rather than gradually.****

          ImageView bart = findViewById(R.id.bart);
        bart.setTranslationX(-1000f);
        bart.setTranslationY(-1000f);

    }
}
