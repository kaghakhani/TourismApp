package ir.aghakhaniedu.tourismapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListActivity extends AppCompatActivity {

    String [] list = {"مشهد","تهران","شیراز","اراک"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ListView listView = findViewById(R.id.listVew);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.list_style,R.id.textViewStyle ,list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                    Intent intent= new Intent(ListActivity.this,SecondActivity.class);
                    intent.putExtra("name",i);
                    startActivity(intent);

            }
        });

    }
}