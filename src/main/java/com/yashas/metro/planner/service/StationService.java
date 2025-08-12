package com.yashas.metro.planner.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yashas.metro.planner.entity.Station;
import com.yashas.metro.planner.repo.StationRepo;

@Service
public class StationService implements StationServiceInterface {

	@Autowired
	private StationRepo stationRepo;

	@Override
	public List<Station> getStations() {
		return stationRepo.findAll();
	}

}
