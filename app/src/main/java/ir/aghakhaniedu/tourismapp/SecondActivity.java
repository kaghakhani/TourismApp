package ir.aghakhaniedu.tourismapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView title = findViewById(R.id.textViewTitle);
        TextView Text = findViewById(R.id.textViewText);
        ImageView img = findViewById(R.id.imageView);


        Intent recive = getIntent();
        int name = recive.getIntExtra("name",0);
        if (name==0) {
            title.setText(getResources().getString(R.string.title_page0));
            title.setTextColor(getResources().getColor(R.color.purple_500));
            Text.setText(getResources().getString(R.string.text_page0));
            img.setImageDrawable(getResources().getDrawable(R.drawable.p0));


        }
        else if (name==1) {
            title.setText(getResources().getString(R.string.title_page1));
            title.setTextColor(getResources().getColor(R.color.teal_200));
            Text.setText(getResources().getString(R.string.text_page1));
            img.setImageDrawable(getResources().getDrawable(R.drawable.p1));

        } else if (name==2) {
            title.setText(getResources().getString(R.string.title_page2));
            title.setTextColor(Color.BLUE);
            Text.setText(getResources().getString(R.string.text_page2));
            img.setImageDrawable(getResources().getDrawable(R.drawable.p2));

        } else if (name==3) {
            title.setText(getResources().getString(R.string.title_page3));
            title.setTextColor(Color.BLUE);
            Text.setText(getResources().getString(R.string.text_page3));
            img.setImageDrawable(getResources().getDrawable(R.drawable.p3));

        }


    }
}