package com.example.mariaclara;

import java.util.ArrayList;

public class PlanetaDao {

    ArrayList<Planeta> arrayListPlaneta;

    public PlanetaDao(){
        arrayListPlaneta = new ArrayList<>();
        arrayListPlaneta.add(new Planeta("Mercúrio", R.drawable.mercury));
        arrayListPlaneta.add(new Planeta("Vênus", R.drawable.venus));
        arrayListPlaneta.add(new Planeta("Terra", R.drawable.earth));
        arrayListPlaneta.add(new Planeta("Marte", R.drawable.mars));
        arrayListPlaneta.add(new Planeta("Jupiter", R.drawable.jupter));
        arrayListPlaneta.add(new Planeta("Saturno", R.drawable.saturn));
        arrayListPlaneta.add(new Planeta("Urano", R.drawable.uranus));
        arrayListPlaneta.add(new Planeta("Netuno", R.drawable.neptune));
    }

    public ArrayList<Planeta> getPlanetas(){
        return arrayListPlaneta;
    }

    public void addPlaneta(Planeta planeta){
        arrayListPlaneta.add(planeta);  // Adiciona o planeta à lista
    }
}
