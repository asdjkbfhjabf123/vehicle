package com.geekzila.vehicle.service;

import java.util.List;

import com.geekzila.vehicle.model.Vehicle;

public interface Brand {

	public void add(Vehicle vehicle);

	public List<Vehicle> findAll();

}
