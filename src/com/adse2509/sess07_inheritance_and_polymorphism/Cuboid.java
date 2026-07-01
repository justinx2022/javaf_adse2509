package com.adse2509.sess07_inheritance_and_polymorphism;

/**
 * The {@code Cuboid} class represents a 3-dimensional Cuboid with its
 * length, width and breadth (depth). It provides methods to compute
 * its surface area and volume
 * 
 * @author odhia
 */
public class Cuboid extends Rectangle {
    // =============================================================
    // Instance Fields
    // =============================================================
    private int breadth;

    // =============================================================
    // Constructors
    // =============================================================

    public Cuboid() {
        super();
        this.name = "Cuboid";
        this.breadth = 0;
    }

    public Cuboid(int width, int length, int breadth) {
        super(width, length); // Call/ Invoke the parent/super class constructor
        this.name = "Cuboid";
        this.breadth = breadth;
    }

    // =============================================================
    // Getters and Setters
    // =============================================================

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    // =============================================================
    // Instance Methods
    // =============================================================

    protected long calculateSurfaceArea() {
        return 2 * (width * length + length * breadth + breadth * width); // 2 * (lw + lh + hw)
    }

    protected long calculateVolume() {
        return width * length * breadth; // (l * w * h(breadth))
    }

    // =============================================================
    // String Methods
    // =============================================================

    @Override
    public String toString()
    {
        return String.format(
            """
            %s Details
            -------------------------------------------------------------
            Width: %d
            Length: %d
            Breadth: %d
            Surface Area: %d
            Volume: %d
            -------------------------------------------------------------
            """,
            this.getName(),
            this.width,
            this.length,
            this.breadth,
            this.calculateSurfaceArea(),
            this.calculateVolume()
        );
    }
}
