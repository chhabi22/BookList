package Adapter;

import android.content.Context;
import android.content.Intent;
import android.nfc.Tag;
import android.service.autofill.OnClickAction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
//import androidx.annotation.NonNull;
//import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.booklist.DetailsActivity;
import com.example.booklist.R;
import java.util.List;
import Model.ListItem;



    public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

         private Context context;
         private List<ListItem>listItems;
         public static final String TAG = "Recycler Adapter";
         int count = 0;

    public MyAdapter(Context context, List listItem){
        this.context = context;
        this.listItems = listItem; }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        Log.i(TAG, "onCreateViewHolder - " + count++);

    // to inflate the row ----------
    View view = LayoutInflater.from(parent.getContext())
            .inflate(R.layout.list_row, parent, false);

        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(MyAdapter.ViewHolder holder, int position) {

        // - get element from  dataset at this position
        // - replace the contents of the view with that element

        ListItem item = listItems.get(position);


        ImageView image = holder.image;
        TextView name = holder.name;
        TextView description = holder.description;

        image.setImageResource(item.getImage());
        name.setText(item.getName());
        description.setText(item.getDescription());

    }


    @Override
    public int getItemCount() {
        return listItems.size();
    }




 // ------ ViewHolder Class --------

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView name;
        public TextView description;
        public ImageView image;


        public ViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);

            name = itemView.findViewById(R.id.title);
            description = itemView.findViewById(R.id.description);
            image = itemView.findViewById(R.id.image);

        }



        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            ListItem item = listItems.get(position);
            Intent intent = new Intent(context, DetailsActivity.class);
            intent.putExtra("image", item.getImage());
            intent.putExtra("name", item.getName());
            intent.putExtra("description", item.getDescription());

            context.startActivity(intent);

        }
    }


}
