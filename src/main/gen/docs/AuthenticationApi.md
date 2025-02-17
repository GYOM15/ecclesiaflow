# AuthenticationApi

All URIs are relative to *https://api.ecclesiaflow.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**churchLoginUser**](AuthenticationApi.md#churchLoginUser) | **POST** /churches/{churchId}/auth/login | Connexion d&#39;un utilisateur d&#39;église |
| [**churchesChurchIdAuthLogoutPost**](AuthenticationApi.md#churchesChurchIdAuthLogoutPost) | **POST** /churches/{churchId}/auth/logout | Déconnexion d&#39;un utilisateur d&#39;église |
| [**churchesChurchIdAuthRefreshTokenPost**](AuthenticationApi.md#churchesChurchIdAuthRefreshTokenPost) | **POST** /churches/{churchId}/auth/refresh-token | Rafraîchir le token d&#39;accès pour un utilisateur d&#39;église |


<a id="churchLoginUser"></a>
# **churchLoginUser**
> LoginResponse churchLoginUser(churchId, loginRequest)

Connexion d&#39;un utilisateur d&#39;église

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ecclesiaflow.com/v1");

    AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
    String churchId = "churchId_example"; // String | Identifiant unique de l'église
    LoginRequest loginRequest = new LoginRequest(); // LoginRequest | 
    try {
      LoginResponse result = apiInstance.churchLoginUser(churchId, loginRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#churchLoginUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **churchId** | **String**| Identifiant unique de l&#39;église | |
| **loginRequest** | [**LoginRequest**](LoginRequest.md)|  | |

### Return type

[**LoginResponse**](LoginResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Connexion réussie |  -  |
| **401** | Erreur d&#39;authentification |  -  |
| **423** | Compte bloqué |  -  |

<a id="churchesChurchIdAuthLogoutPost"></a>
# **churchesChurchIdAuthLogoutPost**
> churchesChurchIdAuthLogoutPost(churchId)

Déconnexion d&#39;un utilisateur d&#39;église

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ecclesiaflow.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
    String churchId = "churchId_example"; // String | Identifiant unique de l'église
    try {
      apiInstance.churchesChurchIdAuthLogoutPost(churchId);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#churchesChurchIdAuthLogoutPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **churchId** | **String**| Identifiant unique de l&#39;église | |

### Return type

null (empty response body)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Déconnexion réussie |  -  |
| **401** | Non autorisé |  -  |

<a id="churchesChurchIdAuthRefreshTokenPost"></a>
# **churchesChurchIdAuthRefreshTokenPost**
> LoginResponse churchesChurchIdAuthRefreshTokenPost(churchId, refreshTokenRequest)

Rafraîchir le token d&#39;accès pour un utilisateur d&#39;église

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ecclesiaflow.com/v1");

    AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
    String churchId = "churchId_example"; // String | Identifiant unique de l'église
    RefreshTokenRequest refreshTokenRequest = new RefreshTokenRequest(); // RefreshTokenRequest | 
    try {
      LoginResponse result = apiInstance.churchesChurchIdAuthRefreshTokenPost(churchId, refreshTokenRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#churchesChurchIdAuthRefreshTokenPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **churchId** | **String**| Identifiant unique de l&#39;église | |
| **refreshTokenRequest** | [**RefreshTokenRequest**](RefreshTokenRequest.md)|  | |

### Return type

[**LoginResponse**](LoginResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Token rafraîchi |  -  |
| **401** | Refresh token invalide |  -  |

