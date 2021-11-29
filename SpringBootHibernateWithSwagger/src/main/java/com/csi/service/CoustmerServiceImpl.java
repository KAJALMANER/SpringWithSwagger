package com.csi.service;

import com.csi.dao.CoustmerDao;
import com.csi.model.Coustmer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoustmerServiceImpl implements CoustmerService{

@Autowired
    CoustmerDao coustmerDao;
    
    @Override
    public void saveData(Coustmer coustmer) {
        coustmerDao.saveData(coustmer);
    }

    @Override
    public List<Coustmer> getALLData() {

        return coustmerDao.getALLData();
    }
}
