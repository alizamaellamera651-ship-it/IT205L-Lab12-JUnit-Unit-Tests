package com.clebs.domain;

public class Equipment {

    private String equipmentId;
    private String equipmentName;
    private int quantity;

    // Constructor
    public Equipment(String equipmentId, String equipmentName, int quantity) {

        if (equipmentId == null || equipmentId.trim().isEmpty()) {
            throw new IllegalArgumentException("Equipment ID cannot be empty.");
        }

        if (equipmentName == null || equipmentName.trim().isEmpty()) {
            throw new IllegalArgumentException("Equipment name cannot be empty.");
        }

        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative.");
        }

        this.equipmentId = equipmentId;
        this.equipmentName = equipmentName;
        this.quantity = quantity;
    }

    // Getters
    public String getEquipmentId() {
        return equipmentId;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public int getQuantity() {
        return quantity;
    }

    // Update quantity
    public void updateQuantity(int quantity) {

        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative.");
        }

        this.quantity = quantity;
    }
}