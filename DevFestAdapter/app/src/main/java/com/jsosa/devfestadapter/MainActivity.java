package com.jsosa.devfestadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Android versions represented as an String array, you can use also an ArrayList<T> but it will consume more resources
        String[] mVersions = {"Cupcake", "Donut", "Eclair", "Froyo", "Gingerbread", "Honeycomb", "Ice Cream Sandwich",
                "Jelly Bean", "KitKat", "Lollipop", "Marshmallow"};

        //Our adapter binds the information to our View, in this case our ListView.
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mVersions);
        ListView androidVersionsListView = (ListView) findViewById(R.id.versions_list_view);
        androidVersionsListView.setAdapter(adapter);
    }
}
