package io.swagger.api;

import io.swagger.model.Vehicles;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T02:24:33.854Z[GMT]")
@Controller
public class VehiclesApiController implements VehiclesApi {

    private static final Logger log = LoggerFactory.getLogger(VehiclesApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public VehiclesApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<Vehicles>> getAllVehicles() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Vehicles>>(objectMapper.readValue("[ {\n  \"identification\" : \"HIJ8473\",\n  \"year\" : \"2011\",\n  \"vin\" : \"xuz-345\",\n  \"model\" : \"Corolla\",\n  \"id\" : \"e8b085d1-fa2c-4e0f-8b2e-93c6ac991f12\",\n  \"type\" : \"car\",\n  \"make\" : \"Toyota\",\n  \"account\" : \"010db8b4-a724-47fc-c17e-733b656312a1\"\n}, {\n  \"identification\" : \"HIJ8473\",\n  \"year\" : \"2011\",\n  \"vin\" : \"xuz-345\",\n  \"model\" : \"Corolla\",\n  \"id\" : \"e8b085d1-fa2c-4e0f-8b2e-93c6ac991f12\",\n  \"type\" : \"car\",\n  \"make\" : \"Toyota\",\n  \"account\" : \"010db8b4-a724-47fc-c17e-733b656312a1\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Vehicles>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Vehicles>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Vehicles> getVehicleById(@ApiParam(value = "The identifier of the vehicle to be retrieved.",required=true) @PathVariable("id") String id
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Vehicles>(objectMapper.readValue("{\n  \"identification\" : \"HIJ8473\",\n  \"year\" : \"2011\",\n  \"vin\" : \"xuz-345\",\n  \"model\" : \"Corolla\",\n  \"id\" : \"e8b085d1-fa2c-4e0f-8b2e-93c6ac991f12\",\n  \"type\" : \"car\",\n  \"make\" : \"Toyota\",\n  \"account\" : \"010db8b4-a724-47fc-c17e-733b656312a1\"\n}", Vehicles.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Vehicles>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Vehicles>(HttpStatus.NOT_IMPLEMENTED);
    }

}
