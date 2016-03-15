package org.rottblink.backend.core.groupmgnt.domain.domainvalue;

import javax.persistence.Embeddable;

@Embeddable
public class LatLng {

	private double latitude;
	private double longitude;

	public LatLng() {
	}

	public LatLng(double lat, double lng) {
		this.setLatitude(lat);
		this.setLongitude(lng);
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double lat) {
		this.latitude = lat;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double lng) {
		this.longitude = lng;
	}
}
