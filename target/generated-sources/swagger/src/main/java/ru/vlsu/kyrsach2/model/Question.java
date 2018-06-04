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
 * Question
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-03T16:01:50.300+03:00")
@JacksonXmlRootElement(localName = "Question")
@XmlRootElement(name = "Question")
@XmlAccessorType(XmlAccessType.FIELD)
public class Question  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  @JacksonXmlProperty(localName = "id")
  private Long id = null;

  @JsonProperty("name")
  @JacksonXmlProperty(localName = "name")
  private String name = null;

  @JsonProperty("ymkId")
  @JacksonXmlProperty(localName = "ymkId")
  private Long ymkId = null;

  public Question id(Long id) {
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

  public Question name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Question ymkId(Long ymkId) {
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
    Question question = (Question) o;
    return Objects.equals(this.id, question.id) &&
        Objects.equals(this.name, question.name) &&
        Objects.equals(this.ymkId, question.ymkId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, ymkId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Question {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

