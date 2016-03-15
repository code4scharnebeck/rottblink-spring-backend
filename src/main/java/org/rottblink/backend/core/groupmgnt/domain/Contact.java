package org.rottblink.backend.core.groupmgnt.domain;

import javax.persistence.Embeddable;

@Embeddable
public class Contact {

	private String website;
	private String facebook;
	private String twitter;
	private String email;
	private String phone;
	private String irc;
	
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getFacebook() {
		return facebook;
	}
	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getTwitter() {
		return twitter;
	}
	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}
	public String getIrc() {
		return irc;
	}
	public void setIrc(String irc) {
		this.irc = irc;
	}
	
}
