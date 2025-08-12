package com.yashas.metro.planner.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yashas.metro.planner.entity.Station;
import com.yashas.metro.planner.service.StationService;

@RestController
public class StationController {

	@Autowired
	private StationService stationService;

	@GetMapping("/stations")
	public List<Station> getStations() {
		return stationService.getStations();
	}
}
