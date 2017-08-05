package com.example.shadmanfahimahmad.gobangladesh;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by ShadmanFahimAhmad on 7/26/2017.
 */

public class MySingleton {

    private static MySingleton mInstances;
    private RequestQueue requestQueue;
    private Context mCtx;

    private MySingleton(Context context)
    {
        mCtx = context;
        requestQueue = getRequestQueue();
    }

    private RequestQueue getRequestQueue()
    {
        if (requestQueue == null)
        {
            requestQueue = Volley.newRequestQueue(mCtx.getApplicationContext());
        }
        return requestQueue;
    }

    public static synchronized MySingleton getInstance(Context context)
    {
        if(mInstances == null)
        {
            mInstances = new MySingleton(context);
        }
        return mInstances;
    }

    public<T> void addToRequestQueue(Request<T> request)
    {
        getRequestQueue().add(request);
    }

}
