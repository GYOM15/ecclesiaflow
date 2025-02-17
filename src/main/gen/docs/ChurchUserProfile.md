

# ChurchUserProfile


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**churchId** | **String** |  |  [optional] |
|**email** | **String** |  |  [optional] |
|**firstName** | **String** |  |  [optional] |
|**lastName** | **String** |  |  [optional] |
|**phoneNumber** | **String** |  |  [optional] |
|**address** | [**Address**](Address.md) |  |  [optional] |
|**role** | [**RoleEnum**](#RoleEnum) |  |  [optional] |
|**ministries** | **List&lt;String&gt;** |  |  [optional] |
|**groups** | **List&lt;String&gt;** |  |  [optional] |
|**joinDate** | **OffsetDateTime** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**preferences** | [**UserPreferences**](UserPreferences.md) |  |  [optional] |



## Enum: RoleEnum

| Name | Value |
|---- | -----|
| MEMBER | &quot;MEMBER&quot; |
| DEACON | &quot;DEACON&quot; |
| ELDER | &quot;ELDER&quot; |
| PASTOR | &quot;PASTOR&quot; |
| ADMIN | &quot;ADMIN&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;ACTIVE&quot; |
| INACTIVE | &quot;INACTIVE&quot; |
| BLOCKED | &quot;BLOCKED&quot; |



