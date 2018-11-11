package com.afrobaskets.App.adapter;

/**
 * Created by HP-PC on 1/8/2018.
 */

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.afrobaskets.App.bean.CountryCodeModel;
import com.webistrasoft.org.ecommerce.R;

import java.util.ArrayList;

public class CountryCodeAdapter  extends ArrayAdapter<CountryCodeModel> {
    Context context;

    LayoutInflater inflter;
    private final LayoutInflater mInflater;

    ArrayList<CountryCodeModel>countryCodeModelArrayList;
    public CountryCodeAdapter(Context applicationContext,
                              ArrayList<CountryCodeModel> countryCodeModelArrayList) {
        super(applicationContext,  0, countryCodeModelArrayList);

        context = applicationContext;
        mInflater = LayoutInflater.from(context);


        this.countryCodeModelArrayList=countryCodeModelArrayList;
        inflter = (LayoutInflater.from(applicationContext));
    }
    @Override
    public View getDropDownView(int position, @Nullable View convertView,
                                @NonNull ViewGroup parent) {
        return createItemView(position, convertView, parent);
    }

    @Override
    public @NonNull View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return createItemView(position, convertView, parent);
    }

    private View createItemView(int position, View convertView, ViewGroup parent){
      View  view = inflter.inflate(R.layout.countrycodeitems, null);
        ImageView icon = (ImageView) view.findViewById(R.id.imageView);
        TextView names = (TextView) view.findViewById(R.id.textView);

        names.setText(""+countryCodeModelArrayList.get(position).getCountryCode());
        return view;
    }
   /* @Override
    public int getCount() {
        return countryCodeModelArrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.countrycodeitems, null);
        ImageView icon = (ImageView) view.findViewById(R.id.imageView);
        TextView names = (TextView) view.findViewById(R.id.textView);

        names.setText(""+countryCodeModelArrayList.get(i).getCountryCode());
        return view;
    }*/
}