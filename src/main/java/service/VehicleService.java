package service;

import model.VehicleModel;
import repo.VehicleRepo;

public class VehicleService {
    private VehicleRepo vehicleRepo = new VehicleRepo();

    public boolean registerVehicle(VehicleModel vehicle) {
        return vehicleRepo.addVehicle(vehicle);
    }
}
