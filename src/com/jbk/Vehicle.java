package com.jbk;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Vehicle {

	@Id
	private long vehicle_id;
	private String make;
	private String model;
	private String color;
	private String type;

	public Vehicle() {

	}

	public Vehicle(long vehicle_id, String make, String model, String color, String type) {
		super();
		this.vehicle_id = vehicle_id;
		this.make = make;
		this.model = model;
		this.color = color;
		this.type = type;
	}

	public long getVehicle_id() {
		return vehicle_id;
	}

	public void setVehicle_id(long vehicle_id) {
		this.vehicle_id = vehicle_id;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicle_id=" + vehicle_id + ", make=" + make + ", model=" + model + ", color=" + color
				+ ", type=" + type + "]";
	}

}
