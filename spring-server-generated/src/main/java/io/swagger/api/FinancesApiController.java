package io.swagger.api;

import io.swagger.model.Finances;
import io.swagger.model.Payouts;
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
public class FinancesApiController implements FinancesApi {

    private static final Logger log = LoggerFactory.getLogger(FinancesApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public FinancesApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<Finances>> getAllFinances() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Finances>>(objectMapper.readValue("[ {\n  \"balance\" : \"100\",\n  \"balance_currency\" : \"balance_currency\",\n  \"payout_method\" : \"uber\"\n}, {\n  \"balance\" : \"100\",\n  \"balance_currency\" : \"balance_currency\",\n  \"payout_method\" : \"uber\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Finances>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Finances>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Payouts> getFinaceById(@ApiParam(value = "The identifier of the payout to be retrieved.",required=true) @PathVariable("id") String id
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Payouts>(objectMapper.readValue("{\n  \"hours\" : \"hours\",\n  \"metadata\" : \"metadata\",\n  \"taxes\" : \"2.31\",\n  \"reimbursements\" : \"20.00\",\n  \"type\" : \"direct_deposit\",\n  \"gross_pay\" : \"6.70\",\n  \"deductions\" : \"0.00\",\n  \"net_pay\" : \"6.70\",\n  \"employer_address\" : {\n    \"country\" : \"US\",\n    \"city\" : \"NEW YORK\",\n    \"state\" : \"NY\",\n    \"postal_code\" : \"560087\",\n    \"line2\" : \"line2\",\n    \"line1\" : \"33 IRVING PLACE\"\n  },\n  \"payout_date\" : \"2020-01-27T08:26:16Z\",\n  \"overtime\" : \"9.02\",\n  \"currency\" : \"INR\",\n  \"commission\" : \"15.32\",\n  \"id\" : \"47b216e2-d334-4235-bc1e-185d15ab18d0\",\n  \"bonuses\" : \"10.70\",\n  \"status\" : \"completed\"\n}", Payouts.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Payouts>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Payouts>(HttpStatus.NOT_IMPLEMENTED);
    }

}
