package com.cognizant.airport.booking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
/**
 * AirlineBookingRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-30T12:34:04.749Z")

public class AirlineBookingRequest   {
  @JsonProperty("Email")
  private String email = null;

  @JsonProperty("NoOfPassenger")
  private String noOfPassenger = null;

  @JsonProperty("PhNo")
  private String phNo = null;

  @JsonProperty("Price")
  private String price = null;

  @JsonProperty("RouteId")
  private String routeId = null;
  
  @JsonProperty("BookingDate")
  private String bookingDate = null;
  
  @JsonProperty("TravelDate")
  private String travelDate = null;
  
  @JsonProperty("BookingClass")
  private String bookingClass = null;

  public AirlineBookingRequest email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public AirlineBookingRequest noOfPassenger(String noOfPassenger) {
    this.noOfPassenger = noOfPassenger;
    return this;
  }

   /**
   * Get noOfPassenger
   * @return noOfPassenger
  **/
  @ApiModelProperty(value = "")
  public String getNoOfPassenger() {
    return noOfPassenger;
  }

  public void setNoOfPassenger(String noOfPassenger) {
    this.noOfPassenger = noOfPassenger;
  }

  public AirlineBookingRequest phNo(String phNo) {
    this.phNo = phNo;
    return this;
  }

   /**
   * Get phNo
   * @return phNo
  **/
  @ApiModelProperty(value = "")
  public String getPhNo() {
    return phNo;
  }

  public void setPhNo(String phNo) {
    this.phNo = phNo;
  }

  public AirlineBookingRequest price(String price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @ApiModelProperty(value = "")
  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  public AirlineBookingRequest routeId(String routeId) {
    this.routeId = routeId;
    return this;
  }
  
  /**
   * Get bookingDate
   * @return bookingDate
  **/
  @ApiModelProperty(value = "")
  public String getBookingDate() {
    return bookingDate;
  }

  public void setBookingDate(String bookingDate) {
    this.bookingDate = bookingDate;
  }
  
  
  /**
   * Get travelDate
   * @return travelDate
  **/
  @ApiModelProperty(value = "")
  public String getTravelDate() {
    return travelDate;
  }

  public void setTravelDate(String travelDate) {
    this.travelDate = travelDate;
  }
  
  
  /**
   * Get bookingClass
   * @return bookingClass
  **/
  @ApiModelProperty(value = "")
  public String getBookingClass() {
    return bookingClass;
  }

  public void setBookingClass(String bookingClass) {
    this.bookingClass = bookingClass;
  }

   /**
   * Get routeId
   * @return routeId
  **/
  @ApiModelProperty(value = "")
  public String getRouteId() {
    return routeId;
  }

  public void setRouteId(String routeId) {
    this.routeId = routeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AirlineBookingRequest airlineBookingRequest = (AirlineBookingRequest) o;
    return Objects.equals(this.email, airlineBookingRequest.email) &&
        Objects.equals(this.noOfPassenger, airlineBookingRequest.noOfPassenger) &&
        Objects.equals(this.phNo, airlineBookingRequest.phNo) &&
        Objects.equals(this.price, airlineBookingRequest.price) &&
        Objects.equals(this.bookingDate, airlineBookingRequest.bookingDate) &&
        Objects.equals(this.travelDate, airlineBookingRequest.travelDate) &&
        Objects.equals(this.bookingClass, airlineBookingRequest.bookingClass) &&
        Objects.equals(this.routeId, airlineBookingRequest.routeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, noOfPassenger, phNo, price, routeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AirlineBookingRequest {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    noOfPassenger: ").append(toIndentedString(noOfPassenger)).append("\n");
    sb.append("    phNo: ").append(toIndentedString(phNo)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    
    sb.append("    routeId: ").append(toIndentedString(routeId)).append("\n");
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

