package org.rottblink.backend.core.groupmgnt.util;

import org.rottblink.backend.core.groupmgnt.domain.domainvalue.LatLng;

public class LatLngUtil {

	public static double getRandomLatitude() {
		return (Math.random() * 180) - 90;
	}

	public static double getRandomLongitude() {
		return (Math.random() * 360) - 180;
	}

	public static LatLng getRandomLatLng() {
		return new LatLng(getRandomLatitude(), getRandomLongitude());
	}
}
