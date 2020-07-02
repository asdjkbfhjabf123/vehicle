node{
   stage('SCM Checkout')
   {
     git 'https://github.com/asdjkbfhjabf123/vehicle.git'
   }
   stage('Compile-Package')
   {
   //    Get maven home path here
       def mvnHome =  tool name: 'maven', type: 'maven'   
       sh "${mvnHome}/bin/mvn package"
   } 
   stage('SonarQube Analysis') {
        def mvnHome =  tool name: 'maven', type: 'maven'
        withSonarQubeEnv('sonar') { 
          sh "${mvnHome}/bin/mvn sonar:sonar"
        }
    
    }
      stage ('Build Docker Image') {
     sh 'docker build -t 853306/my-app:1 .'
   }
   
   stage('Push Docker image'){
   withCredentials([string(credentialsId: 'docker_id', variable: 'docker_password')]) {
   sh "docker login -u 853306 -p ${docker_password}"
}
  
   sh 'docker push 853306/my-app:1'
}
}