package com.example.mybottomnavigationmenu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class ProgrameAdapter extends RecyclerView.Adapter<ProgrameAdapter.ViewHolder> {

    Context context;
    String[] NGO;
    String[] DESCRIPTION;
    int[] IMAGES;
    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView NGOTitle;
        TextView NGODesc;
        ImageView NGOImage;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            NGOTitle=itemView.findViewById(R.id.textView);
            NGODesc=itemView.findViewById(R.id.textView2);
            NGOImage=itemView.findViewById(R.id.imageView);
        }
    }

    public ProgrameAdapter(Context context,String[] NGO,String[] DESCRIPTION,int[] IMAGES) {
        this.context = context;
        this.NGO=NGO;
        this.DESCRIPTION=DESCRIPTION;
        this.IMAGES=IMAGES;
    }

    @NonNull
    @Override
    public ProgrameAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(context);
        View view=layoutInflater.inflate(R.layout.single_item,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ProgrameAdapter.ViewHolder holder, int position) {
             holder.NGOImage.setImageResource(IMAGES[position]);
             holder.NGOTitle.setText(NGO[position]);
             holder.NGODesc.setText(DESCRIPTION[position]);
    }

    @Override
    public int getItemCount() {
        return NGO.length;
    }
}
