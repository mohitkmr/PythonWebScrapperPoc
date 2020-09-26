/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.21).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.AccountDetails;
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
@Api(value = "accounts", description = "the accounts API")
public interface AccountsApi {

    @ApiOperation(value = "Delete an account", nickname = "deleteAccountById", notes = "Deletes an account and all resources associated with that account profiles, vehicles, documents, incomes etc.", tags={ "Accounts", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "On successful account deletion responds with a 204 status and an empty response body.") })
    @RequestMapping(value = "/accounts/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteAccountById(@ApiParam(value = "ID of the account to be deleted.",required=true) @PathVariable("id") String id
);


    @ApiOperation(value = "Retrieve an account", nickname = "getAccountById", notes = "Retrieve an account object with the supplied ID.", response = AccountDetails.class, tags={ "Accounts", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns an account object if a valid identifier was provided.", response = AccountDetails.class) })
    @RequestMapping(value = "/accounts/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<AccountDetails> getAccountById(@ApiParam(value = "The identifier of the account to be retrieved.",required=true) @PathVariable("id") String id
);


    @ApiOperation(value = "List accounts", nickname = "getAllAccounts", notes = "List all accounts that your customers have connected through Linkage.", response = AccountDetails.class, responseContainer = "List", tags={ "Accounts", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "An object with a results property that contains an array of up to limit account objects.", response = AccountDetails.class, responseContainer = "List") })
    @RequestMapping(value = "/accounts",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<AccountDetails>> getAllAccounts(@ApiParam(value = "The number of user objects to be returned. The default is 10.") @Valid @RequestParam(value = "limit", required = false) Integer limit
,@ApiParam(value = "The number of user objects to skip. Use this argument for pagination. The default is 0.") @Valid @RequestParam(value = "offset", required = false) Integer offset
,@ApiParam(value = "Only return accounts for the data partner with the provided ID.") @Valid @RequestParam(value = "data_partner", required = false) Integer dataPartner
,@ApiParam(value = "Only return accounts for the user with the provided ID.") @Valid @RequestParam(value = "user", required = false) Integer user
);

}
