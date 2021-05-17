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
//sss
    private List<Craving> cravingList = new ArrayList<>();
    final private OnListItemClickListener mOnListItemClickListener;
    public CravingAdapter(OnListItemClickListener listener){
        mOnListItemClickListener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.craving_list_item, parent, false);
        return new ViewHolder(view);
    }


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
    public interface OnListItemClickListener {
        void onListItemClick(int clickedItemIndex);
    }

}
