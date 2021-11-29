package com.csi.service;

import com.csi.model.Coustmer;

import java.util.List;

public interface CoustmerService {
    public void saveData(Coustmer coustmer);


    public List<Coustmer> getALLData();

    public boolean signin(Coustmer coustmer);
}
