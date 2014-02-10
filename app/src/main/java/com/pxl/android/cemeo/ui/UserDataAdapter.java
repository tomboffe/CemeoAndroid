package com.pxl.android.cemeo.ui;


import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.LayoutInflater;

import com.github.kevinsawicki.wishlist.SingleTypeAdapter;
import com.pxl.android.cemeo.BootstrapApplication;
import com.pxl.android.cemeo.R;
import com.pxl.android.cemeo.core.User;
import com.pxl.android.cemeo.util.Ln;
import com.squareup.picasso.Picasso;

import java.text.SimpleDateFormat;
import java.util.List;

/**
 * Adapter to display a list of traffic items
 */
public class UserDataAdapter extends SingleTypeAdapter<User> {

    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("MMMM dd");

    /**
     * @param inflater
     * @param items
     */
    public UserDataAdapter(LayoutInflater inflater, List<User> items) {
        super(inflater, R.layout.user_list_item);

    }

    /**
     * @param inflater
     */
    public UserDataAdapter(LayoutInflater inflater) {
        this(inflater, null);

    }


    @Override
    public long getItemId(final int position) {
        String id = getItem(position).getUserId();
        return !TextUtils.isEmpty(id) ? id.hashCode() : super.getItemId(position);
    }

    @Override
    protected int[] getChildViewIds() {
        return new int[]{R.id.iv_avatar, R.id.tv_email , R.id.tv_firstname , R.id.tv_lastname , R.id.tv_location_n , R.id.tv_location_s,R.id.tv_location_ci , R.id.tv_location_co , R.id.tv_username };
    }


    @Override
    protected void update(int position, User item) {



        Picasso.with(BootstrapApplication.getInstance())
                //.load(user.getAvatarUrl()) --> afb van de spectifieke gebruiker laden
                .load(R.drawable.gravatar_icon)
                .placeholder(R.drawable.gravatar_icon)
                .into(imageView(0));

        try{

        setText(8, String.format("%s", item.getUserName()));
        setText(1, String.format("%s", item.getEMail()));
        setText(2, String.format("%s", item.getFirstName()));
        setText(3, String.format("%s", item.getLastName()));
        setText(4, String.format("%s", item.getPreferedLocation().getName()));
        setText(5, String.format("%s %s", item.getPreferedLocation().getStreet() ,item.getPreferedLocation().getNumber() ));
        setText(6, String.format("%s %s", item.getPreferedLocation().getZip(), item.getPreferedLocation().getCity()));
        setText(7, String.format("%s", item.getPreferedLocation().getCountry()));

        }catch(NullPointerException ex){

            Ln.d("statuslog : Error --> Prefered location = NULL");
        }

    }


}
