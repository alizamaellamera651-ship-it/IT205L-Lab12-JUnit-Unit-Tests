package com.clebs.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.clebs.domain.Equipment;

public class EquipmentServiceTest {

    private EquipmentService equipmentService = new EquipmentService();

    @Test
    void registersEquipment_withValidDetails() {
        // Arrange
        String id = "EQ001";
        String name = "Computer";
        int quantity = 10;

        // Act
        Equipment equipment = equipmentService.registerEquipment(
                id, name, quantity);

        // Assert
        assertEquals("EQ001", equipment.getEquipmentId());
        assertEquals("Computer", equipment.getEquipmentName());
        assertEquals(10, equipment.getQuantity());
    }

    @Test
    void returnsTrue_whenEquipmentIsAvailable() {
        // Arrange
        Equipment equipment = new Equipment("EQ001", "Computer", 5);

        // Act
        boolean result = equipmentService.isAvailable(equipment);

        // Assert
        assertTrue(result);
    }

    @Test
    void returnsFalse_whenEquipmentIsNotAvailable() {
        // Arrange
        Equipment equipment = new Equipment("EQ001", "Computer", 0);

        // Act
        boolean result = equipmentService.isAvailable(equipment);

        // Assert
        assertFalse(result);
    }

    @Test
    void updatesEquipmentQuantity_successfully() {
        // Arrange
        Equipment equipment = new Equipment("EQ001", "Computer", 5);

        // Act
        equipmentService.updateEquipmentQuantity(equipment, 10);

        // Assert
        assertEquals(10, equipment.getQuantity());
    }

    @Test
    void throwsException_whenUpdatingWithNegativeQuantity() {
        // Arrange
        Equipment equipment = new Equipment("EQ001", "Computer", 5);

        // Act and Assert
        assertThrows(IllegalArgumentException.class,
                () -> equipmentService.updateEquipmentQuantity(equipment, -5));
    }
}