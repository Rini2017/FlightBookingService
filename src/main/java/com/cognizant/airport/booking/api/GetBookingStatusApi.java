package com.cognizant.airport.booking.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import javax.validation.constraints.NotNull;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cognizant.airport.booking.model.InlineResponse2011;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-06-06T05:57:42.532Z")

@Api(value = "/getBookingStatus", description = "the getBookingStatus API")
public interface GetBookingStatusApi {

    @ApiOperation(value = "Check flight booking staus", notes = "Check flight booking staus for specific reservation ID ", response = InlineResponse2011.class, tags={ "GetFlightBookingStatus" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Reservation Successfully Created", response = InlineResponse2011.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Reservation Not Found"),
        @ApiResponse(code = 405, message = "Invalid input") })
    @RequestMapping(value = "/getBookingStatus",
        produces = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse2011> getBookingStatus( @NotNull @ApiParam(value = "ReservationId", required = true, defaultValue="") @RequestParam(value = "reservationId", required = true, defaultValue="") String reservationId);

}
