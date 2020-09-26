package io.swagger.api;

import io.swagger.model.ReputationDetails;
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
public class ReputationsApiController implements ReputationsApi {

    private static final Logger log = LoggerFactory.getLogger(ReputationsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ReputationsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<ReputationDetails>> getAllReputations() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<ReputationDetails>>(objectMapper.readValue("[ {\n  \"achievements\" : [ {\n    \"badge_url\" : \"https://media.website.com/1554853.png\",\n    \"count\" : 1,\n    \"description\" : \"Earned on total 5-star ratings\",\n    \"label\" : \"perfect_rating\"\n  }, {\n    \"badge_url\" : \"https://media.website.com/1554853.png\",\n    \"count\" : 1,\n    \"description\" : \"Earned on total 5-star ratings\",\n    \"label\" : \"perfect_rating\"\n  } ],\n  \"updated_at\" : \"2019-11-27T15:56:50.583233Z\",\n  \"ontime_rate\" : \"0.8\",\n  \"rating\" : \"4.95\",\n  \"client\" : \"010db8b4-a724-47fc-a17e-733b656312a2\",\n  \"created_at\" : \"2019-11-27T15:56:50.583233Z\",\n  \"acceptance_rate\" : \"0.86\",\n  \"id\" : \"47b216e2-d334-4235-bc1e-185d15ab18d0\",\n  \"created_by\" : \"82bc04fa-1e11-43f2-9a88-357f865b4998\",\n  \"account\" : \"010db8b4-a724-47fc-a17e-733b656312a2\"\n}, {\n  \"achievements\" : [ {\n    \"badge_url\" : \"https://media.website.com/1554853.png\",\n    \"count\" : 1,\n    \"description\" : \"Earned on total 5-star ratings\",\n    \"label\" : \"perfect_rating\"\n  }, {\n    \"badge_url\" : \"https://media.website.com/1554853.png\",\n    \"count\" : 1,\n    \"description\" : \"Earned on total 5-star ratings\",\n    \"label\" : \"perfect_rating\"\n  } ],\n  \"updated_at\" : \"2019-11-27T15:56:50.583233Z\",\n  \"ontime_rate\" : \"0.8\",\n  \"rating\" : \"4.95\",\n  \"client\" : \"010db8b4-a724-47fc-a17e-733b656312a2\",\n  \"created_at\" : \"2019-11-27T15:56:50.583233Z\",\n  \"acceptance_rate\" : \"0.86\",\n  \"id\" : \"47b216e2-d334-4235-bc1e-185d15ab18d0\",\n  \"created_by\" : \"82bc04fa-1e11-43f2-9a88-357f865b4998\",\n  \"account\" : \"010db8b4-a724-47fc-a17e-733b656312a2\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<ReputationDetails>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<ReputationDetails>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ReputationDetails> getReputationById(@ApiParam(value = "User ID",required=true) @PathVariable("id") String id
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ReputationDetails>(objectMapper.readValue("{\n  \"achievements\" : [ {\n    \"badge_url\" : \"https://media.website.com/1554853.png\",\n    \"count\" : 1,\n    \"description\" : \"Earned on total 5-star ratings\",\n    \"label\" : \"perfect_rating\"\n  }, {\n    \"badge_url\" : \"https://media.website.com/1554853.png\",\n    \"count\" : 1,\n    \"description\" : \"Earned on total 5-star ratings\",\n    \"label\" : \"perfect_rating\"\n  } ],\n  \"updated_at\" : \"2019-11-27T15:56:50.583233Z\",\n  \"ontime_rate\" : \"0.8\",\n  \"rating\" : \"4.95\",\n  \"client\" : \"010db8b4-a724-47fc-a17e-733b656312a2\",\n  \"created_at\" : \"2019-11-27T15:56:50.583233Z\",\n  \"acceptance_rate\" : \"0.86\",\n  \"id\" : \"47b216e2-d334-4235-bc1e-185d15ab18d0\",\n  \"created_by\" : \"82bc04fa-1e11-43f2-9a88-357f865b4998\",\n  \"account\" : \"010db8b4-a724-47fc-a17e-733b656312a2\"\n}", ReputationDetails.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ReputationDetails>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ReputationDetails>(HttpStatus.NOT_IMPLEMENTED);
    }

}
