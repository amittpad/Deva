package com.india.deva;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;

import cn.pedant.SweetAlert.SweetAlertDialog;

/**
 * Created by AMIT PRAMANIK on 29-06-2019.
 * Eclipse Technoconsulting Global Pvt. Ltd.
 * amit.pramanik@theetsindia.com
 */
public class DiaLogHelper {
    public static SweetAlertDialog pDialog = null;
    public static int Type = 0;
    private static int SPLASH_DISPLAY_LENGTH = 1000;

    public static void showDialog(Context c, String Msg, int type) {
        Type = type;
        pDialog = new SweetAlertDialog(c, type);
        pDialog.getProgressHelper().setBarColor(Color.parseColor("#A5DC86"));
        pDialog.setTitleText(Msg);
        pDialog.setCancelable(false);
        pDialog.show();

    }


    public static void showDialog(final Context c, String Msg, int type, final Context ix) {
        Type = type;
        pDialog = new SweetAlertDialog(c, type);
        pDialog.getProgressHelper().setBarColor(Color.parseColor("#A5DC86"));
        pDialog.setTitleText(Msg);
        pDialog.setCancelable(false);
        pDialog.setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
            @Override
            public void onClick(SweetAlertDialog sweetAlertDialog) {

                String action;
                Uri uri;


            }
        });
        pDialog.show();

    }
    public static void Dissmiss() {
        pDialog.dismiss();
    }
}
