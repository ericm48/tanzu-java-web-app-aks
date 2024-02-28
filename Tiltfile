#
# TiltFile: tap-1.7.3-v2 for NS: dev1
#
allow_k8s_contexts('npc-tap-cluster-173-v2')

update_settings( max_parallel_updates = 3 , k8s_upsert_timeout_secs = 60 , suppress_unused_image_warnings = None ) 

SOURCE_IMAGE = os.getenv("SOURCE_IMAGE", default='cspsitigeracreast.azurecr.io/tap-1.7.3/workloads/tanzu-java-web-app-aks-dev1')
LOCAL_PATH = os.getenv("LOCAL_PATH", default='.')
NAMESPACE = os.getenv("NAMESPACE", default='dev1')

k8s_custom_deploy(
    'tanzu-java-web-app-aks',
    apply_cmd="tanzu apps workload apply -f config/workload.yaml --live-update" +
               " --local-path " + LOCAL_PATH +
               " --source-image " + SOURCE_IMAGE +
               " --namespace " + NAMESPACE +
               " --yes >/dev/null" +
               " && kubectl get workload tanzu-java-web-app-aks --namespace " + NAMESPACE + " -o yaml",
    delete_cmd="tanzu apps workload delete -f config/workload.yaml --namespace " + NAMESPACE + " --yes",
    deps=['pom.xml', './target/classes'],
    container_selector='workload',
    live_update=[
      sync('./target/classes', '/workspace/BOOT-INF/classes')
    ]
)

# k8s_resource('tanzu-java-web-app-aks', port_forwards=["8080:8080"], extra_pod_selectors=[{'serving.knative.dev/service': 'tanzu-java-web-app'}])

           
