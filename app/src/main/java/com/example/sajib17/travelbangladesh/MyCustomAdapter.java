package com.example.sajib17.travelbangladesh;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * Created by Sajib 17 on 10/14/2017.
 */

public class MyCustomAdapter extends BaseAdapter{

    String[] namez;
    int[] imez;
    Context ct;
    private static LayoutInflater inflater=null;
    public MyCustomAdapter(DhakaActivity mainact, String[] nameofarea, int[] areaims){

        namez=nameofarea;
        imez=areaims;
        ct=mainact;
        inflater=(LayoutInflater) ct.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }



    @Override
    public int getCount() {
        return namez.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
    public class MyHolder{
        TextView tvs;
        ImageView ims;
    }

    @Override
    public View getView(final int position, View view, ViewGroup viewGroup) {
        MyHolder myh=new MyHolder();
        View myview;
        myview=inflater.inflate(R.layout.customlayout,null);
        myh.tvs=(TextView) myview.findViewById(R.id.textviewid);
        myh.ims=(ImageView) myview.findViewById(R.id.imageviewid);
        myh.tvs.setText(namez[position]);
        myh.ims.setImageResource(imez[position]);

        return myview;
    }
}
