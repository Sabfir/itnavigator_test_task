package com.itnavigator.opinta.service;

import com.itnavigator.opinta.model.Phone;

import java.util.List;

public interface PhoneService {
	List<Phone> getAll();
	Phone getById(Integer id);
	void create(Phone phone);
	Phone update(Phone phone);
}
