package io.swagger.api;

import io.swagger.model.DataPartner;
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
public class DataPartnersApiController implements DataPartnersApi {

    private static final Logger log = LoggerFactory.getLogger(DataPartnersApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public DataPartnersApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<DataPartner>> getAllDataPartners(@ApiParam(value = "Only return data partners with the name provided.") @Valid @RequestParam(value = "name", required = false) String name
,@ApiParam(value = "The number of data partner objects to be returned. The default is 10.") @Valid @RequestParam(value = "limit", required = false) Integer limit
,@ApiParam(value = "The number of data partner objects to skip. Use this argument for pagination. The default is 0.") @Valid @RequestParam(value = "offset", required = false) Integer offset
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<DataPartner>>(objectMapper.readValue("[ {\n  \"name\" : \"Uber Technologies\",\n  \"id\" : \"uber\",\n  \"type\" : \"services\"\n}, {\n  \"name\" : \"Uber Technologies\",\n  \"id\" : \"uber\",\n  \"type\" : \"services\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<DataPartner>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<DataPartner>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DataPartner> getDataPartnerById(@ApiParam(value = "The identifier of the data partner to be retrieved.",required=true) @PathVariable("id") String id
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DataPartner>(objectMapper.readValue("{\n  \"name\" : \"Uber Technologies\",\n  \"id\" : \"uber\",\n  \"type\" : \"services\"\n}", DataPartner.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DataPartner>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DataPartner>(HttpStatus.NOT_IMPLEMENTED);
    }

}
