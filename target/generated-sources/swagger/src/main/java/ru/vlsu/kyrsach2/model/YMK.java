package ru.vlsu.kyrsach2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import javax.xml.bind.annotation.*;

/**
 * YMK
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-03T16:01:50.300+03:00")
@JacksonXmlRootElement(localName = "YMK")
@XmlRootElement(name = "YMK")
@XmlAccessorType(XmlAccessType.FIELD)
public class YMK  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  @JacksonXmlProperty(localName = "id")
  private Long id = null;

  @JsonProperty("discipline")
  @JacksonXmlProperty(localName = "discipline")
  private Long discipline = null;

  @JsonProperty("speciality")
  @JacksonXmlProperty(localName = "speciality")
  private Long speciality = null;

  @JsonProperty("questions")
  @JacksonXmlProperty(localName = "questions")
  private List<Integer> questions = null;

  @JsonProperty("works")
  @JacksonXmlProperty(localName = "works")
  private List<Integer> works = null;

  public YMK id(Long id) {
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

  public YMK discipline(Long discipline) {
    this.discipline = discipline;
    return this;
  }

   /**
   * Get discipline
   * @return discipline
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Long getDiscipline() {
    return discipline;
  }

  public void setDiscipline(Long discipline) {
    this.discipline = discipline;
  }

  public YMK speciality(Long speciality) {
    this.speciality = speciality;
    return this;
  }

   /**
   * Get speciality
   * @return speciality
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Long getSpeciality() {
    return speciality;
  }

  public void setSpeciality(Long speciality) {
    this.speciality = speciality;
  }

  public YMK questions(List<Integer> questions) {
    this.questions = questions;
    return this;
  }

  public YMK addQuestionsItem(Integer questionsItem) {
    if (this.questions == null) {
      this.questions = new ArrayList<Integer>();
    }
    this.questions.add(questionsItem);
    return this;
  }

   /**
   * Get questions
   * @return questions
  **/
  @ApiModelProperty(value = "")


  public List<Integer> getQuestions() {
    return questions;
  }

  public void setQuestions(List<Integer> questions) {
    this.questions = questions;
  }

  public YMK works(List<Integer> works) {
    this.works = works;
    return this;
  }

  public YMK addWorksItem(Integer worksItem) {
    if (this.works == null) {
      this.works = new ArrayList<Integer>();
    }
    this.works.add(worksItem);
    return this;
  }

   /**
   * Get works
   * @return works
  **/
  @ApiModelProperty(value = "")


  public List<Integer> getWorks() {
    return works;
  }

  public void setWorks(List<Integer> works) {
    this.works = works;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    YMK YMK = (YMK) o;
    return Objects.equals(this.id, YMK.id) &&
        Objects.equals(this.discipline, YMK.discipline) &&
        Objects.equals(this.speciality, YMK.speciality) &&
        Objects.equals(this.questions, YMK.questions) &&
        Objects.equals(this.works, YMK.works);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, discipline, speciality, questions, works);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class YMK {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    discipline: ").append(toIndentedString(discipline)).append("\n");
    sb.append("    speciality: ").append(toIndentedString(speciality)).append("\n");
    sb.append("    questions: ").append(toIndentedString(questions)).append("\n");
    sb.append("    works: ").append(toIndentedString(works)).append("\n");
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

