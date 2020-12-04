import jenkins.model.*

pipeline { 
  agent any 
  node('master') {
    stage('say-hello') {
        echo "Hello World from the jnlp-maven-client POD !"
    }
  }
}
