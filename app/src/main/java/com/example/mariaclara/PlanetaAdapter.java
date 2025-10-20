package com.example.mariaclara;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class PlanetaAdapter extends  ArrayAdapter<Planeta>{
    int mResouce;
    public PlanetaAdapter(@NonNull Context context, int resource, @NonNull List<Planeta> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View v = inflater.inflate(mResouce, parent, false);
        Planeta planeta=getItem(position);
        TextView tv=v.findViewById(R.id.editTextText);
        ImageView iv =v.findViewById(R.id.imageView);
        return v;
    }
}
