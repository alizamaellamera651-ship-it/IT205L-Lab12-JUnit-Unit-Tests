package com.clebs.service;

import com.clebs.domain.Equipment;

public class EquipmentService {

    // Register equipment
    public Equipment registerEquipment(
            String equipmentId,
            String equipmentName,
            int quantity) {

        return new Equipment(equipmentId, equipmentName, quantity);
    }

    // Check available quantity
    public boolean isAvailable(Equipment equipment) {

        return equipment.getQuantity() > 0;
    }

    // Update equipment quantity
    public void updateEquipmentQuantity(
            Equipment equipment,
            int newQuantity) {

        equipment.updateQuantity(newQuantity);
    }
}