# OCI CLI and Git Hub Actions - Capex Free Exercises

Let's play and learn:




## 1 - Creating Container Instances

  - [oci-cli-container-instances.yml](.github/workflows/oci-cli-container-instances.yml)


## 2 - Listing k8s Serverless and Deploying Apps


  - [oci-cli-oke-serverless.yml](.github/workflows/oci-cli-oke-serverless.yml)


## 3 - Creating and Invoking Functions


  - [oci-cli-function.yml](.github/workflows/oci-cli-functions.yml)

## 4 - OKE OpenID Connect Authentication


  - [oci-cli-oke-oidc.yml](.github/workflows/oci-cli-oke-oidc.yml)

The background color is `#ffffff` for light mode and `#000000` for dark mode.

```
{
  "options": {
    "openIdConnectTokenAuthenticationConfig": {
      "isOpenIdConnectAuthEnabled": true,
      "clientId": "oke-kubernetes-cluster",
      "issuerUrl": "https://token.actions.githubusercontent.com",
      "usernameClaim": "sub",
      "usernamePrefix": "actions-oidc:",
      "requiredClaim": [
        "repository=myaccount/oke-oidc",
        "workflow=oke-oidc",
        "ref=refs/heads/main"
      ],
      "caCertificate": null,
      "signingAlgorithms": [
        "RS256"
      ]
    }
  }
}
```






