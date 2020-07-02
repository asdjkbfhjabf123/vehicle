package com.geekzila.vehicle;

import java.util.List;

import com.geekzila.vehicle.model.Vehicle;
import com.geekzila.vehicle.service.Brand;
import com.geekzila.vehicle.service.VehicleBrand;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Brand brand = new VehicleBrand();
		List<Vehicle> vehicles = brand.findAll();
		for (int i = 0; i < vehicles.size(); i++) {
			Vehicle vehicle = vehicles.get(i);
			System.out.println("Name:" + vehicle.getName() + " ID:" + vehicle.getId());
		}

	}
}
