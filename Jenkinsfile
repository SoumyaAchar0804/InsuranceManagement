node{
    
    def mavenHome, mavenCMD, docker, tag, dockerHubUser, containerName, httpPort = ""
    
   stage('Prepare Environment'){
        echo 'Initialize Environment'
        mavenHome = tool name: 'Maven 3.6.3' , type: 'maven'
        mavenCMD = "${mavenHome}/bin/mvn"
        tag="3.0"
	dockerHubUser="soumyaachar"
	containerName="insure-me"
	httpPort="8081"       
    }
    
    stage('Code Checkout'){
        git url:'https://github.com/vdharmaraj/PGDO_Proj3.git',branch:'master' //update your forked repo     
    }
    
    stage('Maven Build'){
        sh "${mavenCMD} clean package"        
    }

   stage('Build Project') {
      // build project via maven
      sh "'${mvnHome}/bin/mvn' clean install"
    }
    
   
