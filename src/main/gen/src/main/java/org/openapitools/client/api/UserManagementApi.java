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


import org.openapitools.client.model.ChurchUserProfile;
import java.io.File;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserManagementApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public UserManagementApi() {
        this(Configuration.getDefaultApiClient());
    }

    public UserManagementApi(ApiClient apiClient) {
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
     * Build call for churchesChurchIdUsersGet
     * @param churchId Identifiant unique de l&#39;église (required)
     * @param page Numéro de page à récupérer (défaut 1) (optional)
     * @param size Nombre d&#39;enregistrements par page (défaut 10) (optional)
     * @param role Filtrer par rôle (ex. MEMBER, PASTOR) (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Liste des utilisateurs récupérée </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Accès refusé – rôle insuffisant </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call churchesChurchIdUsersGetCall(String churchId, Integer page, Integer size, String role, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/churches/{churchId}/users"
            .replace("{" + "churchId" + "}", localVarApiClient.escapeString(churchId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (size != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("size", size));
        }

        if (role != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("role", role));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "BearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call churchesChurchIdUsersGetValidateBeforeCall(String churchId, Integer page, Integer size, String role, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'churchId' is set
        if (churchId == null) {
            throw new ApiException("Missing the required parameter 'churchId' when calling churchesChurchIdUsersGet(Async)");
        }

        return churchesChurchIdUsersGetCall(churchId, page, size, role, _callback);

    }

    /**
     * Lister les utilisateurs d&#39;une église
     * 
     * @param churchId Identifiant unique de l&#39;église (required)
     * @param page Numéro de page à récupérer (défaut 1) (optional)
     * @param size Nombre d&#39;enregistrements par page (défaut 10) (optional)
     * @param role Filtrer par rôle (ex. MEMBER, PASTOR) (optional)
     * @return List&lt;ChurchUserProfile&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Liste des utilisateurs récupérée </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Accès refusé – rôle insuffisant </td><td>  -  </td></tr>
     </table>
     */
    public List<ChurchUserProfile> churchesChurchIdUsersGet(String churchId, Integer page, Integer size, String role) throws ApiException {
        ApiResponse<List<ChurchUserProfile>> localVarResp = churchesChurchIdUsersGetWithHttpInfo(churchId, page, size, role);
        return localVarResp.getData();
    }

    /**
     * Lister les utilisateurs d&#39;une église
     * 
     * @param churchId Identifiant unique de l&#39;église (required)
     * @param page Numéro de page à récupérer (défaut 1) (optional)
     * @param size Nombre d&#39;enregistrements par page (défaut 10) (optional)
     * @param role Filtrer par rôle (ex. MEMBER, PASTOR) (optional)
     * @return ApiResponse&lt;List&lt;ChurchUserProfile&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Liste des utilisateurs récupérée </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Accès refusé – rôle insuffisant </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<ChurchUserProfile>> churchesChurchIdUsersGetWithHttpInfo(String churchId, Integer page, Integer size, String role) throws ApiException {
        okhttp3.Call localVarCall = churchesChurchIdUsersGetValidateBeforeCall(churchId, page, size, role, null);
        Type localVarReturnType = new TypeToken<List<ChurchUserProfile>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Lister les utilisateurs d&#39;une église (asynchronously)
     * 
     * @param churchId Identifiant unique de l&#39;église (required)
     * @param page Numéro de page à récupérer (défaut 1) (optional)
     * @param size Nombre d&#39;enregistrements par page (défaut 10) (optional)
     * @param role Filtrer par rôle (ex. MEMBER, PASTOR) (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Liste des utilisateurs récupérée </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Accès refusé – rôle insuffisant </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call churchesChurchIdUsersGetAsync(String churchId, Integer page, Integer size, String role, final ApiCallback<List<ChurchUserProfile>> _callback) throws ApiException {

        okhttp3.Call localVarCall = churchesChurchIdUsersGetValidateBeforeCall(churchId, page, size, role, _callback);
        Type localVarReturnType = new TypeToken<List<ChurchUserProfile>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for churchesChurchIdUsersUserIdPhotoPost
     * @param churchId Identifiant unique de l&#39;église (required)
     * @param userId Identifiant unique de l&#39;utilisateur (required)
     * @param photo Fichier image de la photo de profil. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Photo téléchargée avec succès </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call churchesChurchIdUsersUserIdPhotoPostCall(String churchId, String userId, File photo, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/churches/{churchId}/users/{userId}/photo"
            .replace("{" + "churchId" + "}", localVarApiClient.escapeString(churchId.toString()))
            .replace("{" + "userId" + "}", localVarApiClient.escapeString(userId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (photo != null) {
            localVarFormParams.put("photo", photo);
        }

        final String[] localVarAccepts = {
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "BearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call churchesChurchIdUsersUserIdPhotoPostValidateBeforeCall(String churchId, String userId, File photo, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'churchId' is set
        if (churchId == null) {
            throw new ApiException("Missing the required parameter 'churchId' when calling churchesChurchIdUsersUserIdPhotoPost(Async)");
        }

        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling churchesChurchIdUsersUserIdPhotoPost(Async)");
        }

        return churchesChurchIdUsersUserIdPhotoPostCall(churchId, userId, photo, _callback);

    }

    /**
     * Télécharger la photo de profil d&#39;un utilisateur d&#39;une église
     * 
     * @param churchId Identifiant unique de l&#39;église (required)
     * @param userId Identifiant unique de l&#39;utilisateur (required)
     * @param photo Fichier image de la photo de profil. (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Photo téléchargée avec succès </td><td>  -  </td></tr>
     </table>
     */
    public void churchesChurchIdUsersUserIdPhotoPost(String churchId, String userId, File photo) throws ApiException {
        churchesChurchIdUsersUserIdPhotoPostWithHttpInfo(churchId, userId, photo);
    }

    /**
     * Télécharger la photo de profil d&#39;un utilisateur d&#39;une église
     * 
     * @param churchId Identifiant unique de l&#39;église (required)
     * @param userId Identifiant unique de l&#39;utilisateur (required)
     * @param photo Fichier image de la photo de profil. (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Photo téléchargée avec succès </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> churchesChurchIdUsersUserIdPhotoPostWithHttpInfo(String churchId, String userId, File photo) throws ApiException {
        okhttp3.Call localVarCall = churchesChurchIdUsersUserIdPhotoPostValidateBeforeCall(churchId, userId, photo, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Télécharger la photo de profil d&#39;un utilisateur d&#39;une église (asynchronously)
     * 
     * @param churchId Identifiant unique de l&#39;église (required)
     * @param userId Identifiant unique de l&#39;utilisateur (required)
     * @param photo Fichier image de la photo de profil. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Photo téléchargée avec succès </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call churchesChurchIdUsersUserIdPhotoPostAsync(String churchId, String userId, File photo, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = churchesChurchIdUsersUserIdPhotoPostValidateBeforeCall(churchId, userId, photo, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for churchesChurchIdUsersUserIdPut
     * @param churchId Identifiant unique de l&#39;église (required)
     * @param userId Identifiant unique de l&#39;utilisateur (required)
     * @param churchUserProfile  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Profil mis à jour avec succès </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call churchesChurchIdUsersUserIdPutCall(String churchId, String userId, ChurchUserProfile churchUserProfile, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = churchUserProfile;

        // create path and map variables
        String localVarPath = "/churches/{churchId}/users/{userId}"
            .replace("{" + "churchId" + "}", localVarApiClient.escapeString(churchId.toString()))
            .replace("{" + "userId" + "}", localVarApiClient.escapeString(userId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
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
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call churchesChurchIdUsersUserIdPutValidateBeforeCall(String churchId, String userId, ChurchUserProfile churchUserProfile, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'churchId' is set
        if (churchId == null) {
            throw new ApiException("Missing the required parameter 'churchId' when calling churchesChurchIdUsersUserIdPut(Async)");
        }

        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling churchesChurchIdUsersUserIdPut(Async)");
        }

        // verify the required parameter 'churchUserProfile' is set
        if (churchUserProfile == null) {
            throw new ApiException("Missing the required parameter 'churchUserProfile' when calling churchesChurchIdUsersUserIdPut(Async)");
        }

        return churchesChurchIdUsersUserIdPutCall(churchId, userId, churchUserProfile, _callback);

    }

    /**
     * Mettre à jour le profil d&#39;un utilisateur d&#39;une église
     * 
     * @param churchId Identifiant unique de l&#39;église (required)
     * @param userId Identifiant unique de l&#39;utilisateur (required)
     * @param churchUserProfile  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Profil mis à jour avec succès </td><td>  -  </td></tr>
     </table>
     */
    public void churchesChurchIdUsersUserIdPut(String churchId, String userId, ChurchUserProfile churchUserProfile) throws ApiException {
        churchesChurchIdUsersUserIdPutWithHttpInfo(churchId, userId, churchUserProfile);
    }

    /**
     * Mettre à jour le profil d&#39;un utilisateur d&#39;une église
     * 
     * @param churchId Identifiant unique de l&#39;église (required)
     * @param userId Identifiant unique de l&#39;utilisateur (required)
     * @param churchUserProfile  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Profil mis à jour avec succès </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> churchesChurchIdUsersUserIdPutWithHttpInfo(String churchId, String userId, ChurchUserProfile churchUserProfile) throws ApiException {
        okhttp3.Call localVarCall = churchesChurchIdUsersUserIdPutValidateBeforeCall(churchId, userId, churchUserProfile, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Mettre à jour le profil d&#39;un utilisateur d&#39;une église (asynchronously)
     * 
     * @param churchId Identifiant unique de l&#39;église (required)
     * @param userId Identifiant unique de l&#39;utilisateur (required)
     * @param churchUserProfile  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Profil mis à jour avec succès </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call churchesChurchIdUsersUserIdPutAsync(String churchId, String userId, ChurchUserProfile churchUserProfile, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = churchesChurchIdUsersUserIdPutValidateBeforeCall(churchId, userId, churchUserProfile, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}
