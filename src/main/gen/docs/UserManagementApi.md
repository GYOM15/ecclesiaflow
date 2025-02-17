# UserManagementApi

All URIs are relative to *https://api.ecclesiaflow.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**churchesChurchIdUsersGet**](UserManagementApi.md#churchesChurchIdUsersGet) | **GET** /churches/{churchId}/users | Lister les utilisateurs d&#39;une église |
| [**churchesChurchIdUsersUserIdPhotoPost**](UserManagementApi.md#churchesChurchIdUsersUserIdPhotoPost) | **POST** /churches/{churchId}/users/{userId}/photo | Télécharger la photo de profil d&#39;un utilisateur d&#39;une église |
| [**churchesChurchIdUsersUserIdPut**](UserManagementApi.md#churchesChurchIdUsersUserIdPut) | **PUT** /churches/{churchId}/users/{userId} | Mettre à jour le profil d&#39;un utilisateur d&#39;une église |


<a id="churchesChurchIdUsersGet"></a>
# **churchesChurchIdUsersGet**
> List&lt;ChurchUserProfile&gt; churchesChurchIdUsersGet(churchId, page, size, role)

Lister les utilisateurs d&#39;une église

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ecclesiaflow.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    UserManagementApi apiInstance = new UserManagementApi(defaultClient);
    String churchId = "churchId_example"; // String | Identifiant unique de l'église
    Integer page = 1; // Integer | Numéro de page à récupérer (défaut 1)
    Integer size = 10; // Integer | Nombre d'enregistrements par page (défaut 10)
    String role = "MEMBER"; // String | Filtrer par rôle (ex. MEMBER, PASTOR)
    try {
      List<ChurchUserProfile> result = apiInstance.churchesChurchIdUsersGet(churchId, page, size, role);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserManagementApi#churchesChurchIdUsersGet");
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
| **page** | **Integer**| Numéro de page à récupérer (défaut 1) | [optional] |
| **size** | **Integer**| Nombre d&#39;enregistrements par page (défaut 10) | [optional] |
| **role** | **String**| Filtrer par rôle (ex. MEMBER, PASTOR) | [optional] |

### Return type

[**List&lt;ChurchUserProfile&gt;**](ChurchUserProfile.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Liste des utilisateurs récupérée |  -  |
| **403** | Accès refusé – rôle insuffisant |  -  |

<a id="churchesChurchIdUsersUserIdPhotoPost"></a>
# **churchesChurchIdUsersUserIdPhotoPost**
> churchesChurchIdUsersUserIdPhotoPost(churchId, userId, photo)

Télécharger la photo de profil d&#39;un utilisateur d&#39;une église

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ecclesiaflow.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    UserManagementApi apiInstance = new UserManagementApi(defaultClient);
    String churchId = "churchId_example"; // String | Identifiant unique de l'église
    String userId = "userId_example"; // String | Identifiant unique de l'utilisateur
    File photo = new File("/path/to/file"); // File | Fichier image de la photo de profil.
    try {
      apiInstance.churchesChurchIdUsersUserIdPhotoPost(churchId, userId, photo);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserManagementApi#churchesChurchIdUsersUserIdPhotoPost");
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
| **userId** | **String**| Identifiant unique de l&#39;utilisateur | |
| **photo** | **File**| Fichier image de la photo de profil. | [optional] |

### Return type

null (empty response body)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Photo téléchargée avec succès |  -  |

<a id="churchesChurchIdUsersUserIdPut"></a>
# **churchesChurchIdUsersUserIdPut**
> churchesChurchIdUsersUserIdPut(churchId, userId, churchUserProfile)

Mettre à jour le profil d&#39;un utilisateur d&#39;une église

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ecclesiaflow.com/v1");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    UserManagementApi apiInstance = new UserManagementApi(defaultClient);
    String churchId = "churchId_example"; // String | Identifiant unique de l'église
    String userId = "userId_example"; // String | Identifiant unique de l'utilisateur
    ChurchUserProfile churchUserProfile = new ChurchUserProfile(); // ChurchUserProfile | 
    try {
      apiInstance.churchesChurchIdUsersUserIdPut(churchId, userId, churchUserProfile);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserManagementApi#churchesChurchIdUsersUserIdPut");
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
| **userId** | **String**| Identifiant unique de l&#39;utilisateur | |
| **churchUserProfile** | [**ChurchUserProfile**](ChurchUserProfile.md)|  | |

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
| **200** | Profil mis à jour avec succès |  -  |

