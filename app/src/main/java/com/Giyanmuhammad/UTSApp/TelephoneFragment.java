package com.Giyanmuhammad.UTSApp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;


public class TelephoneFragment extends Fragment {

    ImageView iv_call;
    EditText et_number;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_telephone, container, false);

        et_number = view.findViewById(R.id.et_number);
        iv_call = view.findViewById(R.id.ic_call);


        iv_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number = et_number.getText().toString();
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + number));
                startActivity(intent);
            }
        });



        return view;
    }
}