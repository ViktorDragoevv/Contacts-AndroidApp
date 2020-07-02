package com.example.fragments_17621640;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class ContactFragment extends DialogFragment implements View.OnClickListener {

    private Button add;
    private EditText name;
    private EditText address;
    private EditText image;
    AddcontactDialogListener listener;

    public ContactFragment() {
    }

    public static ContactFragment newInstance() {
        return new ContactFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_add_contact, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        image = view.findViewById(R.id.et);
        name = view.findViewById(R.id.et2);
        address = view.findViewById(R.id.et3);
        add = view.findViewById(R.id.bt);
        add.setOnClickListener(this);
        name.requestFocus();
        getDialog().getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        listener = (AddcontactDialogListener) context;
    }

    @Override
    public void onClick(View v) {
        Contacts contact = new Contacts( image.getText().toString(),name.getText().toString(), address.getText().toString());

        listener.onFinishAddDialog(contact);

        dismiss();
    }

}
