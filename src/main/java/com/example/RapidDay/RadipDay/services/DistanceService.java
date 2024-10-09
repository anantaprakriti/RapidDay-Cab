package com.example.RapidDay.RadipDay.services;

import org.locationtech.jts.geom.Point;

public interface DistanceService {

    double calculateDistance(Point src, Point dst);
    //call third party api orm

}
