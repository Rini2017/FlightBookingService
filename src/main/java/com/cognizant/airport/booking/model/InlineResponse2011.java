package com.cognizant.airport.booking.model;

import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InlineResponse2011
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-06-06T05:57:42.532Z")

public class InlineResponse2011   {
 
// @JsonProperty("FlightBookingRequest")
//  private BookingStatusResponse bookingStatusResponse = null;
//
//  public InlineResponse2011 bookingStatusResponse(BookingStatusResponse bookingStatusResponse) {
//    this.bookingStatusResponse = bookingStatusResponse;
//    return this;
//  }
//
//   /**
//   * Get bookingStatusResponse
//   * @return bookingStatusResponse
//  **/
//  @ApiModelProperty(value = "")
//  public BookingStatusResponse getBookingStatusResponse() {
//    return bookingStatusResponse;
//  }
//
//  public void setBookingStatusResponse(BookingStatusResponse bookingStatusResponse) {
//    this.bookingStatusResponse = bookingStatusResponse;
//  }
//
// 
//
//  @Override
//  public boolean equals(java.lang.Object o) {
//    if (this == o) {
//      return true;
//    }
//    if (o == null || getClass() != o.getClass()) {
//      return false;
//    }
//    InlineResponse2011 inlineResponse2011 = (InlineResponse2011) o;
//    return Objects.equals(this.bookingStatusResponse, inlineResponse2011.bookingStatusResponse);
//       
//  }
//
//  @Override
//  public int hashCode() {
//    return Objects.hash(bookingStatusResponse);
//  }
//
//  @Override
//  public String toString() {
//    StringBuilder sb = new StringBuilder();
//    sb.append("class InlineResponse2011 {\n");
//    
//    sb.append("    bookingStatusResponse: ").append(toIndentedString(bookingStatusResponse));
//    sb.append("}");
//    return sb.toString();
//  }
//
//  /**
//   * Convert the given object to string with each line indented by 4 spaces
//   * (except the first line).
//   */
//  private String toIndentedString(java.lang.Object o) {
//    if (o == null) {
//      return "null";
//    }
//    return o.toString().replace("\n", "\n    ");
//  }
 
 @JsonProperty("ContactNo")
  private String contactNo = null;

  @JsonProperty("Email")
  private String email = null;

  @JsonProperty("NoOfPassenger")
  private String noOfPassenger = null;

  @JsonProperty("Price")
  private String price = null;

  @JsonProperty("ReservationId")
  private String reservationId = null;

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

  public InlineResponse2011 contactNo(String contactNo) {
    this.contactNo = contactNo;
    return this;
  }

   /**
   * Get contactNo
   * @return contactNo
  **/
  @ApiModelProperty(value = "")
  public String getContactNo() {
    return contactNo;
  }

  public void setContactNo(String contactNo) {
    this.contactNo = contactNo;
  }

  public InlineResponse2011 email(String email) {
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

  public InlineResponse2011 noOfPassenger(String noOfPassenger) {
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

  public InlineResponse2011 price(String price) {
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

  public InlineResponse2011 reservationId(String reservationId) {
    this.reservationId = reservationId;
    return this;
  }

   /**
   * Get reservationId
   * @return reservationId
  **/
  @ApiModelProperty(value = "")
  public String getReservationId() {
    return reservationId;
  }

  public void setReservationId(String reservationId) {
    this.reservationId = reservationId;
  }

  public InlineResponse2011 routeId(String routeId) {
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

  public InlineResponse2011 bookingDate(String bookingDate) {
    this.bookingDate = bookingDate;
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

  public InlineResponse2011 travelDate(String travelDate) {
    this.travelDate = travelDate;
    return this;
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

  public InlineResponse2011 bookingClass(String bookingClass) {
    this.bookingClass = bookingClass;
    return this;
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

  public InlineResponse2011 status(String status) {
    this.status = status;
    return this;
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2011 inlineResponse2011 = (InlineResponse2011) o;
    return Objects.equals(this.contactNo, inlineResponse2011.contactNo) &&
        Objects.equals(this.email, inlineResponse2011.email) &&
        Objects.equals(this.noOfPassenger, inlineResponse2011.noOfPassenger) &&
        Objects.equals(this.price, inlineResponse2011.price) &&
        Objects.equals(this.reservationId, inlineResponse2011.reservationId) &&
        Objects.equals(this.routeId, inlineResponse2011.routeId) &&
        Objects.equals(this.bookingDate, inlineResponse2011.bookingDate) &&
        Objects.equals(this.travelDate, inlineResponse2011.travelDate) &&
        Objects.equals(this.bookingClass, inlineResponse2011.bookingClass) &&
        Objects.equals(this.status, inlineResponse2011.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactNo, email, noOfPassenger, price, reservationId, routeId, bookingDate, travelDate, bookingClass, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2011 {\n");
    
    sb.append("    contactNo: ").append(toIndentedString(contactNo)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    noOfPassenger: ").append(toIndentedString(noOfPassenger)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    reservationId: ").append(toIndentedString(reservationId)).append("\n");
    sb.append("    routeId: ").append(toIndentedString(routeId)).append("\n");
    sb.append("    bookingDate: ").append(toIndentedString(bookingDate)).append("\n");
    sb.append("    travelDate: ").append(toIndentedString(travelDate)).append("\n");
    sb.append("    bookingClass: ").append(toIndentedString(bookingClass)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

