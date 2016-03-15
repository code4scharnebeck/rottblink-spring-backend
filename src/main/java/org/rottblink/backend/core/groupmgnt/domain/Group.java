package org.rottblink.backend.core.groupmgnt.domain;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

import org.rottblink.backend.core.groupmgnt.domain.domainvalue.LatLng;
import org.rottblink.backend.core.groupmgnt.domain.domainvalue.Position;
import org.rottblink.backend.core.usermgnt.domain.User;
import org.springframework.data.domain.Auditable;

@Entity
@Table(name="local_group")
public class Group {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Integer version;

//	private List<User> admins;
	private String name;
	private Contact contact;
	private LatLng mapMarkerPosition;
	
	private Position defaultMeetingLoction;//TODO move to regular meeting entry
//	private List<RegularMeetingRule> rules;
//	private List<GroupMeeting> additionalFutureMeetings;
	private Integer minAge;
	private Integer maxAge;
	private String description;
	private String iconUrl;
	private LocalDate lastChange;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getVersion() {
		return version;
	}
	public void setVersion(Integer version) {
		this.version = version;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
//	public List<Contact> getContact() {
//		return contact;
//	}
//	public void setContact(List<Contact> contact) {
//		this.contact = contact;
//	}
	public LatLng getMapMarkerPosition() {
		return mapMarkerPosition;
	}
	public void setMapMarkerPosition(LatLng mapMarkerPosition) {
		this.mapMarkerPosition = mapMarkerPosition;
	}
	public Integer getMinAge() {
		return minAge;
	}
	public void setMinAge(Integer minAge) {
		this.minAge = minAge;
	}
	public Integer getMaxAge() {
		return maxAge;
	}
	public void setMaxAge(Integer maxAge) {
		this.maxAge = maxAge;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getIconUrl() {
		return iconUrl;
	}
	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}
	public LocalDate getLastChange() {
		return lastChange;
	}
	public void setLastChange(LocalDate lastChange) {
		this.lastChange = lastChange;
	}
	
	public Contact getContact() {
		return contact;
	}
	public void setContact(Contact contact) {
		this.contact = contact;
	}
	public Position getDefaultMeetingLoction() {
		return defaultMeetingLoction;
	}
	public void setDefaultMeetingLoction(Position defaultMeetingLoction) {
		this.defaultMeetingLoction = defaultMeetingLoction;
	}

	@PrePersist
	@PreUpdate
	public void updateLastChange() {
		setLastChange(LocalDate.now());
	}
}
