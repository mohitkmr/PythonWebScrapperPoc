package io.swagger.api;

import io.swagger.model.Body2;
import io.swagger.model.InlineResponse2001;
import io.swagger.model.Webhook;
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
public class WebhooksApiController implements WebhooksApi {

    private static final Logger log = LoggerFactory.getLogger(WebhooksApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public WebhooksApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> deleteWebhookById(@ApiParam(value = "ID of the account to be deleted.",required=true) @PathVariable("id") String id
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Webhook>> getAllWebhooks(@ApiParam(value = "The number of user objects to be returned. The default is 10.") @Valid @RequestParam(value = "limit", required = false) Integer limit
,@ApiParam(value = "The number of user objects to skip. Use this argument for pagination. The default is 0.") @Valid @RequestParam(value = "offset", required = false) Integer offset
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Webhook>>(objectMapper.readValue("[ {\n  \"is_active\" : true,\n  \"id\" : \"580dca76-c024-4458-bb10-a2111ad4063e\",\n  \"secret\" : \"secret\",\n  \"events\" : [ \"activities.added\" ],\n  \"url\" : \"https://webhooks-backend.com/linkage\"\n}, {\n  \"is_active\" : true,\n  \"id\" : \"580dca76-c024-4458-bb10-a2111ad4063e\",\n  \"secret\" : \"secret\",\n  \"events\" : [ \"activities.added\" ],\n  \"url\" : \"https://webhooks-backend.com/linkage\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Webhook>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Webhook>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Webhook> getWebhookById(@ApiParam(value = "Identifier of the webhook object to be retrieved.",required=true) @PathVariable("id") String id
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Webhook>(objectMapper.readValue("{\n  \"is_active\" : true,\n  \"id\" : \"580dca76-c024-4458-bb10-a2111ad4063e\",\n  \"secret\" : \"secret\",\n  \"events\" : [ \"activities.added\" ],\n  \"url\" : \"https://webhooks-backend.com/linkage\"\n}", Webhook.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Webhook>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Webhook>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse2001> registerWebhooks(@ApiParam(value = ""  )  @Valid @RequestBody Body2 body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2001>(objectMapper.readValue("{\n  \"access\" : \"access\"\n}", InlineResponse2001.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2001>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2001>(HttpStatus.NOT_IMPLEMENTED);
    }

}
