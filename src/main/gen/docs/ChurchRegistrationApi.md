# ChurchRegistrationApi

All URIs are relative to *https://api.ecclesiaflow.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**registerChurch**](ChurchRegistrationApi.md#registerChurch) | **POST** /churches/register | Enregistrer une nouvelle église |


<a id="registerChurch"></a>
# **registerChurch**
> ChurchRegisterResponse registerChurch(churchRegisterRequest)

Enregistrer une nouvelle église

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChurchRegistrationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ecclesiaflow.com/v1");

    ChurchRegistrationApi apiInstance = new ChurchRegistrationApi(defaultClient);
    ChurchRegisterRequest churchRegisterRequest = new ChurchRegisterRequest(); // ChurchRegisterRequest | 
    try {
      ChurchRegisterResponse result = apiInstance.registerChurch(churchRegisterRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChurchRegistrationApi#registerChurch");
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
| **churchRegisterRequest** | [**ChurchRegisterRequest**](ChurchRegisterRequest.md)|  | |

### Return type

[**ChurchRegisterResponse**](ChurchRegisterResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Église enregistrée avec succès |  -  |
| **400** | Erreur de validation |  -  |
| **409** | L&#39;église existe déjà |  -  |

