package com.example.exam_project.Adapters;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.exam_project.R;
import com.example.exam_project.model.Craving;

import java.util.ArrayList;
import java.util.List;

public class CravingAdapter extends RecyclerView.Adapter<CravingAdapter.ViewHolder> {
    // We want the data from the Craving objects to the RecycleView items.
    //Set to new ArrayList to make sure it is not NULL, before we get first Live data update.
    //Cant call method on it, if it is null
    private List<Craving> cravingList = new ArrayList<>();
    final private OnListItemClickListener mOnListItemClickListener;

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView CravingDescription;
        ImageView icon;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            CravingDescription = itemView.findViewById(R.id.CravingDescription);
            icon = itemView.findViewById(R.id.picture);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            mOnListItemClickListener.onListItemClick(getBindingAdapterPosition());
        }
    }

    public CravingAdapter(OnListItemClickListener listener) {
        mOnListItemClickListener = listener;
    }

    @NonNull
    @Override
    //This is the layout we are gonna use for the single item in our RecycleView
    public CravingAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.craving_list_item, parent, false);
        return new CravingAdapter.ViewHolder(view);
    }

    //Get the data from the single craving java object into the views of our cravingholder
    public void onBindViewHolder(@NonNull CravingAdapter.ViewHolder holder, int position) {
        holder.CravingDescription.setText(cravingList.get(position).getName());
        holder.icon.setImageResource(cravingList.get(position).getId());
    }

    public void updateList(List<Craving> cravingList) {
        this.cravingList = cravingList;
        notifyDataSetChanged();
    }

    public int getItemCount() {
        return cravingList.size();
    }


    public interface OnListItemClickListener {
        void onListItemClick(int clickedItemIndex);
    }

}
