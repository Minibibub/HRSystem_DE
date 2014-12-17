package com.aug.services.may;

import java.util.List;

import com.aug.daos.may.MayDao;
import com.aug.entities.may.May;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MayService {

    @Autowired
    private MayDao mayDao;

	public void save(May may) {
		mayDao.save(may);
	}

	public List<May> findAll() {
		return mayDao.findAll();
	}

	public void update(May may) {
		mayDao.update(may);
	}

	public May findById(Integer id) {
		return mayDao.getById(id);
	}

	public boolean deleteById(Integer id) {
		return mayDao.deleteById(id);
	}

	public List<May> search(String search) {
		return mayDao.search(search);
	}
}
