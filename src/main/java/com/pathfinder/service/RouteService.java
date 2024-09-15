package com.pathfinder.service;

import com.pathfinder.model.Route;
import com.pathfinder.repository.RouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RouteService {

    private final RouteRepository routeRepository;

    @Autowired
    public RouteService(RouteRepository routeRepository) {
        this.routeRepository = routeRepository;
    }

    public Route getMostCommented() {
        return this.routeRepository.findMostCommented();
    }
}
