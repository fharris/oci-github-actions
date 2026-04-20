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
Replace *fharris* with your github account and *oci-github-actions* with your repo:

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

## 5. Signing and Verifying Images in OCIR

oci artifacts container image-signature sign-upload --compartment-id <compartment-ocid> --kms-key-id <key-ocid> --kms-key-version-id <key-version-ocid> --signing-algorithm <signing-algorithm> --image-id <image-ocid> --description <signature-description> --metadata <image-metadata-json> [OPTIONS]


##signing
```
oci artifacts container image-signature sign-upload --compartment-id ocid1.compartment.oc1..(...)sa5hbzq --kms-key-id ocid1.key.oc1.eu-frankfurt-1.c(...)45oa --kms-key-version-id ocid1.keyversion.oc1.eu-frankfurt-1.c(...)ma --signing-algorithm SHA_224_RSA_PKCS_PSS --image-id ocid1.containerimage.oc1.eu-frankfurt-1.0.frsxwtjs(...)ksaq --description "Image for UAT testing" 
```

##verifying
oci artifacts container image-signature get-verify --compartment-id ocid1.compartment.oc1..aaaaaaaam(...)zq --repo-name wikipedia/demo/curiosityfrontendms --image-digest sha256:231def9(...)5 --trusted-keys ocid1.key.oc1.eu-frankfurt-1.cbrijocpaafl4.abthe(...)oa --compartment-id-in-subtree false





