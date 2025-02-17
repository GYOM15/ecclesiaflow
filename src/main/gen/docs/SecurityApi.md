# SecurityApi

All URIs are relative to *https://api.ecclesiaflow.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**churchesChurchIdAuthMfaSetupPost**](SecurityApi.md#churchesChurchIdAuthMfaSetupPost) | **POST** /churches/{churchId}/auth/mfa/setup | Configurer la MFA pour un utilisateur d&#39;église |
| [**churchesChurchIdAuthMfaVerifyPost**](SecurityApi.md#churchesChurchIdAuthMfaVerifyPost) | **POST** /churches/{churchId}/auth/mfa/verify | Vérifier le code MFA pour un utilisateur d&#39;église |
| [**churchesChurchIdAuthPasswordChangePost**](SecurityApi.md#churchesChurchIdAuthPasswordChangePost) | **POST** /churches/{churchId}/auth/password/change | Changer le mot de passe d&#39;un utilisateur d&#39;église |
| [**churchesChurchIdAuthPasswordResetPost**](SecurityApi.md#churchesChurchIdAuthPasswordResetPost) | **POST** /churches/{churchId}/auth/password/reset | Demander une réinitialisation de mot de passe pour un utilisateur d&#39;église |
| [**churchesChurchIdAuthPasswordResetTokenPost**](SecurityApi.md#churchesChurchIdAuthPasswordResetTokenPost) | **POST** /churches/{churchId}/auth/password/reset/{token} | Réinitialiser le mot de passe avec un token pour un utilisateur d&#39;église |
| [**churchesChurchIdUsersSessionsDelete**](SecurityApi.md#churchesChurchIdUsersSessionsDelete) | **DELETE** /churches/{churchId}/users/sessions | Terminer toutes les sessions d&#39;un utilisateur d&#39;une église |
| [**churchesChurchIdUsersSessionsGet**](SecurityApi.md#churchesChurchIdUsersSessionsGet) | **GET** /churches/{churchId}/users/sessions | Lister les sessions actives d&#39;un utilisateur d&#39;une église |


<a id="churchesChurchIdAuthMfaSetupPost"></a>
# **churchesChurchIdAuthMfaSetupPost**
> MFASetupResponse churchesChurchIdAuthMfaSetupPost(churchId)

Configurer la MFA pour un utilisateur d&#39;église

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SecurityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ecclesiaflow.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    SecurityApi apiInstance = new SecurityApi(defaultClient);
    String churchId = "churchId_example"; // String | Identifiant unique de l'église
    try {
      MFASetupResponse result = apiInstance.churchesChurchIdAuthMfaSetupPost(churchId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityApi#churchesChurchIdAuthMfaSetupPost");
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

[**MFASetupResponse**](MFASetupResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Configuration MFA réussie |  -  |

<a id="churchesChurchIdAuthMfaVerifyPost"></a>
# **churchesChurchIdAuthMfaVerifyPost**
> churchesChurchIdAuthMfaVerifyPost(churchId, mfAVerifyRequest)

Vérifier le code MFA pour un utilisateur d&#39;église

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SecurityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ecclesiaflow.com/v1");

    SecurityApi apiInstance = new SecurityApi(defaultClient);
    String churchId = "churchId_example"; // String | Identifiant unique de l'église
    MFAVerifyRequest mfAVerifyRequest = new MFAVerifyRequest(); // MFAVerifyRequest | 
    try {
      apiInstance.churchesChurchIdAuthMfaVerifyPost(churchId, mfAVerifyRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityApi#churchesChurchIdAuthMfaVerifyPost");
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
| **mfAVerifyRequest** | [**MFAVerifyRequest**](MFAVerifyRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Vérification MFA réussie |  -  |
| **400** | Code invalide |  -  |

<a id="churchesChurchIdAuthPasswordChangePost"></a>
# **churchesChurchIdAuthPasswordChangePost**
> churchesChurchIdAuthPasswordChangePost(churchId, changePasswordRequest)

Changer le mot de passe d&#39;un utilisateur d&#39;église

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SecurityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ecclesiaflow.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    SecurityApi apiInstance = new SecurityApi(defaultClient);
    String churchId = "churchId_example"; // String | Identifiant unique de l'église
    ChangePasswordRequest changePasswordRequest = new ChangePasswordRequest(); // ChangePasswordRequest | 
    try {
      apiInstance.churchesChurchIdAuthPasswordChangePost(churchId, changePasswordRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityApi#churchesChurchIdAuthPasswordChangePost");
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
| **changePasswordRequest** | [**ChangePasswordRequest**](ChangePasswordRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Mot de passe modifié |  -  |
| **400** | Mot de passe invalide |  -  |
| **401** | Non autorisé |  -  |

<a id="churchesChurchIdAuthPasswordResetPost"></a>
# **churchesChurchIdAuthPasswordResetPost**
> churchesChurchIdAuthPasswordResetPost(churchId, churchesChurchIdAuthPasswordResetPostRequest)

Demander une réinitialisation de mot de passe pour un utilisateur d&#39;église

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SecurityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ecclesiaflow.com/v1");

    SecurityApi apiInstance = new SecurityApi(defaultClient);
    String churchId = "churchId_example"; // String | Identifiant unique de l'église
    ChurchesChurchIdAuthPasswordResetPostRequest churchesChurchIdAuthPasswordResetPostRequest = new ChurchesChurchIdAuthPasswordResetPostRequest(); // ChurchesChurchIdAuthPasswordResetPostRequest | 
    try {
      apiInstance.churchesChurchIdAuthPasswordResetPost(churchId, churchesChurchIdAuthPasswordResetPostRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityApi#churchesChurchIdAuthPasswordResetPost");
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
| **churchesChurchIdAuthPasswordResetPostRequest** | [**ChurchesChurchIdAuthPasswordResetPostRequest**](ChurchesChurchIdAuthPasswordResetPostRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Email de réinitialisation envoyé |  -  |
| **404** | Email non trouvé |  -  |

<a id="churchesChurchIdAuthPasswordResetTokenPost"></a>
# **churchesChurchIdAuthPasswordResetTokenPost**
> churchesChurchIdAuthPasswordResetTokenPost(churchId, token, churchesChurchIdAuthPasswordResetTokenPostRequest)

Réinitialiser le mot de passe avec un token pour un utilisateur d&#39;église

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SecurityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ecclesiaflow.com/v1");

    SecurityApi apiInstance = new SecurityApi(defaultClient);
    String churchId = "churchId_example"; // String | Identifiant unique de l'église
    String token = "token_example"; // String | Token reçu par email de réinitialisation
    ChurchesChurchIdAuthPasswordResetTokenPostRequest churchesChurchIdAuthPasswordResetTokenPostRequest = new ChurchesChurchIdAuthPasswordResetTokenPostRequest(); // ChurchesChurchIdAuthPasswordResetTokenPostRequest | 
    try {
      apiInstance.churchesChurchIdAuthPasswordResetTokenPost(churchId, token, churchesChurchIdAuthPasswordResetTokenPostRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityApi#churchesChurchIdAuthPasswordResetTokenPost");
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
| **token** | **String**| Token reçu par email de réinitialisation | |
| **churchesChurchIdAuthPasswordResetTokenPostRequest** | [**ChurchesChurchIdAuthPasswordResetTokenPostRequest**](ChurchesChurchIdAuthPasswordResetTokenPostRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Réinitialisation du mot de passe réussie |  -  |
| **400** | Token invalide |  -  |

<a id="churchesChurchIdUsersSessionsDelete"></a>
# **churchesChurchIdUsersSessionsDelete**
> churchesChurchIdUsersSessionsDelete(churchId)

Terminer toutes les sessions d&#39;un utilisateur d&#39;une église

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SecurityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ecclesiaflow.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    SecurityApi apiInstance = new SecurityApi(defaultClient);
    String churchId = "churchId_example"; // String | Identifiant unique de l'église
    try {
      apiInstance.churchesChurchIdUsersSessionsDelete(churchId);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityApi#churchesChurchIdUsersSessionsDelete");
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
| **200** | Toutes les sessions ont été terminées |  -  |

<a id="churchesChurchIdUsersSessionsGet"></a>
# **churchesChurchIdUsersSessionsGet**
> List&lt;Session&gt; churchesChurchIdUsersSessionsGet(churchId)

Lister les sessions actives d&#39;un utilisateur d&#39;une église

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SecurityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ecclesiaflow.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    SecurityApi apiInstance = new SecurityApi(defaultClient);
    String churchId = "churchId_example"; // String | Identifiant unique de l'église
    try {
      List<Session> result = apiInstance.churchesChurchIdUsersSessionsGet(churchId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityApi#churchesChurchIdUsersSessionsGet");
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

[**List&lt;Session&gt;**](Session.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Sessions récupérées |  -  |

