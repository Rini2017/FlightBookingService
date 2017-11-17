package com.cognizant.airport.booking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
/**
 * InlineResponse201
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-30T12:34:04.749Z")

public class InlineResponse201   {
  @JsonProperty("ReservationID")
  private String reservationID = null;

  public InlineResponse201 reservationID(String reservationID) {
    this.reservationID = reservationID;
    return this;
  }

   /**
   * Get reservationID
   * @return reservationID
  **/
  @ApiModelProperty(value = "")
  public String getReservationID() {
    return reservationID;
  }

  public void setReservationID(String reservationID) {
    this.reservationID = reservationID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse201 inlineResponse201 = (InlineResponse201) o;
    return Objects.equals(this.reservationID, inlineResponse201.reservationID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reservationID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse201 {\n");
    
    sb.append("    reservationID: ").append(toIndentedString(reservationID)).append("\n");
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

