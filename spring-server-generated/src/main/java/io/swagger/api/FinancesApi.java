/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.21).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Finances;
import io.swagger.model.Payouts;
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
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-26T10:30:08.165Z[GMT]")
@Api(value = "finances", description = "the finances API")
public interface FinancesApi {

    @ApiOperation(value = "Lists all finance objects which are registered in Linkage.", nickname = "getAllFinances", notes = "List finances", response = Finances.class, responseContainer = "List", tags={ "Finances", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "An object with a results property that contains an array of up to limit finance objects.", response = Finances.class, responseContainer = "List") })
    @RequestMapping(value = "/finances",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Finances>> getAllFinances();


    @ApiOperation(value = "Retrieve a finance", nickname = "getFinaceById", notes = "Retrieves a payout object with the supplied ID.", response = Payouts.class, tags={ "Finances", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns a finance object if a valid identifier was provided.", response = Payouts.class) })
    @RequestMapping(value = "/finances/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Payouts> getFinaceById(@ApiParam(value = "The identifier of the payout to be retrieved.",required=true) @PathVariable("id") String id
);

}
