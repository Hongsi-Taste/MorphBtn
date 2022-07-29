package com.example.processbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.dd.morphingbutton.MorphingButton;

public class MainActivity extends AppCompatActivity {

    private int mp_btn_counter = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MorphingButton mp_btn = (MorphingButton) findViewById(R.id.btn);

    }

    public void onMorphBtnClicked(final MorphingButton btn) {
        if(mp_btn_counter == 0) {
            mp_btn_counter ++;
            morphToSquare(btn, R.integer.mb_animation);
        } else if (mp_btn_counter == 1) {
            mp_btn_counter =0;
            morphToCircle(btn);
        }
    }

    private void morphToSquare(final MorphingButton btn, int duration) {
        MorphingButton.Params square = MorphingButton.Params.create()
                .duration(duration)
                .cornerRadius(R.dimen.mb_corner_radius_2)
                .width(R.dimen.mb_width_200)
                .height(R.dimen.mb_height_56)
                .color(R.color.holo_blue_bright)
                .colorPressed(R.color.blue)
                .text("Button");
        btn.morph(square);
    }
    private void morphToCircle(final MorphingButton btn) {
        MorphingButton.Params circle = MorphingButton.Params.create()
                .duration(R.integer.mb_animation)
                .cornerRadius(R.dimen.mp_normal)
                .width(R.dimen.mp_normal)
                .height(R.dimen.mp_normal)
                .color(R.color.blue)
                .colorPressed(R.color.holo_green)
                .icon(R.drawable.ic_done);
        btn.morph(circle);
    }
}