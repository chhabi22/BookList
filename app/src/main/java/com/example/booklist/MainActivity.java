package com.example.booklist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.os.ResultReceiver;
import java.util.ArrayList;
import java.util.List;
import Adapter.MyAdapter;
import Model.ListItem;



public class MainActivity extends AppCompatActivity {


    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
     List<ListItem> listItems;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = findViewById(R.id.recyclerViewID);


        //---- layout manager ----

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);








//        for (int i = 0; i  < 20; i++){
//            ListItem item =  new ListItem("Book " + (i+1), "Author of book " + (i + 1));
//            listItems.add(item);
//
//       }






        listItems = new ArrayList<>();

        listItems.add(new ListItem(R.drawable.richpoor,"Rich Dad Poor Dad","Author is Robert Kiyosaki"));
        listItems.add(new ListItem(R.drawable.paulo,"The Alchemist","Author is Paulo Coelho"));
        listItems.add(new ListItem(R.drawable.mh,"Milk & Honey","Author is Rupi Kaur"));
        listItems.add(new ListItem(R.drawable.hwc,"W W C W Y D","Author is Robin Sharma"));
        listItems.add(new ListItem(R.drawable.eleven,"Eleven Minutes","Author is Paulo Coelho"));
        listItems.add(new ListItem(R.drawable.richpoor,"Rich Dad Poor Dad","Author is Robert Kiyosaki"));
        listItems.add(new ListItem(R.drawable.paulo,"The Alchemist","Author is Paulo Coelho"));
        listItems.add(new ListItem(R.drawable.mh,"Milk & Honey","Author is Rupi Kaur"));
        listItems.add(new ListItem(R.drawable.hwc,"W W C W Y D","Author is Robin Sharma"));
        listItems.add(new ListItem(R.drawable.eleven,"Eleven Minutes","Author is Paulo Coelho"));
        listItems.add(new ListItem(R.drawable.paulo,"The Alchemist","Author is Paulo Coelho"));
        listItems.add(new ListItem(R.drawable.mh,"Milk & Honey","Author is Rupi Kaur"));
        listItems.add(new ListItem(R.drawable.hwc,"W W C W Y D","Author is Robin Sharma"));
        listItems.add(new ListItem(R.drawable.eleven,"Eleven Minutes","Author is Paulo Coelho"));
        listItems.add(new ListItem(R.drawable.richpoor,"Rich Dad Poor Dad","Author is Robert Kiyosaki"));
        listItems.add(new ListItem(R.drawable.paulo,"The Alchemist","Author is Paulo Coelho"));
        listItems.add(new ListItem(R.drawable.eleven,"Eleven Minutes","Author is Paulo Coelho"));
        listItems.add(new ListItem(R.drawable.richpoor,"Rich Dad Poor Dad","Author is Robert Kiyosaki"));
        listItems.add(new ListItem(R.drawable.paulo,"The Alchemist","Author is Paulo Coelho"));
        listItems.add(new ListItem(R.drawable.mh,"Milk & Honey","Author is Rupi Kaur"));
        listItems.add(new ListItem(R.drawable.hwc,"W W C W Y D","Author is Robin Sharma"));
        listItems.add(new ListItem(R.drawable.eleven,"Eleven Minutes","Author is Paulo Coelho"));
        listItems.add(new ListItem(R.drawable.paulo,"The Alchemist","Author is Paulo Coelho"));


        adapter = new MyAdapter(this, listItems);
        recyclerView.setAdapter(adapter);




    }
}
