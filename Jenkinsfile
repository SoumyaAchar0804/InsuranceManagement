node{
    
    def mavenHome, mavenCMD, docker, tag, dockerHubUser, containerName, httpPort = ""
    script {
          System.setProperty("org.jenkinsci.plugins.durabletask.BourneShellScript.HEARTBEAT_CHECK_INTERVAL", "300");
   } 
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
        git url:'https://github.com/SoumyaAchar0804/InsuranceManagement.git',branch:'master' //update your forked repo     
    }
    
   stage('Build Project') {
      // build project via maven
      sh "'${mavenHome}/bin/mvn' clean install"
    }
}
   
