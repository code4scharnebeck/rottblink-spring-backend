package org.rottblink.backend.connector.rest.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;


/**
 * Rule to generate dates of a regular meeting.
 **/
@ApiModel(description = "Rule to generate dates of a regular meeting.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringMVCServerCodegen", date = "2016-03-26T20:54:27.472Z")
public class RegularMeetingRuleDto  {
  
  private Long id = null;
  private Date startDate = null;
  private Date optEndDate = null;
  private Integer dayOfMonth = null;
  private Integer dayOfWeek = null;
  private Integer weekOfMonth = null;

  
  /**
   * Unique identifier for the group
   **/
  @ApiModelProperty(value = "Unique identifier for the group")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("startDate")
  public Date getStartDate() {
    return startDate;
  }
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("optEndDate")
  public Date getOptEndDate() {
    return optEndDate;
  }
  public void setOptEndDate(Date optEndDate) {
    this.optEndDate = optEndDate;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("dayOfMonth")
  public Integer getDayOfMonth() {
    return dayOfMonth;
  }
  public void setDayOfMonth(Integer dayOfMonth) {
    this.dayOfMonth = dayOfMonth;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("dayOfWeek")
  public Integer getDayOfWeek() {
    return dayOfWeek;
  }
  public void setDayOfWeek(Integer dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("weekOfMonth")
  public Integer getWeekOfMonth() {
    return weekOfMonth;
  }
  public void setWeekOfMonth(Integer weekOfMonth) {
    this.weekOfMonth = weekOfMonth;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegularMeetingRuleDto regularMeetingRuleDto = (RegularMeetingRuleDto) o;
    return Objects.equals(id, regularMeetingRuleDto.id) &&
        Objects.equals(startDate, regularMeetingRuleDto.startDate) &&
        Objects.equals(optEndDate, regularMeetingRuleDto.optEndDate) &&
        Objects.equals(dayOfMonth, regularMeetingRuleDto.dayOfMonth) &&
        Objects.equals(dayOfWeek, regularMeetingRuleDto.dayOfWeek) &&
        Objects.equals(weekOfMonth, regularMeetingRuleDto.weekOfMonth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, startDate, optEndDate, dayOfMonth, dayOfWeek, weekOfMonth);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegularMeetingRuleDto {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  startDate: ").append(startDate).append("\n");
    sb.append("  optEndDate: ").append(optEndDate).append("\n");
    sb.append("  dayOfMonth: ").append(dayOfMonth).append("\n");
    sb.append("  dayOfWeek: ").append(dayOfWeek).append("\n");
    sb.append("  weekOfMonth: ").append(weekOfMonth).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
