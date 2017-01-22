package com.itnavigator.opinta.dao;

import com.itnavigator.opinta.model.Client;

import java.util.List;

public interface ClientDAO {
	List<Client> getAll();
	Client getById(Integer id);
	void create(Client client);
	Client update(Client client);
}
