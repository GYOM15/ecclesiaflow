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

import org.openapitools.client.ApiException;
import org.openapitools.client.model.ChurchRegisterRequest;
import org.openapitools.client.model.ChurchRegisterResponse;
import org.openapitools.client.model.RegisterChurch400Response;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ChurchRegistrationApi
 */
@Disabled
public class ChurchRegistrationApiTest {

    private final ChurchRegistrationApi api = new ChurchRegistrationApi();

    /**
     * Enregistrer une nouvelle église
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void registerChurchTest() throws ApiException {
        ChurchRegisterRequest churchRegisterRequest = null;
        ChurchRegisterResponse response = api.registerChurch(churchRegisterRequest);
        // TODO: test validations
    }

}
