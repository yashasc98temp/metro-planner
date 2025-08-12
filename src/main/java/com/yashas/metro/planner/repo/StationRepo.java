package com.yashas.metro.planner.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yashas.metro.planner.entity.Station;

@Repository
public interface StationRepo extends JpaRepository<Station, String> {

}
