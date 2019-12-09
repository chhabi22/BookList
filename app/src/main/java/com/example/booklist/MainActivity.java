package com.example.booklist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.os.ResultReceiver;
import java.util.ArrayList;
import java.util.List;
import Adapter.MyAdapter;
import Model.ListItem;



public class MainActivity extends AppCompatActivity {

    //----- instance of recyclerView-----
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
     List<ListItem> listItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //----------------------------------------

        recyclerView = findViewById(R.id.recyclerViewID);
        recyclerView.setHasFixedSize(true);

        //---- layout manager ----
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        listItems = new ArrayList<>();

        listItems.add(new ListItem(R.drawable.richpoor,"Rich Dad Poor Dad","Author: Robert"));
        listItems.add(new ListItem(R.drawable.paulo,"The Alchemist","Author: Paulo"));
        listItems.add(new ListItem(R.drawable.mh,"Milk & Honey","Author: Rupi"));
        listItems.add(new ListItem(R.drawable.hwc,"W W C W Y D","Author: Robin Sharma"));
        listItems.add(new ListItem(R.drawable.eleven,"Eleven Minutes","Author: Paulo"));
        listItems.add(new ListItem(R.drawable.richpoor,"Rich Dad Poor Dad","Author: Robert"));
        listItems.add(new ListItem(R.drawable.paulo,"The Alchemist","Author: Paulo"));
        listItems.add(new ListItem(R.drawable.mh,"Milk & Honey","Author: Rupi"));
        listItems.add(new ListItem(R.drawable.hwc,"W W C W Y D","Author: Robin Sharma"));
        listItems.add(new ListItem(R.drawable.eleven,"Eleven Minutes","Author: Paulo"));
        listItems.add(new ListItem(R.drawable.paulo,"The Alchemist","Author: Paulo"));
        listItems.add(new ListItem(R.drawable.mh,"Milk & Honey","Author: Rupi"));
        listItems.add(new ListItem(R.drawable.hwc,"W W C W Y D","Author: Robin Sharma"));

//
//        for (int i = 0; i  < 20; i++){
//            ListItem item =  new ListItem("Book " + (i+1), "Author of book " + (i + 1));
//            listItems.add(item);
//
//       }


        // ----- Initialize Adapter----
        adapter = new MyAdapter(this, listItems);

        //---- attach adapter to recyclerView---
        recyclerView.setAdapter(adapter);


    }
}
