/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.22).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.ProfileDetails;
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
@Api(value = "profiles", description = "the profiles API")
public interface ProfilesApi {

    @ApiOperation(value = "Lists Profiles", nickname = "getAllProfiles", notes = "Lists profile objects.", response = ProfileDetails.class, responseContainer = "List", tags={ "Profiles", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "An object with a results property that contains an array of up to limit profile objects.", response = ProfileDetails.class, responseContainer = "List") })
    @RequestMapping(value = "/profiles",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<ProfileDetails>> getAllProfiles(@ApiParam(value = "The number of user objects to be returned. The default is 10.") @Valid @RequestParam(value = "limit", required = false) Integer limit
,@ApiParam(value = "The number of user objects to skip. Use this argument for pagination. The default is 0.") @Valid @RequestParam(value = "offset", required = false) Integer offset
,@ApiParam(value = "Only return the profile for the account with the provided ID.") @Valid @RequestParam(value = "account", required = false) Integer account
,@ApiParam(value = "Only return accounts for the user with the provided ID.") @Valid @RequestParam(value = "user", required = false) Integer user
);


    @ApiOperation(value = "Retrieve a profile", nickname = "getProfileById", notes = "Retrieves the profile object with the supplied ID.", response = ProfileDetails.class, tags={ "Profiles", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns a profile object if a valid identifier was provided.", response = ProfileDetails.class) })
    @RequestMapping(value = "/profiles/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<ProfileDetails> getProfileById(@ApiParam(value = "User ID",required=true) @PathVariable("id") String id
);

}

