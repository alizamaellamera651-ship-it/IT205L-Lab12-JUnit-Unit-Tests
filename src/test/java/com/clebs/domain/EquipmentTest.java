package com.clebs.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class EquipmentTest {

    @Test
    void createsEquipment_withValidDetails() {
        // Arrange
        Equipment equipment = new Equipment("EQ001", "Computer", 10);

        // Act and Assert
        assertEquals("EQ001", equipment.getEquipmentId());
        assertEquals("Computer", equipment.getEquipmentName());
        assertEquals(10, equipment.getQuantity());
    }

    @Test
    void updatesQuantity_withValidValue() {
        // Arrange
        Equipment equipment = new Equipment("EQ001", "Computer", 10);

        // Act
        equipment.updateQuantity(15);

        // Assert
        assertEquals(15, equipment.getQuantity());
    }

    @Test
    void throwsException_whenEquipmentIdIsEmpty() {
        // Arrange and Act
        // Assert
        assertThrows(IllegalArgumentException.class,
                () -> new Equipment("", "Computer", 10));
    }

    @Test
    void throwsException_whenEquipmentNameIsEmpty() {
        assertThrows(IllegalArgumentException.class,
                () -> new Equipment("EQ001", "", 10));
    }

    @Test
    void throwsException_whenQuantityIsNegative() {
        assertThrows(IllegalArgumentException.class,
                () -> new Equipment("EQ001", "Computer", -5));
    }

    @Test
    void throwsException_whenUpdatedQuantityIsNegative() {
        // Arrange
        Equipment equipment = new Equipment("EQ001", "Computer", 10);

        // Act and Assert
        assertThrows(IllegalArgumentException.class,
                () -> equipment.updateQuantity(-5));
    }
}