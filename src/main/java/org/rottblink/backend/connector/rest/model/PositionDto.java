package org.rottblink.backend.connector.rest.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringMVCServerCodegen", date = "2016-03-26T20:54:27.472Z")
public class PositionDto  {
  
  private String title = null;
  private Double latitude = null;
  private Double longitude = null;

  
  /**
   * human readable position eg. address or placename
   **/
  @ApiModelProperty(value = "human readable position eg. address or placename")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("latitude")
  public Double getLatitude() {
    return latitude;
  }
  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("longitude")
  public Double getLongitude() {
    return longitude;
  }
  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PositionDto latLng = (PositionDto) o;
    return Objects.equals(title, latLng.title) &&
        Objects.equals(latitude, latLng.latitude) &&
        Objects.equals(longitude, latLng.longitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, latitude, longitude);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LatLng {\n");
    
    sb.append("  title: ").append(title).append("\n");
    sb.append("  latitude: ").append(latitude).append("\n");
    sb.append("  longitude: ").append(longitude).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
