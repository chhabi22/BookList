package Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
//import androidx.annotation.NonNull;
//import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.booklist.R;
import java.util.List;
import Model.ListItem;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private Context context;
private List<ListItem>listItems;

public MyAdapter(Context context, List listItem){
    this.context = context;
    this.listItems = listItem;


}

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    // to inflate our row ----------
    View view = LayoutInflater.from(parent.getContext())
            .inflate(R.layout.list_row, parent, false);
    // to return view holder class ----
        return new ViewHolder(view);


    }

    @Override
    public void onBindViewHolder(MyAdapter.ViewHolder holder, int position) {
   ListItem item = listItems.get(position);
           // holder.name.setText(item.getName());
           // holder.description.setText(item.getDescription());


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



    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView name;
        public TextView description;
        public ImageView image;



        public ViewHolder(View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.title);
            description = itemView.findViewById(R.id.description);
            image = itemView.findViewById(R.id.image);




        }



    }
}
