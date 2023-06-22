package com.jsp.repository;

import java.util.List;

import com.jsp.dto.Destination;

public interface DestinationRep {
	String save(Destination destination);
	String update(Destination destination);
	String delete(int id);
	Destination getById(int id);
	List<Destination> getByName(String name);
	List<Destination> getAll();

}
