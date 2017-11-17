package com.cognizant.airport.booking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
/**
 * BookingStatusResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-06-06T05:57:42.532Z")

public class BookingStatusResponse   {
  @JsonProperty("Email")
  private String email = null;

  @JsonProperty("NoOfPassenger")
  private String noOfPassenger = null;

  @JsonProperty("ContactNo")
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
  
  @JsonProperty("Status")
  private String status = null;
  
   @JsonProperty("ReservationId")
  private String reservationId = null;


  public BookingStatusResponse email(String email) {
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

  public BookingStatusResponse noOfPassenger(String noOfPassenger) {
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

  public BookingStatusResponse phNo(String phNo) {
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

  public BookingStatusResponse price(String price) {
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

  public BookingStatusResponse routeId(String routeId) {
    this.routeId = routeId;
    return this;
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

  public BookingStatusResponse status(String status) {
    this.status = status;
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
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Get reservationId
   * @rereservationIdturn reservationId
  **/
  @ApiModelProperty(value = "")
  public String getReservationId() {
    return reservationId;
  }

  public void setReservationId(String reservationId) {
    this.reservationId = reservationId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BookingStatusResponse bookingStatusResponse = (BookingStatusResponse) o;
    return Objects.equals(this.email, bookingStatusResponse.email) &&
        Objects.equals(this.noOfPassenger, bookingStatusResponse.noOfPassenger) &&
        Objects.equals(this.phNo, bookingStatusResponse.phNo) &&
        Objects.equals(this.price, bookingStatusResponse.price) &&
        Objects.equals(this.routeId, bookingStatusResponse.routeId) &&
        Objects.equals(this.bookingDate, bookingStatusResponse.bookingDate) &&
        Objects.equals(this.travelDate, bookingStatusResponse.travelDate) &&
        Objects.equals(this.bookingClass, bookingStatusResponse.bookingClass) &&
        Objects.equals(this.status, bookingStatusResponse.status) &&
        Objects.equals(this.reservationId, bookingStatusResponse.reservationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, noOfPassenger, phNo, price, routeId, bookingDate, travelDate, bookingClass, status, reservationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BookingStatusResponse {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    noOfPassenger: ").append(toIndentedString(noOfPassenger)).append("\n");
    sb.append("    phNo: ").append(toIndentedString(phNo)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    routeId: ").append(toIndentedString(routeId)).append("\n");
    sb.append("    bookingDate: ").append(toIndentedString(bookingDate)).append("\n");
    sb.append("    travelDate: ").append(toIndentedString(travelDate)).append("\n");
    sb.append("    bookingClass: ").append(toIndentedString(bookingClass)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    reservationId: ").append(toIndentedString(reservationId)).append("\n");
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

