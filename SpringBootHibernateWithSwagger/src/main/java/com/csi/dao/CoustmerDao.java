package com.csi.dao;

import com.csi.model.Coustmer;

import java.util.List;

public interface CoustmerDao {


    public void saveData(Coustmer coustmer);


    public List<Coustmer> getALLData();

    public boolean signin(Coustmer coustmer);
}
