package com.smartdroidesign.projectapp_recyclerview2.Presenter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.smartdroidesign.projectapp_recyclerview2.R;

import de.hdodenhof.circleimageview.CircleImageView;

class ViewHolder extends RecyclerView.ViewHolder {

    CircleImageView image;
    TextView lineOne;
    TextView lineTwo;

    ViewHolder(@NonNull View itemView, final Adapter.OnItemClickListener listener) {
        super(itemView);
        image = itemView.findViewById(R.id.image);
        lineOne = itemView.findViewById(R.id.image_name);
        lineTwo = itemView.findViewById(R.id.image_author);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (listener != null) {
                    int position = getAdapterPosition();
                    if (position != RecyclerView.NO_POSITION) {
                        listener.onItemClick(position);
                    }
                }
            }
        });
    }
}
