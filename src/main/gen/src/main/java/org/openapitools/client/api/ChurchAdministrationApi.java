/*
 * EcclesiaFlow Authentication API
 * API d'authentification et de gestion des utilisateurs pour un système de gestion d'églises en mode multi-tenant. Une église s'enregistre d'abord, puis peut créer et administrer ses propres utilisateurs avec des rôles spécifiques. 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@ecclesiaflow.com
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


import org.openapitools.client.model.ChurchUserCreationRequest;
import org.openapitools.client.model.ChurchUserProfile;
import org.openapitools.client.model.RegisterChurch400Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChurchAdministrationApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ChurchAdministrationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ChurchAdministrationApi(ApiClient apiClient) {
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
     * Build call for churchesChurchIdUsersPost
     * @param churchId Identifiant unique de l&#39;église (required)
     * @param churchUserCreationRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Utilisateur créé avec succès </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Erreur de validation </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Accès refusé – rôle insuffisant </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call churchesChurchIdUsersPostCall(String churchId, ChurchUserCreationRequest churchUserCreationRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = churchUserCreationRequest;

        // create path and map variables
        String localVarPath = "/churches/{churchId}/users"
            .replace("{" + "churchId" + "}", localVarApiClient.escapeString(churchId.toString()));

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

        String[] localVarAuthNames = new String[] { "BearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call churchesChurchIdUsersPostValidateBeforeCall(String churchId, ChurchUserCreationRequest churchUserCreationRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'churchId' is set
        if (churchId == null) {
            throw new ApiException("Missing the required parameter 'churchId' when calling churchesChurchIdUsersPost(Async)");
        }

        // verify the required parameter 'churchUserCreationRequest' is set
        if (churchUserCreationRequest == null) {
            throw new ApiException("Missing the required parameter 'churchUserCreationRequest' when calling churchesChurchIdUsersPost(Async)");
        }

        return churchesChurchIdUsersPostCall(churchId, churchUserCreationRequest, _callback);

    }

    /**
     * Créer un nouvel utilisateur pour l&#39;église
     * 
     * @param churchId Identifiant unique de l&#39;église (required)
     * @param churchUserCreationRequest  (required)
     * @return ChurchUserProfile
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Utilisateur créé avec succès </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Erreur de validation </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Accès refusé – rôle insuffisant </td><td>  -  </td></tr>
     </table>
     */
    public ChurchUserProfile churchesChurchIdUsersPost(String churchId, ChurchUserCreationRequest churchUserCreationRequest) throws ApiException {
        ApiResponse<ChurchUserProfile> localVarResp = churchesChurchIdUsersPostWithHttpInfo(churchId, churchUserCreationRequest);
        return localVarResp.getData();
    }

    /**
     * Créer un nouvel utilisateur pour l&#39;église
     * 
     * @param churchId Identifiant unique de l&#39;église (required)
     * @param churchUserCreationRequest  (required)
     * @return ApiResponse&lt;ChurchUserProfile&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Utilisateur créé avec succès </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Erreur de validation </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Accès refusé – rôle insuffisant </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ChurchUserProfile> churchesChurchIdUsersPostWithHttpInfo(String churchId, ChurchUserCreationRequest churchUserCreationRequest) throws ApiException {
        okhttp3.Call localVarCall = churchesChurchIdUsersPostValidateBeforeCall(churchId, churchUserCreationRequest, null);
        Type localVarReturnType = new TypeToken<ChurchUserProfile>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Créer un nouvel utilisateur pour l&#39;église (asynchronously)
     * 
     * @param churchId Identifiant unique de l&#39;église (required)
     * @param churchUserCreationRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Utilisateur créé avec succès </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Erreur de validation </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Accès refusé – rôle insuffisant </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call churchesChurchIdUsersPostAsync(String churchId, ChurchUserCreationRequest churchUserCreationRequest, final ApiCallback<ChurchUserProfile> _callback) throws ApiException {

        okhttp3.Call localVarCall = churchesChurchIdUsersPostValidateBeforeCall(churchId, churchUserCreationRequest, _callback);
        Type localVarReturnType = new TypeToken<ChurchUserProfile>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
