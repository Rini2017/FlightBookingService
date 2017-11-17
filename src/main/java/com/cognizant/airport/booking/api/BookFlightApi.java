package com.cognizant.airport.booking.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cognizant.airport.booking.model.Body;
import com.cognizant.airport.booking.model.InlineResponse201;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-30T12:34:04.749Z")

@Api(value = "bookFlight", description = "The BookFlight API")
public interface BookFlightApi {

    @ApiOperation(value = "book flight for passenger", notes = "Book flight for a specific route ", response = InlineResponse201.class, tags={"BookFlight"  })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "successful operation", response = InlineResponse201.class),
        @ApiResponse(code = 400, message = "Bad input parameter"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found"),
        @ApiResponse(code = 405, message = "Invalid input")})
        
    @RequestMapping(value = "/bookFlight",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<InlineResponse201> bookFlight(@ApiParam(value = ""  ) @RequestBody Body body);

}
