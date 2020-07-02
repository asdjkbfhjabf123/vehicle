package com.geekzila.vehicle.service;

import java.util.ArrayList;
import java.util.List;

import com.geekzila.vehicle.model.Vehicle;

public class VehicleBrand implements Brand {

	public List<Vehicle> vehicles = new ArrayList<Vehicle>();

	public VehicleBrand() {
		vehicles.add(new Vehicle("Audi", 789456));
		vehicles.add(new Vehicle("Hyundai", 124569));
	}

	public void add(Vehicle vehicle) {
		// TODO Auto-generated method stub
		vehicles.add(vehicle);

	}

	public List<Vehicle> findAll() {
		// TODO Auto-generated method stub
		return vehicles;
	}

}
