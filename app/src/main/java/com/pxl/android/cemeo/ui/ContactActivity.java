package com.pxl.android.cemeo.ui;


import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import com.pxl.android.cemeo.R;
import com.pxl.android.cemeo.core.Contact;
import com.pxl.android.cemeo.core.User;
import com.pxl.android.cemeo.util.Ln;
import com.squareup.picasso.Picasso;

import butterknife.InjectView;

import static com.pxl.android.cemeo.core.Constants.Extra.CONTACT;
import static com.pxl.android.cemeo.core.Constants.Extra.USER;

public class ContactActivity extends BootstrapActivity {

    @InjectView(R.id.iv_contact_avatar)
    protected ImageView avatar;
    @InjectView(R.id.tv_contact_name)
    protected TextView name;

    protected Contact contact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.add_contact_view);

        if (getIntent() != null && getIntent().getExtras() != null) {
            contact = (Contact) getIntent().getExtras().getSerializable(CONTACT);
        }

        Picasso.with(this).load(R.drawable.gravatar_icon).placeholder(R.drawable.gravatar_icon).into(avatar);

        name.setText(String.format("%s %s", contact.getFirstName(), contact.getLastName()));


    }





}
