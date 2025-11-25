package com.example.mariaclara;

import java.util.ArrayList;

public class PlanetaController {

    PlanetaDao planetaDao;

    public PlanetaController(){
        planetaDao = new PlanetaDao();
    }

    public void addPlaneta(Planeta planeta){
        planetaDao.addPlaneta(planeta);  // Adicionando planeta ao DAO
    }

    public ArrayList<Planeta> getPlanetas(){
        return planetaDao.getPlanetas();
    }

    public ArrayList<String> getNomePlanetas(){
        ArrayList<String> nomes = new ArrayList<>();
        for(Planeta planeta : planetaDao.getPlanetas()){
            nomes.add(planeta.nome);
        }
        return nomes;
    }
}
