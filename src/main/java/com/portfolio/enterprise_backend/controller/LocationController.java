package com.portfolio.enterprise_backend.controller;

import com.portfolio.enterprise_backend.dto.LocationRequest;
import com.portfolio.enterprise_backend.model.LocationEntity;
import com.portfolio.enterprise_backend.repository.LocationRepository;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/locations")
public class LocationController {

    private final LocationRepository locationRepository;

    public LocationController(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    @GetMapping
    public ResponseEntity<List<LocationEntity>> getAllLocations() {
        return ResponseEntity.ok(locationRepository.findAll());
    }

    @PostMapping
    public ResponseEntity<LocationEntity> createLocation(@Valid @RequestBody LocationRequest request) {
        LocationEntity entity = new LocationEntity(
                request.getTitle(),
                request.getDescription(),
                request.getLatitude(),
                request.getLongitude()
        );
        return ResponseEntity.ok(locationRepository.save(entity));
    }
}