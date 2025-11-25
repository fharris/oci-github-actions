# OCI CLI and Git Hub Actions - Capex Free Exercises

Let's play and learn:




## 1 - Creating Container Instances

  - [oci-cli-container-instances.yml](.github/workflows/oci-cli-container-instances.yml)


## 2 - Listing k8s Serverless and Deploying Apps


  - [oci-cli-oke-serverless.yml](.github/workflows/oci-cli-oke-serverless.yml)


## 3 - Creating and Invoking Functions


  - [oci-cli-function.yml](.github/workflows/oci-cli-functions.yml)

## 4 - OKE OpenID Connect Authentication
  - [tutorial](https://docs.oracle.com/en/learn/gaw-oke-odic/index.html#introduction)
  - [documentation](https://docs.oracle.com/en-us/iaas/Content/ContEng/Tasks/contengOpenIDConnect-Authentication.htm)

  - [oke-oidc.yml](.github/workflows/oke-oidc.yml)


Update your cluster with the following command:
```
oci ce cluster update --cluster-id CLUSTER_OCID --from-json file://./update.json
```

The content of the update.json file is below. 
Replace fharris with your github account and oci-github-actions with your repo:

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
        "repository=fharris/oci-github-actions",
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






