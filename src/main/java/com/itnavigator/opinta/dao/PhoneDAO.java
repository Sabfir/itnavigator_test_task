package com.itnavigator.opinta.dao;

import com.itnavigator.opinta.model.Phone;

import java.util.List;

public interface PhoneDAO {
	List<Phone> getAll();
	Phone getById(Integer id);
	void create(Phone phone);
	Phone update(Phone phone);
}
