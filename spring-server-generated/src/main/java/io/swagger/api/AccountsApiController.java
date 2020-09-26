package io.swagger.api;

import io.swagger.model.AccountDetails;
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
public class AccountsApiController implements AccountsApi {

    private static final Logger log = LoggerFactory.getLogger(AccountsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public AccountsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> deleteAccountById(@ApiParam(value = "ID of the account to be deleted.",required=true) @PathVariable("id") String id
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AccountDetails> getAccountById(@ApiParam(value = "The identifier of the account to be retrieved.",required=true) @PathVariable("id") String id
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AccountDetails>(objectMapper.readValue("{\n  \"updated_at\" : \"2019-11-27T15:56:50.583233Z\",\n  \"created_at\" : \"2019-11-27T15:56:50.583233Z\",\n  \"connection\" : {\n    \"updated_at\" : \"2019-11-29T08:37:42.112Z\",\n    \"error_code\" : \"unsupported_auth_type\",\n    \"status\" : \"connected\"\n  },\n  \"id\" : \"ac81e2bc-2157-4535-8ca4-fb1f068df1fc\",\n  \"availability\" : {\n    \"documents\" : {\n      \"status\" : \"synced\"\n    },\n    \"vehicles\" : {\n      \"updated_at\" : \"2019-11-27T15:56:20.699Z\",\n      \"status\" : \"synced\"\n    }\n  },\n  \"user\" : \"ac81e2bc-2157-4535-8ca4-fb1f068df1fc\",\n  \"data_partner\" : \"greyhr\"\n}", AccountDetails.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AccountDetails>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AccountDetails>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<AccountDetails>> getAllAccounts(@ApiParam(value = "The number of user objects to be returned. The default is 10.") @Valid @RequestParam(value = "limit", required = false) Integer limit
,@ApiParam(value = "The number of user objects to skip. Use this argument for pagination. The default is 0.") @Valid @RequestParam(value = "offset", required = false) Integer offset
,@ApiParam(value = "Only return accounts for the data partner with the provided ID.") @Valid @RequestParam(value = "data_partner", required = false) Integer dataPartner
,@ApiParam(value = "Only return accounts for the user with the provided ID.") @Valid @RequestParam(value = "user", required = false) Integer user
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<AccountDetails>>(objectMapper.readValue("[ {\n  \"updated_at\" : \"2019-11-27T15:56:50.583233Z\",\n  \"created_at\" : \"2019-11-27T15:56:50.583233Z\",\n  \"connection\" : {\n    \"updated_at\" : \"2019-11-29T08:37:42.112Z\",\n    \"error_code\" : \"unsupported_auth_type\",\n    \"status\" : \"connected\"\n  },\n  \"id\" : \"ac81e2bc-2157-4535-8ca4-fb1f068df1fc\",\n  \"availability\" : {\n    \"documents\" : {\n      \"status\" : \"synced\"\n    },\n    \"vehicles\" : {\n      \"updated_at\" : \"2019-11-27T15:56:20.699Z\",\n      \"status\" : \"synced\"\n    }\n  },\n  \"user\" : \"ac81e2bc-2157-4535-8ca4-fb1f068df1fc\",\n  \"data_partner\" : \"greyhr\"\n}, {\n  \"updated_at\" : \"2019-11-27T15:56:50.583233Z\",\n  \"created_at\" : \"2019-11-27T15:56:50.583233Z\",\n  \"connection\" : {\n    \"updated_at\" : \"2019-11-29T08:37:42.112Z\",\n    \"error_code\" : \"unsupported_auth_type\",\n    \"status\" : \"connected\"\n  },\n  \"id\" : \"ac81e2bc-2157-4535-8ca4-fb1f068df1fc\",\n  \"availability\" : {\n    \"documents\" : {\n      \"status\" : \"synced\"\n    },\n    \"vehicles\" : {\n      \"updated_at\" : \"2019-11-27T15:56:20.699Z\",\n      \"status\" : \"synced\"\n    }\n  },\n  \"user\" : \"ac81e2bc-2157-4535-8ca4-fb1f068df1fc\",\n  \"data_partner\" : \"greyhr\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<AccountDetails>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<AccountDetails>>(HttpStatus.NOT_IMPLEMENTED);
    }

}
