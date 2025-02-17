# ChurchAdministrationApi

All URIs are relative to *https://api.churchmanagement.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**churchesChurchIdUsersPost**](ChurchAdministrationApi.md#churchesChurchIdUsersPost) | **POST** /churches/{churchId}/users | Créer un nouvel utilisateur pour l&#39;église |


<a id="churchesChurchIdUsersPost"></a>
# **churchesChurchIdUsersPost**
> ChurchUserProfile churchesChurchIdUsersPost(churchId, churchUserCreationRequest)

Créer un nouvel utilisateur pour l&#39;église

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChurchAdministrationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.churchmanagement.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ChurchAdministrationApi apiInstance = new ChurchAdministrationApi(defaultClient);
    String churchId = "churchId_example"; // String | Identifiant unique de l'église
    ChurchUserCreationRequest churchUserCreationRequest = new ChurchUserCreationRequest(); // ChurchUserCreationRequest | 
    try {
      ChurchUserProfile result = apiInstance.churchesChurchIdUsersPost(churchId, churchUserCreationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChurchAdministrationApi#churchesChurchIdUsersPost");
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
| **churchUserCreationRequest** | [**ChurchUserCreationRequest**](ChurchUserCreationRequest.md)|  | |

### Return type

[**ChurchUserProfile**](ChurchUserProfile.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Utilisateur créé avec succès |  -  |
| **400** | Erreur de validation |  -  |
| **403** | Accès refusé – rôle insuffisant |  -  |

