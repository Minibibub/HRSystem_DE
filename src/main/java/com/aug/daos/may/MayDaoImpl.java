package com.aug.daos.may;

import com.aug.daos.BaseHibernateDaoImpl;
import com.aug.entities.may.May;

import org.springframework.stereotype.Repository;

@Repository
public class MayDaoImpl extends BaseHibernateDaoImpl<May> implements MayDao{

    protected MayDaoImpl() {
        super(May.class);
    }

    @Override
    public boolean deleteById(int id) {
    	May may = getById(id);
    	if(may == null){
    		return false;
    	}
    	getCurrentSession().delete(may);
        return true;
    }
    
}
