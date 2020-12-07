package jobs.dummy

node('boosters') {
    stage('say-hello') {
        echo "Hello World from our jnlp-maven-oc-jdk-tool POD !"
    }
}