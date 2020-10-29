package io.swagger.api;

import io.swagger.model.ProfileDetails;
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
public class ProfilesApiController implements ProfilesApi {

    private static final Logger log = LoggerFactory.getLogger(ProfilesApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ProfilesApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<ProfileDetails>> getAllProfiles(@ApiParam(value = "The number of user objects to be returned. The default is 10.") @Valid @RequestParam(value = "limit", required = false) Integer limit
,@ApiParam(value = "The number of user objects to skip. Use this argument for pagination. The default is 0.") @Valid @RequestParam(value = "offset", required = false) Integer offset
,@ApiParam(value = "Only return the profile for the account with the provided ID.") @Valid @RequestParam(value = "account", required = false) Integer account
,@ApiParam(value = "Only return accounts for the user with the provided ID.") @Valid @RequestParam(value = "user", required = false) Integer user
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<ProfileDetails>>(objectMapper.readValue("[ {\n  \"employment_type\" : \"part time\",\n  \"address\" : {\n    \"country\" : \"SINGAPORE\",\n    \"city\" : \"Singapore\",\n    \"state\" : \"SINGAPORE\",\n    \"postal_code\" : \"308215\",\n    \"line2\" : \"Mandalay Towers\",\n    \"line1\" : \"Mandalay Road\"\n  },\n  \"picture_url\" : \"picture_url\",\n  \"gender\" : \"male\",\n  \"birth_date\" : \"1982-02-18\",\n  \"created_at\" : \"2019-11-27T15:56:50.583233Z\",\n  \"last_name\" : \"Rajendran\",\n  \"marital_status\" : \"married\",\n  \"full_name\" : \"M. Rajendran\",\n  \"updated_at\" : \"2019-11-27T15:56:50.583233Z\",\n  \"hire_dates\" : [ \"2019-01-15T08:00:22.386555Z\", \"2019-01-15T08:00:22.386555Z\" ],\n  \"aadhaar_number\" : \"***-***-**15\",\n  \"phone_number\" : \"+12 67579 54645\",\n  \"id\" : \"47b216e2-d334-4235-bc1e-185d15ab18d0\",\n  \"employment_status\" : \"active\",\n  \"terminations\" : [ {\n    \"date\" : \"2019-06-15T00:00:22.142321Z\",\n    \"reason\" : \"contract ended\"\n  }, {\n    \"date\" : \"2019-06-15T00:00:22.142321Z\",\n    \"reason\" : \"contract ended\"\n  } ],\n  \"first_name\" : \"M\",\n  \"job_title\" : \"Driver\",\n  \"account\" : \"010db8b4-a724-47fc-a17e-733b656312a2\",\n  \"platform_user_id\" : \"b18d015a\"\n}, {\n  \"employment_type\" : \"part time\",\n  \"address\" : {\n    \"country\" : \"SINGAPORE\",\n    \"city\" : \"Singapore\",\n    \"state\" : \"SINGAPORE\",\n    \"postal_code\" : \"308215\",\n    \"line2\" : \"Mandalay Towers\",\n    \"line1\" : \"Mandalay Road\"\n  },\n  \"picture_url\" : \"picture_url\",\n  \"gender\" : \"male\",\n  \"birth_date\" : \"1982-02-18\",\n  \"created_at\" : \"2019-11-27T15:56:50.583233Z\",\n  \"last_name\" : \"Rajendran\",\n  \"marital_status\" : \"married\",\n  \"full_name\" : \"M. Rajendran\",\n  \"updated_at\" : \"2019-11-27T15:56:50.583233Z\",\n  \"hire_dates\" : [ \"2019-01-15T08:00:22.386555Z\", \"2019-01-15T08:00:22.386555Z\" ],\n  \"aadhaar_number\" : \"***-***-**15\",\n  \"phone_number\" : \"+12 67579 54645\",\n  \"id\" : \"47b216e2-d334-4235-bc1e-185d15ab18d0\",\n  \"employment_status\" : \"active\",\n  \"terminations\" : [ {\n    \"date\" : \"2019-06-15T00:00:22.142321Z\",\n    \"reason\" : \"contract ended\"\n  }, {\n    \"date\" : \"2019-06-15T00:00:22.142321Z\",\n    \"reason\" : \"contract ended\"\n  } ],\n  \"first_name\" : \"M\",\n  \"job_title\" : \"Driver\",\n  \"account\" : \"010db8b4-a724-47fc-a17e-733b656312a2\",\n  \"platform_user_id\" : \"b18d015a\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<ProfileDetails>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<ProfileDetails>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ProfileDetails> getProfileById(@ApiParam(value = "User ID",required=true) @PathVariable("id") String id
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ProfileDetails>(objectMapper.readValue("{\n  \"employment_type\" : \"part time\",\n  \"address\" : {\n    \"country\" : \"SINGAPORE\",\n    \"city\" : \"Singapore\",\n    \"state\" : \"SINGAPORE\",\n    \"postal_code\" : \"308215\",\n    \"line2\" : \"Mandalay Towers\",\n    \"line1\" : \"Mandalay Road\"\n  },\n  \"picture_url\" : \"picture_url\",\n  \"gender\" : \"male\",\n  \"birth_date\" : \"1982-02-18\",\n  \"created_at\" : \"2019-11-27T15:56:50.583233Z\",\n  \"last_name\" : \"Rajendran\",\n  \"marital_status\" : \"married\",\n  \"full_name\" : \"M. Rajendran\",\n  \"updated_at\" : \"2019-11-27T15:56:50.583233Z\",\n  \"hire_dates\" : [ \"2019-01-15T08:00:22.386555Z\", \"2019-01-15T08:00:22.386555Z\" ],\n  \"aadhaar_number\" : \"***-***-**15\",\n  \"phone_number\" : \"+12 67579 54645\",\n  \"id\" : \"47b216e2-d334-4235-bc1e-185d15ab18d0\",\n  \"employment_status\" : \"active\",\n  \"terminations\" : [ {\n    \"date\" : \"2019-06-15T00:00:22.142321Z\",\n    \"reason\" : \"contract ended\"\n  }, {\n    \"date\" : \"2019-06-15T00:00:22.142321Z\",\n    \"reason\" : \"contract ended\"\n  } ],\n  \"first_name\" : \"M\",\n  \"job_title\" : \"Driver\",\n  \"account\" : \"010db8b4-a724-47fc-a17e-733b656312a2\",\n  \"platform_user_id\" : \"b18d015a\"\n}", ProfileDetails.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ProfileDetails>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ProfileDetails>(HttpStatus.NOT_IMPLEMENTED);
    }

}
