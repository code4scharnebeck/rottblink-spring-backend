package org.rottblink.backend.core.groupmgnt.domain.domainvalue;

import javax.persistence.Embeddable;

@Embeddable
public class Position extends LatLng {

	private String title;

	public Position() {
	}

	public Position(double lat, double lng) {
		super(lat, lng);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
