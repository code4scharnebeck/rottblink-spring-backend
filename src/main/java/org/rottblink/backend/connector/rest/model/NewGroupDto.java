package org.rottblink.backend.connector.rest.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringMVCServerCodegen", date = "2016-03-26T20:54:27.472Z")
public class NewGroupDto {

	private String name = null;
	private LatLngDto mapMarkerPosition = null;
	private PositionDto defaultMeetingLoction;//TODO move to regular meeting entry
	private ContactDto contact =null;
	private String description = null;
	private Integer minAge=null;
	private Integer maxAge = null;
	private String iconUrl=null;

	@ApiModelProperty(required = false, value = "")
	@JsonProperty("minAge")
	public Integer getMinAge() {
		return minAge;
	}

	public void setMinAge(Integer minAge) {
		this.minAge = minAge;
	}

	@ApiModelProperty(required = false, value = "")
	@JsonProperty("maxAge")
	public Integer getMaxAge() {
		return maxAge;
	}

	public void setMaxAge(Integer maxAge) {
		this.maxAge = maxAge;
	}

	@ApiModelProperty(required = false, value= "")
	@JsonProperty("iconUrl")
	public String getIconUrl() {
		return iconUrl;
	}

	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}

	/**
	 * Unique identifier for the group
	 **/
	@ApiModelProperty(required = true, value = "Unique identifier for the group")
	@JsonProperty("name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 **/
	@ApiModelProperty(required = true, value = "")
	@JsonProperty("mapMarkerPosition")
	public LatLngDto getMapMarkerPosition() {
		return mapMarkerPosition;
	}

	public void setMapMarkerPosition(LatLngDto position) {
		this.mapMarkerPosition = position;
	}

	/**
	 * a short text to explain what is the group about
	 **/
	@ApiModelProperty(required = true, value = "a short text to explain what is the group about")
	@JsonProperty("description")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@ApiModelProperty(required = false, value = "")
	@JsonProperty("contact")
	public ContactDto getContact() {
		return contact;
	}

	public void setContact(ContactDto contact) {
		this.contact = contact;
	}

	@ApiModelProperty(required = false, value = "the place where the meetings take place usually")
	public PositionDto getDefaultMeetingLoction() {
		return defaultMeetingLoction;
	}

	public void setDefaultMeetingLoction(PositionDto defaultMeetingLoction) {
		this.defaultMeetingLoction = defaultMeetingLoction;
	}

}
