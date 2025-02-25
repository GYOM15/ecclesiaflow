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
import org.openapitools.client.model.ChurchLoginUser401Response;
import org.openapitools.client.model.LoginRequest;
import org.openapitools.client.model.LoginResponse;
import org.openapitools.client.model.RefreshTokenRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AuthenticationApi
 */
@Disabled
public class AuthenticationApiTest {

    private final AuthenticationApi api = new AuthenticationApi();

    /**
     * Connexion d&#39;un utilisateur d&#39;église
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void churchLoginUserTest() throws ApiException {
        String churchId = null;
        LoginRequest loginRequest = null;
        LoginResponse response = api.churchLoginUser(churchId, loginRequest);
        // TODO: test validations
    }

    /**
     * Déconnexion d&#39;un utilisateur d&#39;église
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void churchesChurchIdAuthLogoutPostTest() throws ApiException {
        String churchId = null;
        api.churchesChurchIdAuthLogoutPost(churchId);
        // TODO: test validations
    }

    /**
     * Rafraîchir le token d&#39;accès pour un utilisateur d&#39;église
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void churchesChurchIdAuthRefreshTokenPostTest() throws ApiException {
        String churchId = null;
        RefreshTokenRequest refreshTokenRequest = null;
        LoginResponse response = api.churchesChurchIdAuthRefreshTokenPost(churchId, refreshTokenRequest);
        // TODO: test validations
    }

}
