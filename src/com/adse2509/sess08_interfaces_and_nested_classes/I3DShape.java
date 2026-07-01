package com.adse2509.sess08_interfaces_and_nested_classes;

/**
 * The {@code I3DShape} interface represents a three-dimensional geometric shape.
 * It extends {@code I2DShape} because a 3-D shape also has a surface area.
 * It introduces a contract for calculating the volume.
 * 
 * @author odhia
 */
public interface I3DShape extends I2DShape {
    /**
     * Calculates the volume of the 3-D shape.
     * 
     * @return the volume as a {@code float}.
     */
    public float calcVolume();
}
