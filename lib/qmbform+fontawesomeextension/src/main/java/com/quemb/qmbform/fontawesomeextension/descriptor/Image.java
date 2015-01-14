package com.quemb.qmbform.fontawesomeextension.descriptor;

import com.joanzapata.android.iconify.IconDrawable;
import com.joanzapata.android.iconify.Iconify;
import com.quemb.qmbform.descriptor.OnValueChangeListener;
import com.quemb.qmbform.fontawesomeextension.R;

import android.graphics.Color;

/**
 * Created by tonimoeckel on 14.07.14.
 */
public class Image {

    public static final int ANDROID_ACTIONBAR_ICON_SIZE_DP = 48;

    private Iconify.IconValue mIcon;
    private int mColor = R.color.default_fa_color ;
    private int mSize = ANDROID_ACTIONBAR_ICON_SIZE_DP;

    private OnValueChangeListener mOnValueChangeListener;


    public Image() { }

    public Image(Iconify.IconValue icon){
        mIcon = icon;
    }
    public Image(Iconify.IconValue icon, int size){
        mIcon = icon;
        mSize = size;
    }

    public Image(Iconify.IconValue icon, int size, int color){
        mIcon = icon;
        mSize = size;
        mColor = color;
    }


    public Iconify.IconValue getIcon(){
        return mIcon;
    }

    public int getColor(){
        return mColor;
    }


    public void setImage(Iconify.IconValue icon, int color){
        mIcon = icon;
        mColor = color;
        if (mOnValueChangeListener != null){
            mOnValueChangeListener.onChange(icon);
        }
    }


    public void setOnValueChangeListener(OnValueChangeListener listener) {
        this.mOnValueChangeListener = listener;
    }

    public int getSize(){
        return mSize;
    }

    public void setSize(int size){
        mSize = size;
    }
}
