package com.carpark.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

//import javax.persistence.*;

@Entity
@Table(name = "car_park_availability")
public class CarParkAvailability {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "car_park_id")
    private CarParkInformation carParkInformation;

    @Column(name = "available_spaces")
    private int availableSpaces;

    @Column(name = "last_updated")
    private LocalDateTime lastUpdated;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CarParkInformation getCarParkInformation() {
        return carParkInformation;
    }

    public void setCarParkInformation(CarParkInformation carParkInformation) {
        this.carParkInformation = carParkInformation;
    }

    public int getAvailableSpaces() {
        return availableSpaces;
    }

    public void setAvailableSpaces(int availableSpaces) {
        this.availableSpaces = availableSpaces;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}




