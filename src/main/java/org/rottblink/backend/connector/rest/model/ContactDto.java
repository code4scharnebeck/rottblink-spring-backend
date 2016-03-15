package org.rottblink.backend.connector.rest.model;

import io.swagger.annotations.ApiModelProperty;

public class ContactDto {

	private String website;
	private String facebook;
	private String twitter;
	private String email;
	private String phone;
	private String irc;
	
	@ApiModelProperty(required = false, value = "")
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	@ApiModelProperty(required = false, value = "")
	public String getFacebook() {
		return facebook;
	}
	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}

	@ApiModelProperty(required = false, value = "")
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@ApiModelProperty(required = false, value = "")
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	@ApiModelProperty(required = false, value = "")
	public String getTwitter() {
		return twitter;
	}
	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}

	@ApiModelProperty(required = false, value = "")
	public String getIrc() {
		return irc;
	}
	public void setIrc(String irc) {
		this.irc = irc;
	}
	
}
