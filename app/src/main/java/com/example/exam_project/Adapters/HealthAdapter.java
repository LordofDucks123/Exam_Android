package com.example.exam_project.Adapters;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.exam_project.R;
import com.example.exam_project.model.Health;

import java.util.ArrayList;
import java.util.List;

public class HealthAdapter extends RecyclerView.Adapter<HealthAdapter.ViewHolder> {

    private List<Health> healthList = new ArrayList<>();
    final private OnListItemClickListener mOnListItemClickListener;

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView HealthDescription;
        ImageView icon;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            HealthDescription = itemView.findViewById(R.id.HealthDescription);
            icon = itemView.findViewById(R.id.picture);
            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {
            mOnListItemClickListener.onListItemClick(getBindingAdapterPosition());
        }
    }

    public HealthAdapter(OnListItemClickListener listener) {
        mOnListItemClickListener = listener;
    }

    @NonNull
    @Override
    public HealthAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.health_list_item, parent, false);
        return new HealthAdapter.ViewHolder(view);
    }

    public void onBindViewHolder(@NonNull HealthAdapter.ViewHolder holder, int position) {
        holder.HealthDescription.setText(healthList.get(position).getName());
        holder.icon.setImageResource(healthList.get(position).getId());
    }

    public void updateList(List<Health> healthList) {
        this.healthList = healthList;
        notifyDataSetChanged();
    }

    public int getItemCount() {

        return healthList.size();
    }


    public interface OnListItemClickListener {
        void onListItemClick(int clickedItemIndex);
    }
}
