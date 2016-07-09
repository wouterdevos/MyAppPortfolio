package com.wouterdevos.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchApp(View view) {
        int id = view.getId();
        int buttonRes = R.string.button_popular_movies;

        switch (id) {
            case R.id.popular_movies_button:
                buttonRes = R.string.button_popular_movies;
                break;
            case R.id.stock_hawk_button:
                buttonRes = R.string.button_stock_hawk;
                break;
            case R.id.build_it_bigger_button:
                buttonRes = R.string.button_build_it_bigger;
                break;
            case R.id.make_your_app_material_button:
                buttonRes = R.string.button_make_your_app_material;
                break;
            case R.id.go_ubiquitous_button:
                buttonRes = R.string.button_go_ubiquitous;
                break;
            case R.id.capstone_button:
                buttonRes = R.string.button_capstone;
                break;
        }

        String appName = getString(buttonRes);
        String toastText = getString(R.string.toast_launch_app, appName);
        Toast.makeText(this, toastText, Toast.LENGTH_SHORT).show();
    }
}
