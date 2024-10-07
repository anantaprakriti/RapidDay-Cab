package com.example.RapidDay.RadipDay.services.impl;

import com.example.RapidDay.RadipDay.services.DistanceService;
import org.locationtech.jts.geom.Point;
import org.springframework.stereotype.Service;

@Service
public class DistanceServiceOSRMImpl implements DistanceService {
    @Override
    public double calculateDistance(Point src, Point dst) {
        return 0;
    }
}
