package io.swagger.api;

import io.swagger.model.UserDetails;
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
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-26T10:30:08.165Z[GMT]")
@Controller
public class UsersApiController implements UsersApi {

    private static final Logger log = LoggerFactory.getLogger(UsersApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public UsersApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<UserDetails>> getAllUsers(@ApiParam(value = "The number of user objects to be returned. The default is 10.") @Valid @RequestParam(value = "limit", required = false) Integer limit
,@ApiParam(value = "The number of user objects to skip. Use this argument for pagination. The default is 0.") @Valid @RequestParam(value = "offset", required = false) Integer offset
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<UserDetails>>(objectMapper.readValue("[ {\n  \"created_at\" : \"2019-11-27T15:56:50.583233Z\",\n  \"data_providers_connected\" : [ \"data_providers_connected\", \"data_providers_connected\" ],\n  \"id\" : \"0994b847-cc69-4d98-bc99-c5e65e762add\"\n}, {\n  \"created_at\" : \"2019-11-27T15:56:50.583233Z\",\n  \"data_providers_connected\" : [ \"data_providers_connected\", \"data_providers_connected\" ],\n  \"id\" : \"0994b847-cc69-4d98-bc99-c5e65e762add\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<UserDetails>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<UserDetails>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<UserDetails> getUserById(@ApiParam(value = "The identifier of the user to be retrieved.",required=true) @PathVariable("id") String id
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<UserDetails>(objectMapper.readValue("{\n  \"created_at\" : \"2019-11-27T15:56:50.583233Z\",\n  \"data_providers_connected\" : [ \"data_providers_connected\", \"data_providers_connected\" ],\n  \"id\" : \"0994b847-cc69-4d98-bc99-c5e65e762add\"\n}", UserDetails.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<UserDetails>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<UserDetails>(HttpStatus.NOT_IMPLEMENTED);
    }

}
