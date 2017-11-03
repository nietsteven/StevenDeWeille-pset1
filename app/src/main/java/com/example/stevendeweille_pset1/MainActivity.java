package com.example.myapplication3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);


        int armsVisible = findViewById(R.id.arms).getVisibility();
        int earsVisible = findViewById(R.id.ears).getVisibility();
        int eyebrowsVisible = findViewById(R.id.eyebrows).getVisibility();
        int eyesVisible = findViewById(R.id.eyes).getVisibility();
        int glassesVisible = findViewById(R.id.glasses).getVisibility();
        int hatVisible = findViewById(R.id.hat).getVisibility();
        int mouthVisible = findViewById(R.id.mouth).getVisibility();
        int mustacheVisible = findViewById(R.id.mustache).getVisibility();
        int noseVisible = findViewById(R.id.nose).getVisibility();
        int shoesVisible = findViewById(R.id.shoes).getVisibility();

        outState.putInt("armsVisible", armsVisible);
        outState.putInt("earsVisible", earsVisible);
        outState.putInt("eyebrowsVisible", eyebrowsVisible);
        outState.putInt("eyesVisible", eyesVisible);
        outState.putInt("glassesVisible", glassesVisible);
        outState.putInt("hatVisible", hatVisible);
        outState.putInt("mouthVisible", mouthVisible);
        outState.putInt("mustacheVisible", mustacheVisible);
        outState.putInt("noseVisible", noseVisible);
        outState.putInt("shoesVisible", shoesVisible);
    }

    @Override
    public void onRestoreInstanceState(Bundle inState) {
        super.onRestoreInstanceState(inState);

        findViewById(R.id.arms).setVisibility(inState.getInt("armsVisible"));
        findViewById(R.id.ears).setVisibility(inState.getInt("earsVisible"));
        findViewById(R.id.eyebrows).setVisibility(inState.getInt("eyebrowsVisible"));
        findViewById(R.id.eyes).setVisibility(inState.getInt("eyesVisible"));
        findViewById(R.id.glasses).setVisibility(inState.getInt("glassesVisible"));
        findViewById(R.id.hat).setVisibility(inState.getInt("hatVisible"));
        findViewById(R.id.mouth).setVisibility(inState.getInt("mouthVisible"));
        findViewById(R.id.mustache).setVisibility(inState.getInt("mustacheVisible"));
        findViewById(R.id.nose).setVisibility(inState.getInt("noseVisible"));
        findViewById(R.id.shoes).setVisibility(inState.getInt("shoesVisible"));
    }

    public void changeVisibility(View view) {
        int id = view.getId();
        String bodypart = getResources().getResourceName(id);
        ImageView imageview = (ImageView) findViewById(R.id.shoes);
        if (id == R.id.check_arms) {
            imageview = (ImageView) findViewById(R.id.arms);
        }
        else if (id == R.id.check_ears) {
            imageview = (ImageView) findViewById(R.id.ears);
            System.out.println(bodypart);
        }
        else if (id == R.id.check_eyebrows) {
            imageview = (ImageView) findViewById(R.id.eyebrows);
        }
        else if (id == R.id.check_eyes) {
            imageview = (ImageView) findViewById(R.id.eyes);
        }
        else if (id == R.id.check_glasses) {
            imageview = (ImageView) findViewById(R.id.glasses);
        }
        else if (id == R.id.check_hat) {
            imageview = (ImageView) findViewById(R.id.hat);
        }
        else if (id == R.id.check_mouth) {
            imageview = (ImageView) findViewById(R.id.mouth);
        }
        else if (id == R.id.check_mustache) {
            imageview = (ImageView) findViewById(R.id.mustache);
        }
        else if (id == R.id.check_nose) {
            imageview = (ImageView) findViewById(R.id.nose);
        }

        int current = imageview.getVisibility();
        if (current == view.VISIBLE){
            imageview.setVisibility(view.INVISIBLE);
        }
        else {
            imageview.setVisibility(view.VISIBLE);
        }
    }
}
