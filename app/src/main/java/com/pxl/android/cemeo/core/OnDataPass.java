package com.pxl.android.cemeo.core;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jordy on 20/01/14.
 */
public interface OnDataPass {
    public void onDataPass(List<Contact> selected);
    public void onContactsPass(List<Contact> selected);
    public void onTimeFramePass(String date , String time , String duration);
    public void onLocationPass(Location selected);
}