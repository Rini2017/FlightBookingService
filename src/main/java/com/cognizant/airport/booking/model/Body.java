package com.cognizant.airport.booking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
/**
 * Body
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-30T12:34:04.749Z")

public class Body   {
    
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
  
  @JsonProperty("Source")
  private String source = null;
  
  @JsonProperty("Destination")
  private String destination = null;
  
  @JsonProperty("Channelidentifier")
  private String channelidentifier = null;
  
  /*@JsonProperty("Status")
  private String status = null;*/

  public Body email(String email) {
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

  public Body noOfPassenger(String noOfPassenger) {
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

  public Body phNo(String phNo) {
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

  public Body price(String price) {
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

  public Body routeId(String routeId) {
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
   * Get source
   * @return source
  **/
  @ApiModelProperty(value = "")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }
  
  
  /**
   * Get destination
   * @return destination
  **/
  @ApiModelProperty(value = "")
  public String getDestination() {
    return destination;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }
  
  
  /**
   * Get channelidentifier
   * @return channelidentifier
  **/
  @ApiModelProperty(value = "")
  public String getChannelidentifier() {
    return channelidentifier;
  }

  public void setChannelidentifier(String channelidentifier) {
    this.channelidentifier = channelidentifier;
  }
  
  
  /**
   * Get status
   * @return status
  **/
  /*@ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }*/


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Body body = (Body) o;
    return Objects.equals(this.email, body.email) &&
        Objects.equals(this.noOfPassenger, body.noOfPassenger) &&
        Objects.equals(this.phNo, body.phNo) &&
        Objects.equals(this.price, body.price) &&
        Objects.equals(this.routeId, body.routeId) &&
        Objects.equals(this.bookingDate, body.bookingDate) &&
        Objects.equals(this.travelDate, body.travelDate) &&
        Objects.equals(this.bookingClass, body.bookingClass) &&
        Objects.equals(this.source, body.source) &&
        Objects.equals(this.destination, body.destination) &&
        Objects.equals(this.channelidentifier, body.channelidentifier); /*&&
        Objects.equals(this.status, body.status);*/
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, noOfPassenger, phNo, price, routeId/*, status*/);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    noOfPassenger: ").append(toIndentedString(noOfPassenger)).append("\n");
    sb.append("    phNo: ").append(toIndentedString(phNo)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    routeId: ").append(toIndentedString(routeId)).append("\n");
    sb.append("    bookingDate: ").append(toIndentedString(bookingDate)).append("\n");
    sb.append("    travelDate: ").append(toIndentedString(travelDate)).append("\n");
    sb.append("    bookingClass: ").append(toIndentedString(bookingClass)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    channelidentifier: ").append(toIndentedString(channelidentifier)).append("\n");
    
    /*sb.append("    status: ").append(toIndentedString(status)).append("\n");*/
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

