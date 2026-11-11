package com.portfolio.enterprise_backend.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class LocationRequest {
    @NotNull(message = "Title is required")
    @Size(min = 2, max = 100)
    private String title;

    private String description;

    @NotNull(message = "Latitude is required")
    private Double latitude;

    @NotNull(message = "Longitude is required")
    private Double longitude;

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public Double getLatitude() { return latitude; }
    public void setLatitude(Double latitude) { this.latitude = latitude; }
    public Double getLongitude() { return longitude; }
    public void setLongitude(Double longitude) { this.longitude = longitude; }
}