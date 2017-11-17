package com.cognizant.airport.booking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
/**
 * ReservationId
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-06-06T05:57:42.532Z")

public class ReservationId   {
  @JsonProperty("ReservationID")
  private String reservationID = null;

  public ReservationId reservationID(String reservationID) {
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
    ReservationId reservationId = (ReservationId) o;
    return Objects.equals(this.reservationID, reservationId.reservationID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reservationID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReservationId {\n");
    
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

