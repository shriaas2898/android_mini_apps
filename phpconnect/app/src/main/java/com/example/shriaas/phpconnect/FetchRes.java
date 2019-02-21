package com.example.shriaas.phpconnect;

import android.os.AsyncTask;
import java.io.*;
import java.net.*;


/**
 * Created by shriaas on 13/2/19.
 */

class FetchRes extends AsyncTask <String,Void,String>{
    MainActivity activity;
    URL url;
    HttpURLConnection htpc;
    public FetchRes(MainActivity mainActivity) {
        activity =mainActivity;
    }


    @Override
    protected String doInBackground(String... params) {
        try {
            url = new URL(params[0]);
            htpc =(HttpURLConnection) url.openConnection();
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(htpc)
            );
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
