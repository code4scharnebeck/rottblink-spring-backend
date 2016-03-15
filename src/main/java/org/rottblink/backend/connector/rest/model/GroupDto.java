package org.rottblink.backend.connector.rest.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringMVCServerCodegen", date = "2016-03-26T20:54:27.472Z")
public class GroupDto extends NewGroupDto {

	
	private String lastChanged = null;
	private Long id = null;


	/**
	 * internaly used to flag group as inactive after a while
	 **/
	@ApiModelProperty(value = "internaly used to flag group as inactive after a while")
	@JsonProperty("lastChanged")
	public String getLastChanged() {
		return lastChanged;
	}

	public void setLastChanged(String lastChanged) {
		this.lastChanged = lastChanged;
	}

	/**
	 **/
	@ApiModelProperty(required = true, value = "")
	@JsonProperty("id")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	}
