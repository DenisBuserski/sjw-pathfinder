package com.pathfinder.repository;

import com.pathfinder.model.Route;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RouteRepository extends JpaRepository<Route, Long> {

    @Query("SELECT r FROM Route r ORDER BY SIZE(r.comments) DESC LIMIT 1")
    Route findMostCommented();
    
}
