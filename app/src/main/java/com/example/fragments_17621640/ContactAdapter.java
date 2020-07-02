package com.example.fragments_17621640;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ContactAdapter extends RecyclerView.Adapter<ContactViewHolder>{
    private List<Contacts> contacts;
    private Context context;

    public ContactAdapter(List<Contacts> contacts) {
        this.contacts = contacts;
    }

    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View contactView = inflater.inflate(R.layout.item2, parent, false);
        ContactViewHolder contactViewHolder = new ContactViewHolder((contactView));

        return contactViewHolder;
    }
    @Override
    public void onBindViewHolder(@NonNull ContactViewHolder holder, int position) {
        final Contacts contact = contacts.get(position);

        holder.setName(contact.getName());
        holder.setAddress(contact.getAddress());
        holder.setImage(contact.getPicture());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, contact.getName() + ", " + contact.getAddress(), Toast.LENGTH_SHORT).show();
            }
        });
    }
    @Override
    public int getItemCount() {
        return contacts.size();

    }
    public void AddContact(Contacts contact)
    {
        contacts.add(getItemCount(), contact);
        notifyItemInserted(getItemCount());
    }
}
