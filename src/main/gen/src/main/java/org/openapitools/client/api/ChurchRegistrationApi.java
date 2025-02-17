/*
 * Church Management Authentication API
 * API d'authentification et de gestion des utilisateurs pour un système de gestion d'églises en mode multi-tenant. Une église s'enregistre d'abord, puis peut créer et administrer ses propres utilisateurs avec des rôles spécifiques. 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@churchmanagement.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.ChurchRegisterRequest;
import org.openapitools.client.model.ChurchRegisterResponse;
import org.openapitools.client.model.RegisterChurch400Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChurchRegistrationApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ChurchRegistrationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ChurchRegistrationApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for registerChurch
     * @param churchRegisterRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Église enregistrée avec succès </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Erreur de validation </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> L&#39;église existe déjà </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call registerChurchCall(ChurchRegisterRequest churchRegisterRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = churchRegisterRequest;

        // create path and map variables
        String localVarPath = "/churches/register";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call registerChurchValidateBeforeCall(ChurchRegisterRequest churchRegisterRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'churchRegisterRequest' is set
        if (churchRegisterRequest == null) {
            throw new ApiException("Missing the required parameter 'churchRegisterRequest' when calling registerChurch(Async)");
        }

        return registerChurchCall(churchRegisterRequest, _callback);

    }

    /**
     * Enregistrer une nouvelle église
     * 
     * @param churchRegisterRequest  (required)
     * @return ChurchRegisterResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Église enregistrée avec succès </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Erreur de validation </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> L&#39;église existe déjà </td><td>  -  </td></tr>
     </table>
     */
    public ChurchRegisterResponse registerChurch(ChurchRegisterRequest churchRegisterRequest) throws ApiException {
        ApiResponse<ChurchRegisterResponse> localVarResp = registerChurchWithHttpInfo(churchRegisterRequest);
        return localVarResp.getData();
    }

    /**
     * Enregistrer une nouvelle église
     * 
     * @param churchRegisterRequest  (required)
     * @return ApiResponse&lt;ChurchRegisterResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Église enregistrée avec succès </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Erreur de validation </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> L&#39;église existe déjà </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ChurchRegisterResponse> registerChurchWithHttpInfo(ChurchRegisterRequest churchRegisterRequest) throws ApiException {
        okhttp3.Call localVarCall = registerChurchValidateBeforeCall(churchRegisterRequest, null);
        Type localVarReturnType = new TypeToken<ChurchRegisterResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Enregistrer une nouvelle église (asynchronously)
     * 
     * @param churchRegisterRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Église enregistrée avec succès </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Erreur de validation </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> L&#39;église existe déjà </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call registerChurchAsync(ChurchRegisterRequest churchRegisterRequest, final ApiCallback<ChurchRegisterResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = registerChurchValidateBeforeCall(churchRegisterRequest, _callback);
        Type localVarReturnType = new TypeToken<ChurchRegisterResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
