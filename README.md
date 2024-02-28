# Welcome to the tanzu-java-web-app-aks project!

This is a sample of the Tanzu Java Web App Deployed to TAP-1.7.3 on AKS, with vsCode & Tilt.


## Dependencies
| Item    | Version |
| ------- | ------------------ |
| 1. kubectl-cli | > 1.22.x |
| 2. tilt-cli | > v0.32.0 |
| 3. TAP | > 1.7.3 |
| 4. TAP Supply Chain | - basic <br> - testing <br> - testing_scanning |
| 5. vsCode-Plugin: Tanzu Developer Tools | - 2023-10-20 |

## Setup Commands:

Login to Azure with cli:
```
az login
```

Verify correct account:
```
az account list
```

Verify correct subscription:
```
az account set --subscription ...
```

Login to target-cluster where TAP is installed:
```
az aks get-credentials --resource-group cloud-shell-storage-southcentralus --name npc-tap-cluster-173
```





## Funny Things To Watch Out For:
| Date    | Description |
| ------- | ------------------ |
| 23-Feb-2024: | - vsCode PlugIn must be removed/reinstalled upon each vsCode Startup. |


## Notes:

| Date     | Description |
| -------- | ------- |
| 23-Feb-2024:   | - Updated for TAP-1.7.3. <br> - Uses Azure-K8s: 1.27.7    |
| 20-Feb-2024:  | - Initial Implementation     |




