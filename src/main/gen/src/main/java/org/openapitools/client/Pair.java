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


package org.openapitools.client;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-17T11:45:52.556339-05:00[America/Montreal]", comments = "Generator version: 7.7.0")
public class Pair {
    private String name = "";
    private String value = "";

    public Pair (String name, String value) {
        setName(name);
        setValue(value);
    }

    private void setName(String name) {
        if (!isValidString(name)) {
            return;
        }

        this.name = name;
    }

    private void setValue(String value) {
        if (!isValidString(value)) {
            return;
        }

        this.value = value;
    }

    public String getName() {
        return this.name;
    }

    public String getValue() {
        return this.value;
    }

    private boolean isValidString(String arg) {
        if (arg == null) {
            return false;
        }

        return true;
    }
}
