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

public class PlanetaAdapter extends ArrayAdapter<Planeta> {

    int mResource;

    public PlanetaAdapter(@NonNull Context context, int resource, @NonNull List<Planeta> objects) {
        super(context, resource, objects);
        this.mResource = resource; // Inicializando mResource
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View v = inflater.inflate(mResource, parent, false);

        Planeta planeta = getItem(position);
        TextView tv = v.findViewById(R.id.editTextText);  // Certifique-se de que o id 'editTextText' está correto
        ImageView iv = v.findViewById(R.id.imageView);  // Certifique-se de que o id 'imageView' está correto

        if (planeta != null) {
            tv.setText(planeta.getNome());  // Definindo o nome do planeta
            iv.setImageResource(planeta.getFoto());  // Definindo a imagem do planeta
        }

        return v;
    }
}
