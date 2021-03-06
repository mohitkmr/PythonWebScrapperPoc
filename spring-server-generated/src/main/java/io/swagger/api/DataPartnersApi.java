/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.22).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.DataPartner;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T02:24:33.854Z[GMT]")
@Api(value = "data-partners", description = "the data-partners API")
public interface DataPartnersApi {

    @ApiOperation(value = "List data partners", nickname = "getAllDataPartners", notes = "Lists all data partners supported by Linkage.", response = DataPartner.class, responseContainer = "List", tags={ "Data Partners", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "An object with a results property that contains an array of data partner objects.", response = DataPartner.class, responseContainer = "List") })
    @RequestMapping(value = "/data-partners",
            produces = { "application/json" },
            method = RequestMethod.GET)
    ResponseEntity<List<DataPartner>> getAllDataPartners(@ApiParam(value = "Only return data partners with the name provided.") @Valid @RequestParam(value = "name", required = false) String name
            ,@ApiParam(value = "The number of data partner objects to be returned. The default is 10.") @Valid @RequestParam(value = "limit", required = false) Integer limit
            ,@ApiParam(value = "The number of data partner objects to skip. Use this argument for pagination. The default is 0.") @Valid @RequestParam(value = "offset", required = false) Integer offset
    );


    @ApiOperation(value = "Retrieve a data partner", nickname = "getDataPartnerById", notes = "Retrieves a data partner object with the supplied ID.", response = DataPartner.class, tags={ "Data Partners", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Returns a data partner object if a valid identifier was provided.", response = DataPartner.class) })
    @RequestMapping(value = "/data-partners/{id}",
            produces = { "application/json" },
            method = RequestMethod.GET)
    ResponseEntity<DataPartner> getDataPartnerById(@ApiParam(value = "The identifier of the data partner to be retrieved.",required=true) @PathVariable("id") String id
    );

}

