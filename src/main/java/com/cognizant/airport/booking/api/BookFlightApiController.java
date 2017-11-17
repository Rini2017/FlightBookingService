package com.cognizant.airport.booking.api;

import io.swagger.annotations.ApiParam;
import com.cognizant.airport.booking.model.Body;
import com.cognizant.airport.booking.model.InlineResponse201;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-30T12:34:04.749Z")
@Controller
public class BookFlightApiController implements BookFlightApi {

    final String uri = "https://api.mlab.com/api/1/databases/cloudfoundry/collections/AirBooking?apiKey=B5o7ycWHwEailJZhJ9ViYpPTePnCpgZy";

    JSONObject jsonObj = null;

    
    String Email = null;
    String NoOfPassenger = null;
    String PhNo = null;
    String Price = null;
    String reservationId = null;
    String routeId = null;
    String bookingDate = null;
    String travelDate = null;
    String bookingClass = null;
    String status = null;
    String source = null;
    String destination = null;
    //String channel_identifier = null;
    
    RestTemplate restTemplate =null;
    JSONObject request = null;
    JSONObject flightBookingRequest = null;
    HttpHeaders headers = null;
    HttpEntity<String> entity = null;
    ResponseEntity<String> bookFlight = null;
    
    InlineResponse201 inlineResponse201 = null; 

    List<InlineResponse201> arrayList     = new ArrayList<InlineResponse201>();

    public ResponseEntity<InlineResponse201> bookFlight(@ApiParam(value = "") @RequestBody Body body) {
        restTemplate = new RestTemplate();
        request = new JSONObject();
        try {
            // create request body
            flightBookingRequest = new JSONObject();
           
            flightBookingRequest.put("Email",body.getEmail());
            flightBookingRequest.put("NoOfPassenger", body.getNoOfPassenger());
            flightBookingRequest.put("ContactNo", body.getPhNo());
            flightBookingRequest.put("Price", body.getPrice());
            flightBookingRequest.put("RouteId", body.getRouteId());
            flightBookingRequest.put("BookingDate", body.getBookingDate());
            flightBookingRequest.put("TravelDate", body.getTravelDate());
            flightBookingRequest.put("BookingClass", body.getBookingClass());
            flightBookingRequest.put("Status", "Booked");
            flightBookingRequest.put("Source", body.getSource());
            flightBookingRequest.put("Destination", body.getDestination());
            flightBookingRequest.put("Channelidentifier", body.getChannelidentifier());
            reservationId = getSaltString();
            flightBookingRequest.put("ReservationId", reservationId);
            request.put("FlightBookingRequest", flightBookingRequest);
            
        } catch (Exception e) {
            System.out.println("Error while creating JSON : "+ e);
        }
        // set headers
        headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        entity = new HttpEntity<String>(request.toString(), headers);
        System.out.println("Request uri to mlab : " + uri);
        bookFlight = restTemplate.exchange(uri, HttpMethod.POST, entity, String.class);
        
        if (bookFlight.getStatusCode() == HttpStatus.OK) 
        {
            try {
               
                   inlineResponse201 = new InlineResponse201();
                   inlineResponse201.setReservationID(reservationId.toString());
                   System.out.println("Flight is successfully booked with ReservationId : "+inlineResponse201.getReservationID());
        
            } catch (Exception e) {
                System.out.println("Exception while creating response : " +e);
            }
           
        }

        return new ResponseEntity<InlineResponse201>(inlineResponse201,HttpStatus.OK);
       
    }
    
    public String getSaltString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 5) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }

}
