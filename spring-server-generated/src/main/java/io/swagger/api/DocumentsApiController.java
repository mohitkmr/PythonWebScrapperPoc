package io.swagger.api;

import io.swagger.model.Documents;
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
public class DocumentsApiController implements DocumentsApi {

    private static final Logger log = LoggerFactory.getLogger(DocumentsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public DocumentsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<Documents>> getAllDocuments() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Documents>>(objectMapper.readValue("[ {\n  \"file_url\" : \"https://linkage-api-prod-uploads.storage.googleapis.com/e0c16ace-0628-25da-8928-5dffd7a7b1d1-20200016\",\n  \"document_number\" : \"D1234567\",\n  \"id\" : \"110a6cd9-2cd5-3a8e-b8db-3fae4e96b58a\",\n  \"expiration_date\" : \"2026-01-01T00:00:00Z\",\n  \"account\" : \"e0c16ace-0628-25da-8928-5dffd7a7b1d1\",\n  \"document_type\" : \"drivers-license\",\n  \"document_type_description\" : \"Driver's license\"\n}, {\n  \"file_url\" : \"https://linkage-api-prod-uploads.storage.googleapis.com/e0c16ace-0628-25da-8928-5dffd7a7b1d1-20200016\",\n  \"document_number\" : \"D1234567\",\n  \"id\" : \"110a6cd9-2cd5-3a8e-b8db-3fae4e96b58a\",\n  \"expiration_date\" : \"2026-01-01T00:00:00Z\",\n  \"account\" : \"e0c16ace-0628-25da-8928-5dffd7a7b1d1\",\n  \"document_type\" : \"drivers-license\",\n  \"document_type_description\" : \"Driver's license\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Documents>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Documents>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Documents> getDocumentById(@ApiParam(value = "The identifier of the document to be retrieved.",required=true) @PathVariable("id") String id
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Documents>(objectMapper.readValue("{\n  \"file_url\" : \"https://linkage-api-prod-uploads.storage.googleapis.com/e0c16ace-0628-25da-8928-5dffd7a7b1d1-20200016\",\n  \"document_number\" : \"D1234567\",\n  \"id\" : \"110a6cd9-2cd5-3a8e-b8db-3fae4e96b58a\",\n  \"expiration_date\" : \"2026-01-01T00:00:00Z\",\n  \"account\" : \"e0c16ace-0628-25da-8928-5dffd7a7b1d1\",\n  \"document_type\" : \"drivers-license\",\n  \"document_type_description\" : \"Driver's license\"\n}", Documents.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Documents>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Documents>(HttpStatus.NOT_IMPLEMENTED);
    }

}
