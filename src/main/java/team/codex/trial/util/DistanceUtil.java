package team.codex.trial.util;

import team.codex.trial.model.AirportData;

public class DistanceUtil {

    private static final double EARTH_RADIUS = 6372.8;

    private DistanceUtil() {
    }

    public static double calculateDistance(AirportData ad1, AirportData ad2) {
        double deltaLat = Math.toRadians(ad2.getLatitude() - ad1.getLatitude());
        double deltaLon = Math.toRadians(ad2.getLongitude() - ad1.getLongitude());
        double haversine = Math.pow(Math.sin(deltaLat / 2), 2) + Math.pow(Math.sin(deltaLon / 2), 2)
                * Math.cos(Math.toRadians(ad1.getLatitude())) * Math.cos(Math.toRadians(ad2.getLatitude()));
        return 2 * EARTH_RADIUS * Math.asin(Math.sqrt(haversine));
    }
}
