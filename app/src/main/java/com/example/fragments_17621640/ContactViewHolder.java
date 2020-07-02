package com.example.fragments_17621640;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

public class ContactViewHolder extends RecyclerView.ViewHolder {
    private ImageView image;
    private TextView name;
    private TextView address;
    private TextView address1;
    private TextView name1;


    public ContactViewHolder(@NonNull View itemView) {
        super(itemView);
       image=itemView.findViewById(R.id.iv);
       name=itemView.findViewById(R.id.tv);
        address=itemView.findViewById(R.id.tv2);
        name1=itemView.findViewById(R.id.tv3);
        address1=itemView.findViewById(R.id.tv4);
        address1.setText("Address:");
        name1.setText("Name:");

    }




    public void setImage(String url ) {

        Picasso.get().load(url).resize(300,300).error(R.drawable.ic_launcher_background).into(image);

    }


    public TextView getName() {
        return name;
    }

    public void setName(String name) {
        this.name.setText(name);
    }

    public TextView getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address.setText(address);
    }

    public ImageView getImage() {
        return image;
    }

}
