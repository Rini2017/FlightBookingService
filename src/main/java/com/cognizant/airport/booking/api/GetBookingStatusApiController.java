package com.cognizant.airport.booking.api;

import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.ApiParam;

import javax.validation.constraints.NotNull;

import org.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.cognizant.airport.booking.model.InlineResponse2011;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-06-06T05:57:42.532Z")

@Controller
public class GetBookingStatusApiController implements GetBookingStatusApi {

    String Email = null;
    String NoOfPassenger = null;
    String PhNo = null;
    String Price = null;
    String ReservationId = null;
    String RouteId = null;
    String BookingDate = null;
    String TravelDate = null;
    String BookingClass = null;
    String Status = null;
    
    RestTemplate restTemplate =null;
    JSONObject request = null;
    JSONObject responseObject = null;
    HttpHeaders headers = null;
    HttpEntity<String> entity = null;
    ResponseEntity<String> flightStatusDetails = null;
    
    
    InlineResponse2011 inlineResponse2011 = null; 

    List<InlineResponse2011> arrayList     = new ArrayList<InlineResponse2011>();

    public ResponseEntity<InlineResponse2011> getBookingStatus(@NotNull @ApiParam(value = "ReservationId", required = true, defaultValue="") @RequestParam(value = "reservationId", required = true, defaultValue="") String reservationId) {
        final String uri = "https://api.mlab.com/api/1/databases/cloudfoundry/collections/AirBooking";
        
        restTemplate = new RestTemplate();
        headers = new HttpHeaders();
        headers.set("Accept", "application/json");
        
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(uri)         
            .queryParam("q", "{'FlightBookingRequest.ReservationId' : '"+reservationId+"'}")   
            .queryParam("f", "{'_id': 0 }")
            .queryParam("fo", "true")
            .queryParam("apiKey", "B5o7ycWHwEailJZhJ9ViYpPTePnCpgZy");
        
       
        System.out.println("Request uri to mlab : " + builder.build().encode().toUri());
        System.out.println("reservationId from request: " + reservationId);
        
        /*InlineResponse2011 inlineResponse2011 = null;
        inlineResponse2011 = restTemplate.getForObject(builder.build().encode().toUri(), InlineResponse2011.class); 
        if(inlineResponse2011!=null && inlineResponse2011.getBookingStatusResponse() != null){
            System.out.println("Document retrieved from mlab has ReservationID "+ inlineResponse2011.getBookingStatusResponse().getReservationId());
        }else{
            System.out.println("No document found");
        }

        return new ResponseEntity<InlineResponse2011>(inlineResponse2011,HttpStatus.OK);*/
        // set headers
        
        String res = restTemplate.getForObject(builder.build().encode().toUri(), String.class);
       
       System.out.println("Response received : "+ res.toString());
       
        if(!(res.trim().equalsIgnoreCase("null"))){
            
            
            try {
                   responseObject = new JSONObject(res);
                   
                   if((responseObject.getJSONObject("FlightBookingRequest").getString("Email"))!=null){
                    Email = responseObject.getJSONObject("FlightBookingRequest").getString("Email");
                   }
                   if((responseObject.getJSONObject("FlightBookingRequest").getString("NoOfPassenger"))!=null){
                    NoOfPassenger = responseObject.getJSONObject("FlightBookingRequest").getString("NoOfPassenger");
                   }
                   if((responseObject.getJSONObject("FlightBookingRequest").getString("ContactNo"))!=null){
                    PhNo = responseObject.getJSONObject("FlightBookingRequest").getString("ContactNo");
                   }
                   if((responseObject.getJSONObject("FlightBookingRequest").getString("Price")).trim()!=null){
                    Price = responseObject.getJSONObject("FlightBookingRequest").getString("Price");
                   }
                   if((responseObject.getJSONObject("FlightBookingRequest").getString("ReservationId"))!=null){
                    ReservationId = responseObject.getJSONObject("FlightBookingRequest").getString("ReservationId");
                   }
                   if((responseObject.getJSONObject("FlightBookingRequest").getString("RouteId"))!=null){
                    RouteId = responseObject.getJSONObject("FlightBookingRequest").getString("RouteId");
                   }
                   /*if((responseObject.getJSONObject("FlightBookingRequest").getString("BookingDate"))!=null){
                    BookingDate = responseObject.getJSONObject("FlightBookingRequest").getString("BookingDate");
                   }
                   if((responseObject.getJSONObject("FlightBookingRequest").getString("TravelDate"))!=null){
                    TravelDate = responseObject.getJSONObject("FlightBookingRequest").getString("TravelDate");
                   }
                   if((responseObject.getJSONObject("FlightBookingRequest").getString("BookingClass"))!=null){
                    BookingClass = responseObject.getJSONObject("FlightBookingRequest").getString("BookingClass");
                   }*/
                   if((responseObject.getJSONObject("FlightBookingRequest").getString("Status")).trim()!=null){
                    Status = responseObject.getJSONObject("FlightBookingRequest").getString("Status");
                   }

                   
                   
                   inlineResponse2011 = new InlineResponse2011();
                   if(Email.toString()!=null){
                       inlineResponse2011.setEmail(Email.toString());
                   }else{
                       inlineResponse2011.setEmail("");
                   }
                   if(NoOfPassenger.toString()!=null){
                       inlineResponse2011.setNoOfPassenger(NoOfPassenger.toString());
                   }else{
                       inlineResponse2011.setNoOfPassenger("");
                   }
                   if(PhNo.toString()!=null){
                       inlineResponse2011.setContactNo(PhNo.toString());
                   }else{
                       inlineResponse2011.setContactNo("");
                   }
                   if(Price.toString()!=null){
                       inlineResponse2011.setPrice(Price.toString());
                   }else{
                       inlineResponse2011.setPrice("");
                   }
                   if(ReservationId.toString()!=null){
                       inlineResponse2011.setReservationId(ReservationId.toString());
                   }else{
                       inlineResponse2011.setReservationId("");
                   }
                   if(RouteId.toString()!=null){
                       inlineResponse2011.setRouteId(RouteId.toString());
                   }else{
                       inlineResponse2011.setRouteId("");
                   }
                   /*if(BookingDate.toString()!=null){
                       inlineResponse2011.setBookingDate(BookingDate.toString());
                   }else{
                       inlineResponse2011.setBookingDate("");
                   }
                   if(TravelDate.toString()!=null){
                       inlineResponse2011.setTravelDate(TravelDate.toString());
                   }else{
                       inlineResponse2011.setTravelDate("");
                   }
                   if(BookingClass.toString()!=null){
                       inlineResponse2011.setBookingClass(BookingClass.toString());
                   }else{
                       inlineResponse2011.setBookingClass("");
                   }*/
                   if(Status.toString()!=null){
                       inlineResponse2011.setStatus(Status.toString());
                   }else{
                       inlineResponse2011.setStatus("");
                   }
                          
            } catch (Exception e) {
                System.out.println("Exception while creating response : " + e);
                // inlineResponse2011 = null;
                  inlineResponse2011 = new InlineResponse2011();
                  inlineResponse2011.setStatus("Not found");
                  inlineResponse2011.setEmail("");
                   inlineResponse2011.setNoOfPassenger("");
                   inlineResponse2011.setContactNo("");
                   inlineResponse2011.setPrice("");
                   inlineResponse2011.setReservationId("");
                   inlineResponse2011.setRouteId("");
                   inlineResponse2011.setBookingDate("");
                   inlineResponse2011.setTravelDate("");
                   inlineResponse2011.setBookingClass("");
            }
           
        }else{
             System.out.println("Inside else block when response is null " );
                  inlineResponse2011 = new InlineResponse2011();
                  inlineResponse2011.setStatus("Not found");
                  inlineResponse2011.setEmail("");
                   inlineResponse2011.setNoOfPassenger("");
                   inlineResponse2011.setContactNo("");
                   inlineResponse2011.setPrice("");
                   inlineResponse2011.setReservationId("");
                   inlineResponse2011.setRouteId("");
                   inlineResponse2011.setBookingDate("");
                   inlineResponse2011.setTravelDate("");
                   inlineResponse2011.setBookingClass("");
            }
        

        return new ResponseEntity<InlineResponse2011>(inlineResponse2011,HttpStatus.OK);
    }

}
