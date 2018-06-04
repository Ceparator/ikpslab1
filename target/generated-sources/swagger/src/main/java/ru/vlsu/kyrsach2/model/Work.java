package ru.vlsu.kyrsach2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import javax.xml.bind.annotation.*;

/**
 * Work
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-03T16:01:50.300+03:00")
@JacksonXmlRootElement(localName = "Work")
@XmlRootElement(name = "Work")
@XmlAccessorType(XmlAccessType.FIELD)
public class Work  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  @JacksonXmlProperty(localName = "id")
  private Long id = null;

  @JsonProperty("workType")
  @JacksonXmlProperty(localName = "workType")
  private String workType = null;

  @JsonProperty("hours")
  @JacksonXmlProperty(localName = "hours")
  private Long hours = null;

  @JsonProperty("week")
  @JacksonXmlProperty(localName = "week")
  private Long week = null;

  @JsonProperty("ymkId")
  @JacksonXmlProperty(localName = "ymkId")
  private Long ymkId = null;

  public Work id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Work workType(String workType) {
    this.workType = workType;
    return this;
  }

   /**
   * Get workType
   * @return workType
  **/
  @ApiModelProperty(value = "")


  public String getWorkType() {
    return workType;
  }

  public void setWorkType(String workType) {
    this.workType = workType;
  }

  public Work hours(Long hours) {
    this.hours = hours;
    return this;
  }

   /**
   * Get hours
   * @return hours
  **/
  @ApiModelProperty(value = "")


  public Long getHours() {
    return hours;
  }

  public void setHours(Long hours) {
    this.hours = hours;
  }

  public Work week(Long week) {
    this.week = week;
    return this;
  }

   /**
   * Get week
   * @return week
  **/
  @ApiModelProperty(value = "")


  public Long getWeek() {
    return week;
  }

  public void setWeek(Long week) {
    this.week = week;
  }

  public Work ymkId(Long ymkId) {
    this.ymkId = ymkId;
    return this;
  }

   /**
   * Get ymkId
   * @return ymkId
  **/
  @ApiModelProperty(value = "")


  public Long getYmkId() {
    return ymkId;
  }

  public void setYmkId(Long ymkId) {
    this.ymkId = ymkId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Work work = (Work) o;
    return Objects.equals(this.id, work.id) &&
        Objects.equals(this.workType, work.workType) &&
        Objects.equals(this.hours, work.hours) &&
        Objects.equals(this.week, work.week) &&
        Objects.equals(this.ymkId, work.ymkId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, workType, hours, week, ymkId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Work {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    workType: ").append(toIndentedString(workType)).append("\n");
    sb.append("    hours: ").append(toIndentedString(hours)).append("\n");
    sb.append("    week: ").append(toIndentedString(week)).append("\n");
    sb.append("    ymkId: ").append(toIndentedString(ymkId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

